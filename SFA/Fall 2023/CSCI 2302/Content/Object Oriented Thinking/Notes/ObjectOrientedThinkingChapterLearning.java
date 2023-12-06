/* This program is to learn the concepts covered in the Object Oriented Thinking chapter
 *
 * Sample input: hard coded into program 
 *
 * Sample run/output:
 *  Association Examples
 A@2f92e0f4
 B object instantiated
 B@5305068a
 
 Aggregation Example
 Cup object instantiated
 Cup object instantiated
 Cup object instantiated
 Cupboard with a height of 3.5 a width of 0.25 and a length of 2.5 with 3 cups.
 Cup object instantiated
 How many Cup objects?  4
 Did you think this one would be 1?  Why was it 4?  Because static modifier!
 
 Composition Example
 Pulp object instantiated
 Pulp exists on its own & other products can be made of Pulp.
 Paper object instantiated
 Paper is made up of Pulp and cannot exist without it.
 
 Pulp object instantiated
 Pulp exists on its own & other products can be made of Pulp.
 
 
 
 1111111110
 
 true
 true
 true
 true
 true
 true
 false
 
 SFA Lumberjacks
 SFA Lumberjacks LadyJacks
 SFA Lumberjacks Ladyjacks
 25
 31
 
 *
 * */

import java.io.*;
import java.util.*;
import java.math.*;

public class ObjectOrientedThinkingChapterLearning {

   Scanner input = new Scanner(System.in);
   
  public static void main(String[] args) {
  	
  	/*
      We have been learning about objects - 
         how to define and implement real world objects into code so that it can be used by a program.
      We are also adding another piller of OOP:  abstraction.
      Wwe are adding the idea of how different kind of objects can interact together, and defining those relationships.  
      Then the chapter continues with:
         wrapping primitive data types into object data types
         BigInteger and BigDecimal data types
         more methods on Strings and regex
         StringBuilder/StringBuffer data types 
   */
   
   /* Abstraction
      abstraction separates class implementation from how the class is used
         meaning you do not need to know about the class is defined and implemented to know how to use it
      Book example:  using a computer system verses how to build a computer system
         You know how to use a computer, but you do NOT have to know how it is built
         to enter in words to a software application, like Word or an IDE, you just type the words on the keyboard.
         You do NOT have to know the specifics of the circuit layout on the keyboard, the complete program of the keyboard driver,
         nor the complete program of Word (or the IDE) to use Word (or the IDE) to use that app.
      Another example:  using a car verses how a car is built
         You know what to do to start the car, to put it in drive, to accelerate, to stop, but you do NOT have to know
         all the specific mechanical and software programs that are used to be able to drive a car.
      
      We as programmers need to look at both sides though.
      
      We need to be able to obtain class abstraction, and when we think how will we obtain this, we think about encapuslation.
      
      Remember that encapsulation is the process of making the details of the implementation hidden from the user.  
         When we do this, we are protecting the data of the object; thus, this process keeps the integrity of the data AND
         modularizing the code which makes it easy to reuse and easy to maintain.
         How we do this is by using the private visibility modifier and using setters and getters methods.
      
      How do we achieve abstraction?  through encapsulation  - implementing methods to do one thing
         and that one thing well - those methods with the parameter list informs the user how to use the object.
         The UML diagram of an object fits these concepts perfectly.  It tells the programmer what to implement
            into code and it tells the user how to use that object by seeing the states/fields and 
            methods with the parameter list and return type.
         
      This allows a user to use the object without having to know the implementation of the object.
      Thus, we achieve encapsulation and abstraction.
   */
   
   /*
      ADT:  Abstract Data Type
      When we define a class and implement that class into code, we are creating an ADT.
      This ADT can be an object, we are learning in this course, or it can be a data structure, as you will learn in Data Structures.
      When we define and implement these ADTs correctly, we follow the concepts of abstarction and encapsulation, meaning the 
         data type implementation is abstract.
   */
   
   /*
      coupling:  the concept of combining data/states/attributes/fields/vairables and 
         its associated behavior/activities/what it can do/methods into an object
   */
   
   /* class relationships
      
      In this chapter, we will cover 3 class relationships:  association, aggregation, and composition.
      
      Association:  there is some activity between 2 classes, i.e. class A has a main method and instantiates class B objects
      
      Aggregation:  one class is made up of another class, BUT both classes can exist on their own, 
         i.e. Cupboard object and Cup object, both can exist on their own; a Cupboard can be empty or it can hold Cup objects,
         a Cup object can exist without having to be in a Cupboard object.
         Referred to as has-a relationship.
         
      Composition:  one class is made up of another and it cannot exist on its own, i.e.Pulp object and Paper object; 
         Pulp objects can exist on it own, but Paper object are made up of Pulp objects and cannot exist without being made of Pulp objects.
         
   */
   System.out.println("Association Examples");
   A aObject = new A();
   System.out.println(aObject.toString());// notice that there is not a toString method? - this method is inherited, we learn about that next chapter
   B bObject = new B();
   System.out.println(bObject.toString());
   System.out.println();
   
   System.out.println("Aggregation Example");
   Cupboard cupboard = new Cupboard();  //Aggregated Object - a cupboard can exist with cups, dishes, pies, food, etc; or it can be empty
   System.out.println(cupboard.toString());
   Cup cup = new Cup(); // Object that can exist on its own
   System.out.println("How many Cup objects?  " + cup.getHowManyCupsInstantiated());
   System.out.println("Did you think this one would be 1?  Why was it 4?  Because static modifier!");
   System.out.println();
   
   System.out.println("Composition Example");
   Paper paper = new Paper();// Composite example - paper is made up of pulp, if it is made with something else, it is not paper, pulp can be made with any cellulose fibres
   System.out.println();
   Pulp pulp = new Pulp();
   System.out.println();
   System.out.println();
   
   /*
      Processing Primitive Data Type Values as Objects
      
      Java has a vast array of goodies we can use from the Java Libaray, but many of those methods require objects.
      So, then the question is, How do we make a primitive data type into an Object/Reference data type?
      By using Wrapper class - some of the goodies already written for use in the Java library!
      examples:   Integer intObject = new Integer(2302);
                  Double doubleObject = new Double(2302.500);
      
      How to get the Reference/Object data type values into primitive data types?
      By using the Java library - the dataTypeValue methods:  intValue() and doubleValue()
      
      How to get a String value into a numeric object class?  By using the valueOf() method or using the parseDataType methods
      
   */
   
   //primitive data types - defining and assigning values
   int intNum = 1;
   double doubleNum = 2;
   char charPrimitive = 'p';
   
   //Wrapper Classes = Objects/Reference Data Types - creating/instantiating the objects
   
   Integer integerObjectNum = Integer.valueOf(1);  // or Integer integerObjectNum = 1; this is autoboxing
   //Integer integerObjectNum = new Integer(1);  still works! 
   
   Double doubleObjectNum = Double.valueOf(2.147); // or Double doubleObjectNum = 2.147; this is autoboxing
   //Double doubleObjectNum = new Double(2.147);  still works!
   
   Character charObject = Character.valueOf('p');  // or Charater charObject = 'p';  this is autoboxing
   //Character charObject = new Character('p');  still works!
   
   // To get the Objects/Reference Data Types into primitive data types:
   int intPrimitiveNumber = integerObjectNum.intValue(); 
   double doublePrimitiveNumber = doubleObjectNum.doubleValue();
   char charPrimitiveCharacter = charObject.charValue();
   
   // To get Strings into numeric Objects/Reference Data Types:
   Integer intString = Integer.parseInt("1");
   Double doubleString = Double.parseDouble("2");
   System.out.println();
   
   //BigInteger and BigDecimal Classes
   /*
      Java provides the BigInteger class to work with really, really large numbers
      
      Java provides the BigDecimal class to work with decimal/fractional numbers with exact precision 
      
      ****Keep in mind that the +, -, *, / are for primitive values ONLY****
      
      To perform any mathematical operation you HAVE TO USE the methods:
         .add
         .subtract
         .multiply
         .divide
      
   */
   
   //to instantiate:
   BigInteger bigIntegerNumber = new BigInteger("1236547899874563211236547889");
   BigDecimal bigDecimalNumber = new BigDecimal("123.3698521478965412366547893");
   
   //mathematical operations
   BigInteger bi_1 = new BigInteger("123456789");
   BigInteger bi_2 = new BigInteger("987654321");
   System.out.println(bi_1.add(bi_2));
   BigDecimal a = new BigDecimal(1.0);
   BigDecimal b = new BigDecimal(3);
   BigDecimal c = a.divide(b, 20, BigDecimal.ROUND_UP);
   
   System.out.println();
   
   /*
      String Class and Regex
      
      The String variables that we used in CSCI 1302 were String literals, which is something in-between a primitive
         and a Reference data type in a way.  Strings are reference data types, and do not have the value stored in the method's memory
         as primitive data types do.  But, String literals do not get a totally separate memory spot either; these variables get 
         stored in an area called a Pool (String Pool).  The value stored in the method's memory is where that String is stored in the Pool.
         String sLiteral = "a string literal";  
      
      String objects get stored in its own memory spot.
         String sObject = new String("a string object");
   */
   
   String sObject = new String("a string object");  //instantiates a String object that is stored in its own memory location
   
   // To use any of the methods defined in the String class:  identifier.methodName()
   System.out.println(sObject.contains("a"));
   
   /* matches method is used for pattern matching, AKA searching for regular expressions = regex
      this method returns a true or false
            
      matches differs from equals/equalsIgnoreCase (which looks for an exact match) and contains (which looks for if the string argument
         is in the string) because it is looking for a pattern, 
         not just for certain character or numbers, but the pattern/format of those characters or numbers
   */
   
   System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));
   // this is looking for the pattern of 3 whole numbers, a dash, 2 whole numbers, a dash, 4 whole numbers
   // another way of doing the same thing:
   System.out.println("440-02-4534".matches("[0-9]{3}-[0-9]{2}-[0-9]{4}"));
   System.out.println("word".matches("\\w{4}"));  // looks for 4 characters that are used in words
   // other ways:
   System.out.println("word".matches("[A-Za-z]{4}"));// looks for 4 upper or lower case letters
   System.out.println("word".matches("[a-z]{4}"));// looks for 4 lower case letters
   System.out.println("word".matches("[A-Z]{4}"));// looks for 4 upper case letters
   
   //##########
   Scanner input = new Scanner(System.in);
   System.out.println("Phone number:");
   String phoneNumber = input.nextLine();
   System.out.println("phoneNumber:  " + phoneNumber.matches("[0-9]{10}"));
 
   
   System.out.println();
   
   /*
      StringBuilder/StringBuffer class
      
      The difference between these two is StringBuffer is for parallel programming, which we will not be doing.
      
      These classes creates "strings" that are mutable (verses the String class which is immutable), 
         this allows flexibility - manipulation of the "strings."
      Depending on what you are doing, using the StringBuilder class may save memory space 
         while "creating" the "string" and then can be made into a String by using the
         toString method.
      Many of the methods, except the setCharAt, change the contents of the string builder and return the reference of the StringBuilder.
   */
   
   StringBuilder sb = new StringBuilder("SFA Lumberjacks");
   System.out.println(sb);
   sb.append(" LadyJacks");  // notice that it is not reassigned - that is because StringBuilder is mutable
   System.out.println(sb);
   sb.setCharAt(20, 'j');
   System.out.println(sb);
   System.out.println(sb.length()); // specifies how many characters are in the StringBuilder
   System.out.println(sb.capacity()); // specifies how much room is in memory - this number 
      //can grow as needed by the lenght of the StringBuilder
   sb.trimToSize();  // trims the memory area to the length of the StringBuilder
   String s_sb = sb.toString();  // returns a String of the StringBuilder   
   
  
  }// end main
}// end of ObjectOrientedThinkingChapterLearning

//*******************************************************************************************************************

// Association Example
class A{
   
   // notice that there is not an explicitly defined constructor - the compiler wrote it - that is the default/no-args constructor
   
   public static void main(String[] args){
      System.out.println("in class A");
      B bObject = new B();// an object instantiated in another class - B object is associated with A class
   }
   
} // end class A

class B{
   public B(){
      System.out.println("B object instantiated");
   }
}// end class B

//*******************************************************************************************************************


// Aggregation Example
class Cup{
    // states/attributes/fields aka data dictionary
    static int howManyCupsInstantiated = 0;
    
   public Cup(){
      System.out.println("Cup object instantiated");
      howManyCupsInstantiated++;
   }
   
   public int getHowManyCupsInstantiated(){
      return this.howManyCupsInstantiated;
   }
}// end Cup class

class Cupboard{
   // states/attributes/fields aka data dictionary
   private double height;
   private double width;
   private double length;
   private Cup cup;  // the Cupboard has-a Cup
   private Cup cup1;  // the Cupboard has-a Cup
   private Cup cup2;  // the Cupboard has-a Cup
   
   public Cupboard(){
      this.height = 3.5;
      this.width = 0.25;
      this.length = 2.5;
      this.cup = new Cup();   //instantiating a Cup object
      this.cup1 = new Cup();  //instantiating a Cup object
      this.cup2 = new Cup();  //instantiating a Cup object
   }
   
   public String toString(){
      return "Cupboard with a height of " + this.height + " a width of " 
         + this.width + " and a length of " + this.length + " with " + cup.getHowManyCupsInstantiated() + " cups.";
   }
} // end Cupboard class

//*******************************************************************************************************************

// Composition Example
class Pulp{
   public Pulp(){
      System.out.println("Pulp object instantiated");
      System.out.println("Pulp exists on its own & other products can be made of Pulp.");
   }
}// end Pulp class

class Paper{
   // states/attributes/fields aka data dictionary
   Pulp p = new Pulp();
   
   public Paper(){
      System.out.println("Paper object instantiated");
      System.out.println("Paper is made up of Pulp and cannot exist without it.");
   }
   
}// end Paper class

//*******************************************************************************************************************
