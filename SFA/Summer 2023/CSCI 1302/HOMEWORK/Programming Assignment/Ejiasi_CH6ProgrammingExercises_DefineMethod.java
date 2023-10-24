/*
   Name: Victor Ejiasi
   Date: 06/26/2023
   Course Section: CSCI 1302
   Purpose of Program: Chapter 6 Programming Exercises Define Method
*/

 import java.util.Scanner;

public class Ejiasi_CH6ProgrammingExercises_DefineMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        System.out.println("Welcome to the Area Calculator!");
        System.out.println("This program calculates the area for the following shapes: circle, square, rectangle, and triangle.");

        while (!quit) {
            System.out.println("\nSelect a shape to calculate its area:");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Rectangle");
            System.out.println("4. Triangle");
            System.out.println("5. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the radius of the circle:");
                    double radius = scanner.nextDouble();
                    double circleArea = calculateCircleArea(radius);
                    System.out.println("The area of the circle is: " + circleArea);
                    break;
                case 2:
                    System.out.println("Enter the side length of the square:");
                    double side = scanner.nextDouble();
                    double squareArea = calculateSquareArea(side);
                    System.out.println("The area of the square is: " + squareArea);
                    break;
                case 3:
                    System.out.println("Enter the base length of the rectangle:");
                    double base = scanner.nextDouble();
                    System.out.println("Enter the height of the rectangle:");
                    double height = scanner.nextDouble();
                    double rectangleArea = calculateRectangleArea(base, height);
                    System.out.println("The area of the rectangle is: " + rectangleArea);
                    break;
                case 4:
                    System.out.println("Enter the base length of the triangle:");
                    double triBase = scanner.nextDouble();
                    System.out.println("Enter the height of the triangle:");
                    double triHeight = scanner.nextDouble();
                    double triangleArea = calculateTriangleArea(triBase, triHeight);
                    System.out.println("The area of the triangle is: " + triangleArea);
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
                    break;
            }
        }

        System.out.println("\nThank you for using the Area Calculator. Goodbye!");
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateRectangleArea(double base, double height) {
        return base * height;
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
