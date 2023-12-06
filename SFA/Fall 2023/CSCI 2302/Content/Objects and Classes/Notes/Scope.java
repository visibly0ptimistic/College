/* Java version: 8
 * This program provides examples of scope of variables
 *
 * Sample input: hard coded into the program
 *
 * Sample run/output: to the screen
 *		Printing the class variables  in main:
		instance variable number3:  3
		static variable num9: 9
		printing the static variable word:  Lumberjack
		Printing the local variable, that has the same name as the instance/class variable:
		number3: 321
		printing the value passed in to the method:  321
		printing the instance class variable number3 in the method: 3
		printing the static variable num9 in the method: 9
		printing the static variable word in the method:  Lumberjack
 *
 * */
 
 /*   Import notes:
         a static variable is shared by all objects of the class
         a static method cannot access instance members of the class
         a static method can be invoked without creating an instance of the class
         
         an instance variable is tied to a specific instance of the class - it is not shared among objects of the class -
            its value is based upon an instance of the class
         an instance method is also based upon an instance of the class
         
         Scope:  local verses class
         
            a local variable "lives" (can be accessed/used) from where it is declared to the closing brace of that block of code
            
            a class variable "lives" (can be accessed/used) from anywhere in the code
            
            Scope deals with the accessability - the memory location of where a variable is stored
            
 */
 
 
 

import java.io.*;
import java.util.*;

public class Scope {

	int number3 = 3;// an instance variable - it has the scope of the class, and needs an instance of the class to be used
	
   static int num9 = 9; /* an instance variable that is now called a static variable
							by using the keyword static that means it is a variable
							that is shared by all in the class.  This means that is HAS TO HAVE the scope of the class. */
   /*
		* Static variables can be accessed in three ways.
		* 1- Via the class name 
               example:  Scope.num9
		* 2- Via an object of the class 
               example:  new Scope().num9
        3 - by itself
               example:  num9
	*/
   
  public static void main(String[] args) throws IOException {

   /*
		 * the below variable is an OBJECT variable, an object of this class,
		 * which is an instance of this class, it is an instance variable
	*/
   Scope scopeObject = new Scope();  // instantiation of an object
   // this variable is declared in main an lives from this line to the closing brace of main
      
  	System.out.println("Printing the class variables  in main:");
  	System.out.println("instance variable number3:  " + new Scope().number3);// notice how this instance variable is being accessed, it can only be accessed by an object of the class.
  	System.out.println("static variable num9: " + num9);
  	System.out.println("printing the static variable word:  " + word);// where did this variable come from?!  How annoying - to go looking for a variable.  Imagine if this program had more lines...

   /*
		* the below variable is a LOCAL variable as it is defined inside a method in the
		* class. The modifier that can be applied on local variable is final.
		* 	
		* Note: Local variables need to be initialize before they can be used.
		* Which is not true for Static or Instance variable.
	*/
	System.out.println("Printing the local variable, that has the same name as the instance/class variable:");
  	int number3 = 321; // a local variable that takes precedence over the instance variable
	System.out.println("number3: " + number3);// see how it has the value of 321 and not just 3
   // Keep in mind that this is bad form!!!!  It is too confusing to have variables with the same name having different values = sloppy code!

	method(number3);

  }// end main
  
  /*
      a static method cannot access instance members of the class.
  */

  public static void method(int num){
  	System.out.println("printing the value passed in to the method:  " + num);
   Scope scopeObject = new Scope(); // created an object of the class to use with the instance variable
   System.out.println("printing the instance class variable number3 in the method: " + scopeObject.number3);
  	System.out.println("printing the static variable num9 in the method: " + num9);
  	System.out.println("printing the static variable word in the method:  " + word);
  }// end method

  static String word = "Lumberjack"; // static variable, scope is the class

}// end of Scope
