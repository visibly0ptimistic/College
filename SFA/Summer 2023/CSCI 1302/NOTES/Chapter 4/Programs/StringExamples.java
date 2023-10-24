/*
 *
 *
 **/


import java.util.*;
import java.io.*;

public class StringExamples {


    public static void main(String[] args) {


		String s1 = "java";
		String s2 = "java";

		// length method - returns an int
		int howManyCharIn_s1 = s1.length();
		System.out.println("Length is how many characters in that String.  For example, the variable s1 has: " + s2.length() + " characters in it");

		// getting the first character
		char firstch = s1.charAt(0);
		System.out.println("The first character of s1:" + firstch);

		// getting the last character
		int num = s1.length()-1;
		char lastch = s1.charAt(num);
		System.out.println("The last character of s1:" +lastch);
		// another way of getting the last character
		char lastch2 = s2.charAt(s1.length()-1);
		System.out.println("The last character of s2:" + lastch2);

		// getting the third character
		char tch = s1.charAt(2);
		System.out.println("The third character of s1:" +tch);


		// comparing the strings
		boolean eb = s1.equals(s2);
		System.out.println("Are they the same using .equals? " + eb);

		boolean ebic = s1.equalsIgnoreCase(s2);
		System.out.println("Are they the same using .equalsIgnoreCase? " + ebic);

		System.out.println("Can the == be used to compare Strings?  NO!!");
		System.out.println("Comparing s1 & s2 using ==  " + s1 == s2);

		int num2 = s1.compareTo(s2);
		System.out.println("The result of s1.compareTo(s2) is: " + num2);

		int num3 = s2.compareTo(s1);
		System.out.println("The result of s2.compareTo(s1) is: " + num3);

		// joining Strings
		String course = "CSC 102";
		String joinedStrings = course.concat(s1);
		System.out.println("course variable with s1 joined on at the end: " + joinedStrings);

		// another way
		String anotherWay = course + s1;
		System.out.println("course variable with s1 joined on at the end: " + anotherWay);

		// getting all capital letters
		s1 = s1.toUpperCase();
		System.out.println("s1 with all capital letters:  " + s1);

		// getting all lower case letters
		s1 = s1.toLowerCase();
		System.out.println("s1 with all lower case letters:  " + s1);

		// getting ride of blank spaces on the front and the back of the String
		String blankSpaces = "    lots of blank spaces or white spaces before and after     ";
		String noBlankSpaces = blankSpaces.trim();
		System.out.println("String:" + blankSpaces + "spaces, spaces spaces, ...");
		System.out.println("String:" + noBlankSpaces + "none on the ends now");


		// finding out what the String starts with
		System.out.println("Does s1 start with a j?  " + s1.startsWith("j"));
		System.out.println("Does s1 start with a J?  " + s1.startsWith("J"));

		// finding out what the String ends with
		System.out.println("Does s1 start with a a?  " + s1.endsWith("a"));
		System.out.println("Does s1 start with a A?  " + s1.endsWith("A"));

		// finding out if a String contains another String
		boolean contains_a = s1.contains("a");
		System.out.println("Does s1 contain the letter a? " + contains_a);

		boolean containsA = s1.contains("A");
		System.out.println("Does s1 contain the letter A? " + containsA);

		boolean contains_va = s1.contains("va");
		System.out.println("Does s1 contain the letters va? " + contains_va);

		// obtaining a substring
		String middleOf_s1 = s1.substring(1,3);
		System.out.println("The middle characters of s1:  " + middleOf_s1);

		// the last 2 letters of a word
		String last = s1.substring(s1.length()-2,s1.length() );
		System.out.println("The last two characters of s1:  " + last);

		// finding characters in a String
		System.out.println("Notice that indexOf method returns the first occurance of the specified character with that range or the String - depending on the arguments given.");
		System.out.println("And that lasIndexOf returns the last occurance of the specified character with that range or the String - depending on the arguments given.");
		System.out.println("Two examples:");
		int firstIndexOfA = s1.indexOf('a');
		System.out.println("First occurance of a: " + firstIndexOfA);
		int lastIndexOfA = s1.lastIndexOf('a');
		System.out.println("Last occurance of a: " + lastIndexOfA);

    }// end main

}// end StringExamples class