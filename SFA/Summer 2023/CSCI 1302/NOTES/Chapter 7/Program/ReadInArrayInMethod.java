/*
 * This progroam will has the methods to read in an array from a file, print the array
 *		in reverse, and print the array to a file
 *
 * input:  File:  input.txt
 * output:  to the screen and to a File:  oupt.txt
 *
 * Sample run:
 *
 *
 */
import java.io.*;
import java.util.*;

public class ReadInArrayInMethod {

     public static void main (String args[]) throws IOException{

     	String [] ary = readIn();
     	printReverseToScreen(ary);
     	printToFile(ary);

   }// end main

   public static String[] readIn() throws IOException{

   		File inFile = new File("input.txt");
   		Scanner input = new Scanner(inFile);

   		int size = input.nextInt();
   		String [] ary = new String[size];

   		for(int i = 0; i < ary.length; i++){
   			ary[i] = input.next();
   		}

   		return ary;

   }// end readIn

    public static void printReverseToScreen(String [] ary){
    	for(int i = ary.length-1; i >=0 ; i--){
    		System.out.println(ary[i]);
    	}
    }// end printReverseToScreen

    public static void printToFile(String [] ary) throws IOException{

    	File outFile = new File("output.txt");
    	PrintWriter out = new PrintWriter(outFile);

    	for(int i = 0; i < ary.length ; i++){
    		out.println(ary[i] + " ");
    	}

    	out.close();

    }// end printToFile


}// end class