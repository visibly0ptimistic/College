/* Java version: 8
 * This application program shows examples of Inheritance, Polymorphism, Abstract methods & Interfaces
 *
 * Sample input: hard coded into the program
 *
 * Sample run/output:
 *
 *
 *
 * */

import java.io.*;
import java.util.*;

public class InterfaceExample {
  public static void main(String[] args) {

  	Animal [] animals = {new Cat(), new Dog(), new Dove(), new Lion()};

  	for(int i = 0; i < animals.length; i++){
  		if(animals[i] instanceof Eats){
  			System.out.println("I eat" + ((Eats)animals[i]).eats());
  		}
  	}

  }// end main

}// end of InterfaceExample
