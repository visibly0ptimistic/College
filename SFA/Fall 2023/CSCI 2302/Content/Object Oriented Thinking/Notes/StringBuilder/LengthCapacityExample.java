/*
 *
 **/


import java.io.*;
import java.util.*;

 public class LengthCapacityExample {
 	public static void main(String[] args) {

 		// creates empty builder, capacity 16 (default constructor/size)
		StringBuilder sb = new StringBuilder();
		System.out.println("sb constructed is " + sb);  //nothing
		System.out.println("sb's capacity is " + sb.capacity());  // sb's capacity is 16
		System.out.println("sb's length is " + sb.length());  // sb's length is 0 - empty

		System.out.println();

		// adds 9 character string at beginning - because empty
		sb.append("Greetings - Good morning class!");
		System.out.println("sb appended " + sb);  // sb now has a value of Greetings
		System.out.println("sb's capacity is " + sb.capacity());  // sb's capacity is now 34
		System.out.println("sb's length is " + sb.length());  // sb's length is 31, how many letters are actually there

 	} // end main

 } // end LengthCapacityExample