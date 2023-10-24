// This is examples of declaring and assigning varibales
// variables can be re-assigned values

import java.io.*;
import java.util.*;

public class Declare_Assign {
	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

		int i;  	// declared an int i
		i = 400; 	// assigned i a value of 400 
		System.out.println("Declared then Assigned: i = " + i);

		System.out.println();
		//*****************

		int j = 3;	// declared & assigned
		System.out.println("Declared & Assigned: j = " + j);

		System.out.println();
		//*****************

		int k;		// declared
		System.out.println("Please enter a integer value.");
		k = input.nextInt();	// assigned
		System.out.println("Declared & then Assigned by reading in a value: k = " + k);

		System.out.println();
		//*****************

		System.out.println("Please enter a integer value.");
		int m = input.nextInt();	// declared & assigned
		System.out.println("Declared & Assigned by reading in a value: m = " + m);
		
		System.out.println();
		//*****************
		
		int a, b, c;  	// declared ints a, b, c
		a = 1; 	// assigned a a value of 1 
		System.out.println("Declared then Assigned: a = " + a);
		b = 2; 	// assigned b a value of 2 
		System.out.println("Declared then Assigned: b = " + b);
		c = 3; 	// assigned c a value of 3 
		System.out.println("Declared then Assigned: c = " + c);
		
		System.out.println();
		//*****************
		
		i = 88; 	// reassigned i a value of 88 
		System.out.println("i was already declared and now assigned another value: i = " + i);
	}
}