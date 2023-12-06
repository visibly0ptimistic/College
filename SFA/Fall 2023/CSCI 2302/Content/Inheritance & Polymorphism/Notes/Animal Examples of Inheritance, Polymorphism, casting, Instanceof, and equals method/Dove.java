/* Java version: 8
 * This application program shows inheritance, polymorphism, casting, and instanceof
*/

import java.io.*;
import java.util.*;

public class Dove extends Animal{

  public Dove(){
  	System.out.println("Dove created");
  }

  public String coo(){
  	return "coo coo";
  }

  @Override
  public String toString(){
		return super.toString() + "Dove";
  }

}// end of Dove
