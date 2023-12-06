/* This application program is to see the difference between next() and nextLine() methods
 *
 * Sample input: user input
 *
 *  */

import java.io.*;
import java.util.*;

public class DifferenceBetweenNextAndNextLine {
  public static void main(String[] args) {

  	// data dictionary
  	Scanner input = new Scanner(System.in);
  	int number1;
  	int number2;
  	int number3;
  	String word1;
  	String word2;
  	String word3;
  	String emptyString;
  	String word4;

  	System.out.println("This program will help you see the difference between next() and nextLine()");
  	System.out.println("First you will see how next() works reading in a single word");
  	System.out.println("Second, you will see how nextLine() works after a user enters data and hits the return key");
  	System.out.println("Third, will repeat the first (just so you know you are crazy)");
  	System.out.println("Lastly, you will see the benefit of nextLine()");
  	System.out.println();
  	System.out.println();

  	System.out.println("Please enter a number");
  	number1 = input.nextInt();
  	System.out.println("The number you entered is: " + number1);
  	System.out.println();

  	System.out.println("Please enter a single word -next() ");
  	word1 = input.next();
  	System.out.println("The word you entered is " + word1);
  	System.out.println();

  	System.out.println("Let's try this again:");
  	System.out.println();

  	System.out.println("Please enter a number");
  	number2 = input.nextInt();
  	System.out.println("The number you entered is: " + number2);
  	System.out.println();

  	System.out.println("Please enter a group of word -nextLine()");
  	word2 = input.nextLine();
  	System.out.println("The word you entered is " + word2);
  	System.out.println();

  	System.out.println("What just happened!?  You did not get to enter in that data!");
  	System.out.println("Is that what you expected?");
	System.out.println();
  	System.out.println();

  	System.out.println("Let's try this again!");
  	System.out.println();

  	System.out.println("Please enter a number");
  	number3 = input.nextInt();
  	System.out.println("The number you entered is: " + number3);
  	System.out.println();

  	System.out.println("Please enter a word -next()");
  	word3 = input.next();
  	System.out.println("The word you entered is " + word3);
  	System.out.println();

  	System.out.println("Why did it work \"correctly\" the first and third time?");
  	System.out.println("It is the difference between next() and nextLine()");
  	System.out.println("next() reads until a white space - the space bar");
  	System.out.println("nextLine() reads until a carriage return - the enter key");
  	System.out.println();
  	System.out.println("Since most of us hit the enter key and not the space bar when enter in data, the nextLine may not allow the data to be entered in as we expect.");
  	System.out.println();
  	System.out.println("the nextLine() though will allow for more than 1 word to be stored into a variable.");
  	System.out.println();

  	System.out.println("BUT! you may have to \"clear\" the carriage-enter key");
  	emptyString = input.nextLine();
  	System.out.println();
  	System.out.println();

  	System.out.println("see how nextLine() works - ");
  	System.out.println();
  	System.out.println("Please enter a group of words");
  	word4 = input.nextLine();
  	System.out.println("The words you entered are " + word4);


  }// end main
}// end of DifferenceBetweenNextAndNextLine
