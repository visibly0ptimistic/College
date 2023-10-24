/*
 *  CSC 102
 *
 *  Program is an example of local variables & pass by value.
 *
 *  Example of input:  3
 *
 *  Example of output:
 *		x in change is: 25
		x in main is: 5
 *
 **/


import java.io.*;
import java.util.*;

 public class PassByValueExample {
 	public static void main(String[] args) {

 		// data dictionary
		int x = 5;

		change(x);

		System.out.println("x in main is: " + x);

 	} // end main

 	public static void change(int x){
 		x = x * 5;
 		System.out.println("x in change is: " + x);
 		//return x;
 	}// end change

 } // end PassByValueExample