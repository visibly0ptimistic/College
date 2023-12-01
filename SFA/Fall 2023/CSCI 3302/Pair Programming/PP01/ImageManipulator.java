import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * Author: JJB
 * Victor Ejiasi / Hunter Havard
 * Already submitted by Hunter.
 * 9.7.2023
 * CSCI 3302 Section 002
 * This class is used to perform manipulations of
 * a double array of integers. The integers represent
 * pixels of a image.
 */
public class ImageManipulator {
    // pixels making up an image
    private int[][] pixels;

    public ImageManipulator() {
        // nothing to do but what the super constructor does
    }

    public ImageManipulator(int[][] pixels) {
        this.pixels = pixels;
    }

    public ImageManipulator(BufferedImage image) {
        this.setImage(image);
    }

    /**
     * This method sets the pixels given the image
     * file.
     * @param image - given a image
     * The pixels contain the color information for the given.
     */
    public void setImage(BufferedImage image) {
        int w = image.getWidth();
        int h = image.getHeight();
        this.pixels = new int[w][h];

        for (int x = 0; x < w; x++)
            for (int y = 0; y < h; y++)
                this.pixels[x][y] = image.getRGB(x, y);
    }

    
    /**********************************************
     * This method rotates the currently image used by 90 degree
     * in a clockwise fashion.
     * Pre : given an implicit image display (this)
     * Post: the image is rotated 90 degree clockwise
     */
    public int[][] rotate() {
        int rows = pixels.length;
        int cols = pixels[0].length;
        int[][] rotated = new int[cols][rows];
    
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                rotated[j][i] = pixels[i][cols - j - 1];
            }
        }
        return rotated;
    }    

    /************************************
     * This method takes the current image used and finds the grayscale equivalent
     * image.
     * Pre : the implicit image display is given
     * Post: a gray scale version of the current image is displayed
     */
    public int[][] grayScale() {
        int w = pixels.length;
        int h = pixels[0].length;
        
        int[][] newPixels = new int[w][h];
        for (int x = 0; x < w; x++)
            for (int y = 0; y < h; y++) {
                Color color = new Color(pixels[x][y]);

                int red = color.getRed();
                int blue = color.getBlue();
                int green = color.getGreen();

                int gray = (red+blue+green)/3;
                newPixels[x][y] = new Color(gray, gray, gray).getRGB();
        
            }

        return newPixels;

    }

        

    /******************************************
     * This method inverts the color of the currently displayed image.
     * That is, we take the current RGB value of the color for the pixel
     * and form a new image where the valuee is 255-R, 255-G, 255-B.
     * Pre : given the implicit image display
     * Post: an image with the inverted colors of the current image is displayed
     */
    public int[][] invert() {
        int rows = pixels.length;
        int cols = pixels[0].length;
        int[][] inverted = new int[rows][cols];
    
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                int pixel = pixels[i][j];
                int r = (pixel >> 16) & 0xFF;
                int g = (pixel >> 8) & 0xFF;
                int b = pixel & 0xFF;
                r = 255 - r;
                g = 255 - g;
                b = 255 - b;
                inverted[i][j] = (r << 16) | (g << 8) | b;
            }
        }
        return inverted;
    }    

    /***************************************
     * This method displays a version of the current image which
     * is flipped horizontally. That is, the first column pixels are
     * swapped with the last column, the 2nd column pixels are swapped
     * with the second to last columns, etc.
     * Pre : given the implicit ImageDisplay
     * Post: a version of the current image that is flipped horizontally is
     * displayed
     */
    public int[][] flipHorizontal() {
        int rows = pixels.length;
        int cols = pixels[0].length;
        int[][] flipped = new int[rows][cols];
    
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                flipped[i][j] = pixels[rows - i - 1][j];
            }
        }
        return flipped;
    }    

    /***************************************
     * This method displays a version of the current image which
     * is flipped vertically. That is, the first row pixels are
     * swapped with the last row, the 2nd row pixels are swapped
     * with the second to last row, etc.
     * Pre : given the implicit ImageDisplay
     * Post: a version of the current image that is flipped vertically is displayed
     */
    public int[][] flipVertical() {
        int rows = pixels.length;
        int cols = pixels[0].length;
        int[][] flipped = new int[rows][cols];
    
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                flipped[i][j] = pixels[i][cols - j - 1];
            }
        }
        return flipped;
    }     

    /***************************************
     * This method displays a filtered version of the current image.
     * That is, a mask is applied to the pixels to highlight specific
     * colors.
     * 
     * Pre : given the mask as a positive integer
     * Post: a version of the current image that is filtered is displayed
     */
    public int[][] filter(int mask) {
        int w = pixels.length;
        int h = pixels[0].length;

        int[][] newPixels = new int[w][h];
        for(int y = 0; y < h; y++){
            for(int x = 0; x < w; x++){
                int color = pixels[x][y];
                newPixels[x][y] = color & mask;
            }
        }
        
        return newPixels;
    }

  
} // end class