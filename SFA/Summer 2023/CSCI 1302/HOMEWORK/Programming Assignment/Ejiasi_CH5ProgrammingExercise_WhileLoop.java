/*
   Name: Victor Ejiasi
   Date: 06/21/2023
   Course Section: CSCI 1302
   Purpose of Program: Chapter 5 Programming Exercise While Loop
*/

import java.util.Scanner;
import java.util.Random;

public class Ejiasi_CH5ProgrammingExercise_WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // Print your name 10 times
        for (int i = 0; i < 10; i++) {
            System.out.println("Victor");
        }

        // When the value of speed is over 40 (the speed limit), print "Slow down"
        // and reduce speed by 1 until the speed is under the speed limit
        int speed = 45; // assuming initial speed is 45
        while (speed > 40) {
            System.out.println("Slow down");
            speed--;
        }

        // Ask the user for 5 temperatures, display the highest temperature entered
        System.out.println("Enter 5 temperatures:");
        int max = scanner.nextInt();
        for (int i = 1; i < 5; i++) {
            int temp = scanner.nextInt();
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println("The highest temperature entered is: " + max);

        // Generate a random number between 1 and 10.
        // Ask the user to guess the number, stop when the user has guessed the right number
        int number = rand.nextInt(10) + 1;
        int guess = 0;
        while (guess != number) {
            System.out.println("Guess the number:");
            guess = scanner.nextInt();
        }
        System.out.println("Congratulations! You guessed the number.");

        // Ask the user to enter a list of numbers and print the sum of all the numbers entered.
        // The user should enter -1 to indicate they have entered all the data.
        int sum = 0;
        while (true) {
            System.out.println("Enter a number:");
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
        }
        System.out.println("The sum of all numbers entered is: " + sum);

        // Ask the user to enter a list of numbers (positive and negative).
        // Entering 0 will quit. Sum up the negative numbers and display the total.
        // Sum up the positive numbers and display the total.
        int sumPositive = 0;
        int sumNegative = 0;
        while (true) {
            System.out.println("Enter a number:");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num > 0) {
                sumPositive += num;
            } else {
                sumNegative += num;
            }
        }
        System.out.println("The sum of all positive numbers entered is: " + sumPositive);
        System.out.println("The sum of all negative numbers entered is: " + sumNegative);

        scanner.close();
    }
}
