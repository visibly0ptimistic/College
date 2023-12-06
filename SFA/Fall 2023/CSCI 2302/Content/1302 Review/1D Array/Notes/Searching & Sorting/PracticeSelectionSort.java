/*Purpose:  to understand how the SelectionSort works
 *
 *input: 	read in from the file numList.txt
 *output: 	to the screen
 *
 *sample run:
 *	The currentMin (1st for loop): 2.3
	The currentMinIndex (1st for loop): 0
	Checking through to find the min value - j/index is: 1
	Checking through to find the min value - j/index is: 2
	Checking through to find the min value - j/index is: 3
	at the if(2.3 > 1.2)
	Found a lower number & reassigning currentMin to new value: 1.2
	Re-assigning the currentMinIndex to match the index of the new currentMin: 3
	Checking through to find the min value - j/index is: 4
	at the if(1.2 > 0.9)
	Found a lower number & reassigning currentMin to new value: 0.9
	Re-assigning the currentMinIndex to match the index of the new currentMin: 4
	Checking through to find the min value - j/index is: 5
	Checking through to find the min value - j/index is: 6
	Checking through to find the min value - j/index is: 7
	Checking through to find the min value - j/index is: 8
	Checking through to find the min value - j/index is: 9
	at the if(0.9 > 0.1)
	Found a lower number & reassigning currentMin to new value: 0.1
	Re-assigning the currentMinIndex to match the index of the new currentMin: 9
	Leaving the 2nd for loop that checks to find the min value in the rest of the array
	Need to swap the new min value location with the previous min value location
	The previous min is moved where the new min location was in the array: 2.3
	The new min is now assigned to where the previous min was located:  0.1
	see how far it is sorted now: 0.1    5.6    8.1    1.2    0.9    5.4    7.1    6.3    8.9    2.3

	...

	0.1    0.9    1.2    2.3    5.4    5.6    6.3    7.1    8.1    8.9

 *
 */


import java.io.*;
import java.util.*;

public class PracticeSelectionSort {

  public static void main(String[] args) throws IOException{

	double [] ary = new double [10];

	readIn(ary);
	selectionSort(ary);
	printIt(ary);

  }// end main

  //**********************************************************************

  /** The method for sorting the numbers */
  public static void selectionSort(double[] list) {
    // to loop through the array to find the minimum
    for (int i = 0; i < list.length - 1; i++) {
      // Find the minimum in the list[i..list.length-1]
      double currentMin = list[i];					System.out.println("The currentMin (1st for loop): " + currentMin);
      int currentMinIndex = i;						System.out.println("The currentMinIndex (1st for loop): " + currentMinIndex);

      // finds the min in the rest of the array
      for (int j = i + 1; j < list.length; j++) {	System.out.println("Checking through to find the min value - j/index is: " + j);
        if (currentMin > list[j]) {					System.out.println("at the if("+currentMin+" > "+list[j]+") ");
          currentMin = list[j];  					System.out.println("Found a lower number & reassigning currentMin to new value: " + currentMin);
          currentMinIndex = j;   					System.out.println("Re-assigning the currentMinIndex to match the index of the new currentMin: " + currentMinIndex);
        }
      }// for loop that
													System.out.println("Leaving the 2nd for loop that checks to find the min value in the rest of the array");

      // Swap list[i] with list[currentMinIndex] if necessary;
      if (currentMinIndex != i) {			System.out.println("Need to swap the new min value location with the previous min value location");
        list[currentMinIndex] = list[i];  	System.out.println("The previous min is moved where the new min location was in the array: " + list[currentMinIndex]);
        list[i] = currentMin;				System.out.println("The new min is now assigned to where the previous min was located:  " + list[i]);
        									System.out.print("see how far it is sorted now: ");printIt(list);System.out.println();
      }

    }// end for loop that loops through the array to find the minimum in the list

  }// end selectionSortMethod

  //**********************************************************************

  public static void readIn(double [] list) throws IOException{

  	File fileIn = new File("numList.txt");
  	Scanner input = new Scanner(fileIn);

  	for(int i = 0; i < list.length; i++){
  		list[i] = input.nextDouble();
  	}

  }// end readIn method

  //**********************************************************************

  public static void printIt(double [] list){
  	for(int i = 0; i < list.length; i++){
  		System.out.print(list[i] + "    ");
  	}
  }// end printIt method

}// end class PracticeSelectionSort
