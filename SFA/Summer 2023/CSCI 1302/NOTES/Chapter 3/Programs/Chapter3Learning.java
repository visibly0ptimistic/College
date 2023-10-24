/* Java version: 8
 * This program is all about learning the concepts in Chapter 3
 *
 * Sample input:  hard coded in the program
 *
 * Sample run/output:  to the screen
 *
 *		If a person is older than 18, then legally the person is an adult
		The age is:  20, is that an adult?  true


		Relational Operators:
		When using a programming language, the symbols have to be something that can be typed in - on the keyboard.
		So programming languages have different symbols for relational operators than what is learned in Math.
		Java uses:  <, <=, >, >=, ==, !=
		The relational operators work in the same capacity as they do in Math.
		These relational operators work on primitive data types - not reference data types


		Logical Operators:
		Logical operators provide the way to combine Boolean expressions to produce one result.
		The logical operators that we use are:
		&& which is the And logical operator
		The && short-circuits, if the first operand/test/Boolean condition is false, the second is never looked at, automatically assigns F
		|| which is the Or logical operator
		The || short-circuits, if the first operand/test/Boolean condition is true, the second is never looked at, automatically assigns T
		! which is the Not logical operator
		^ which is the exclusive or logical operator

		Let's see some examples!
		What is my yard like in the summer time?  dead grass and wilted roses!  true

		It is either cold or February

		It is either cold or February


		if statements
		even number
		odd number
		divisible by 3


		if-else statement
		not divisible by 4


		if-else if-else statements
		even number


		Generating Random Numbers
		a random number between 1 & 10, including 10 (but not including 11):  9


		switch statements
		mid-morning hours
 * */

import java.io.*;
import java.util.*;

public class Chapter3Learning {
  public static void main(String[] args) throws IOException {

  	int age = 20;
  	//boolean data type
  	boolean isAdult = age >= 18;
  	System.out.println("If a person is older than 18, then legally the person is an adult \n" +
  		"The age is:  " + age + ", is that an adult?  " + isAdult);
  	System.out.println();
  	System.out.println();


  	//Relational Operators
  	System.out.println("Relational Operators:");
  	System.out.println("When using a programming language, the symbols have to be something that can be typed in - on the keyboard.");
  	System.out.println("So programming languages have different symbols for relational operators than what is learned in Math.");
  	System.out.println("Java uses:  <, <=, >, >=, ==, != ");
  	System.out.println("The relational operators work in the same capacity as they do in Math.");
  	System.out.println("These relational operators work on primitive data types - not reference data types");
  	System.out.println();
  	System.out.println();

  	// Logical Operators
  	System.out.println("Logical Operators:");
  	System.out.println("Logical operators provide the way to combine Boolean expressions to produce one result.");
  	System.out.println("The logical operators that we use are:");
  	System.out.println("&& which is the And logical operator");
  	System.out.println("The && short-circuits, if the first operand/test/Boolean condition is false, the second is never looked at, automatically assigns F");
  	System.out.println("|| which is the Or logical operator");
  	System.out.println("The || short-circuits, if the first operand/test/Boolean condition is true, the second is never looked at, automatically assigns T");
  	System.out.println("! which is the Not logical operator");
  	System.out.println("^ which is the exclusive or logical operator");
  	System.out.println();
  	System.out.println("Let's see some examples!");
  	boolean itIsRaining = false;
  	boolean grassIsDead = true;
  	boolean itIsSummerTimeInMyYard = !itIsRaining && grassIsDead;
  	System.out.println("What is my yard like in the summer time?  dead grass and wilted roses!  " + itIsSummerTimeInMyYard);
  	System.out.println();

  	boolean isItCold = false;
  	boolean isItFebruary = true;
  	boolean isItWinter = isItCold || isItFebruary;// since the first part was false, it had to look at the second part - evaluated to T - as long as there is 1 T, || is T
  	if(isItWinter){
  		System.out.println("It is either cold or February");
  	}
  	System.out.println();

  	if(isItCold ^ isItFebruary){// one or the other, but not both!
  		System.out.println("It is either cold or February");
  	}
  	System.out.println();
  	System.out.println();

  	/*if statements provide programs with making selections - doing something different based on a condition being true
  	  if statements have to utilize Boolean expressions
  	  if statements are only executed if the Boolean expression evaluates to T
  	*/
  	System.out.println("if statements");
  	if(4 % 2 == 0){
  		System.out.println("even number");
  	}

  	if(5 % 2 == 1){
  		System.out.println("odd number");
  	}

  	if(9 % 3 == 0){
  		System.out.println("divisible by 3");
  	}
  	System.out.println();
  	System.out.println();

  	/* else statements provide a default to the if
  	 * else statements do NOT test
  	 * else statements only execute when the if evaluated to false
  	*/
  	System.out.println("if-else statement");
  	if(6 % 4 == 0){
  		System.out.println("divisible by 4");
  	}
  	else{
  		System.out.println("not divisible by 4");
  	}
  	System.out.println();
  	System.out.println();

  	/* if-else if-else statements provide the ability to do several related, sequential tests
  	 * there is only 1 if statement
  	 * there can be unlimited else if statement - each else if statement tests
  	 * there can only be 1 else statement
  	 * once it finds the match - the JVM leaves the structure
  	*/
  	System.out.println("if-else if-else statements");
  	int num = 42;
  	if(num % 2 == 0){
  		System.out.println("even number"); // found the match & left the structure, even though other tests would have evaluated true- it goes with the first match!
  	}
  	else if(num % 2 == 1){
  		System.out.println("odd number");
  	}
  	else if(num % 3 == 0){
  		System.out.println("divisible by 3");
  	}
  	else if(num % 4 == 0){
  		System.out.println("divisible by 4");
  	}
  	else if(num % 5 == 0){
  		System.out.println("divisible by 5");
  	}
  	else if(num % 6 == 0){
  		System.out.println("divisible by 6");
  	}
  	else if(num % 7 == 0){
  		System.out.println("divisible by 7");
  	}
  	else if(num % 8 == 0){
  		System.out.println("divisible by 8");
  	}
  	else if(num % 9 == 0){
  		System.out.println("divisible by 9");
  	}
  	else if(num % 10 == 0){
  		System.out.println("divisible by 10");
  	}
	// you don't always have to have an else - but some compilers might complain about that
	System.out.println();
	System.out.println();

	// Generating Random Numbers
	System.out.println("Generating Random Numbers");
	/*a + (int)(Math.random() * b)
      Returns a random whole number between a & a+b, excluding a+b's value

      b = the range of numbers, or how many numbers you want
	  i. e:  you need _(so many)__  numbers to choose from
	  a = the starting point, the first number on the number line to choose from, where the range of numbers start
	  i. e:  your choice of numbers starts at 5

	  If you want a number between 5 and 15 the range is 10 [15-5]
      replace the b with 10.

      If you want the lowest number in the range to start with 5 then replace the a with 5.

	  int randomNumber = 5 + (int)(Math.random() * 10 );
	  what this means taken together:  you have 10 numbers to choose from and the the first number is 5; thus your range is from 5 upto 15, not including 15

	  if you need to include 15, then b is 11
	  int randomNumber = 5 + (int)(Math.random() * 11 );
	  // thus you have a random number between 5 & 15, including 15
    */

    // the example below creates a whole number between the values of 1 and 10
    int randomNumber = 1 + (int)(Math.random() * 10 );
    System.out.println("a random number between 1 & 10, including 10 (but not including 11):  " + randomNumber);
	System.out.println();
	System.out.println();

	/*  switch statements provide a clean presentation of boolean expressions that are looking for an exact match
	 *  switch statments can be used on int, double, char, and String data types
	*/
	System.out.println("switch statements");
	int hour = 10;
	switch(hour){
		case 1:
		case 2:
		case 3:
		case 4:	System.out.println("Wee hours of the morning");
				break;
		case 5:
		case 6:
		case 7:
		case 8:	System.out.println("Morning hours");
				break;
		case 9:
		case 10:
		case 11:System.out.println("mid-morning hours");
				break;
		case 12:System.out.println("mid-day, aka lunch time");
				break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:System.out.println("afternoon hours");
				break;
		case 18:System.out.println("dinner time");
				break;
		case 19:
		case 20:
		case 21:System.out.println("evening time");
				break;
		case 22:
		case 23:
		case 24:System.out.println("night time");
				break;
		default:  System.out.println("Error:  not a value within the military clock");
	}// end case

  }// end main
}// end of Chapter3Learning
