/*
  Victor Ejiasi
  
  CSCI 2302-001
 *	Java Version 8
 *	Purpose:  to practice with Exception Handling
 *
 *	Input:	Read the input from a file, ehLabIn.txt. (format: annualInterestRate, loanAmount, numOfYears).

	Data:	3.6, 30, 100000
			-1, 5, 25000
			3.88, -3, 250000
			8.91, 7, -20000

	Output: 	Save the results to a file, ehLabOut.txt

	Example of a run:

		Creating loan:  3.6 APR, for 30 years, with a loan amount of $100000
		Loan created!
		Creating loan:  -1 APR, for 5 years, with a loan amount of $25000
		java.lang.IllegalArgumentException: Annual interest rate must be positive.
		Creating loan:  3.88 APR, for -3 years, with a loan amount of $250000
		java.lang.IllegalArgumentException: Number of years must be positive.
		Creating loan:  8.91 APR, for 7 years, with a loan amount of $-20000
		java.lang.IllegalArgumentException: Loan amount must be positive.
		End of program

 *
 */

import java.io.*;
import java.util.*;

public class Ejiasiv_ExceptionHandling_UsingLibraryLab{

  public static void main(String[] args)  throws IOException{

	File file = new File("ehLabIn.txt");
  	Scanner in = new Scanner(file);
  	File outFile = new File("ehLabOut.txt");
  	PrintWriter out = new PrintWriter(outFile);

  	double apr;
  	int numOfYears;
  	double loanAmount;
  	NewLoan loan;

  	while(in.hasNext()){
  		apr = in.nextDouble();
  		numOfYears = in.nextInt();
  		loanAmount = in.nextDouble();

  		// step 2:  
      // 2.	In the main method, add the try..catch around the  code that instantiates the NewLoans objects. 
      try {
          loan = new NewLoan(apr, numOfYears, loanAmount);
      } catch (Exception ex) {
          System.out.println(ex);
          out.println(ex);
      }

      try{
	      //System.out.println("Creating loan:  " + apr + " APR, for " + numOfYears + " years, with a loan amount of $" + loanAmount);
	      out.println("Creating loan:  " + apr + " APR, for " + numOfYears +
	      	" years, with a loan amount of $" + loanAmount);
	      loan = new NewLoan(apr, numOfYears, loanAmount);
  		}
  		catch (Exception ex) {
      		System.out.println(ex);
      		out.println(ex);
    	}
    	System.out.println();
    	out.println();

  	}// end while

	in.close();
	out.close();
   System.out.println("End of program");
  }
}// end ExceptionHandling_UsingLibraryLab

class NewLoan {
  private double annualInterestRate;
  private int numOfYears;
  private double loanAmount;

  /** Default constructor */
  public NewLoan() {
	this(2.5, 1, 1000);
  }

  /*
    Construct a NewLoan with specified annual interest rate,
      number of years and loan amount
  */
  public NewLoan(double annualInterestRate, int numOfYears, double loanAmount) {
      if (annualInterestRate <= 0) {
          throw new IllegalArgumentException("Annual interest rate must be positive.");
      }
      if (numOfYears <= 0) {
          throw new IllegalArgumentException("Number of years must be positive.");
      }
      if (loanAmount <= 0) {
          throw new IllegalArgumentException("Loan amount must be positive.");
      }

      this.setAnnualInterestRate(annualInterestRate);
      this.setNumOfYears(numOfYears);
      this.setLoanAmount(loanAmount);
      System.out.println("Loan created!");
  }


  /** Return annualInterestRate */
  public double getAnnualInterestRate() {
    return this.annualInterestRate;
  }

  /** Set a new annualInterestRate */
  public void setAnnualInterestRate(double annualInterestRate) {
    /*add your code to throw IllegalArgumentExceptions if
      annualInterestRate value is less than or equal to zero
    */
  }

  /** Return numOfYears */
  public int getNumOfYears() {
    return this.numOfYears;
  }

  /** Set a new numOfYears */
  public void setNumOfYears(int numOfYears) {
    /*add your code to throw IllegalArgumentExceptions if
      numOfYears value is less than or equal to zero
    */
  }

  /** Return loanAmount */
  public double getLoanAmount() {
    return this.loanAmount;
  }

  /** Set a newloanAmount */
  public void setLoanAmount(double loanAmount) {
    /*add your code to throw IllegalArgumentExceptions if
      loanAmount value is less than or equal to zero
    */
  }

  /** Find monthly payment */
  public double monthlyPayment() {
    double monthlyInterestRate = this.annualInterestRate / 1200;
    return this.loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), this.numOfYears * 12)));
  }

  /** Find total payment */
  public double totalPayment() {
    return this.monthlyPayment() * this.numOfYears * 12;
  }
}//end NewLoan
