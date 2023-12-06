/* *
 * */

import java.io.*;
import java.util.*;

public class WrapperClassesExamples {
  public static void main(String[] args) {

	System.out.println("Converting Strings into numbers:");
	System.out.println("Bytes:  ");
	// the number 123
	byte b = Byte.parseByte("123");
	System.out.println("Byte.parseByte(\"123\"): " + b);

	// binary number of the number 5
	byte b2 = Byte.parseByte("101", 2);
	System.out.println("Byte.parseByte(\"101\", 2): " + b2);

	// octal number of the number 65
	byte b8 = Byte.parseByte("101", 8);
	System.out.println("Byte.parseByte(\"101\", 8): " + b8);

	// the number 123
	byte b10 = Byte.parseByte("123", 10);
	System.out.println("Byte.parseByte(\"123\", 10): " + b10);

	// hex number of the number 10
	byte b16 = Byte.parseByte("A", 16);
	System.out.println("Byte.parseByte(\"A\", 16): " + b16);

	System.out.println();
	System.out.println("Integer:  ");
	// number into  using the Binary number
	Integer i = Integer.parseInt("11", 2);
	System.out.println("Integer.parseInt(\"11\", 2): " + i);

	// number into  using the Octoal number
	Integer i8 = Integer.parseInt("23", 8);
	System.out.println("Integer.parseInt(\"23\", 8): " + i8);

	// number into  using the Decimal number
	Integer i10 = Integer.parseInt("23", 10);
	System.out.println("Integer.parseInt(\"23\", 10): " + i10);

	// number into  using the Hex number
	Integer i16 = Integer.parseInt("23", 16);
	System.out.println("Integer.parseInt(\"23\", 16): " + i16);

	System.out.println();
	System.out.println("Double:  ");

	Double d = Double.parseDouble("11");
	System.out.println("Double.parseDouble(\"11\"): " + d);

	System.out.println();
	System.out.println();

    System.out.println("Autoboxing and Autounboxing:");
    int n1 = 100;
	Integer n2 = new Integer(n1);

	//Using autoboxing:
	Integer n2_Autoboxed = n1;
	System.out.println("a regular int: " + n1 + " and an Integer: " + n2 + " and an Integer using autoboxing: " + n2_Autoboxed);

	// Using autounboxing:
	int numerUnboxed = n2_Autoboxed;
	System.out.println("Now the number is autounboxed:  " + numerUnboxed);

	System.out.println();
	System.out.println();

	System.out.println("Converting numbers into Strings:");

	int num = 1234;

   // Converting with a specific numbering system.
	// binary
	String binaryString = Integer.toBinaryString(num);
	System.out.println("the number, 1234, converting into a String but in the format of the Binary Counting System: " + binaryString);
	// octal
	String octalString = Integer.toOctalString(num);
    System.out.println("Integer.toOctalString(num): " + octalString);
    // hex
    String hexString = Integer.toHexString(num);
    System.out.println("Integer.toHexString(num): " + hexString);

	 StringBuilder sb = new StringBuilder();
    sb.append(num);
    String string_stringBuilder_int = sb.toString();
    System.out.println("a String formed from: an int to a StringBuilder to a String!  string_stringBuilder_int = " + string_stringBuilder_int);

  }// end main
}// end of WrapperClassesExamples
