/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18

 *	Purpose:  to work with Generics
 *				Generics enable you to detect errors at compile time rather than at runtime
 *				Generics enable you to reuse code independent of the data types
				Generics eliminate the need for type casting
 *	Input:  genericsIn.txt
 *	Output:  to the screen
 *	Sample run:
 *		The Sorted Arrays are:
		1 3 5 6 6 9 15 16 19 24 25 34 36 43 48 55 81 82 86 99 107 241
		7.31 8.81 10.2 12.73 18.25 19.2 23.5 28.99 32.1 45.6 46.7 56.55 64.67 81.6 88.37
		4 A B E M P S T V X

		Generics Program finished
 */

import java.util.*;
import java.io.*;

   public class Ejiasiv_GenericsMethodsLab{

   	public static void main(String [] args) throws IOException{

   		// Declare arrays
   		Integer[] integers;
   		Double[] doubles;
   		Character[] characters;

		   // add your try with resource code here
		try (Scanner input = new Scanner(new File("genericsIn.txt"))) {
	   		// Read arrays
		integers = readIntegers(input);
		doubles = readDoubles(input);
		characters = readCharacters(input);


         // Output original data
         System.out.print("The integer array:  ");
   		printArray(integers);
   		System.out.print("The double array:  ");
   		printArray(doubles);
   		System.out.print("The character array:  ");
   		printArray(characters);

   		// Sort
   		sort(integers);
   		sort(doubles);
   		sort(characters);

   		// Output sorted data
   		System.out.println();
   		System.out.println("The Sorted Arrays are:");
   		printArray(integers);
   		printArray(doubles);
   		printArray(characters);

   		System.out.println();
   		System.out.println("Generics Program finished");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
   	}// end main

   	public static Character[] readCharacters(Scanner in){
   		int size = in.nextInt();
   		Character[] charValues = new Character [size];
   		for(int i = 0; i < size; i++){
   			charValues [i] = in.next().charAt(0);
   		}
   		return charValues;
   	}// end readCharacters

   	public static Integer[] readIntegers(Scanner in){
   		int size = in.nextInt();
   		Integer[] intValues = new Integer [size];
   		for(int i = 0; i < size; i++){
   			intValues [i] = in.nextInt();
   		}
   		return intValues;
   	}// end readIntegers

   	public static Double[] readDoubles(Scanner in){
   		int size = in.nextInt();
   		Double[] doubleValues = new Double [size];
   		for(int i = 0; i < size; i++){
   			doubleValues [i] = in.nextDouble();
   		}
   		return doubleValues;
   	}// end readDoubles


   	// You provide print method here
	public static <E> void printArray(E[] array) {
		for (E element : array) {
			System.out.print(element + " ");
		}
		System.out.println();

   	}// end printArray

	   // You provide generic sort here
	   // <E extends Comparable <E>> makes it bounded
	public static <E extends Comparable<E>> void sort(E[] array) {
		Arrays.sort(array);
   	}// end sort
      
}// end GenericsMethodsLab
