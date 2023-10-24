/* Java version: 8
 * This program provides examples of Chapter 6 concepts
 * */

import java.io.*;
import java.util.*;

public class Chapter6Learning {

  public static void main(String[] args) throws IOException {

  	/*Method:  a collection of statements grouped together to perform an operation
  	 *A method is a block of code which only runs when it is invoked/called.
  	 *A method is a collection of statements that perform some specific task and return the result to the caller.
	  Methods are used to perform certain actions, and they are known as functions in other programming languages.

	  Methods can be used to define reusable code, methods organize and simplify code.
	  To reuse code: define the code once, and use it many times.
	  Utilizing methods make code modular = organized and simplified.

	  Methods do one thing (modularizing code), only one thing;
	    that way if a change happens for that one thing,
	    it is contained and its effects will not cascade
	    through the rest of the code = easy to maintain, easy to debug

	  IMPROTANT:  the placement of the method is after the closing } of main & prior to the } of the class
	  In Java, the standard format is to have main listed first, then the methods in the order that they are used in the program.

	*/

	System.out.println("You have been using methods all along - since day one, when you wrote the Hello World/Welcome program");
	System.out.println("everytime you typed println, print you were invoking/calling a method");
	System.out.println("everytime when you use Scanner - you are using methods:  nextInt, nextDouble, next, nextLine");
	System.out.println("you used them in the Math class - Math.pow, Math.ceil, etc");
	System.out.println();
	System.out.println("All you are learning now is the method header and the return statement");
	System.out.println("You already know how to use methods - matching the parameter list/sending the values it needs to do its stuff");
	System.out.println("You already know how to catch the values being returned.");
	System.out.println("The content - the body of the method - is the code you have been learning all along.");
	System.out.println();
	System.out.println();
	System.out.println();



  	/*The syntax for a method:
		  modifier returnValueType  methodName( listOfParameters ){
			//body
		  }
	  for CSC 102, the modifiers will always be public static

	  the return type is the data type of the variable that is being returned to the place where it was called/invoked
	  Java methods can ONLY return ONE variable (primitive or reference data type)
	  If you have nothing to return to the caller, then the return type is void (means nothing)
	  If you have a variable to return, then a return statement has to be included.
	  This return statement has to be at the end of the method - nothing can be after the return statement
	     (those statements will cause a comile error - unreachable) because the return key word tells the JVM to leave immediately

	  methodName follows the Java standards for naming conventions

	  listOfParameters the variables that are passed into the method from the caller
	  this list of parameters act like declaring and assinging statements



	*/

	System.out.println("Methods - Chapter 6");
	System.out.println("It is VERY IMPORTANT to understand that Java is pass-by-VALUE!");
	System.out.println("What is stored in that's variable memory in main memory - " +
		" it is that value that is passed to the methods.");
	System.out.println("primitive data types store that literal value");
	System.out.println("reference data types (like String and arrays - learning next chapter)" +
		" store the memory address of where to find that variable in memory; " +
		" hence the name reference data type.");
	System.out.println();
	System.out.println();

	aMethod();// invoking/calling statement to aMethod
	/* this statement broken down:
	 *	nothing is being returned, so nothing has to be "caught"
	 *  nothing is being sent to the method, so no parameters/arguments
	 */

	boolean b = bMethod();// invoking/calling statement to bMethod
	/* this statement broken down:
	 *  a boolean value is being returned, so that value is being "caught" by saving it to a variable, b
	 *  nothing is being sent to the method, so no parameters/arguments
	 */

	int c = cMethod(3); // invoking/calling statement to cMethod
	/* this statement broken down:
	 *  a int value is being returned, so that value is being "caught" by saving it to a variable, c
	 *  an int value is being sent to the method, so a parameter/argument of the value 3
	 */

	System.out.println("Invoking cMethod with the parameter of 7 and catching the return value by printing the value:  " + cMethod(7));
	System.out.println();

	String howAmILearning = methodD(); // invoking/calling statement to methodD
	System.out.println(howAmILearning);
	/* these statement broken down:
	 *  methodD is being invoked with no parameters
	 *  methodD returns a String value, which is being stored in the variable howAmILearning
	 *  the s.o.p. line prints out the content of that String, howAmILearning
	 */
	 System.out.println();

	System.out.println("Now that have practiced the syntax some, let's learn more.");
	System.out.println();

	//invoking one method, three different times with different values
	int sumOfThreeNumbersFirstTime = sumThreeNumbersMethod(1, 2, 3);
	System.out.println("First time result:  " + sumOfThreeNumbersFirstTime);
	System.out.println();

	int sumOfThreeNumbersSecondTime = sumThreeNumbersMethod(4, 5, 6);
	System.out.println("Second time result:  " + sumOfThreeNumbersSecondTime);
	System.out.println();

	int sumOfThreeNumbersThirdTime = sumThreeNumbersMethod(7, 8, 9);
	System.out.println("Third time result:  " + sumOfThreeNumbersThirdTime);
	System.out.println();

	System.out.println("Let's see how changing the values in a method work");
	System.out.println("We will use two primitive values and a reference value");
	String stringValue = "Does the value change?";
	System.out.println("Prior to method call, stringValue:  " + stringValue);
	double numValue = 102.987;
	System.out.println("Prior to method call, numValue:  " + numValue);
	char charValue = 'a';
	System.out.println("Prior to method call, charValue: " + charValue);
	System.out.println();
	seeHowChangingPrimitiveVsReferenceValueDiffer(stringValue, numValue, charValue);
	System.out.println();
	System.out.println("After the method call, stringValue:  " + stringValue);
	System.out.println("After the method call, numValue:  " + numValue);
	System.out.println("After the method call, charValue: " + charValue);
	System.out.println();
	System.out.println("Why didn't the stringValue change?  Strings are immutable, if you change anything, you get a new String returned.");
	System.out.println("In this case, the variable is a String litereal, and the String value of 'Does the value change' was passed to th method and assigned to a new String variable, w1");
	System.out.println("Even though Strings are reference data types, they are treated a bit different from all the other reference data types");
	System.out.println("All other reference types will pass the address location, meaning any changes in the method for these variables does affect the variable");
	System.out.println("This part will become more clear when we learn about arrays in the next chapter");
	System.out.println();

	System.out.println("Method example of getting back a character, adding it to a String:");
	String characters = "";
	char charFromMethod = ' ';
	for (int i = 0; i < 10; i++){
		charFromMethod = returnALetter();
		System.out.println("the character from the method is:  " + charFromMethod);
		characters += charFromMethod;
		System.out.println("current content of the String characters: " + characters);
	}
	System.out.println("After the loop, the String characters is:  " + characters);
	System.out.println();

	System.out.println("Method example of reading in values and calculating the average of those numbers");
	System.out.println("Going to the method to read in values, then the method will return the average");
	double average = calculateAverge();
	System.out.println("The average of those numbers:  " + average);
	System.out.println();
	System.out.println();


  }// end main

  //**********************************************************************

  public static void aMethod(){
  	// example to show where the placement of methods go
  	// method accepts nothing, returns nothing; hence no return statments
  }// end aMethod

  //**********************************************************************

  public static boolean bMethod(){

  	// a method that returns a boolean value, accepts nothing

  	return true;// last statement in the method; returns that value, which has to match the return type on the method header

  }// end bMethod

  //**********************************************************************

  public static int cMethod(int num){

  	// a method that returns a whole number, int, accepts a whole number, int

  	return 102; // last statement in the method; returns that value, which has to match the return type on the method header

  }// end cMethod

  //**********************************************************************

  public static String methodD(){

  	// a method that returns a String, and accepts nothing

  	return "Very well indeed! :)  "; // last statement in the method; returns that value, which has to match the return type on the method header

  }// end methodD

  //**********************************************************************

  public static int sumThreeNumbersMethod(int n1, int n2, int n3){
  	System.out.println("In the sumThreeNumbersMethod");
  	System.out.println("the values of " + n1 + ",  " + n2 + " and " + n3 + " were passed in, one value, the sum of those 3 numbers, is being returned");
  	return n1 + n2 + n3;
  }// end of sumThreeNumbersMethod

  //**********************************************************************

  public static void seeHowChangingPrimitiveVsReferenceValueDiffer(String w1, double dnum, char letter){
  	System.out.println("In the seeHowChangingPrimitiveVsReferenceValueDiffer method.");
  	System.out.println("Original values passed in:");
  	System.out.println("w1:  " + w1);
  	System.out.println("dnum:  " + dnum);
  	System.out.println("letter:  " + letter);
	System.out.println("values being maniputlated in the method");
	w1 = "changed";
	dnum = 789.369;
	letter = 'z';
	System.out.println("After changing the values in the method, the method varaibles are:");
	System.out.println("w1:  " + w1);
  	System.out.println("dnum:  " + dnum);
  	System.out.println("letter:  " + letter);
  	System.out.println("leaving method");

  }// end seeHowChangingPrimitiveVsReferenceValueDiffer

  //**********************************************************************

  public static char returnALetter(){
  	int randomIndexValueInAlphabet = ((int)(97 + Math.random() * 26));
  	char letter = (char)randomIndexValueInAlphabet;
  	return letter;
  }// end returnALetter

  //**********************************************************************

  public static double calculateAverge() throws IOException{

  	double average;
  	int sum = 0;
  	int count = 1;
  	Scanner input = new Scanner(new File("numbers.txt"));
  	while(input.hasNext()){
  		sum += input.nextInt();
  		count++;
  	}
  	input.close();
  	average = (double)sum / count;
  	return average;

  }// end calculateAverge

}// end of Chapter6Learning
