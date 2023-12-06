/* 
 **/


import java.io.*;
import java.util.*;

public class TestStringCompareTo{
 public static void main(String[] args) {

   String s1="String1";  // literals
   String s2="String1";
   String s3="String3";
   String s4="Difference";

   System.out.println(s1.compareTo(s2));  //0
   System.out.println(s1.compareTo(s3));  //-2 (because s1 < s3)
   System.out.println(s3.compareTo(s1));  //2 (because s3 > s1 )
   System.out.println(s3.compareTo(s4));  // 15 (because s3 > s4

   String ss1 = "CSC202";
   String ss2 = "CSC202";
   String ss3 = "csc202";

   System.out.println(ss1.compareTo(ss2)); //0
   System.out.println(ss1.compareTo(ss3)); //-32(because s1 < s3)
   System.out.println(ss3.compareTo(ss1)); //32(because s3 > s1 )


  }// end main
}// end class TestStringCompareTo