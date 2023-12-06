/*
 **/


import java.io.*;
import java.util.*;

 public class DeleteExample {
 	public static void main(String[] args) {

 		// creates a string Hello
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("sb constructed is " + sb);  //Hello

		System.out.println();

		// deletes the 2nd & 3rd characters
		sb.delete(1,3);  // the characters at index 1 & 2 are deleted from the string - notice it does not include index 3!
		System.out.println("sb deleted at indices 1 through 3, but not including 3 is " + sb);  //Hlo

		// deletes the last character
		sb.deleteCharAt(sb.length()-1);  // the last character
		System.out.println("sb deleted last character: " + sb);  //Hl

 	} // end main
 } // end DeleteExample