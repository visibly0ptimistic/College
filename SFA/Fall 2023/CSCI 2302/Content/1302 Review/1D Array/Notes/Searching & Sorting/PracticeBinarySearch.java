/* purpose:	to understand how the BinarySearch works
 *
 * input:	read in the from the file intNumList.txt
 *			the key is hard coded in the code
 * output:	to the screen
 *
 * sample run:
 *	The array values are:
	1    2    3    4    5    6    7    8    9    10
	The key is 2, can it be found?
	low (index value)is: 0
	high (index value) is: 9
	Going into the while loop: 9 >= 0
	mid (index value) is: 4
	if(2 < 5)
	the key is a lesser value than the middle value & the high (index value) is now 3; thus the loop will now look in the lower half of the array
	mid (index value) is: 1
	key found and returning the mid (index value), which is: 1
	The key was found at index 1 and the key is 2
 */

import java.io.*;
import java.util.*;

public class PracticeBinarySearch{

  public static void main(String[] args) throws IOException{

  	int [] ary = new int [10];
  	int key =  11;

	readIn(ary);
	printIt(ary);
	System.out.println("The key is " + key + ", can it be found?");
	int keyIndex = binarySearch(ary, key);
	if(keyIndex >= 0){
		System.out.println("The key was found at index " + keyIndex + " and the key is " + ary[keyIndex]);
	}
	else{
		System.out.println("The key was not found");
	}

  }// end main

  //**********************************************************************

  /** Use binary search to find the key in the list */
  public static int binarySearch(int[] list, int key) {
    int low = 0;					System.out.println("low (index value)is: " + low);
    int high = list.length - 1;		System.out.println("high (index value) is: " + high);

    								System.out.println("Going into the while loop: "+high+" >= "+low);
    while (high >= low) {
      int mid = (low + high) / 2;	System.out.println("mid (index value) is: " + mid);
      if (key < list[mid]){			System.out.println("if("+key+" < "+list[mid]+")  ");
        high = mid - 1;				System.out.println("the key is a lesser value than the middle value & the high (index value) is now " + high + "; thus the loop will now look in the lower half of the array");
      }
      else if (key == list[mid]){	System.out.println("key found and returning the mid (index value), which is: " + mid);
        return mid;
      }
      else{
      	low = mid + 1;				System.out.println("key is greater than the middle value & low (index value) is now " + low + "; thus the loop will now look in the upper half of the array");
      }

    }// end while loop

    return - 1; // meaning the key was not found

  }// end binarySearch method

  //**********************************************************************

  public static void readIn(int [] list) throws IOException{

  	File fileIn = new File("intNumList.txt");
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

}// end class PracticeBinarySearch
