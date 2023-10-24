/*Java version: 8
 * examples of methods
 *
 * */

import java.io.*;
import java.util.*;

public class MethodExamples {
  public static void main(String[] args) throws IOException {

  	System.out.println("println is a method");

  	System.out.println("Math.pow is a method - accepts the argument and returns a double value.");
  	System.out.println("For example:  Math.pow(2, 3) - the value of 2 and the value of 3 are the parameters and the value of 8.0 is returned.");

  	// example of invoking/calling a method with no parameters and nothing being returned
  	methodOne();

  	// example of invoking a method with parameters and returns a value
  	int num = methodTwo(5, 8, 3);
  	System.out.println("The value being returned is: " + num);

  	// example of invoking a method with parameters and returns nothing
  	String s = "in main";
  	System.out.println("s:  " + s);
  	double n1 = 102.00;
  	System.out.println("n1:  " + n1);
  	char ch = 'q';
  	System.out.println("ch:  " + ch);
  	methodThree(s, n1, ch);
  	System.out.println("The values stay the same here in main - because it is pass-by-value!!");
  	System.out.println("s:  " + s);
  	System.out.println("n1:  " + n1);
  	System.out.println("ch:  " + ch);


  }// end main

  // **********************************************************************************************

  public static void methodOne(){
  	System.out.println("a method that has no parameters and returns nothing");
  }// end of methodOne

  // **********************************************************************************************

  public static int methodTwo(int n1, int n2, int n3){
  	System.out.println("the values of " + n1 + ",  " + n2 + " and " + n3 + " were passed in, one vlaue is being returned");
  	return n1 + n2 + n3;
  }// end of methodTwo

  // **********************************************************************************************

  public static void methodThree(String w1, double dnum, char letter){
  	System.out.println("w1:  " + w1);
  	System.out.println("dnum:  " + dnum);
  	System.out.println("letter:  " + letter);
	System.out.println("values being maniputlated in the method");
	w1 = "changed";
	dnum = 789.369;
	letter = 'z';
	System.out.println("w1:  " + w1);
  	System.out.println("dnum:  " + dnum);
  	System.out.println("letter:  " + letter);

  }// end methodThree

  // **********************************************************************************************

}// end of MethodExamples
