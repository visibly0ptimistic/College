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
		sb.replace(0,2, "222" );  // the characters at index 1, 2, & 3 are deleted from the string
		System.out.println("sb replaced is " + sb);  //Hlo

 	} // end main

 } // end OverRideObjectToStringExample