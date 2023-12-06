/* Java version: 8
 * This  program provides examples of the concepts covered in Objects and Classes Chapter
 *
 * Sample input:  hard coded in the program
 *
 * Sample run/output:  to the screen
 *
 *
 * */

import java.io.*;
import java.util.*;

public class ObjectsAndClassesLearning {  // this is the class with main, the file has to be labeled with this name
      
      // class variables = has the scope of the class
      //    these can be defined anywhere outside of methods and are accessable anywhere in this class (restrictions may apply)
      char letterO = 'o';  // this is an instance variable - only instances of this class can access this variable
      static int num1 = 1; // this is a static variable - it can be accessed by itself, the class name, or by an instance of the class


  public static void main(String[] args) throws IOException {  // main method is the method that is automatically executed
      
      //instantiating an object!  follows the reference data type of declaring and assigning variables
      ObjectExample objex = new ObjectExample();  // instantiating an object
                                                   // objex is an instance of the ObjectExample class BUT it is a local variable in the ObjectsAndClassesLearning class/program
                                                      // objex is a variable can access the states and behavior of the ObjectExample program
                                                   //objex has the scope from here to the end of main method
      
      // using the objex variable - invoking the behaviors
      System.out.println(objex.getNumber());   // using the variable to access a state of the ObjectExample class
      objex.setNumber(42); // giving the state number a value
      System.out.println(objex.getNumber());   // seeing how the value changed
      objex.itsBehaviorMethod(); 
      
      

      ObjectsAndClassesLearning objAndClassEx = new ObjectsAndClassesLearning(); // instantiating an object
                                                   // objAndClassEx is an instance of the ObjectsAndClassesLearning class
                                                   // objAndClassEx is a local varaible in the ObjectsAndClassesLearning class
                                                      // objAndClassEx is a variable can access the states and behaviors of the ObjectsAndClassesLearning program
                                                   // objAndClassEx has the scope from here to the end of main method
      
      // ways objAndClassEx object can access states of this class
      System.out.println(objAndClassEx.letterO);   // accessing the instance variable - which can only be accessed by an instance of the class
      System.out.println(new ObjectsAndClassesLearning().letterO);   // accessing the instance variable - which can only be accessed by an instance of the class
                        // created an object "on the fly" to access this
      System.out.println(objAndClassEx.num1);      // accessing the static variable by an instance of the class
      System.out.println(ObjectsAndClassesLearning.num1);   // accessing the static variable by the class name
      System.out.println(num1);   // accessing the static variable by the variable name
      
      

  }// end main
}// end of ObjectsAndClassesLearning

// ******************************************************************

// Defining an object
class ObjectExample{ // since this class is in the same file as the class with main, it cannot have the public modifier
   //states:
   private int number;  //setting the visibility modifier to private:  part 1 of data encapsulation
   private String stuff;
   
   
   // Behaviors:
   
   // Constructors HAVE to be listed first!
   public ObjectExample(){}   //default- no-args contructor
      // using public visibilty modifier to let all in the package have access to this constructor
   
   public ObjectExample(int number, String stuff){    //parameter list constructor
      this.number = number;   // using the keyword this to clarify the difference between the object and what is being passed in
      this.stuff = stuff;
   }
   
    
   // then setters & getters
   public void setNumber(int number){  // providing the setters & getters for the states/fields:  part 2 of data encapsulation
      this.number = number;
   }
   
   public int getNumber(){
      return this.number;
   }
   
   public void setStuff(String stuff){
      this.stuff = stuff;
   }
   
   public String getStuff(){
      return this.stuff;
   }
   
   // then the rest of the behaviors
   public void itsBehaviorMethod(){
      System.out.println("method to do something!");
   }


}// end ObjectExample