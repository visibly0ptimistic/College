/*
 *
 **/

import java.io.*;
import java.util.*;

 public class InsertExample {
 	public static void main(String[] args) {

 		// creates a string Hello
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("sb constructed is " + sb);  //Hello

		System.out.println();

		// adds Java starting at index 1
		sb.insert(1,"Java"); // Java inserted after the H - at index 1
		System.out.println("sb inserted with Java at index 1 is " + sb);  //HJavaello

 	} // end main
 } // end InsertExample