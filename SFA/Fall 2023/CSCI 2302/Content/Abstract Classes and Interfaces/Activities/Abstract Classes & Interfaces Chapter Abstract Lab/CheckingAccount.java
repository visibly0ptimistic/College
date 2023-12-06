/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose:  checking account class for the bank program
   
   Input:  hard coded in the program
   
   
   Output: to the console
   
   Other associated files: SavingsAccount.java, Account.java, TestBank.java
*/

// ****************************************************************************

/*
   Inherits from abstract class Account
   2.	Modify the CheckingAccount.java to inherit from the Account class.
      a.	In the CheckingAccount Modify the withdraw method by implementing
         an overdraft protection that charges $35.00 when there is NSF 
         (non-sufficient funds) and allow the withdrawal; meaning, if 
         there is not enough funds to cover the withdraw, the account 
         will be charged $35.00.
*/

public class CheckingAccount extends Account{
    private static final double OVERDRAFT_FEE = 35.00;

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(int id, double balance, double interestRate) {
        super(id, balance, interestRate);
    }

    @Override
    public double withDraw(double amount) {
        if(super.getBalance() < amount) {
            System.out.println("NSF - Overdraft Protection invoked");
            super.withDraw(amount + OVERDRAFT_FEE);
        } else {
            super.withDraw(amount);
        }
        return super.getBalance();
    }

    @Override
    public String toString() {
        return "Checking " + super.toString();
    }
}
 // end CheckingAccount
