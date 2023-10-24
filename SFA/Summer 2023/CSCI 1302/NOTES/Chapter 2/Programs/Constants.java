// This is examples of constants
// constants never change

import java.io.*;
import java.util.*;


public class Constants {

    public static void main (String[] args){
    	// Constants are declared:  final datatype CONSTANTNAME = value;

    	final double PI = 3.14159;
    	System.out.println("PI is " + PI);

		System.out.println();
		//*****************

		final double TEXASTAXRATE = .0625;
    	System.out.println("The Texas sale tax rate is " + TEXASTAXRATE + ", though local " +
    		"taxing jurisdictions (cities, counties, special purpose districts, and " +
    		"transit authorities) may also impose sales and use tax up to 2% for a total" +
    		" maximum combined rate of 8.25%.");

		System.out.println();
		//*****************
    }


}