/*
   Name: Anne Marie Eubanks
   
   
   Java version:  8
   
   Purpose:  To distinguish between Inheritance & Aggregation 
               and to see the inheritance chain
   
   Input:  hard coding (meaning the values are declared in the code)
   
   
   Output:  to the screen/console
   
   Other associated files:  none
   
   Sample Run:  
       Data Dictionary-  instantiation statements:
       
       A object:
       A object instantiated
       
       B object:
       B object instantiated
       
       C object:
       A object instantiated
       C object instantiated
       
       D object:  
       A object instantiated
       C object instantiated
       D object instantiated
       
       E object:
       A object instantiated
       C object instantiated
       E object instantiated
       
       F object:
       F object instantiated
 
       toString:
       A object
       B object
       C object
       D object that is-a (super class):  C object
       E object that is-a (super class):  C object
       F object
       
       Aggregation data:
       C has-a A object; A object data:  A
       D has-a F object; F object data:  F
       
       Inheritance data:
       D is-a C object; super class data:  C
       E is-a C object; super class data:  C
   
*/


import java.io.*;
import java.util.*;

public class ClassRelationships {
   public static void main (String [] args) throws IOException {
      
      // Data Dictionary
      System.out.println("Data Dictionary-  instantiation statements:");
      System.out.println();
      
      System.out.println("A object:");
      A aObject = new A();
      System.out.println();
      
      System.out.println("B object:");
      B bObject = new B();
      System.out.println();
      
      System.out.println("C object:");
      C cObject = new C();
      System.out.println();
      
      System.out.println("D object:");
      D dObject = new D();
      System.out.println();
      
      System.out.println("E object:");
      E eObject = new E();
      System.out.println();
      
      System.out.println("F object:");
      F fObject = new F();
      System.out.println();
       
      // invoking toString method:
      System.out.println("toString:");
      System.out.println(aObject);
      System.out.println(bObject);
      System.out.println(cObject);
      System.out.println(dObject);
      System.out.println(eObject);
      System.out.println(fObject);
      
      System.out.println();
      
      // getting data from aggregation / has-a relationship:
      System.out.println("Aggregation data:");
      System.out.println("C has-a A object; A object data:  " + cObject.getAObjectChar());
      System.out.println("D has-a F object; F object data:  " + dObject.getFObjectChar());
      
      System.out.println();
      
      // getting data from inheritance / is-a relationship:
      System.out.println("Inheritance data:");
      System.out.println("D is-a C object; super class data:  " + dObject.getCObjectChar());
      System.out.println("E is-a C object; super class data:  " + eObject.getCObjectChar());
            
   }// end main method
   
   // method for superType
   
   // method for subType
   
   
}// end ClassRelationships

class A{
   // Data Dictionary
   private char charA = 'A';
   
   public A(){
      System.out.println("A object instantiated");  // inheritance chain
   }
   
   public char getChar(){
      return this.charA;
   }
   
   @Override  // from the Object class
   public String toString(){
      return "A object";
   }

}// end class A

class B{
   // Data Dictionary
   private char charB = 'B';
   
   public B(){
      System.out.println("B object instantiated");
   }
   
   public char getChar(){
      return this.charB;
   }
   
   @Override  // from the Object class
   public String toString(){
      return "B object";
   }

}// end class B

class C{
   // Data Dictionary
   private char charC = 'C';
   private A aObject = new A();// has-A relationship = aggregation
   private String objectType = "C object";
   
   public C(){
      System.out.println("C object instantiated");   // inheritance chain
   }// default - no-args constructor
   
   public C(String objectType){
      this.objectType = objectType;
      System.out.println("C object instantiated");  // inheritance chain
   }
   
   public char getChar(){
      return this.charC;
   }
   
   public char getAObjectChar(){// has-a:  getting data from that object
      return this.aObject.getChar();
   }
   
   @Override // from the Object class
   public String toString(){
      return "C object";
   }
   
}// end class C

class D extends C{  // is-a relationship = inheritance
   // Data Dictionary
   private char charD = 'D';
   private F fObject = new F(); // has-A relationship = aggregation
   
   public D(){
      super("D object");
      System.out.println("D object instantiated");  // inheritance chain
   }
   
   public char getChar(){
      return this.charD;
   }
   
   public char getFObjectChar(){ // has-a:  use the object to get to its data
      return this.fObject.getChar();
   }
   
   public char getCObjectChar(){ // is-a:  call super to get to the parent class 
      return super.getChar();
   }
   
   @Override  // from the Object class
   public String toString(){
      return "D object that is-a (super class):  " + super.toString();
   }

}// end class D

class E extends C{ // is-a relationship = inheritance
   // Data Dictionary
   private char charE = 'E';
   
   public E(){
      super("E object");
      System.out.println("E object instantiated");  // inheritance chain
   }
   
   public char getChar(){
      return this.charE;
   }
   
   public char getCObjectChar(){ // is-a:  call super to get to the parent class 
      return super.getChar();
   }
   
   @Override  // from the Object class
   public String toString(){
      return "E object that is-a (super class):  " + super.toString();
   }

}// end class E

class F{
   // Data Dictionary
   private char charF = 'F';
   
   public F(){
      System.out.println("F object instantiated");
   }
   
   public char getChar(){
      return this.charF;
   }
   
   @Override  // from the Object class
   public String toString(){
      return "F object";
   }

}// end class F