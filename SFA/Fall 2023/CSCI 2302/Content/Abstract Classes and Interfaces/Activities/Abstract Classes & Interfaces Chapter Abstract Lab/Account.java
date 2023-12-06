/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose:  abstract class for the bank program
   
   Input:  hard coded in the program
   
   Output: to the console
   
   Other associated files: CheckingAccount.java, SavingsAccount.java, TestBank.java
*/

// ****************************************************************************

/*
   Define the abstract class Account
   1.	Implement an abstract class based on the Account UML diagram.
*/

import java.util.Date;

public abstract class Account {
    private int id;
    private double balance;
    private double interestRate;
    private Date dateCreated;

    public Account() {
        this.dateCreated = new Date();
    }

    public Account(int id, double balance, double interestRate) {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
        this.dateCreated = new Date();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public double getMonthlyInterestRate() {
        return this.interestRate / 12.0;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public String toString() {
        return "Account ID: " + this.id + " Balance: $" + this.balance + " Rate: " + this.interestRate + "%";
    }

    public double updateInterest() {
        double interest = (this.balance * this.interestRate) / 100;
        this.balance += interest;
        return interest;
    }

    public double withDraw(double amount) {
        this.balance -= amount;
        return this.balance;
    }

    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }
}
