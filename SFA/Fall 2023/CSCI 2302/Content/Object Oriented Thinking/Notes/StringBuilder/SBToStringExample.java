/*
 *
 **/


import java.io.*;
import java.util.*;

 public class SBToStringExample {
 	public static void main(String[] args) {

 		// creates a string Hello
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("sb constructed is: " + sb);  //Hello

		System.out.println();

		// make the StringBuilder become a String
		sb.toString();  // the StringBuilder is now a String
		System.out.println("sb as a String: " + sb); // can now do String methods with it

 	} // end main

 } // end SBToStringExample