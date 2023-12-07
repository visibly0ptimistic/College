import numpy as np
import matplotlib.pyplot as plt
from scipy.signal import correlate2d

# Victor Ejiasi
# CAP 6415

#  Assignment - Correlation

# 1.Compute h @ (1 - f), with h and f as specified above.\
# Define the arrays f and h as given in the previous sections of the document.
f = np.array([[0, 0, 0, 0, 0], 
              [0, 0, 1, 0, 0], 
              [0, 0, 1, 0, 0], 
              [0, 0, 1, 0, 0], 
              [0, 0, 0, 0, 0]])

h = np.array([[1, 2, 1],
              [0, 0, 0], 
              [-1, -2, -1]])

# Compute the correlation
g_original = correlate2d(1 - f, h, mode='full', boundary='fill', fillvalue=0)


# Change the my_array_re so that instead of returning zero when the index is out of bounds, it should return the boundary value, i.e., for f(-2, 3) and f (2, 15), it should return f(0, 3) and f{2, 9), respectively.
def my_array_ref_modified(arr, i, j):
    # If the index is out of bounds, return the boundary value.
    if i < 0:
        i = 0
    elif i >= arr.shape[0]:
        i = arr.shape[0] - 1

    if j < 0:
        j = 0
    elif j >= arr.shape[1]:
        j = arr.shape[1] - 1

    return arr[i, j]


# 3. Re-compute h @ (1 - f), with h and f as specified above, but using this new my_array_ref function.
g_modified = np.zeros((10, 10))
for i in range(f.shape[0]):
    for j in range(f.shape[1]):
        prod_sum = 0.0
        for k in range(h.shape[0]):
            for l in range(h.shape[1]):
                prod_sum += my_array_ref_modified(h, k, l) * my_array_ref_modified(1 - f, i-k, j-l)
        g_modified[i, j] = prod_sum


# Assignment - Difference of Gaussian (DoG)

# Find values of o and 62 for which the DoG is most similar to the second derivative of Gaussian of o = 3. 
# Define the second derivative of the Gaussian
def second_derivative_of_gaussian(x, sigma):
    return np.exp(-(x**2/(2*sigma*sigma))) * (-(1 - x*x/(sigma*sigma))) / (np.sqrt(2*np.pi)*sigma**3)

# Define the Gaussian
def gaussian(x, sigma):
    return np.exp(-x**2/(2*sigma*sigma)) / (np.sqrt(2*np.pi)*sigma)

t = np.linspace(-10, 10, 400)
sigma = 3.0

# Approximate values for sigma1 and sigma2
sigma1 = sigma
sigma2 = 1.6 * sigma

DoG = gaussian(t, sigma1) - gaussian(t, sigma2)

# Plot the Functions
plt.figure(figsize=(10, 5))
plt.plot(t, second_derivative_of_gaussian(t, sigma), label='Second Derivative of Gaussian')
plt.plot(t, DoG, linestyle='dashed', label='Difference of Gaussians (DoG)')
plt.xlabel('x')
plt.ylabel('Amplitude')
plt.title('Second Derivative of Gaussian vs. DoG')
plt.legend()
plt.grid(True)
plt.show()
