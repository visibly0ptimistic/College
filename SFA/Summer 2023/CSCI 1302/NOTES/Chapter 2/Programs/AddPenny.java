// This is to perform examples on the fly
import java.io.*;
import java.util.*;
public class AddPenny {
	public static void main (String[] args){

		double penny = .01;

		double dollar = 0.0;

		for(int x = 0; x < 100;  x++){
			System.out.println(penny);

			System.out.println(dollar);
			dollar = dollar + penny;
			System.out.println(dollar);
		}

		System.out.println("In the end the dollar is " + dollar);


	}
}