/* purpose: to understand how the LinearSearch works
 *
 * input: read in the from the file linearNumList.txt
 *   the key is hard coded in the code
 * output: to the screen
 *
 * sample run:
 * The array values are:
 5    8    1    7    3    6    8    4    2    9
 The key is 8, can it be found?
 Going to loop through the array 1 value at a time, comparing the array value to the key
 for loop - index is: 0
 not true - next value
 for loop - index is: 1
 if (8 == 8) - is true, returning the index value of i (where the 1st position key was found)
 The key was found at index 1 and the key is 8
 */

import java.io.*;
import java.util.*;

public class PracticeLinearSearch {

  public static void main(String[] args) throws IOException{

   int [] ary = new int [10];
   int key = 2;

 readIn(ary);
 printIt(ary);
 System.out.println("The key is " + key + ", can it be found?");
 int keyIndex = linearSearch(ary, key);
 if(keyIndex >= 0){
  System.out.println("The key was found at index " 
                       + keyIndex + " and the key is " + ary[keyIndex]);
 }
 else{
  System.out.println("The key was not found");
 }

  }// end main

  //**********************************************************************

  /** The method for finding a key in the list */
  public static int linearSearch(int[] list, int key) {
                System.out.println("Going to loop through the array 1 value at a time, comparing the array value to the key");
    for (int i = 0; i < list.length; i++) {    System.out.println("for loop - index is: " + i);
      if (key == list[i]){        System.out.println("if ("+key+" == "+list[i]+") - is true, returning the index value of i (where the 1st position key was found)");
       return i;
      }
                   System.out.println("not true - next value");
    }// end for loop
                 System.out.println("The key was not found - returning a -1 to symbolize it is not in the array");
    return -1;
  }// end linearSearch method

  //**********************************************************************

  public static void readIn(int [] list) throws IOException{

   File fileIn = new File("linearNumList.txt");
   Scanner input = new Scanner(fileIn);

   for(int i = 0; i < list.length; i++){
    list[i] = input.nextInt();
   }

  }// end readIn method

  //**********************************************************************

  public static void printIt(int [] list){
   System.out.println("The array values are:");
   for(int i = 0; i < list.length; i++){
    System.out.print(list[i] + "    ");
   }
   System.out.println();
  }// end printIt method

}// end class PracticeLinearSearch
