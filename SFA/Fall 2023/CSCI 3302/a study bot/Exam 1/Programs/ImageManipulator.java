import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImageManipulator {

    private int[][] pixels; // Represents the pixels of an image.

    // Default Constructor
    public ImageManipulator() {
        // Invokes the superclass constructor implicitly.
    }

    // Constructor initializing pixels array with provided 2D array.
    public ImageManipulator(int[][] pixels) {
        this.pixels = pixels;
    }

    // Constructor that initializes pixels array with color information from a BufferedImage.
    public ImageManipulator(BufferedImage image) {
        this.setImage(image);
    }

    // Initializes pixels array with RGB values from the provided BufferedImage.
    public void setImage(BufferedImage image) {
        int w = image.getWidth();
        int h = image.getHeight();
        this.pixels = new int[w][h];

        // Loop over each pixel to extract color information.
        for (int x = 0; x < w; x++)
            for (int y = 0; y < h; y++)
                this.pixels[x][y] = image.getRGB(x, y);
    }

    // Rotates the image 90 degrees clockwise and returns the rotated pixel array.
    public int[][] rotate() {
        int rows = pixels.length;
        int cols = pixels[0].length;
        int[][] rotated = new int[cols][rows];

        // Logic to rotate the image.
        for (int i = 0; i < rows; ++i)
            for (int j = 0; j < cols; ++j)
                rotated[j][i] = pixels[i][cols - j - 1];

        return rotated;
    }

    // Converts the image to grayscale and returns the modified pixel array.
    public int[][] grayScale() {
        int w = pixels.length;
        int h = pixels[0].length;
        int[][] newPixels = new int[w][h];

        // Loop over each pixel to convert to grayscale.
        for (int x = 0; x < w; x++)
            for (int y = 0; y < h; y++) {
                Color color = new Color(pixels[x][y]);
                int gray = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                newPixels[x][y] = new Color(gray, gray, gray).getRGB();
            }

        return newPixels;
    }

    // Inverts the colors of the image and returns the modified pixel array.
    public int[][] invert() {
        int rows = pixels.length;
        int cols = pixels[0].length;
        int[][] inverted = new int[rows][cols];

        // Loop over each pixel to invert color.
        for (int i = 0; i < rows; ++i)
            for (int j = 0; j < cols; ++j) {
                Color color = new Color(pixels[i][j]);
                int r = 255 - color.getRed();
                int g = 255 - color.getGreen();
                int b = 255 - color.getBlue();
                inverted[i][j] = new Color(r, g, b).getRGB();
            }

        return inverted;
    }

    // Flips the image horizontally and returns the modified pixel array.
    public int[][] flipHorizontal() {
        int rows = pixels.length;
        int cols = pixels[0].length;
        int[][] flipped = new int[rows][cols];

        // Loop over each pixel to flip image horizontally.
        for (int i = 0; i < rows; ++i)
            for (int j = 0; j < cols; ++j)
                flipped[i][j] = pixels[rows - i - 1][j];

        return flipped;
    }

    // Flips the image vertically and returns the modified pixel array.
    public int[][] flipVertical() {
        int rows = pixels.length;
        int cols = pixels[0].length;
        int[][] flipped = new int[rows][cols];

        // Loop over each pixel to flip image vertically.
        for (int i = 0; i < rows; ++i)
            for (int j = 0; j < cols; ++j)
                flipped[i][j] = pixels[i][cols - j - 1];

        return flipped;
    }

    // Applies a color filter to the image and returns the modified pixel array.
    public int[][] filter(int mask) {
        int w = pixels.length;
        int h = pixels[0].length;
        int[][] newPixels = new int[w][h];

        // Loop over each pixel to apply color filter.
        for (int y = 0; y < h; y++)
            for (int x = 0; x < w; x++)
                newPixels[x][y] = pixels[x][y] & mask;

        return newPixels;
    }

    // Main method to test the ImageManipulator class functionalities.
    public static void main(String[] args) {
        try {
            // Read a BufferedImage from a file.
            BufferedImage image = ImageIO.read(new File("path_to_your_image_file"));

            // Initialize ImageManipulator object with the read BufferedImage.
            ImageManipulator manipulator = new ImageManipulator(image);

            // Perform various manipulations.
            manipulator.grayScale();
            manipulator.invert();
            manipulator.rotate();
            manipulator.flipHorizontal();
            manipulator.flipVertical();
            manipulator.filter(0x00FF00); // Example mask for green color filter.

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
