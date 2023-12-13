from skimage import io
import numpy as np
import cv2
import matplotlib.pyplot as plt


def ransac_affine(points1, points2, threshold, max_iterations):
    max_inliers = 0
    best_model = None
    best_residual = float('inf')
    
    for _ in range(max_iterations):
        # Select a random subset of points
        indices = np.random.choice(len(points1), 3, replace=False)
        sample_points1 = points1[indices]
        sample_points2 = points2[indices]
        
        # Estimate the model using the random subset
        residual, T_affine = fit_affine(sample_points1, sample_points2)
        
        # Classify inliers and outliers
        transformed_points = np.dot(T_affine, np.vstack((points1.T, np.ones(len(points1)))))
        residuals = np.sum((transformed_points[:2].T - points2) ** 2, axis=1)
        inliers = residuals < threshold
        
        # If the number of inliers is maximum, update the best model
        if np.sum(inliers) > max_inliers:
            max_inliers = np.sum(inliers)
            best_model = T_affine
            best_residual = np.sqrt(np.mean(residuals[inliers]))
    
    # Re-estimate the model using all inliers
    if best_model is not None:
        inlier_points1 = points1[residuals < threshold]
        inlier_points2 = points2[residuals < threshold]
        best_residual, best_model = fit_affine(inlier_points1, inlier_points2)
        
    return best_residual, best_model


# ------------Read images-----------------------------------
image_1 = io.imread('https://i.stack.imgur.com/Er7vx.png')
image_2 = io.imread('https://i.stack.imgur.com/gAz96.png')

print("Input image size:", image_1.shape)

#-------------Detect SIFT features--------------------------
sift = cv2.SIFT_create(nOctaveLayers = 3, contrastThreshold = 0.04, edgeThreshold = 10, sigma = 1.6)
keypoints_1, descriptors_1 = sift.detectAndCompute(image_1, None)
keypoints_2, descriptors_2 = sift.detectAndCompute(image_2, None)

# -------------Match SIFT features--------------------------
bf = cv2.BFMatcher(cv2.NORM_L1, crossCheck=True)
matches = bf.match(descriptors_1, descriptors_2)
matches = sorted(matches, key = lambda x:x.distance)

# Loop over different NUM_MATCHES
for NUM_MATCHES in [10, 15, 20]:
    # Extract list of corresponding point location pairs
    X_1 = np.array([[keypoints_1[matches[i].queryIdx].pt[0], keypoints_1[matches[i].queryIdx].pt[1]] for i in range(NUM_MATCHES)])
    X_2 = np.array([[keypoints_2[matches[i].trainIdx].pt[0], keypoints_2[matches[i].trainIdx].pt[1]] for i in range(NUM_MATCHES)])
    
    # Perform affine transformation estimation (possibly with RANSAC)
    residual_error, T_affine = ransac_affine(X_1, X_2, threshold=2.0, max_iterations=1000)
    print(f"NUM_MATCHES: {NUM_MATCHES}, Residual Error: {residual_error}")

#----------------------------------Display-------------------------------------------------------
# create an visualization on the matched on an image
match_image = cv2.drawMatches(image_1, keypoints_1, image_2, keypoints_2, matches[0:NUM_MATCHES], image_2, flags=2)

plt.figure(figsize=(40,20))
plt.subplot(221)
plt.imshow(image_1, 'gray')
plt.plot(X_1[:,0], X_1[:,1], 'bo')
plt.subplot(222)
plt.imshow(image_2, 'gray')
plt.plot(X_2[:,0], X_2[:,1], 'ro')
plt.subplot(212)
plt.imshow(match_image)
plt.show()