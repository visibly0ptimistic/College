/*
 * This program is to explain the concepts of chapter 5 - loops
 */

   import java.io.*;
   import java.util.*;

   public class Chapter5Learning {
      public static void main(String[ ] args) {

      	Scanner input = new Scanner(System.in);

      	// we need to understand the scope of a variable
      	// the scope of a variable is from when the variable is declared to the closing }
      	{// these braces denote a block of code
      		//all variables declared here cannot be accessed outside of these braces
      		int numberInsideBraces = 102;
      		System.out.println("having access to the variable, numberInsideBraces:  " + numberInsideBraces);
      	}

      	//take away the comments and try to see if the following line will compile
      	//System.out.println("NOT having access to the variable, numberInsideBraces:  " + numberInsideBraces);
      	// you should have had an error:  error: cannot find symbol, because that scope ended with the }

      	// try this several times with other vairables

      	//****************************************************

      	//Now that we understand the scope, that will add to our understanding of loops

      	// What is a loop?  a loop is a construct that allows us programmers the ability to repeat a section of code
      	// How this repeats depends on how we set the loop to repeat
      	// Why do we want a loop?  Well, what if we wanted to add 100 numbers entered from the keyboard?
      	// I don't know about you, but I would lose count on the pasting of 100 times!

      	// *****!!!!!! each time a loop executes, it is called an iteration !!!!!!********

      	// there are three parts of a loop
      	/* 1. the variable that "controls" the loop, generally called the lcv:  loop control variable
      	 * 2. the test - the test has to be set up so that when the test is true, the loop evaluates the statements inside the loop brackets
      	 *	and will eventually turn false to stop executing the loop statments
      	 * 3. modify the lcv so that the test can be false eventually
      	*/

      	// the loop that can do it all is the while loop

      	// the structure of the while loop
      	/* while(booleanTest){
      	/*	statements to execute;
      	 * 	modify lcv;
      	 * }// end while loop
      	*/

      	// Example:  let's add 10 numbers
      	System.out.println("Here is a loop to add 10 numbers");
      	int count = 0; // the lcv; we will use this to count to 10
      	// notice that this is declared prior to the loop so it is not reset each time the loop evaluates
      	int num;  // I am declaring this outside the loop to save on memory, so that a memory spot does not have to be created each iteration
      	int sum = 0; // this HAS to be declared and assigned to zero prior to the loop
      				 // if this is not declared and assigned here, then the sum gets reset in each iteration and does not have the correct running total
      	while(count < 10){ // a boolean test to be true to count to 10 and turn false after the 10th iteration
      		System.out.println("Please enter a number to be added");
      		num = input.nextInt();// getting the number from the user
      		sum = sum + num;  // adding that number to the value of sum
      		// sum += num;  shortcut way of the previous statement
      		count++; // modifing the lcv so that it will reach the boolean test to turn false
      	}// end while loop
      	System.out.println("The sum of those numbers:  " + sum);

      	System.out.println("Let's try that another way");
      	System. out.println("Instead of adding a finite number, we will continue until the user wants to quit");
      	String cont = "yes";  // the the lcv
      	sum = 0; // I am reusing the variable sum, so no need to declare, just reassign back to zero
      	while(cont.equalsIgnoreCase("yes")){ // boolean test (set up user friendly)
      		System.out.println("Please enter a number to be added");
      		num = input.nextInt();// getting the number from the user
      		sum += num; // adding the value to sum
      		System.out.println("Do you want to continue?  Please enter yes if you want to continue, and anything else if you want to stop.");
      		cont = input.next();  // modifing the lcv
      	}// end while
      	System.out.println("The sum of those numbers:  " + sum);

      	/*Things to keep in mind:
      	   1.  the placement of the variables
      	   2.  the order - the flow - the sequence of how the code is executing
      	   3.  keep it user friendly!
      	*/

      	/*Loop Design Strategies
      	 *1. identify what has to be repeated
      	 *		identify the variables, which ones need to be prior to the loop and which needs to be inside the loop
      	 *2. encase those statements with {}
      	 *3. wrap in a simple loop that will execute one time
      	 *4. modify the loop to be set up as needed for that particular code
      	*/

      	System.out.println("ERRORS");
      	// the common ones:
      	/* 1.  one-off
      	 *		what does that mean?  It means you are doing a counting loop
      	 *		and the loop executed one too many iterations or one too few iteratins
      	 * 2. infinite loop
      	 *		what does that mean?  It means the loop never ends
      	 *		most common error of this is to forget to modify the lcv
      	 *		another way is not have the boolean test set up right
      	 *		another way is to forget to modify the lcv
      	 *  other errors
      	 *** having the variables in the "wrong spot"
      	 *		meaning the sum is declared and assigned inside the loop, or something like that
      	 *		or the modification of the lcv is outside of the loop
      	 *** do NOT forget that the double data type is not stored with accuracy
      	*/

      	System.out.println("the FOR loop - it is only a counting loop!");
		System.out.println("If you know how many times a loop will execute, use a for loop.");
		// FYI:  even if you write a counting loop in the while loop format, the compiler will write a for loop in the ByteCode
		// the for loop is just that more effient

		/*  syntax for loop
		 for(int i = 0; i < numberLimit; i++){
		 	statements to be executed;
		 }// end for loop

		 break down of the parts:
		 int i = 0;   this is declaring and assigning the lcv to 0
		 	It is important to know that this statement is only executed once, prior to entering the loop
		 	i is a standard, i stands for iteration
		 i < numberLimit;  this is the boolean test with the lcv
		 	It is executed prior to each iteration
		 i++  the modification of the lcv
		 	this is executed at the end of each iteration
		*/

		System.out.println("Example of the for loop, averaging 5 numbers");
		sum = 0;  // reusing sum, assigning it zero
		int i;  // I am declaring i here so I can use this variable outside of the for loop
			// i is doing double duty - the lcv and the count to divide with for average
		for(i = 0; i < 5; i++){ // assigning i to zero; boolean test with i; modifiing i
			System.out.println("Please enter a number");
			sum += input.nextInt();
		}// end for loop
		double average = (double)sum / i; // using i outside of the for loop to be able to do average
		System.out.println("the average of those numbers:  " + average);


		System.out.println("Another example of a for loop");
		for(int times = 10; times >= 0; times--){// times (which is i) declared and assigned to 10; times boolean test to be greater than or equal to 0; modifiy times by decrementing
			System.out.print(times + " ");// printing the value of times
		}// end for loop

		System.out.println();


      }// end main

   }// end Chapter5Learning
