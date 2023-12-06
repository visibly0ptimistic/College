/* Java version: 8
 * This program provides examples of the BigInteger and BigDecimal classes
 *
 * Sample input:  none, hard coded into the program
 *
 * Sample run/output:  to the screen
 *		BigIntegers:
 		BigInteger:  123456789987654321

 		BigDecimals:
 		Added: 1112222211.2222222211
		BigDecimal 1 = -863086431.0246913569
		Multiplied: 123030014929277547.5030955772112635269
		bd1 raised to the power of 2:  15517159243658102.97302514857789971041
		bd1 negated: -124567890.0987654321
		the result of comparing bd1 to bd2:  -1
		the result of comparing bd2 to bd1:  1
 *
 *
 * */

import java.io.*;
import java.util.*;
import java.math.*; // have to include math to use the math methods

public class BigIntegerBigDecimalExamples {

  public static void main(String[] args) throws IOException {

        System.out.println("BigIntegers:");
        // Create a BigInteger number
        // the BigInteger constructor only takes a String argument
        BigInteger bi = new BigInteger("123456789987654321");
        System.out.println("BigInteger:  " + bi);
        System.out.println();


        System.out.println("BigDecimals:");
        // Create two new BigDecimals
        // remember that you want complete accuracy so use the String argument to instantiate a BigDecimal object
        BigDecimal bd1 = new BigDecimal("124567890.0987654321");
        BigDecimal bd2 = new BigDecimal("987654321.123456789");

        // Addition of two BigDecimals
        BigDecimal bdAdd = bd1.add(bd2);
        System.out.println("Added: " + bdAdd);

        // Subtraction of two BigDecimals
        BigDecimal bdSubtract = bd1.subtract(bd2);
        System.out.println("BigDecimal 1 = " + bdSubtract);

        // Multiplication of two BigDecimals
        BigDecimal bdMultiply = bd1.multiply(bd2);
        System.out.println("Multiplied: " + bdMultiply);

        /* Division of two BigDecimals
        BigDecimal bdDivide = bd1.divide(bd2);	since this does not terminate an ArithmeticException is thrown
        System.out.println("Divided: " + bdDivide);
        Exception in thread "main" java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
		at java.math.BigDecimal.divide(BigDecimal.java:1690)
		at BigIntegerBigDecimalExamples.main(BigIntegerBigDecimalExamples.java:41)
		*/

        // exponent - or to the power of 2
        BigDecimal bd1Powof2 = bd1.pow(2);
        System.out.println("bd1 raised to the power of 2:  " + bd1Powof2);

        // Negate the value of a BigDecimal
        bd1 = bd1.negate();
        System.out.println("bd1 negated: " + bd1);

        // Comparison of two BigDecimal values
        // compareTo returns -1(less than), 0(Equal), 1(greater than) according to values.
        System.out.println("the result of comparing bd1 to bd2:  " + bd1.compareTo(bd2));
        int compareNumbers = bd2.compareTo(bd1);
        System.out.println("the result of comparing bd2 to bd1:  " + compareNumbers);

  }// end main
}// end of BigIntegerBigDecimalExamples
