# Assignment: OpenCV SIFT Matching

# For a chosen object, take photographs from 16 different angles. Use the OpenCV SIFT feature detector and matching to analyze the images. Observe the effectiveness of the feature detector in matching the images based on the changes in the viewpoint. Study the variation in matching with respect to viewpoint changes. Evaluate the quality of the matches and provide a quantitative measure of the performance of the detector.

import cv2
import matplotlib.pyplot as plt
import numpy as np

# set path to images
path = '/Applications/College/USF/Fall 2023/CAP 6415/Assignments/Assignment 4.2/images'
# read images
images = [cv2.imread(f'{path}/image_{i}.png', cv2.IMREAD_GRAYSCALE) for i in range(16)]

# Initiate SIFT detector
sift = cv2.SIFT_create()
# Create BFMatcher object
bf = cv2.BFMatcher(cv2.NORM_L1, crossCheck=True)

# detect keypoints and compute descriptors for each image
avg_matches = 0
total_images = len(images)

# For each combination of images, find matches and display them
for i in range(total_images):
    for j in range(i+1, total_images):
        keypoints_1, descriptors_1 = sift.detectAndCompute(images[i], None)
        keypoints_2, descriptors_2 = sift.detectAndCompute(images[j], None)
        matches = bf.match(descriptors_1, descriptors_2)
        matches = sorted(matches, key=lambda x: x.distance)
        avg_matches += len(matches)
        
        # Display matches
        match_image = cv2.drawMatches(images[i], keypoints_1, images[j], keypoints_2, matches[:20], None, flags=2)
        plt.imshow(match_image)
        plt.title(f'Matches between image_{i} and image_{j}')
        plt.show()

# Calculate average matches
avg_matches /= (total_images * (total_images - 1)) / 2  # Combination of total_images taken 2 at a time
print(f"Average matches: {avg_matches}") 