/**
    Author: Victor Ejiasi
    Java Version: JDK 18
    Purpose: This program creates a payroll report for the Lumberjack Workforce. It reads daily working hours of employees from 'payrollData.txt', calculates the gross pay and net pay for each employee, and writes the results to 'payrollOutput.txt'.
    Input Source: The input data is read from the file named 'payrollData.txt'.
    Output Destination: The output is written to the file named 'payrollOutput.txt'.
    Sample Run: After running the program, 'payrollOutput.txt' will have entries for each employee indicating their pay rate, total hours worked for the week, gross pay, and net pay.
 */


import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class ejiasiv_MDA_Payroll_Program {
    public static void main(String[] args) {
        final double RATE = 7.50;
        final double TAX_RATE = 0.10;
        
        // Declare a Scanner to read from file, payrollData.txt
        Scanner input = null;
        try {
            input = new Scanner(new File("payrollData.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            System.exit(1);
        }
        
        // Read in the "row"= the number of employees
        int numberOfEmployees = input.nextInt();
        
        // Declare the 2D array
        int[][] employeeHours = new int[numberOfEmployees][7];
        
        // Loop to read in data into a 2D array
        for (int i = 0; i < numberOfEmployees; i++) {
            for (int j = 0; j < 7; j++) {
                employeeHours[i][j] = input.nextInt();
            }
        }
        input.close();

        // Declare a PrintWriter to write to payrollOutput.txt file
        PrintWriter output = null;
        try {
            output = new PrintWriter("payrollOutput.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error creating output file!");
            System.exit(1);
        }

        // Print titles
        output.println("Employee\tRate\tTotal Hours Worked\tGross Pay\tNet Pay");

        // Loop to process and print data
        for (int i = 0; i < numberOfEmployees; i++) {
            int totalHoursWorked = 0;
            for (int j = 0; j < 7; j++) {
                totalHoursWorked += employeeHours[i][j];
            }
            
            double grossPay = totalHoursWorked * RATE;
            double netPay = grossPay * (1 - TAX_RATE);
            
            output.printf("%d\t%.2f\t%d\t%.2f\t%.2f%n", i, RATE, totalHoursWorked, grossPay, netPay);
        }
        output.close();
    }
}
