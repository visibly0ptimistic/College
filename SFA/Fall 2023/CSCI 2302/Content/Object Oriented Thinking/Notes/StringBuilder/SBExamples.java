/*
 *
 **/


import java.io.*;
import java.util.*;

 public class SBExamples {
 	public static void main(String[] args) {

 		// creates a stringbuilder Hello
      StringBuilder sbHello = new StringBuilder("Hello");
      System.out.println("sbHello: " + sbHello);
      
      System.out.println();
      
      // capacity and length of StringBuilders
      StringBuilder sb = new StringBuilder();
		System.out.println("sb constructed is " + sb);
		System.out.println("sb's capacity is " + sb.capacity());  // sb's capacity is 16 - default capacity size
		System.out.println("sb's length is " + sb.length());  // sb's length is 0 - empty

		System.out.println();
      
		// append, capacity, length
      // append:  the method to add content into the StringBuilder
      // capacity:  how much memory space this object is taking up'
         // if a StringBuilder runs out of capcity, then it will "double" in size
      // length:  how many characters are in the StringBuilder
		for(int i = 0; i < 50; i++){
			sb = sb.append(String.valueOf(i));
			System.out.println(sb);
			System.out.println("sb's capacity is " + sb.capacity());//16,  +18 = 34,  +36 = 70  +72 = 142
			System.out.println("sb's length is " + sb.length()); // increase
		}

		System.out.println();

		System.out.println("Examples of converting int to String/StringBuilder");
		int num = 1;

		//String st = num; - doesn't compile; incaptible types
		String st = String.valueOf(num);
		System.out.println("int - String conversion " + st);
		System.out.println();

		//StringBuilder strB = num; - doesn't compile; incaptible types
		StringBuilder strB = new StringBuilder();
		strB.append(String.valueOf(num));
		System.out.println("int - StringBuilder conversion " + strB);
		System.out.println();

 	} // end main

 } // end SBExamples