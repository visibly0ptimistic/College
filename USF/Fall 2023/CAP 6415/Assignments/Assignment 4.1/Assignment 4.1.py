def create_difference_pyramid (up_pyramid, down_pyramid) :
    if (len(up_pyramid) != len(down_pyramid)) :
        print('Error -- the up and down pyramids are of different heights')
        return 0
    
    nlevels = len(up_pyramid)
    difference_pyramid = []
    difference_pyramid.append(up_pyramid[-1])
    # The pyramid is stored as list:[D_n, D_(n-1), ...., D_0] -- small to large sized.
    for i in range (1, nlevels) :
        # compute error between the reconstructed images at each level from pervious levels
        diff_im = padded_add (up_pyramid[-(i+1)], -down_pyramid[i])
        difference_pyramid.append(diff_im)
    return (difference_pyramid)

import matplotlib.pyplot as plt

# Display the original image alongside a given pyramid
def display_pyramid(original, pyramid, title="Difference Pyramid"):
    """Displays the original image alongside a given pyramid."""
    levels = len(pyramid)
    
    # Setup the figure with one extra subplot for the original image
    fig, axs = plt.subplots(1, levels+1, figsize=(20, 5))
    
    # Display the original image
    axs[0].imshow(original, cmap='gray')
    axs[0].set_title("Original Image", fontsize=8) # adjust font size to avoid overlap
    axs[0].axis('off')

    # Display the pyramid images
    for i, image in enumerate(pyramid):
        axs[i+1].imshow(image, cmap='gray')
        axs[i+1].set_title(f'{title} Level {i}', fontsize=8) # add title
        axs[i+1].axis('off')
    
    plt.tight_layout()  # adjust spacing between subplots to avoid overlap
    plt.show()


# Choosing "Armes 1.png" for analysis
img_array = io.imread(f'{data_dir}/Armes 1.png')
img = rgb2gray(rgba2rgb(img_array))

# Constructing up-pyramid
up_pyramid_4 = [img]
up_pyramid_8 = [img]

for i in range(3):
    up_pyramid_4.append(scale_image(up_pyramid_4[-1], 0.5, 1)) 

for i in range(7):
    up_pyramid_8.append(scale_image(up_pyramid_8[-1], 0.5, 1))

# Constructing down-pyramid
down_pyramid_4 = [up_pyramid_4[-1]]
down_pyramid_8 = [up_pyramid_8[-1]]

for i in range(3):
    down_pyramid_4.append(scale_image(down_pyramid_4[-1], 2, 1))

for i in range(7):
    down_pyramid_8.append(scale_image(down_pyramid_8[-1], 2, 1))

# Generating difference pyramids
diff_pyramid_4 = create_difference_pyramid(up_pyramid_4, down_pyramid_4)
diff_pyramid_8 = create_difference_pyramid(up_pyramid_8, down_pyramid_8)

# Display the 4-level and 8-level difference pyramids
display_pyramid(img, diff_pyramid_4, title="4-Level Difference Pyramid")
display_pyramid(img, diff_pyramid_8, title="8-Level Difference Pyramid")
