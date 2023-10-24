/*  CSC 102 */

import java.io.*;
import java.util.*;

 public class MathExamples {
  public static void main(String[] args) {

  	System.out.println("This program is examples of the Math class and how to use its functions/methods");
  	System.out.println("These functions are methods");
  	System.out.println("Each of the methods take an argument - a value, or values, in a specific order to do what that method is designed to do");
  	System.out.println("And each returns a value.");
  	System.out.println("When that value is returned - the programmer has to \"catch\" that return in one of two ways - 1) in a s.o.p. statement or 2) assigning that value to a variable");

  	System.out.println();
  	System.out.println();

  	System.out.println("exponents = raised to the power of = Math.pow");
  	System.out.println("Math.pow is in the form of: a raised to power to the power of b = a^b = Math.pow(a, b)");
  	System.out.println("so, 2^3 is Math.pow(2, 3):  " + Math.pow(2,3));
  	System.out.println("notice the data type being returned - a double");
  	System.out.println();
  	System.out.println("and, 2.0^3 is Math.pow(2.0, 3):  " + Math.pow(2.0,3));
  	System.out.println();
  	System.out.println("and, 2.0^3.5 is Math.pow(2.0, 3.5):  " + Math.pow(2.0,3.5));
  	System.out.println();
  	System.out.println("and, 2^3.5 is Math.pow(2, 3.5):  " + Math.pow(2,3.5));
  	System.out.println("notice the data types being sent - it does not matter if it is int-int, int-double, double-int, or double-double");

  	System.out.println();
  	System.out.println();

  	System.out.println("square root of a number");
  	System.out.println("The square root of 4 = Math.sqrt(4) is: " + Math.sqrt(4));
  	System.out.println("notice the data type being returned - a double");
  	System.out.println("The square root of 4.5 = Math.sqrt(4.5) is: " + Math.sqrt(4.5));
  	System.out.println("notice the data type being sent - an int or a double");


  	System.out.println();
  	System.out.println();

  	System.out.println("max, min, and abs methods");
  	System.out.println("these methods compare between 2 numbers - you use the name and send it the numbers");
  	int inum3 = 3, inum6 = 6;
  	double dnum3 = 3.0, dnum6 = 6.0;
  	System.out.println("Math.max(3, 6) = " + Math.max(inum3, inum6));
  	System.out.println("Math.max(3, 6.0) = " + Math.max(inum3, dnum6));
  	System.out.println("Math.max(3.0, 6.0) = " + Math.max(dnum3, dnum6));
  	System.out.println("Math.max(3.0, 6) = " + Math.max(dnum3, inum6));
  	System.out.println("notice the data types being sent - it does not matter if it is int-int, int-double, double-int, or double-double");
  	System.out.println("notice the data type being returned - a double, unless both arguments are ints!");
  	System.out.println();
  	System.out.println("Math.min(3, 6) = " + Math.min(inum3, inum6));
  	System.out.println("Math.min(3, 6.0) = " + Math.min(inum3, dnum6));
  	System.out.println("Math.min(3.0, 6.0 = )" + Math.min(dnum3, dnum6));
  	System.out.println("Math.min(3.0, 6) = " + Math.min(dnum3, inum6));
  	System.out.println("notice the data types being sent - it does not matter if it is int-int, int-double, double-int, or double-double");
  	System.out.println("notice the data type being returned - a double, unless both arguments are ints!");
  	System.out.println();
  	System.out.println("Math.abs(3) = " + Math.abs(inum3));
  	System.out.println("Math.abs(6.0) = " + Math.abs(dnum6));
  	System.out.println("notice the data type being returned - an int when an int is the argument, a when the argument is a double");

  	System.out.println();
  	System.out.println();

  	System.out.println("The rounding methods return a double value except the round method - it returns an int");
  	double dnum = 12.3456;
  	System.out.println("The number is: " + dnum);
  	System.out.println("ceil method: " + Math.ceil(dnum));
  	System.out.println("floor method: " + Math.floor(dnum));
  	System.out.println("rint method: " + Math.rint(dnum));
  	System.out.println("round method: " + Math.round(dnum));

  	System.out.println();
	System.out.println("The same goes for int numbers");
  	int inum = 12;
  	System.out.println("The number is: " + inum);
  	System.out.println("ceil method: " + Math.ceil(inum));
  	System.out.println("floor method: " + Math.floor(inum));
  	System.out.println("rint method: " + Math.rint(inum));
  	System.out.println("round method: " + Math.round(inum));




  } // end main
 } // end class MathExamples