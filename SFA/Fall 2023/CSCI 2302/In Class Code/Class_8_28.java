/*
   Name: Anne Marie Eubanks
   
   
   Java version:  8
   
   Purpose:  What does this program do?
   
   Input:  (where are you getting the input from?)
         hard coding (meaning the values are declared in the code)
   
   
   Output:  (where is the output going?)
         to the screen/console
   
   Other associated files:
   
   Sample Run:  (how is the output suppose to be when it runs)
         
   
   
*/


//import java.io.*;

public class Class_8_28 {
   public static void main (String [] args) {//throws IOException {
      
      // Data Dictionary
      
      System.out.println("Indent your code, for each block - line up!");
      
      
      String s = "class";
      System.out.println("s:  " + s);
      s.toUpperCase();
      System.out.println("s:  " + s);
      s = s.toUpperCase();
      System.out.println("s:  " + s);
      
      boolean b = true;
      if(!b){
      
      }
      else if (b){
      
      }
      else{
      
      }
      
      char letterQ = 'Q';
      System.out.println(Character.isLetter(letterQ));
      System.out.println(Math.pow(2, 3));
      
      System.out.printf("$%5.2f", 2.7564);
      
      
      System.out.println(method1());
      
      
      method2();
      
      System.out.println(method3());
      
      String hello = "hello";
      System.out.println(hello);
      String stringFromMethod4 = method4(hello);
      System.out.println(stringFromMethod4);
      System.out.println(hello);
      
      //**************************************
      /*
      syntax:   dataType [] identifier = new dataType[#];
                int [] numbers = new int[10];
      
      index values from 0 to 9
      
   */
   int [] numbers = new int[3];
   numbers[0] = 1;
   numbers[1] = 2;
   numbers[2] = 3;
   for(int i = 0; i < numbers.length; i++){
      System.out.print(numbers[i] + " ");
   }
      
      
      
   }// end main method
   
   public static int method1(){
   
      return 1;
   
   }// end method1
   
   static void method2(){
      System.out.println("inside method 2");
   }// end method2
   
   static String method3(){
      System.out.println("inside method 3");
      return "2302";
   }// end method3
   
   public static String method4(String st){
      st = "method 4";
      return st;
   }
   
   // JAVA IS PASS-BY-VALUE!!!!!!!!!
   
   
   
}// end Class_8_28 class