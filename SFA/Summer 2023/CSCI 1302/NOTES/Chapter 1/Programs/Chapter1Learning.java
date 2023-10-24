/* Always include the following information on your programs.
 * Trust me, you will forget what these programs are doing and this will help you see what the program does.
 *
 * Java version: 8
 * This program is for learning compnents of Chapter 1
 *
 * Sample input:  hard coded into the program
 *
 * Sample run/output:  output is displayed to the screen
 *    	All Java statements end with the ;
		The double quotation marks inform the JVM to print whatever is inside those verbatim
		What is the result of dividing 1 / 2?  0
		What is the result of dividing 1.0 / 2?  0.5
 *
 *
 * */

import java.io.*;// I include these two line on all my code.
import java.util.*; // the * stands for a wildcard - meaning whatever the program needs from this library, get it
/*  If the program needs any of the items from these two libraries, then the JVM will get them,
 *   if not, no harm is done as nothing will be imported into the program. */

public class Chapter1Learning { // this name here HAS to match the name of the file you saved it with (verbatim), and have the .java extension

  // make sure you indent (most IDEs will indent automatically for you - just pay attention to the alignment

  public static void main(String[] args) throws IOException { // this never changes!!  Memorize it, verbatim.
    /*  main method is the method that is automatically executed when you run/execute a program.
        You can compile any Java program/file, but you can only execute the Java programs that have main method.*/

    //System.out.*  means that whatever is inside the ( ) will be printed to the screen
    System.out.println("Welcome to CSC 102 / CSCI 1302!");

    System.out.println("All Java statements end with the ; ");

    System.out.println("The double quotation marks inform the JVM to print whatever is inside those verbatim");

    // Don't forget your Math order of operations:  PEMDAS
    // Java follows the rules too, otherwise, it would not produce valid output!

    System.out.println("What is the result of dividing 1 / 2?  " +  1 / 2);
    System.out.println("What is the result of dividing 1.0 / 2?  " +  1.0 / 2);
    // Why is there a different answer?  Why the 0 when you know it should be .5?
    /* Well, Java has ~different~ way of working on numbers.
     *   Remember in Math (way back in elementary) how you learned about whole numbers and then learned about numbers with decimals?
     *   Well, those number types matter big time to Java and Java works with those number in a ~different~ fashion.
     *   In Java, whole numbers stay whole and decimal numbers keep decimals. Hence, 0 vs .5
     *   This can come in quite handy in solving problems.
     *   The point right now is to remember how Java treats these number types. */


  }// end main  - label the closing braces, it will help - you will be surprised at how easily these will get lost or out of whack
}// end of Chapter1Learning  FOR 102/1302 ONLY - this will be the last line of your code
