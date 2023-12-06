/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose: To work with inheritance and abstract classes
   
   This program uses an abstract class and two extended classes
      to create two objects, a savings account and a checking
      account.
      
   Input:  none   Output:  information about the account objects
   
   Sample input:  hardcoded in the program
   
   Sample output:  to the screen

   Sample run:
		Creating accounts
		Savings Account: Account ID: 2526 Balance: $20000.0 Rate: 4.5%
		Checking Account: Account ID: 3565 Balance: $150.0 Rate: 1.25%

		Updating Interest
		Savings Account: Account ID: 2526 Balance: $20900.0 Rate: 4.5%
		Checking Account: Account ID: 3565 Balance: $151.875 Rate: 1.25%

		Processing Withdrawals
		Savings Account: Account ID: 2526 Balance: $15900.0 Rate: 4.5%
		Checking Account: NSF - Overdraft Protection invoked
		Account ID: 3565 Balance: $-183.125 Rate: 1.25%

		Processing Deposits
		Savings Account: Account ID: 2526 Balance: $25900.0 Rate: 4.5%
		Checking Account: Account ID: 3565 Balance: $16.875 Rate: 1.25%

		Thanks for your business!

*/

public class TestBank {
    public static void main(String[] args) {
        System.out.println("Creating accounts");
        SavingsAccount savingsAccount = new SavingsAccount(2526, 20000, 1.5);
        printOutAccount(savingsAccount);

        CheckingAccount checkingAccount = new CheckingAccount(3565, 150, 1.05);
        printOutAccount(checkingAccount);

        System.out.println("\nUpdating Interest");
        savingsAccount.updateInterest();
        printOutAccount(savingsAccount);
        checkingAccount.updateInterest();
        printOutAccount(checkingAccount);

        System.out.println("\nProcessing Withdrawals");
        savingsAccount.withDraw(5000);
        printOutAccount(savingsAccount);
        checkingAccount.withDraw(300);
        printOutAccount(checkingAccount);

        System.out.println("\nProcessing Deposits");
        savingsAccount.deposit(10000);
        printOutAccount(savingsAccount);
        checkingAccount.deposit(200);
        printOutAccount(checkingAccount);

        System.out.println("\nThanks for your business!");
    }  // end main

   /*
      Implement a method, printOutAccount, that accepts Account objects 
      as the argument and prints the id, balance, and the interestRate.
   */
   public static void printOutAccount(Account account) {
   System.out.println(account);
}

} // end TestBank



