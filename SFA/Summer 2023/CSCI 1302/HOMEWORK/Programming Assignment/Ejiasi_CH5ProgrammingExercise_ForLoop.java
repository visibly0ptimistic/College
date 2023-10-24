/*
   Name: Victor Ejiasi
   Date: 06/21/2023
   Course Section: CSCI 1302
   Purpose of Program: Chapter 5 Programming Exercise For Loop
*/

import java.util.Scanner;

public class Ejiasi_CH5ProgrammingExercise_ForLoop {
    public static void main(String[] args) {
        printMilesToKilometers();
        printKilogramsToPounds();
        printMultiplesOfTwoAndThree();
        countPassingGrades();
        calculateAverageGrade();
        printASCIICharacters();
    }

    public static void printMilesToKilometers() {
        System.out.printf("%-10s %-10s%n", "Miles", "Kilometers");
        for (int miles = 5; miles <= 100; miles += 5) {
            double kilometers = miles * 1.609;
            System.out.printf("%-10d %-10.2f%n", miles, kilometers);
        }
        System.out.println();
    }

    public static void printKilogramsToPounds() {
        System.out.printf("%-10s %-10s%n", "Kilograms", "Pounds");
        for (int kilograms = 20; kilograms >= 1; kilograms--) {
            double pounds = kilograms * 2.2;
            System.out.printf("%-10d %-10.2f%n", kilograms, pounds);
        }
        System.out.println();
    }

    public static void printMultiplesOfTwoAndThree() {
        for (int i = 0; i <= 200; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void countPassingGrades() {
        Scanner scanner = new Scanner(System.in);
        int passingGrades = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter grade " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            if (grade >= 60) {
                passingGrades++;
            }
        }

        System.out.println("Number of passing grades: " + passingGrades);
        System.out.println();
    }

    public static void calculateAverageGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of grades: ");
        int numGrades = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < numGrades; i++) {
            System.out.println("Enter grade " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            sum += grade;
        }

        double average = (double) sum / numGrades;
        System.out.println("The average grade is: " + average);
        System.out.println();
    }

    public static void printASCIICharacters() {
        for (int i = 0; i < 128; i++) {
            System.out.printf("%3d: %c", i, (char) i);
            if (i % 10 == 9) {
                System.out.println();
            } else {
                System.out.print("\t");
            }
        }
        System.out.println();
    }
}
