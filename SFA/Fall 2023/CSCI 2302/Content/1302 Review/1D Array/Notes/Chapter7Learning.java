/* Java version: 8
 *
 *	Chapter 7 - 1D Arrays
 * */

import java.io.*;
import java.util.*;

public class Chapter7Learning {
  public static void main(String[] args) throws IOException {

  	/*Array:  stores a fixed-size sequential collection of elements of the same data type (it can only hold one data type!).
	  A single array variable can reference a large collection of data [of the same data type].
	  Once an array is created, its size is fixed.
	  An array reference variable is used to access the elements in an array using an index.
	*/


  	/*Declaring Arrays:
	  elementType [] arrayVariableName;
	  Example:		double [] aryList;
	  Declaring an array does NOT create memory for the array (unlike primitive data types).
	  Creates a storage location for the [future] reference to the array.
	*/
	int [] ary;  //declares a 1D array that will only hold integer data types & says this object will be located at memory spot 01010101

	/*Creating Arrays:
	  arrayVariableName = new elementType [size];
	  Example:	aryList = new double[10];
	  Create an array – This is when the memory space is allocated – the reference is assigned to the variable
	  Assigns the reference of the newly created array to the variable name
	*/
	ary = new int[5]; //at memory spot 01010101, creates a 1D array that will have 5 memory spots that will only hold int data types

	/*Combining – declare & create:
	  elementType [] arrayVariableName = new elementType [size];
	  Example:  	double [] aryList = new double[10];
	  Declared and created an array of type:  double, with variable name: aryList, with 10 elements in the array
	  Default values are assigned to the data elements
		i.e. if int data type, then 0 is assigned to all the elements, if double data type, then 0.0 is assigned to the elements , on so on.
	*/
	int [] ary2 = new int [10]; // declares (says this object will be located at memory spot 1101101) will be a 1D array
								// and at memory spot 1101101, creates a 1D array that will have 10 memory spots that will hold only int data types

	/*To assign values to the elements:
	  arrayVariableName[index] = value;
	  Example:	aryList[0] = 5.6;
	*/
	ary[0] = 102; // for the array, ary, the first element(the element at index 0) will have the value of 102


	/*Size:
		When the array is created, the size is given, then space is allocated
		the size of the array can be obtained using arrayVariableName.length
		the size cannot be changed after the array is created
	*/
	// the array size for ary is 5
	// the array size for ary2 is 10

	/*Default values:
		Primitive numeric data types (int, double) are assigned value of 0
		Character data types are assigned: \u0000
		boolean data types are assigned false
	*/

	/*How to Access Arrays Elements:
		the array elements are accessed through the index
		[#]
	*/

	/*Index:
		counting starts at 0 and ends at arrayVariableName.length - 1
		after an array is created, an indexed variable can be used in the same way as a regular variable
		always int data type!
	*/

	/*Array Initializers:
		shorthand notation
		combines the declaration, creation, and initialization of an array into one statement.
	  elementType [] arrayVariableName = {value0, value1, …, valuek};
	  Example:  double [] aryList = {1.9, 2.9, 3.4, 3.5};
	*/

	/*
	for loops are often used to process arrays, for 2 reasons:
	1.	All of the elements in an array are of the same type.  They are evenly processed in the same fashion repeatedly using a loop.
	2.	Since the size of the array is known, it is natural to use a for loop.
	*/

	/*
	Processing Arrays
	MAKE SURE YOU KNOW HOW TO DO #1, 3, 4, & 5
	The following are some examples of processing arrays.
	*/

	//1.	Initializing arrays with input values: The following loop initializes the array myList with user input values.
	System.out.println("Initializing arrays with input values");
	Scanner input = new Scanner(System.in);
	double [] myList = new double [3];
	System.out.println("Enter " + myList.length + " values: ");
	for (int i = 0; i < myList.length; i++){
		myList[i] = input.nextDouble();// read in any data type values
	}
	System.out.println();

	//2.	Initializing arrays with random values: The following loop initializes the array myList with random values between 0.0 and 100.0, but less than 100.0.
	System.out.println("Initializing arrays with random values");
	for (int i = 0; i < myList.length; i++) {
		myList[i] = Math.random() * 100;
	}
	System.out.println();

	//3.	Displaying arrays: To print an array, you have to print each element in the array using a loop like the following:
	System.out.println("Displaying arrays");
	for (int i = 0; i < myList.length; i++) {
		System.out.print(myList[i] + " ");
	}
	System.out.println();

	//4.	Summing all elements: Use a variable named total to store the sum. Initially total is 0. Add each element in the array to total using a loop like this:
	System.out.println("Summing all elements");
	double total = 0;
	for (int i = 0; i < myList.length; i++) {
		total += myList[i];
	}
	System.out.println("The sum is:  " + total);
	System.out.println();

	/*5.	Finding the largest element: Use a variable named max to store the largest element.
			Initially max is myList[0]. To find the largest element in the array myList,
			compare each element with max, and update max if the element is greater than max. */
	System.out.println("Finding the largest element");
	double max = myList[0];
	for (int i = 1; i < myList.length; i++) {
		if (myList[i] > max)
			max = myList[i];
	}
	System.out.println("Max is:  " + max);
	System.out.println();

	/*6.	Finding the smallest index of the largest element:
	 *		Often you need to locate the largest element in an array.
	 *		If an array has multiple elements with the same largest value,
	 *		find the smallest index of such an element.
	 *		Suppose the array myList is {1, 5, 3, 4, 5, 5}.
	 *		The largest element is 5 and the smallest index for 5 is 1.
	 *		Use a variable named max to store the largest element and
	 *		a variable named indexOfMax to denote the index of the largest element.
	 *		Initially max is myList[0], and indexOfMax is 0. Compare each element
	 *		in myList with max, and update max and indexOfMax if the element is greater than max.*/
	System.out.println("Finding the first occurance of the largest number");
	int [] myIntList = {1, 5, 3, 4, 5, 5};
	double max4myIntList = myIntList[0];
	int indexOfMax4myIntList = 0;
	for (int i = 1; i < myIntList.length; i++) {
		if (myIntList[i] > max4myIntList) {
			max4myIntList = myIntList[i];
			indexOfMax4myIntList = i;
		}
	}
	System.out.println("The max value is:  " + max4myIntList + ", and the first occurance is at:  " + indexOfMax4myIntList);
	System.out.println();

	/*
	Copying Arrays:
		To copy the contents of one array into another, you have to copy the array’s individual elements into the other array.
		The following statement does not copy the contents, it copies the reference to the same array (meaning 2 references to the same array):
			list1 = list2;
	There are 3 ways to copy arrays:
		1) Use a loop to copy the elements 1 by 1
		*/
		int[] sourceArray = {2, 3, 1, 5, 10};
		int[] targetArray = new int[sourceArray.length];
		for (int i = 0; i < sourceArray.length; i++) {
			targetArray[i] = sourceArray[i];
		}
		System.out.println("printing sourceArray:");
		printArray(sourceArray);
		System.out.println("printing targetArray:");
		printArray(targetArray);
		System.out.println();
		/*
		2) Use the static arraycopy method in the System calls.
		*/
		int []a = {1, 8, 3};
	   // Create an array b[] of same size as a[]
	   int []b = new int[a.length];

	   // Copy elements of a[] to b[]
	   System.arraycopy(a, 0, b, 0, 3);
	   System.out.println("printing a array:");
		printArray(a);
		System.out.println("printing b array:");
		printArray(b);
		System.out.println();

		/*
		3)Use the clone method
		*/
		int []aC = {1, 8, 3};
	   // Copy elements of a[] to b[]
	   int []bC = aC.clone();
	   System.out.println("printing aC array: ");
		printArray(aC);
		System.out.println("printing bC array: ");
		printArray(bC);
		System.out.println();

		//The incorrect way to copy:
		int[] aNotACopy = {1, 8, 3};

		// Create an array b[] of same size as a[]
		int[] bNotACopy = new int[aNotACopy.length];

		// Doesn't copy elements of a[] to b[], only makes
		// b refer to same location as a, meaning both are pointing at 1 memory location, not 2 different memory locations
		bNotACopy = aNotACopy;

	/*
	Passing Arrays to Methods:
	•	When passing an array to a method, the reference of the array is passed to the method.

	Java is pass-by-value:  the value that is in memory
		For primitive data types, the value of the variable is passed to the method
		For array data types, the value of the reference to an array is passed to the method.
			Meaning, that the changes in the array in the method will be seen outside the method.

	*/

	int [] aryOf3 = {1, 2, 3};
	System.out.println("Calling printArray method: ");
	printArray(aryOf3);
	System.out.println();
	System.out.println();

	System.out.println("Calling a method to read in the values from a file:");
	int [] aryFromFile = new int [10];
	readInArrayFromFile(aryFromFile);
	System.out.println("printing the contents in main of the aryFromFile");
	for (int i = 0; i < aryFromFile.length; i++) {
		System.out.print(aryFromFile[i] + " ");
	}
	System.out.println();
	System.out.println();


	System.out.println("Now sending the ary to be printed from the printArray method");
	printArray(aryFromFile);
	System.out.println();
	System.out.println();


	/*Returning an Array from a Method:
	  When a method returns an array, the reference of the array is returned.
	*/

	System.out.println("Having an array returned from a method");
	int[] numbers = returnArrayWithValues();
	System.out.println();

	System.out.println("Printing those values in the method PrintArray");
	printArray(numbers);

  }// end main

  //******************************************************************************************

  	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}// end printArray

	//******************************************************************************************

  	public static void readInArrayFromFile(int[] ary) throws IOException{
  		Scanner input = new Scanner(new File("countDown.txt"));
  		for (int i = 0; i < ary.length; i++) {
  			ary[i] = input.nextInt();
  		}
  	}// end readInArrayFromFile

  	//******************************************************************************************

  	public static int[] returnArrayWithValues()throws IOException{
  		Scanner input = new Scanner(new File("10ints.txt"));
  		int size = input.nextInt();// the first value in the file specifies how many elements are in the file
  		int []ary = new int[size];
  		for (int i = 0; i < ary.length; i++) {
  			ary[i] = input.nextInt();
  		}
  		return ary;

  	}// end returnArrayWithValues

  	//******************************************************************************************

}// end of Chapter7Learning
