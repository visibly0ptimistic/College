/* Java version: 8
 * This application program shows inheritance, polymorphism, casting, and instanceof
*/


import java.io.*;
import java.util.*;

public class Dog extends Animal implements Eats{

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

  @Override
  public String livesIn(){
  	return " the house ";
  }

  @Override
  public String eats(){
  	return " meat";
  }

}// end of Dog
