//simple program to show how to open and read from a file

//This program will read data until the number -999 is reached
//This loop type is called "Using a Sentinel"

//NOTE:  The file MUST be in the same directory as the program


   import java.io.*;
   import java.util.*;

   public class ReadUntil_999 {
      public static void main(String[ ] args)  throws IOException {

         File output = new File("Ver1.out");               // Declare a variable of type File - create output file
         PrintWriter out = new PrintWriter(output);        // and open to create writing to

         File myFile = new File("SampleDataFile1.txt"  );  // Declare a variable of type File - input file
         Scanner fileIn= new Scanner(myFile);              // and open a file for reading with a Scanner
         int sum =0;
         int count = 0;

         int number;

         number = fileIn.nextInt();  //"Prime the pump" - read in the first value
         while (number != -999) {

            System.out.println("The number in the file is " + number + ".");
            out.println("The number in the file is " + number + ".");
            sum = sum + number;
            count++;
            number = fileIn.nextInt();
         }
         System.out.println("No more data.");
         out.println("No more data.");
         System.out.println("Sum was " + sum);
         out.println("Sum was " + sum);
         System.out.println("The count was " + count);
         out.println("The count was " + count);
         System.out.println(" And the average was " + (double)sum/count);
         out.println(" And the average was " + (double)sum/count);

         //close file
         fileIn.close();
         out.close();
      }// end main

   }// end ReadUntil_999
