/*
 *
 **/


import java.io.*;
import java.util.*;

 public class BooleanNot {
 	public static void main(String[] args) {

 		// data dictionary
		boolean a = true;
		boolean b = false;

		if (!a){
			System.out.println ("if statement for a" );
		}
		else{
			System.out.println
				 ("else statement for a, because !true evaluated to false");
		}

		if (b == false){
			System.out.println ("if statement for b, false == false evaluated to true");
		}
		else{
			System.out.println("else statement for b");
		}




 	} // end main
 } // end BooleanNot
