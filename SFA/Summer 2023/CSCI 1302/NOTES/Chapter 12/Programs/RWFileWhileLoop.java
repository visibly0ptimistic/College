/*Files*/

 import java.util.*;
 import java.io.*;

 public class RWFileWhileLoop {

  /* Main Method */
  public static void main (String [] args) throws IOException {

   // file names
   File inFile = new File("readingFileForWhileLoop.txt");
   File outFile = new File("writingFile.txt");

   // create scanner
   Scanner in = new Scanner(inFile);

   // create writer
   PrintWriter out = new PrintWriter(outFile);

   int num;
   // reading from a file while there is something there
   while(in.hasNext()){
   	// getting number
   	num = in.nextInt();
   	// printing to a file
    out.print(" " + num);
    //it is also nice to see what is being printed without having to open the file
    System.out.println(" " + num);
    // because if you leave the file open to run it again it will not print to it
   }

   // close reading file when finished reading
   in.close();
   // if you forget to close the file, you do not free up the resource

   // close writing file when finished writing
   out.close();
   // if you forget to close the file - you might not get wll what is suppose to be written to the file

  } // end main
 }// end RWFileWhileLoop