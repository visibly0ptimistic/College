// Importing necessary libraries for input and output
import java.util.Scanner;
import java.io.*;

public class LearningJava {

    // Main method to run the program
    public static void main(String[] args) {
        
        // Printing a string to console
        System.out.println("Hello, Java!");
        
        // Demonstrating Variables and Data Types
        int number = 5; // Integer
        double decimal = 5.5; // Double-precision floating point
        boolean isTrue = true; // Boolean (true/false)
        char character = 'A'; // Character
        String text = "Java String"; // String
        
        // Printing the variables
        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimal);
        System.out.println("Boolean: " + isTrue);
        System.out.println("Character: " + character);
        System.out.println("String: " + text);
        
        // Demonstrating If Statement
        if(number > 3) {
            System.out.println("Number is greater than 3");
        } else {
            System.out.println("Number is not greater than 3");
        }
        
        // Demonstrating a simple array
        int[] array = {1, 2, 3, 4, 5};
        // Printing array elements
        for(int i : array) {
            System.out.println("Array Element: " + i);
        }
        
        // Demonstrating a simple recursion method to find factorial
        System.out.println("Factorial of 5: " + factorial(5));
        
        // Demonstrating a simple user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some text:");
        String userInput = scanner.nextLine();
        System.out.println("User Input: " + userInput);
        
        // Closing the scanner object to prevent resource leak
        scanner.close();
        
        // Demonstrating writing to a file
        try (PrintWriter writer = new PrintWriter(new File("output.txt"))) {
            writer.println("This is a sample text written to a file.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        // Demonstrating problem solving
        System.out.println("Let's solve a problem!");
        // Define a Problem: Find the sum of an array
        int[] numbers = {1, 2, 3, 4, 5};
        // Design an Algorithm: Traverse the array and add each element to the sum
        int sum = 0;
        for(int i : numbers) {
            sum += i;
        }
        // Implement a Solution
        System.out.println("The sum of the array is: " + sum);
    }
    
    // A simple recursive method to find factorial of a number
    public static int factorial(int n) {
        if(n <= 0) return 1;
        return n * factorial(n-1);
    }
}
