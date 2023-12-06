/*  String immutable example
 *
 *
 **/


import java.io.*;
import java.util.*;

public class Testimmutablestring{
 public static void main(String[] args) {

   String s = "CSCI";  // This is a string literal, the value os CSCI is stored in the String Pool memory area
   System.out.println(s);// will print CSCI 
   s.concat(" 2302");//concat() method appends the string at the end - but the variable s is not reassigned
   System.out.println(s);//will print CSCI because strings are immutable objects - and s is not re-assigned!

   s = s.concat(" 2302");// appended and assigned to the NEW value, a NEW string is generated and assigned to the variable s
   System.out.println(s);// will print CSCI 2302  - CSCI object still exists but does not have a reference to it anymore

 }// end main
}// end class