/* Java version: 8
 * This application program shows inheritance, polymorphism, casting, and instanceof
*/


import java.io.*;
import java.util.*;

public class Animal {

	public Animal(){
		System.out.println("Animal created");
	}

	public String animal(){
		return "animal";
	}

	@Override
	public String toString(){
		return "The animal - ";
	}
   
   @Override
   public boolean equals(Object o){
      // tests if the two objects are from the same class
		if (this.getClass() == o.getClass()){
         	return true;	// if the two objects are from the same class, it returns true
     	}
      else
         return false;     // the two objects are not from the same class
   }

}// end of Animal
