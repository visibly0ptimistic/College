/*
 *  CSC 102
 *  Reading from a file Example
 **/

 import java.io.*;
import java.util.*;

public class LineIntoTokens{

 public static void main (String[] args) throws IOException {

  System.out.println("This program is an example of reading from a file and breaking it into individual words (tokens).");
  String s1;
  String s2;

  // set up the Scanner to read from the keyboard
  Scanner in = new Scanner (new File ("fileForTokens.txt"));

  s1 = in.nextLine();
  in.close();

  System.out.println("The line is: " + s1);
  System.out.println("The line has " + s1.length() + " characters");

  System.out.println();
  System.out.println("Breaking the line into tokens we get:");

  int numTokens = 0;
  StringTokenizer st = new StringTokenizer(s1);

  while (st.hasMoreTokens()){
      s2 = st.nextToken();
      numTokens++;
      System.out.println ("    Token " + numTokens + " is: " + s2);
  }// end while

 }// end main
}// end class