/* Java version: 8
 * This application program shows inheritance, polymorphism, casting, and instanceof
*/

import java.io.*;
import java.util.*;

public class Cat extends Animal{
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


}// end of Cat
