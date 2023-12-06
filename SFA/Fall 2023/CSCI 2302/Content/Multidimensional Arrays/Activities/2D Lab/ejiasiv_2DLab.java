/*
   Name: Victor Ejiasi
   Date: 9/5/2023
   Course Section: CSCI 2301 - 002
   Purpose of Program: Read and display data from a 2D array.
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ejiasiv_2DLab {
    public static void main(String[] args) {
        // Initialize Scanner to read from the file
        Scanner scanner;
        try {
            scanner = new Scanner(new File("twoDlab.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            return;
        }
        
        // Declare and create a 2D array, 11 rows x 4 columns
        String[][] array2D = new String[11][4];
        
        // Read the values from the file into the 2D array
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 4; j++) {
                if (scanner.hasNext()) {
                    array2D[i][j] = scanner.next();
                }
            }
        }
        
        // Close the scanner
        scanner.close();
        
        // Print the entire 2D array to the screen
        System.out.println("Reading in the values");
        System.out.println("printing out the contents to the screen");
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        
        // Print the 3rd column to the screen
        System.out.println("\nPrinting the 3rd column using print:");
        for (int i = 0; i < 11; i++) {
            System.out.print(array2D[i][2] + " ");
        }
        
        // Print the 3rd column using println
        System.out.println("\n\nPrinting the 3rd column using println:");
        for (int i = 0; i < 11; i++) {
            System.out.println(array2D[i][2]);
        }
        
        // Print the 9th row to the screen
        System.out.println("\nPrinting the 9th row:");
        for (int j = 0; j < 4; j++) {
            System.out.print(array2D[8][j] + " ");
        }
        System.out.println();
    }
}

