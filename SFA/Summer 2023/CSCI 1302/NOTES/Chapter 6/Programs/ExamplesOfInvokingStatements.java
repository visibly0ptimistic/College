/*
 *
 * */

import java.io.*;
import java.util.*;

public class ExamplesOfInvokingStatements {
  public static void main(String[] args) throws IOException{

  	Scanner input = new Scanner(System.in);
  	System.out.println();

	// an invoking statement
	printMethod();

  }// end main

  //******************************************************

  public static void printMethod() throws IOException{

	  PrintWriter output = new PrintWriter(new File("fileToWriteTo.txt"));

	  output.println("Writing the to the file.");  //putting something in the file

	  output.close();  // closing the object, the content in RAM will be forced to be written in the file

	  readMethod();  // invoking a method; this method will lett us see what was written

  }// end printMethod

  //******************************************************

  public static void readMethod() throws IOException{

	  Scanner input = new Scanner(new File("fileToWriteTo.txt"));  // setting the Scanner object to read the file contents

	  String text;
	  while(input.hasNext()){	// while there is something in the file
		  text = input.next();  // read the contents
		  System.out.println(text);  // print the contents to the screen
	  }

	  input.close();	// closing the Scanner object to free the file

  }// end readMethod

  //******************************************************

}// end of ExamplesOfInvokingStatements
