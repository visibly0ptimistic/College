/* Java version: 8
 * This application program shows inheritance, polymorphism, casting, and instanceof
*/

import java.io.*;
import java.util.*;

public class Cat extends Animal implements Eats{
  Cat(){
  	System.out.println("Cat created");
  }

  public String meow(){
  	return "meow";
  }

  @Override
  public String toString(){
	return super.toString() + "Cat";
  }

  @Override
  public String livesIn(){
  	return " the house ";
  }

  @Override
  public String eats(){
  	return " fish";
  }

}// end of Cat
