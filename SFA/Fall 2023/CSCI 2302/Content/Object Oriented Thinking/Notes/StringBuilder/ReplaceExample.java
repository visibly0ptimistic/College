/*
 *
 **/


import java.io.*;
import java.util.*;

 public class ReplaceExample {
 	public static void main(String[] args) {

 		// creates a string Hello
		StringBuilder sb = new StringBuilder("000 - Learning Java");
		System.out.println("sb constructed is " + sb);

		System.out.println();

		// replace
		sb.replace(0,3, "222" );  // the characters at index 0, 1, & 2 are replaced
		System.out.println("sb replaced is " + sb);


		// replace
		sb.replace(0,1, "333" );  // notice how it changes - it is not "just replaced but added to" because of the indices specified and the length of characters that are doing the replacement
		System.out.println("sb replaced is " + sb);

 	} // end main

 } // end ReplaceExample