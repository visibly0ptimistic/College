/**
 * Java 8 update 73
 *
 *	sample input:  	asks user for the day of the week
 *					day of the week, first letter capitalized
 *	sample output:  displays to the screen
 *
 *	example of run:
 *		This program asks for the day of the week and then tells you type of day that is for the week.

		What day is it?
		Monday
		The day of the week, Monday, is Start of work week
 */

import java.util.*;
import java.io.*;

public class StringSwitchExample {

	public static void main(String[] args) {

		System.out.println("This program asks for the day of the week and then tells you type of day that is for the week.");
		System.out.println();

		Scanner input = new Scanner(System.in);

		System.out.println("What day is it?");
		String dayOfWeek = input.next();
		System.out.print("The day of the week, " + dayOfWeek);

		String typeOfDay;
	     switch (dayOfWeek) {
	         case "Monday":
	             typeOfDay = "Start of work week";
	             break;
	         case "Tuesday":
	         case "Wednesday":
	         case "Thursday":
	             typeOfDay = "Midweek";
	             break;
	         case "Friday":
	             typeOfDay = "End of work week";
	             break;
	         case "Saturday":
	         case "Sunday":
	             typeOfDay = "Weekend";
	             break;
	         default:
	             throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeek);
	     }// end switch

	     System.out.print(", is " + typeOfDay);

	}// end main

} // end StringSwitchExample