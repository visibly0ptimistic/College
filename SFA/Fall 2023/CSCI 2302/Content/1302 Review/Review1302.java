/*
   Name: Victor Ejiasi
   Date: 9/4/2023
   Course Section: CSCI 2302 - 001
   Purpose of Program: This program performs various tasks as part of a review for CSCI 1302.
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Review1302 {

    public static void main(String[] args) throws IOException {
        // Compute and display the letter grade.
        int grade = 85;
        calculateLetterGrade(grade);

        // Print "Welcome to CSCI 2302" 1854 times.
        printWelcomeMessage();

        // Average method using a for-loop.
        calculateAverage();


// Loop Differences Comment:
    // 1. For Loop: Used for iterating a piece of code a known number of times.
    // 2. While Loop: Used for iterating a piece of code as long as a condition is true.
    // 3. Do-While Loop: Similar to While Loop but the code block is executed at least once before the condition is checked.


        // Method tasks
        System.out.println("Sum: " + sumMethod(1, 2, 3));
        System.out.println("Concatenated String: " + concatenateMethod("Hello", " ", "World", "!"));

        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        printCharArray(charArray);
        printCharArrayReverse(charArray);

        System.out.println("Length of string: " + convertMethod("Hello"));

        // Array and find largest value and index
        int[] array = {1, 4, 5, 23, 3, 7, 98, 0};
        findLargestValueAndIndex(array);

        // Convert measurement
        double result = convertMeasurement(9, "feet");
        System.out.println("9 feet in yards is " + result);

        result = convertMeasurement(3, "yards");
        System.out.println("3 yards in feet is " + result);

        // Read and write to file while counting 'a' or 'A'
        countAAndWriteToFile();
    }

    public static void calculateLetterGrade(int grade) {
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    public static void printWelcomeMessage() {
        for (int i = 0; i < 1854; i++) {
            System.out.println("Welcome to CSCI 2302");
        }
    }

    public static void calculateAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;
        while (true) {
            System.out.print("Enter a number (or type -1 to quit): ");
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
            count++;
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The average is " + average);
        }
        sc.close();
    }

    public static int sumMethod(int a, int b, int c) {
        return a + b + c;
    }

    public static String concatenateMethod(String str1, String str2, String str3, String str4) {
        return str1 + str2 + str3 + str4;
    }

    public static void printCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void printCharArrayReverse(char[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static int convertMethod(String str) {
        return str.length();
    }

    public static void findLargestValueAndIndex(int[] arr) {
        int largestValue = arr[0];
        int largestIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largestValue) {
                largestValue = arr[i];
                largestIndex = i;
            }
        }
        System.out.println("Largest value is " + largestValue + " at index " + largestIndex);
    }

    public static double convertMeasurement(double value, String unit) {
        if ("feet".equals(unit)) {
            return value * 0.3333;
        } else if ("yards".equals(unit)) {
            return value * 3;
        } else {
            return -1;
        }
    }

    public static void countAAndWriteToFile() throws IOException {
        File inputFile = new File("TheLetterA.txt");
        Scanner sc = new Scanner(inputFile);
        int count = 0;
        StringBuilder content = new StringBuilder();

        while (sc.hasNext()) {
            String line = sc.nextLine();
            content.append(line).append("\n");
            for (char c : line.toCharArray()) {
                if (Character.toLowerCase(c) == 'a') {
                    count++;
                }
            }
        }

        FileWriter writer = new FileWriter("reout.txt");
        writer.write(content.toString());
        writer.close();

        System.out.println("Number of occurrences of 'a' or 'A': " + count);
        sc.close();
    }
}
