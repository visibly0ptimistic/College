/* Java version: 8
 * This  program covers the concepts in Multidimensional Arrays chapter
 *
 * Sample input: from the keyboard
 *
 * Sample run/output: to the screen
    1D Array:
 apple banana carrot dragonfruit elderberry 
 
 2D Array:
 0 1 
 2 3 
 
 
 3D Array:
 example:
 1 2 3 
 4 5 6 
 7 8 9 
 
 10 11 12 
 13 14 15 
 16 17 18 
 
 19 20 21 
 22 23 24 
 25 26 27 
 
 
 
 3D Array - second example:
 first for loop
 second for loop
 1 2 3 
 second for loop
 4 5 6 
 second for loop
 7 8 9 
 
 first for loop
 second for loop
 10 11 12 
 second for loop
 13 14 15 
 second for loop
 16 17 18 
 
 first for loop
 second for loop
 19 20 21 
 second for loop
 22 23 24 
 second for loop
 25 26 27 
 *
 *
 * */

import java.io.*;
import java.util.*;

public class MultidimensionalArraysLearning {
  public static void main(String[] args) throws IOException {
   
   /* Java only has a data structure of 1D array, 
      but we can use a 1D array to hold a 1D array, that can hold a 1D array, 
      that can hold, a 1D array, and so on
   */
   System.out.println("1D Array:");
   // to define a 1D array
   // dataTpe [] identifier = new dataType [size];
   // example:
   String [] listOfFruits = new String [5];
   listOfFruits[0] = "apple";
   listOfFruits[1] = "banana";
   listOfFruits[2] = "carrot";
   listOfFruits[3] = "dragonfruit";
   listOfFruits[4] = "elderberry";
   
   // to iterate through a 1D array = a for loop
   for(int i = 0; i < listOfFruits.length; i++){
      System.out.print(listOfFruits[i] + " ");
   }
   System.out.println();
   System.out.println();
   
   System.out.println("2D Array:");
   // using the 1D data structure, we can make it hold another 1D array
   // example:
   int [][] table = new int [2][2];  // creates a table that holds 2 rows and 2 columns
   // for each [], there need to be a for loop to iterate through that 
   // this example has 2 [], so there needs to be 2 for loops
   int spot = 0;  // creating a variable so we can see how the flow of this 2D table works
   for(int row = 0; row < table.length; row++){
      for(int column = 0; column < table[row].length; column++){// you have to bound the length since each table can be a different size
         table[row][column] = spot; // assigning a value
         spot++;
      }
   }
   // let's see how it flows:
   for(int row = 0; row < table.length; row++){
      for(int column = 0; column < table[row].length; column++){
         System.out.print(table[row][column] + " ");      // printing all the columns for this row
      }
      System.out.println();  // going to the next row
   }
   System.out.println();
   System.out.println();
   
   System.out.println("3D Array:");
   System.out.println("example:");
   // to get additional 1D arrays - you just expand this concept:
   // assigning values:
   int[][][] threeD = 
       {  { {1,   2,  3}, { 4,  5,  6}, { 7,  8,  9} },
          { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} },
          { {19, 20, 21}, {22, 23, 24}, {25, 26, 27} } };
   // seeing values on the screen       
   for(int [][] rD: threeD){
         for(int [] cD: rD){// bounding to stay within this 1D array
            for(int value: cD){// bounding to stay within this 1D array
               System.out.print(value + " ");
            }
            System.out.println();
         }
         System.out.println();
   }
   System.out.println();
   System.out.println();

   System.out.println("3D Array - second example:");
   int[][][] threeD2 = new int[3][3][3];
   spot = 1;
   for (int i = 0; i < 3; i++){  // this is common to see the i, j, k or the x, y, z
       for (int j = 0; j < 3; j++){
           for (int k = 0; k < 3; k++){
               threeD2[i][j][k] = spot++;
           }
       }
   }
   
   for(int [][] rD: threeD2){ // using the for each loop
      System.out.println("first for loop");
         for(int [] cD: rD){// bounding to stay within this 1D array
            System.out.println("second for loop");
            for(int value: cD){// bounding to stay within this 1D array
               System.out.print(value + " ");
            }
            System.out.println();
         }
         System.out.println();
    }

  }// end main
}// end of MultidimensionalArraysLearning
