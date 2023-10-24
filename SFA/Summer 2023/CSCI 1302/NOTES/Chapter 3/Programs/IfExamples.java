/*  CSC 102 */

import java.io.*;
import java.util.*;

 public class IfExamples {
  public static void main(String[] args) {

   boolean isMoving = true;
   int currentSpeed = 3;
   if (isMoving){
         // the "then" clause (what to do when the test is true): decrease current speed
         currentSpeed  -= 2 ;
     }
     else
      currentSpeed++;
  System.out.println("The speed of the bike is: " + currentSpeed);

  //************************************************

  int temperature = 90;
  if (temperature < 50)
     System.out.println("It's cold.");
  else if (temperature < 85)
     System.out.println("It's nice.");
  else if (temperature < 95)
    System.out.println("It's getting hot!");
  else
     System.out.println("It's hot.");

  //************************************************

  String name = "Anne";
  if( name.equals("John")) {
      System.out.println("Hi John!");
  }
  else if ( name.equals("Jane")) {
      System.out.println("Hi Jane!");
  }
  else if ( name.equals("Linda")) {
   System.out.println("Hi Linda!");
  }
  else {
   System.out.println("Hi There!");
  }

  //************************************************

  int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        }
        else if (testscore >= 80) {
            grade = 'B';
        }
        else if (testscore >= 70) {
            grade = 'C';
        }
        else if (testscore >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

        //************************************************


        System.out.println("Incorrect way - logic error:  compiles, runs, but not correct value");
        if (testscore >= 60) {
            grade = 'D';
        }
        else if (testscore >= 70) {
            grade = 'C';
        }
        else if (testscore >= 80) {
            grade = 'B';
        }
        else if (testscore >= 90) {
            grade = 'A';
        }
        else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);



  } // end main
 } // end IfExamples