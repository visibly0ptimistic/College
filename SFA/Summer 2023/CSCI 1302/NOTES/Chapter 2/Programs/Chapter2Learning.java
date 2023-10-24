/* Java version: 8
 * This program is all about learning the concepts in Chapter 2
 *
 * Sample input:  hard coded & from user
 *
 * Sample run/output:  to the screen
 *	Variables:


	constants:


	Scope of variables:
	3


	Getting user input
	Please enter a whole number
	3


	Math operations
	The result of 4 / 3 is:  1
	The result of 4.0 / 3 is:  1.3333333333333333
	mod:
	The result of 4 % 3 is:  1
	0
	1

	augmentation:
	n1 value:  1, n2 value:  2
	after the augmentation
	n1 value:  3, n2 value:  2

	increment & decrement
	values before the increment & decrement:
	n3 value:  3, n4 value:  4, n5 value:  5, n6 value:  6
	pre examples:
	--n3;  2
	++n4;  5
	values after pre & decrement & increment:
	n3 value:  2, n4 value:  5
	post examples
	n5--;  5
	n6++;  6
	values after post & decrement & increment
	n5 value:  4, n6 value:  7


	conversions
	automatic conversions, aka widening a type, aka implicit casting
	intNumberAuto:  102, doubleNumberAuto:  102.0

	type casting, aka narrowing a type, aka explicit casting
	doubleNumTypeCast:  102.876, intNumTypeCast:  102

	I am only providing some examples, you should practice.  Without practice, you will not fully understand, nor remember all these concepts.
	Practice, practice, practice!  Download the textbook programs and practice with those, change them up; chang this up - just PRACTICE!
	You are in this course, beacuse somehow this content is needed for your choosen profession; so learn it!
 *
 *
 * */

import java.io.*;
import java.util.*;

public class Chapter2Learning {
  public static void main(String[] args) throws IOException {


	// Variables
	System.out.println("Variables:  ");
	// all declaration statement for variables follow the syntax pattern of:
	// dataType identifier;
	int number;
	double numberWithA_DecimalValue;

	// You can also use  the following syntax when you have multiple variables to declare:
	int a, s, d, f;	// this declares a, s, d, and f as int data types

	// all assignning statements for variables follow the syntax pattern of:
	// identifier = value;
	number = 102;
	numberWithA_DecimalValue = 102.987;

	// You can combine declaration and assignning into one statement
	int intNumber = 456;
	double doubleNumber = 456.789;
	System.out.println();
	System.out.println();

	//****************************************************************
	// the data types we will be using in CSCI 1302:
	int num = 42;
	double dNum = 123.456;
	boolean aTrueOrFalseDataType = true; // true and false are reserved/keywords
	char aLetter = 'a';	// char uses ' - single quotation marks
	Sting aWord = "Welcome";	// String uses " - double quotation marks
	Sting aGroupOfWords = "Welcome to Java!";
	int [] ary = new int [10]; // an array is a reference data type that holds elements of the same kind (i.e. this one holds 10 integer values)
	Scanner input = new Scanner(System.in);
	// are you seeing the pattern of the syntax yet?
	// dataType identifier = value;  is for primitive data types
	// dataType identifier = new dataType();  is for reference data types - not much difference
	//****************************************************************

	// constants
	System.out.println("constants:");
	final double PI = 3.14;
	final int COURSE_NUMBER = 1302;
	System.out.println();
	System.out.println();

	System.out.println("Scope of variables:");
	// look at the variables that have been declared so far to evaluate the scope for each one
	// another example of scope:
	{// beginning of a block
		int theAnswer = 3;
		System.out.println(theAnswer); // compiles and works fine here - because it is still in scope
	}// end of the block
	//System.out.println(theAnswer); //doesn't work here - because it is out of scope
	System.out.println();
	System.out.println();

	System.out.println("Getting user input");
	/* Getting input for the program
	 * I use, the import statements with wildcards
	 * import java.io.*;
	   import java.util.*;
	   that way whenever the program needs something
	   		from the class of io (like when it needs to read or write to files, the JVM can use it
	   		and I do not have to remember to import every little thing I need to do those operations)
	   	The Scanner object is in the util class.  We will be using this all the time.
	   	Some compilers will give you a warning regarding the import statements,
	   		stating that since you are not using these statements, it should not be there.
	   		If you do not like to see that, you can simply comment out the lines.
	  */
	 // syntax for Scanner to read from the keyboard:
	 Scanner input = new Scanner(System.in);  // memorize this - you will use it often!
	 /* What does this mean?
	   * It means that you are creating/instansitating a Scanner object with the identifier of input
	   *	it will read the keystrokes that are being typed into the keyboard by the user
	   *
	   * For each data type, there is a method that corresponds to it to read in that value
	   *	Remember that Java is strongly data typed
	   *
	   * When you are getting input from the user, you need to inform the user of this and what to put in.
	   *	Otherwise, the screen is just staring at the user, waiting for the input, but the user does not know this
	   *	and thinks that the program is broken or something is wrong with it.
	 */
	 System.out.println("Please enter a whole number");
	 int userNumber = input.nextInt();
	 /* notice the format of how to use the method nextInt
	  		you use the identifier of the Scanner object, the dot operator, then the method name.
	 */
	 // Now, we have informed the user of what to to and assigned that value to a variable
	 // Nice!
	 System.out.println();
	 System.out.println();

	 System.out.println("Math operations");
	 //Math operations
	 /*  look at your keyboard, do you see a key that puts the X sign in the middle of the line?  No.
	   *  what about the division sign?  No.
	   *  In Java, the * is for multiplication and the / is for division.
	   *  Do NOT forget this!
	 */
	 // int division
	 int intResult = 4 / 3;
	 System.out.println("The result of 4 / 3 is:  " + intResult);

	 // double division
	 double doubleResult = 4.0 / 3;
	 System.out.println("The result of 4.0 / 3 is:  " + doubleResult);

	 // mod
	 System.out.println("mod:");
	 int modResult = 4 % 3;
	 System.out.println("The result of 4 % 3 is:  " + modResult);

	 // finding out if a number is odd or even:
	 // if a number % 2 == 0, then it is even
	 int evenNumber = 4 % 2;
	 System.out.println(evenNumber);
	 // if a number % 2 == 1, then it is odd
	 int oddNumber = 5 % 2;
	 System.out.println(oddNumber);
	 System.out.println();


	 // augmentation
	 System.out.println("augmentation:");
	 int n1 = 1;
	 int n2 = 2;
	 System.out.println("n1 value:  " + n1 + ", n2 value:  " + n2);
	 n1 += n2;
	 System.out.println("after the augmentation");
	 System.out.println("n1 value:  " + n1 + ", n2 value:  " + n2);
	 System.out.println();

	 //increment & decrement
	 System.out.println("increment & decrement");
	 int n3 = 3;
	 int n4 = 4;
	 int n5 = 5;
	 int n6 = 6;
	 System.out.println("values before the increment & decrement:");
	 System.out.println("n3 value:  " + n3 + ", n4 value:  " + n4 + ", n5 value:  " + n5 + ", n6 value:  " + n6);
	 // pre examples (modify, then use)
	 System.out.println("pre examples:");
	 System.out.println("--n3;  " + --n3); // pre and decrement by 1
	 System.out.println("++n4;  " + ++n4); // pre and increment by 1
	 System.out.println("values after pre & decrement & increment:");
	 System.out.println("n3 value:  " + n3 + ", n4 value:  " + n4);

	 // post examples (use, then modify)
	 System.out.println("post examples");
	 System.out.println("n5--;  " + n5--); // post and decrement by 1
	 System.out.println("n6++;  " + n6++); // post and increment by 1
	 System.out.println("values after post & decrement & increment");
	 System.out.println("n5 value:  " + n5 + ", n6 value:  " + n6);
	 System.out.println();
	 System.out.println();

	 // conversions
	 System.out.println("conversions");
	 // automatic conversions:
	 System.out.println("automatic conversions, aka widening a type, aka implicit casting");
	 int intNumberAuto = 102;
	 double doubleNumberAuto = intNumberAuto;
	 System.out.println("intNumberAuto:  " + intNumberAuto + ", doubleNumberAuto:  " + doubleNumberAuto);
	 System.out.println();

	 // type casting
	 System.out.println("type casting, aka narrowing a type, aka explicit casting");
	 double doubleNumTypeCast = 102.876;
	 int intNumTypeCast = (int)doubleNumTypeCast;
	 System.out.println("doubleNumTypeCast:  " + doubleNumTypeCast + ", intNumTypeCast:  " + intNumTypeCast);
	 System.out.println();

	 System.out.println("I am only providing some examples, you should practice.  Without practice, you will not fully understand, nor remember all these concepts.");
	 System.out.println("Practice, practice, practice!  Download the textbook programs and practice with those, change them up; chang this up - just PRACTICE!");
	 System.out.println("You are in this course, beacuse somehow this content is needed for your choosen profession; so learn it!");

  }// end main
}// end of Chapter2Learning
