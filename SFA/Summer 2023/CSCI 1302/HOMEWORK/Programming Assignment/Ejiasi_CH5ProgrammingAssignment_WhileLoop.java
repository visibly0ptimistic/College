/*
   Name: Victor Ejiasi
   Date: 06/21/2023
   Course Section: CSCI 1302
   Purpose of Program: Chapter 5 Programming Assignment While Loop
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejiasi_CH5ProgrammingAssignment_WhileLoop {
    public static void main(String[] args) {
        // Declare and assign the necessary variables to zero
        int totalNames = 0;
        int namesThatStartWithVowels = 0;

        // Declare and assign the Files, Scanner and PrintWriter
        File inputFile = new File("HOMEWORK/Programming Assignment/names.txt");
        File outputFile = new File("HOMEWORK/Programming Assignment/namesData.txt");
        Scanner scanner = null;
        PrintWriter writer = null;

        try {
            scanner = new Scanner(inputFile);
            writer = new PrintWriter(outputFile);

            // Loop through each name in the file
            while (scanner.hasNext()) {
                String name = scanner.nextLine();
                writer.println(name);

                // Increment the total number of names
                totalNames++;

                // Check if the name starts with a vowel
                if (name.matches("(?i)^[aeiou].*")) {
                    namesThatStartWithVowels++;
                }
            }

            // Write the total number of names and names that start with a vowel to the output file
            writer.println("Total names in data source: " + totalNames);
            writer.println("Total names that start with a vowel: " + namesThatStartWithVowels);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            if (scanner != null) {
                scanner.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}