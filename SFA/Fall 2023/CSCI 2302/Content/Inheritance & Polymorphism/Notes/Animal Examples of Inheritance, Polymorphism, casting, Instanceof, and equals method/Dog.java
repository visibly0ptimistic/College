/* Java version: 8
 * This application program shows inheritance, polymorphism, casting, and instanceof
*/


import java.io.*;
import java.util.*;

public class Dog extends Animal{

  public Dog(){
  	System.out.println("Dog created");
  }

  public String woof(){
  	return "woof";
  }

  @Override
  public String toString(){
	return super.toString() + "Dog";
  }

}// end of Dog
