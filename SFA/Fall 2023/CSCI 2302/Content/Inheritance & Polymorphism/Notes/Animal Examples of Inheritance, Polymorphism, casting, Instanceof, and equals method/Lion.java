/* Java version: 8
 * This application program shows inheritance, polymorphism, casting, and instanceof
*/

import java.io.*;
import java.util.*;

public class Lion extends Animal{

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

}// end of Lion
