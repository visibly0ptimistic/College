/*
   Name: Victor Ejiasi
   Date: 06/04/2023
   Course Section: CSCI 1302
   Purpose of Program: Chapter 2 Program Assignment
*/

import java.util.Scanner;

public class Ejiasi_Chapter2ProgrammingAssignment {
   public static void main(String[] args){

      // CSC 102 Chapter 2 Program Assignment

      // Things to remember:
      // Think about the data types, don’t forget about constants.
      // Make sure to make it user friendly – the user has to know what is going on.
      // __________________________________________________________________________________________________
      // Problem:	You have just been hired as a fabric merchandiser.  Your job is to purchase the fabric from the textile factories in Europe.  To do so, you will need to create a program that converts the desired yards needed to fill the order to meters.  (5 pts)
      // Procedure:	The formula is:  meters = yards * 0.9144
      // 	Ask the user for how many yards, convert, and then display the result.  Note that the conversion rate never changes (it is constant).
      // Example:	for a 100 yards to be converted into meters - 91.44 meters = 100 yards * 0.9144

      Scanner input = new Scanner(System.in);

      // Prompt user for input
      System.out.print("Enter the number of yards: ");
      double yards = input.nextDouble();

      // Convert yards to meters
      double meters = yards * 0.9144;

      // Display result
      System.out.println(yards + " yards is equal to " + meters + " meters.");


      // Problem:	You have just started working.  You want to be able to calculate your paychecks.  (For the purpose of this, we are using the lowest tax bracket of 10%.)  (5 pts)
      // Procedure:	The formulas are:  	gross pay =  pay rate * how many hours worked 
      // 				net pay = gross pay - gross pay * 10%
      // 	Ask the user for pay rate and how many hours worked, calculate, and display the result.
      // Example:	for 20 hours at $7.25 an hour the net pay is $130.5

      // Prompt user for input
      System.out.print("Enter pay rate: ");
      double payRate = input.nextDouble();

      System.out.print("Enter hours worked: ");
      double hoursWorked = input.nextDouble();

      // Calculate gross pay
      double grossPay = payRate * hoursWorked;

      // Calculate net pay
      double netPay = grossPay - (grossPay * 0.1);

      // Display result
      System.out.printf("For %.2f hours at $%.2f an hour the net pay is $%.2f", hoursWorked, payRate, netPay);


      // Problem:	You want to be able to plan for vacation time!  You want to create an app that will let you know how much the gasoline part will cost. (5 pts)
      // Procedure:	The formulas are:  
      // how many gallons = road trip distance / how many miles to the gallon
      // 		gas cost = how many gallons * current gas price
      // 	Ask the user for the required information and display the information.
      // Example:	Gas price:  $2.35
      // 		How many miles to the gallon:  28.6
      // Round Trip distance:  150 miles
      // Gasoline Cost = $12.33
      System.out.print("\n");
      System.out.print("Enter current gas price per gallon: $");
      double gasPrice = input.nextDouble();

      System.out.print("Enter car mileage (miles per gallon): ");
      double carMileage = input.nextDouble();

      System.out.print("Enter round trip distance (in miles): ");
      double tripDistance = input.nextDouble();

      // Calculate the cost
      double tripCost = calculateTripCost(gasPrice, carMileage, tripDistance);

      System.out.printf("Gasoline Cost = $%.2f%n", tripCost);

      input.close();
   }

   private static double calculateTripCost(double gasPrice, double carMileage, double tripDistance) {
      double numGallons = tripDistance / carMileage;
      return numGallons * gasPrice;
   }
}