/*
 *  Practice Formatting page 147
 *
 **/

import java.util.*;
import java.io.*;

public class Formatting {


    public static void main(String[] args) {

		String s1 = "Lumberjacks!";
		String s2 = "Axe 'em!";
		System.out.println("Formatting words: with __ spaces in front of each and each word is on its own line");
		System.out.printf("%15s\n%15s\n\n", s1, s2);

		System.out.println("Formatting words: with __ spaces after each word");
		System.out.printf("%-15s\n%-15s\n\n", s1, s2);

		double dNum = 3458.98457923;
		System.out.println("A number: " + dNum);
		System.out.printf("Formatting that number with just 4 places after the decimal.");
		System.out.printf("%10.4f\n\n", dNum);

		System.out.printf("a character- \n");
		System.out.printf("%10c\n\n", 'Q');

		System.out.printf("a whole numer- \n");
		System.out.printf("%10d\n\n", 34);

		System.out.println("Left Justified!");
		System.out.printf("%-15s%-15s%-15s\n\n", s1, s2, "All done!");

    }// end main

}// end Formatting class