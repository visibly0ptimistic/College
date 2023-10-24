/*	If the time is less than 10:00, you will get a "Good Morning" greeting,
	if the time is between 10 & 6 you will get a "Good Day" greeting,
	if the time is between 6 & 10 you will get a "Good Evening" greeting
	otherwise you will get a "Good Night" greeting.
*/
import java.io.*;
import java.util.*;

public class Greetings {
	public static void main (String[] args){

		double time;
		Scanner input = new Scanner(System.in);

		System.out.println("What time is it?  Please use military time.");
		time = input.nextDouble();

		if (time < 10)  {
			System.out.println("Good Morning!");
		}
		else if (time >= 10 && time < 18)  {
			System.out.println("Good Day!");
		}
		else if (time >= 18 && time < 22)  {
			System.out.println("Good Evening!");
		}

		else  {
			System.out.println("Good Night!");
		}

	} // end main
} // end Greetings
