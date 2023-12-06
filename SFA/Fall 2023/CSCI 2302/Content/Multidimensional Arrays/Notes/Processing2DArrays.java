/*Java version 8
 *
 *This program has examples of processing 2D arrays
 *
 * Sample input:  from the file: twoDarray.txt  1 2 3 4 5
 *												1 1 1 1 1
 *
 * Sample run/output: to the screen
 *		1 2 3 4 5
		1 1 1 1 1
		0 0 0 0 0
		2 2 2 2 2
		5 5 5 5 5

		The sum is: 55
		The average is: 2.0

		Printing out just the first row
		1 2 3 4 5
 *
 *
 * */

import java.io.*;
import java.util.*;

public class Processing2DArrays {
  public static void main(String[] args) throws IOException {

	Scanner input = new Scanner(new File("twoDarray.txt"));

	//datatype how_many_dimensions_for_square_brackets variableName = new datatype [how_many_rows][how_many_columns];
	int[][] matrix = new int[5][5];

	// getting data from the file
	for(int row = 0; row<matrix.length; row++){
		for(int column = 0; column<matrix[row].length; column++){
			matrix[row][column] = input.nextInt();
		}
	}
	// closing file to free the resources up
	input.close();

	// printing the entire 2D array
	for(int row = 0; row<matrix.length; row++){
		for(int column = 0; column<matrix[row].length; column++){
			System.out.print(matrix[row][column] + " ");  // prints the row with a space in between the data
		}
		System.out.println();  // new line for the next row
	}
	System.out.println();

	// sum & average for the entire 2D array
	int sum = 0;
	for(int row = 0; row<matrix.length; row++){
		for(int column = 0; column<matrix[row].length; column++){
			sum = sum + matrix[row][column];
		//	sum += matrix[row][column];
		}
	}
	System.out.println("The sum is: " + sum);
	double average = sum/25;
	System.out.println("The average is: " + average);
	System.out.println();

	// printing by hard coding in a value of a row
	System.out.println("Printing out just the first row");
	for(int column = 0; column<matrix[0].length; column++){
		System.out.print(matrix[0][column] + " ");
	}
	System.out.println();
	System.out.println();

	// finding the average for the row
	sum = 0;
	int howManyInRow = 0;
	System.out.println("Printing out a row and getting the average of the row");
	for(int row = 0; row<matrix.length; row++){
		for(int column = 0; column<matrix[row].length; column++){
			System.out.print(matrix[row][column] + " ");
			sum = sum + matrix[row][column];
			howManyInRow = column;
		}
		System.out.println();
		System.out.println("The sum for the row is: " + sum);
		System.out.println("The average for the row is:" + sum/howManyInRow);
		System.out.println();
		sum = 0;
	}



  }// end main
}// end of Processing2DArrays
