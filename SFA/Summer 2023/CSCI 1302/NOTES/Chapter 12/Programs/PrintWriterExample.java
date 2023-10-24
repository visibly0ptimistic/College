/*
 *  CSC 102
 *  Write Example
 **/

import java.io.*;
import java.util.*;

public class PrintWriterExample{

 public static void main (String[] args) throws IOException {
 	System.out.println("This program is an example of reading a line of text from the keyboard and printing it to a file.");

  String s1;
  String s2;
  boolean cont = true;

  // set up the Scanner to read from the keyboard
  Scanner in = new Scanner (System.in);

  // Set up the output file
  File file = new File ("writeToFile.txt");
  PrintWriter pw = new PrintWriter (file);

  while(cont){
      System.out.println ("Enter a line of input; enter ends the loop");

      s1 = in.nextLine();

      System.out.println ("The line has " + s1.length() + " characters");

      if (s1.length() == 0){
	 	cont = false;
	  }
      else{
	 	pw.println (s1);
      }
  }// end while

  pw.close();

 }// end main
}// end class