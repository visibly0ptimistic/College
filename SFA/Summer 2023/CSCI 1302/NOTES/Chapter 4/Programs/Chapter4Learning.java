/* Java version: 8
 * This program helps us learn the chapter 4 concepts

 * Sample input:  hard coded into the program or user input
 *
 * Sample run/output:  to the screen
 *
 *
 * */

import java.io.*;
import java.util.*;

public class Chapter4Learning {
  public static void main(String[] args) throws IOException {

    // the Math class!!
    /* the Math class has a ton of methods (in this case you can think of these methods
         as the predefined functions that are used in mathematics everyday).
         methods for Trig, doing exponents (that we have already used with Math.pow), 
         rounding, and the basic stat stuff.
      ~All~ math methods return a value, it is safe to assume that the data type will be a double.
         Even if the return value is not a double, an int can easily be assigned to a double.
    */
    /* I am going to skip over how to use the Trig - nice programs in the text book
         and the exponents - we already have practice using the Math.pow
         and start with the rounding and do the basic stat methods
    */
    
    // Rounding
    // first off notice in the table 4.3 that these four methods return doubles - including the one rint!
    
    // ceil: if we think of a ceiling it is up - and this method rounds the values up, no matter what!
    // examples:
    System.out.println("Math.ceil(3.0)" + Math.ceil(3.0));     //3.0 - b/c there is nothing to round
    System.out.println("Math.ceil(3.0001)" + Math.ceil(3.001));//4.0
    System.out.println("Math.ceil(3.3)" + Math.ceil(3.3));     //4.0
    System.out.println("Math.ceil(3.5)" + Math.ceil(3.5));     //4.0
    System.out.println("Math.ceil(3.9)" + Math.ceil(3.9));     //4.0
    
    System.out.println();
    System.out.println();
    
    // Notice the negative numbers
    // think about the number line you learned about in elementary school
    System.out.println("Math.ceil(-3.0)" + Math.ceil(-3.0));   //-3.0
    System.out.println("Math.ceil(-3.01)" + Math.ceil(-3.01)); //-3.0
    System.out.println("Math.ceil(-3.1)" + Math.ceil(-3.1));   //-3.0
    System.out.println("Math.ceil(-3.9)" + Math.ceil(-3.9));   //-3.0
    
    System.out.println();
    System.out.println();
    
    //floor:  if we think where the floor is - it is down, everything rounds down
    // pay attention to the negative numbers!
    System.out.println("Math.floor(-3.9)" + Math.floor(-3.9));   //-4.0
    System.out.println("Math.floor(3.9)" + Math.floor(3.9));     //3.0
    System.out.println("Math.floor(3.0)" + Math.floor(3.0));     //3.0 - b/c there is nothing to round
    
    System.out.println();
    System.out.println();
    
    // Service methods   -   stat methods
    // all those times I made you find the largest of the numbers and here it is...  :)
            // good stuff to develop your logical thinking skills with!
    System.out.println("The max and min methods are overloaded.");
    System.out.println("What does that mean?");
    System.out.println("It means that we do not have to say:  Math.maxIntInt(1, 2), we can just say:  Math.max(1, 2) or Math.max(1.5, 2.5)");
    // we will learn more about overloading in chapter 6
        
    System.out.println();
    System.out.println();
    
    // Character class
    // uses the char data type (and int)
    //char declaration & assignment
    char aSingleLetter = 'a';
    System.out.println("Since char is mapped on the ASCII table - which the Unicode is built upon - it can be manipulated using math operators." );
    char aLetter = 'a';
    System.out.println("the variable aLetter:  " + aLetter );
    System.out.println("variable a being manipulated with aLetter++:  " + aLetter++);
    System.out.println("Why didn't it diplay b?  Where is the placement of the ++?  See the value now:  " + aLetter);
    System.out.println("Now as a pre:  ++aLetter:  " + ++aLetter);
    
    // will this compile? = obviously
    char asciiCharacter100 = 100; // the character d
    System.out.println("Displaying asciiCharacter100:  " + asciiCharacter100);
    
    // what about a double value? - you will have to cast!
    char asciiCharacter100_1 = (char)100.1;  // still the letter d
    System.out.println("Displaying asciiCharacter100_1:  " + asciiCharacter100_1);
    // Why?  Java truncates (removes the decimal portion and goes to the ASCII table as normal
    
    System.out.println();
    System.out.println();
    
    // Let's use the methods now
    // Used by the class name, just like in the Math class
    // Character.isDigit(asciiCharacter100_1);
    System.out.println("Is asciiCharacter100_1 a digit?  " + Character.isDigit(asciiCharacter100_1));
    
    System.out.println();
    
    // asciiCharacter100_1 to an uppercase letter:
    asciiCharacter100_1 = Character.toUpperCase(asciiCharacter100_1);
    System.out.println("Displaying asciiCharacter100_1, which is now an upper case letter:  " + asciiCharacter100_1);
    
    System.out.println();
    System.out.println();
    
    // Escape characters
    // Solves the question of "how do I print someone's quote?"
    System.out.println("Malcolm X:  \"Education is the passport to the future, for tomorrow belongs to those who prepare for it today.\" ");
    
    System.out.println();
    System.out.println();
    
    // String class
    // declare and assign: value is stored in the pool
    String stringExample = "Example";
    
    // to use the methods in the String class
    /* to use the methods, you have to say which String you need the info on, manipulate, etc.
         so you use the identifier of that String
    */
    int howManyCharactersInStringExample = stringExample.length();
    
    // I can join Strings by using the unary operator or the method concat (short for concatenate)
    String st12 = "one" + "two";
    // let's see what is stored:
    System.out.println("st12:  " + st12);
    // notice - no space.  If you want the space you have to put it in
    String st1_2 = "one" + " " + "two";
    System.out.println("st1_2:  " + st1_2);
    // even if you do it using the concat method:
    String stConcat12 = "one".concat("two");
    // let's see what is stored:
    System.out.println("stConcat12:  " + stConcat12);
    String stConcat1_2 = "one ".concat("two");
    System.out.println("stConcat1_2:  " + stConcat1_2);
    
    System.out.println();
    
    System.out.println("Comparing Strings");
    /* When comparing String you CANNOT use the realtional operators!!!
       You HAVE TO USE the methods!!!!
    */
    
    String _jack = "jack";
    String _Jack = "Jack";
    
    // equals - equalsIgnoreCase is LIKE the relational operator of ==
    // equals - compares on exact values - it is case sensitive so Jack & jack are not the same String
    System.out.println("_jack.equals(_Jack):  " + _jack.equals(_Jack));
    
    // equalsIgnoreCase - compares on a case insensitive level  so Jack & jack are the same String
    System.out.println("_jack.equalsIgnoreCase(_Jack):  " + _jack.equalsIgnoreCase(_Jack));
    
    // compareTo - compareToIgnoreCase is LIKE the relational operator of <, >, ==
    // if the String that is invoking the method is greater than the String in the paranthesis then you get a positive # ; like >
    // if the String that is invoking the method is less than the String in the paranthesis, then you get a negative #; ; like <
    // if the two Strings are the same, then you get 0, like ==
    String a = "a";
    String b = "b";
    
    System.out.println("a.compareTo(b):  " + a.compareTo(b));
    System.out.println("a.compareToIgnoreCase(b):  " + a.compareToIgnoreCase(b));
    System.out.println("a.compareTo(z):  " + a.compareTo("z"));

    
    System.out.println("a.compareTo(a):  " + a.compareTo(a));
    System.out.println("a.compareToIgnoreCase(A):  " + a.compareToIgnoreCase("A"));
    
    System.out.println();
    
    System.out.println("startsWith method!!"); // case sensitive
    // a handy method to for pattern matching
    System.out.println("Are these two courses from the same field?");
    System.out.println("CSCI 1302.startsWith(CSCI 2302):  " + "CSCI 1302".startsWith("CSCI 2302"));
    
    System.out.println();
    
    System.out.println("endsWith method!!"); // case sensitive
    System.out.println("Is he a Jr?");
    System.out.println("Jack Jr.endsWith(Jr):  " + "Jack Jr".endsWith("Jr"));
    
    System.out.println();
    
    System.out.println("contains method!!");// case sensitive
    // play Scrabble!
    System.out.println("Does zeal have the letter z in it?");
    System.out.println("zeal.contains(z):  " + "zeal".contains("z"));
    
    // it IS case sensitive:
    System.out.println("zeal.contains(Z):  " + "zeal".contains("Z"));

    
    System.out.println();
    System.out.println();
    
    System.out.println("substring method!!");
    /* when using the substring method, you should know that there are 2 methods - overloaded methods
      (meaning that they have the same name, but different parameters - we will learn more about this in cahgpter 6)
         1)  substring(beginIndex)
         2)  substring(beginIndex, endIndex)
               when using this method, it is very important to realize that the endIndex value is:
               "up to but NOT including that value"
    */
    // examples:
    String lj = "lumberjacks";
    String lumber = lj.substring(0, 6); // using substring(beginIndex, endIndex) - upto not including the character at index 6
    String jacks = lj.substring(6); // using substring(beginIndex) - - starting at index 6
    System.out.println("lj string:  " + lj);
    System.out.println("lumber string:  " + lumber);
    System.out.println("jacks string:  " + jacks);
    
    System.out.println();
    System.out.println();
    
    System.out.println("charAt");
    // you can always get the first, middle, and last characters of a string
    String s = "supercalifragilisticexpialidocious";
    char firstCharacter = s.charAt(0);
    char middleCharacter = s.charAt(s.length()/2);
    char lastCharacter = s.charAt(s.length()-1);
    
    System.out.println();
    System.out.println();
    
    System.out.println("indexOf");
    /* also an overloaded method - 4 methods to use
      1)  indexOf(character)
      2)  indexOf(character, startLookingAtThisIndexPointToTheEndOfTheString)
      3)  indexOf(String)
      4)  indexOf(String, startLookingAtThisIndexPointToTheEndOfTheString)
    */
    // let's use the String s = "supercalifragilisticexpialidocious";
    System.out.println("as a character:  first occurance of the letter s:  " + s.indexOf('s'));
    System.out.println("as a String:  first occurance of the String s:  " + s.indexOf("s"));
    System.out.println("as a character, after the index 5, find s:  " + s.indexOf('s', 5));
    System.out.println("as a String:  first occurance of the String cal:  " + s.indexOf("cal"));    
    
    System.out.println();
    System.out.println();
    
    System.out.println("lastIndexOf");
    // continuing with String s
    System.out.println("as a character:  last occurance of the letter s:  " + s.lastIndexOf('s'));
    System.out.println("as a String:  last occurance of the String s:  " + s.lastIndexOf("s"));
    System.out.println("as a String:  last occurance of the String li:  " + s.lastIndexOf("li"));
    
    System.out.println();
    System.out.println();
    
    System.out.println("parsing");
    /* the parse method allows for conversions, for a String to become a number
         this can be very handy when getting user input and you want to verifiy is a digit prior to using that value in the program - 
         you read it in as a String, check that it is a digit (one by one if needed), then parse it into the correct datatype = elimanates runtime errors with user input!
         
       One BIG NOTE to remember:  you are using that data type's class - NOT the string idenifier!!!!  the string identifier is the argument being passed to the class
    */
    String numberAsAString = "1";
    char temp = numberAsAString.charAt(0);
    if(Character.isDigit(temp)){
      int numberAsANumber = Integer.parseInt(numberAsAString);
    }    
    
    System.out.println();
    System.out.println();
    
    System.out.println("formatting output with printf");
    String example = "example";
    System.out.printf("%5s", example);
    System.out.println();  // sometimes the \n just doesn't do what you want - you can still put in a line break:
    String rtAlignment = "aligned along the right side.";
    System.out.printf("%35s" , rtAlignment);
    System.out.println();
    String ltAlignment = "aligned along the left side";
    System.out.printf("%-35s", ltAlignment);

    

    


  }// end main
}// end of Chapter4Learning
