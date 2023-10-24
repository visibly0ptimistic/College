//simple program to show how to open and read from a file

//This method reads until there is no more data
//The last piece of data should have nothing after it - not even a carriage return

//NOTE:  The file MUST be in the same directory as the program


   import java.io.*;
   import java.util.*;

   public class WhileHasNext_Sum {
      public static void main(String[ ] args)  throws IOException {

         File myFile = new File("SampleDataFile3.txt"  );  //Declare a variable of type File
         Scanner fileIn= new Scanner(myFile);              // and open a file for reading
         int sum =0;
         int count = 0;
         int numberRecords;
         int number;

         while (fileIn.hasNext() ) {
            number = fileIn.nextInt();
            System.out.println("The number in the file is " + number + ".");
            sum = sum + number;
            count++;
         }
         System.out.println("No more data.");
         System.out.println("Sum was " + sum);
         System.out.println("The count was " + count);
         System.out.println(" And the average was " + (double)sum/count);

      	 //close file
   	  	 fileIn.close();

      }// end main

   }// end WhileHasNext_Sum
