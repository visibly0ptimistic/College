/*  CSC 102 */

import java.io.*;
import java.util.*;

 public class CharExamples {
  public static void main(String[] args) {

   char ch = 'n';

   System.out.println("The character is the letter: " + ch);

   if(ch == 'a'){
   	System.out.println("It is equal to the letter a");
   }
   else{
   	System.out.println("It is not equal to the letter a");
   }

   if(Character.isDigit(ch)){
   	System.out.println("It is a digit");
   }
   else{
   	System.out.println("It is not a digit");
   }

   if(Character.isLetter(ch)){
   	System.out.println("It is a letter");
   }
   else{
   	System.out.println("It is not a letter");
   }

   if(Character.isLowerCase(ch)){
   	System.out.println("It is a lowercase letter");
   	ch = Character.toUpperCase(ch);
   }
   else if(Character.isUpperCase(ch)){
   	System.out.println("It is not a lowercase letter");
   	ch = Character.toLowerCase(ch);
   }
   else{
   	System.out.println("It is a digit");
   }

   System.out.println("The character is the letter: " + ch);

   System.out.println("The character is a uppercase - true or false: " + Character.isUpperCase(ch) );

   boolean b = Character.isUpperCase(ch);





  } // end main
 } // end CharExamples