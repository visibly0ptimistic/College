/* This program generates 3 random numbers then checks to see which number is greatest.
*/

import java.io.*;
import java.util.*;

public class GreatestNumber {
 
    public static void main (String[] args){
    	
    	// generate 3 random numbers
    	int number1 = (int)(System.currentTimeMillis() * 4 % 10);
    	int number2 = (int)(System.currentTimeMillis() * 9 % 10);
    	int number3 = (int)(System.currentTimeMillis() * 5 % 10);
    	
    	if(number1 > number3){
    		if(number2 > number3){
    			System.out.println("number1, " + number1 + ", and number2, " + number2 + ", is greater than number3, " + number3 + ".");
    		}
    		else{
    			System.out.println("number2, " + number2 + ", is less than or equal to number3, " + number3 + ".");
    		}
    	}
    	
    }
    
    
}