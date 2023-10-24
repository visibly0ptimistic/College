import java.util.Scanner;

public class Ejiasi_CH5ProgrammingAssignment_ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for an initial cash investment
        System.out.print("Please enter the initial cash amount: ");
        double value = scanner.nextDouble();

        // Ask the user for the annual percentage yield
        System.out.print("Enter annual percentage yield: ");
        double annualInterestRate = scanner.nextDouble();

        // Modify the annual interest rate to become a monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Ask the user for how many months till maturity
        System.out.print("How many months to be invested? ");
        int months = scanner.nextInt();

        // Print titles for the table
        System.out.println("Month\tCapital Value");

        // Loop to calculate the interest accrued each month and display the month and the current capital value
        for (int i = 1; i <= months; i++) {
            value = value * (1 + monthlyInterestRate);
            System.out.printf("%4d\t$%,.2f\n", i, value);
        }

        scanner.close();
    }
}
