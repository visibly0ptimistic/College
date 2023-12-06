/* This program shows examples of using regex - matches method *
 * Sample input: hard coded into program 
 *
 * Sample run/output: to the scrren
 *
 * 
 
   Other resources to look at:  http://tutorials.jenkov.com/java-regex/index.html
 * */
 
 
import java.io.*;
import java.util.*;

public class RegexExamples {
  public static void main(String[] args) {

  	   // 936-468-2508
 		String pn = "936-468-2508";
 		System.out.println( pn.matches("\\d{3}-\\d{3}-\\d{4}")   );
      System.out.println( pn.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")   );


      String name = "afst last";
      System.out.println(name.matches("[A-Za-z]{5} [A-Za-z]{4}"));
      System.out.println(name.matches("\\w{5} \\w{4}"));

      String sfaID = "123456";
      System.out.println(sfaID.matches("[0-9]{7}"));
      System.out.println(sfaID.matches("\\d{7}"));


  }// end main
}// end of RegexExamples
