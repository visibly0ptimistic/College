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
		System.out.println("Formatting words: with __ spaces infront of each and each on their own line");
		System.out.printf("%15s\n%15s\n\n", s1, s2);

		System.out.println("Formatting words: with __ spaces after each word");
		System.out.printf("%-15s\n%-15s\n\n", s1, s2);

		System.out.printf("%10.4f\n\n", 3458.98457923);

		System.out.printf("%10c\n\n", 'Q');

		System.out.printf("%10d\n\n", 34);

		System.out.println("Left Justified!");
		System.out.printf("%-15s%-15s%-15s\n\n", s1, s2, "All done!");

    }// end main

}// end Formatting class