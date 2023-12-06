//
import java.io.*;
import java.util.*;
public class AddPenny_ObjectDouble {
	public static void main (String[] args){

		Double penny = .01;
		System.out.println("penny value: " + penny);

		Double dollar = 0.0;
		System.out.println("Dollar at the start: " + dollar);

		for(int x = 0; x < 100;  x++){
			dollar += penny;
			System.out.println(dollar);
		}

		System.out.println("In the end the dollar is " + dollar);

	}// end main
}// end AddPenny_ObjectDouble