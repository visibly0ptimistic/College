/*  Demonstrates how to instantiate/create StringBiolder objects,
      how to use the append method,
      what the capacity of a StringBuilder is and the length of a StringBuilder,
      and the difference between those
 *
 **/


import java.io.*;
import java.util.*;

 public class AppendExample {
 	public static void main(String[] args) {

 		// creates a string Hello
		StringBuilder sb = new StringBuilder();
		System.out.println("sb constructed is: " + sb);  //null = blank
		System.out.println("sb's capacity is " + sb.capacity());  // sb's capacity is 16
		System.out.println("sb's length is " + sb.length());  // sb's length is 0 - how many characters

		System.out.println();

		// append adds to the end - notice the spacing
		sb.append("2302");
		System.out.println("sb appended is: " + sb);  //2302
		System.out.println("sb's capacity is " + sb.capacity());  // sb's capacity is 16
		System.out.println("sb's length is " + sb.length());  // sb's length is 4 - how many characters in 2302

		System.out.println();
		// append adds to the end - notice the spacing
		sb.append("Java");
		System.out.println("sb appended with Java is: " + sb);  //2302Java - notice the spacing
		System.out.println("sb's capacity is " + sb.capacity());  // sb's capacity is 16
		System.out.println("sb's length is " + sb.length());  // sb's length is 8 - how many characters in 2302Java

		System.out.println();
		// append adds to the end - notice the spacing
		sb.append("StringBuilder can be modified");
		System.out.println("sb appended is: " + sb);  //
		System.out.println("sb's capacity is " + sb.capacity());  // sb's capacity is 37
		System.out.println("sb's length is " + sb.length());  // sb's length is 37

 	} // end main
 } // end AppendExample