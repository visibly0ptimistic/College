/*
Victor Ejiasi
CSCI 2302
Lab 1

This program reads from a file and writes to a file.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EjiasiV_textIO_Lab {
    public static void main(String[] args) {
        // Declare and initialize variables for Scanner and PrintWriter
        Scanner input = null;
        PrintWriter output = null;

        try {
            // Create a Scanner object to read from ai.txt
            input = new Scanner(new File("/Applications/College/SFA/Fall 2023/CSCI 2302/LABS/ai.txt"));

            // Create a PrintWriter object to write to out.txt
            output = new PrintWriter(new File("/Applications/College/SFA/Fall 2023/CSCI 2302/LABS/out.txt"));

            // Loop to read from ai.txt and write to out.txt
            while (input.hasNext()) {
                String line = input.nextLine();
                output.println(line);
            }
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.out.println("File not found: " + e.getMessage());
        } finally {
            // Close resources
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }
    }
}
