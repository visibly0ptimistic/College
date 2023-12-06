/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose:  savings account class for the bank program
   
   Input:  hard coded in the program
   
   
   Output: to the console
   
   Other associated files: CheckingAccount.java, Account.java, TestBank.java
*/

// ****************************************************************************

/*
   Inherits from abstract class Account
   2.	Modify the SavingsAccount.java to inherit from the Account class.
*/

public class SavingsAccount extends Account {
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance, double interestRate) {
        super(id, balance, interestRate);
    }

    @Override
    public String toString() {
        return "Savings " + super.toString();
    }
} // end SavingsAccount

