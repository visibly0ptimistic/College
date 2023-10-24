/*
   Name: Victor Ejiasi
   Date: 06/11/2023
   Course Section: CSCI 1302
   Purpose of Program: Chapter 4 Programming Exercises Part 1
*/

import java.util.Scanner;

public class Ejiasi_CH4ProgrammingExercisesPart1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Smallest number
        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double smallest = Math.min(Math.min(num1, num2), num3);
        System.out.println("The smallest number is: " + smallest);

        // Largest number
        System.out.println("Enter three numbers:");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        num3 = scanner.nextDouble();
        double largest = Math.max(Math.max(num1, num2), num3);
        System.out.println("The largest number is: " + largest);

        // Number -99.5478
        double number = -99.5478;
        double absoluteValue = Math.abs(number);
        double roundedUp = Math.ceil(number);
        double roundedDown = Math.floor(number);
        double rounded = Math.round(number);
        char positiveChar = (char) Math.abs(number);

        System.out.println("Absolute value: " + absoluteValue);
        System.out.println("Rounded up: " + roundedUp);
        System.out.println("Rounded down: " + roundedDown);
        System.out.println("Rounded: " + rounded);
        System.out.println("Positive value as char: " + positiveChar);

        // ASCII code equivalence
        System.out.println("Enter a number within the range of the ASCII table:");
        int asciiNumber = scanner.nextInt();
        char asciiChar = (char) asciiNumber;
        System.out.println("Equivalent character: " + asciiChar);

        // Vehicle license plate
        String licensePlate = generateLicensePlate();
        System.out.println("Generated Texas vehicle license plate: " + licensePlate);
    }

    public static String generateLicensePlate() {
        StringBuilder licensePlate = new StringBuilder();
        // Generate 3 uppercase characters
        for (int i = 0; i < 3; i++) {
            char randomChar = (char) (Math.random() * 26 + 'A');
            licensePlate.append(randomChar);
        }
        // Generate 4 random digits
        for (int i = 0; i < 4; i++) {
            int randomDigit = (int) (Math.random() * 10);
            licensePlate.append(randomDigit);
        }
        return licensePlate.toString();
    }
}