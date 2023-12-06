/* Java version: 8
 * This application program shows inheritance, polymorphism, casting, and instanceof
*/

import java.io.*;
import java.util.*;

public class Lion extends Animal implements Eats{

  public Lion(){
  	System.out.println("Lion created");
  }

  public String roar(){
  	return "roar";
  }

  @Override
  public String toString(){
	return super.toString() + "Lion";
  }

  @Override
  public String livesIn(){
  	return " the wild ";
  }

  @Override
  public String eats(){
  	return " meat";
  }

}// end of Lion
