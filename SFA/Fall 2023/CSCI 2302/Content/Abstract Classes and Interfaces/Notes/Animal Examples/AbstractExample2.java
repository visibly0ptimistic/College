/* Java version: 8
 * This application program shows examples of Inheritance, Polymorphism, and Abstract methods
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

public class AbstractExample2 {
  public static void main(String[] args) {

  	Animal cat = new Cat();
  	Animal dog = new Dog();
  	Animal dove = new Dove();
  	Animal lion = new Lion();

  	displayAnimal(cat);
  	displayAnimal(dog);
  	displayAnimal(dove);
  	displayAnimal(lion);

  }// end main

  public static void displayAnimal(Animal a){

  	System.out.println("I am  " + a.toString() + " and I live in " + a.livesIn());

  }

}// end of AbstractExample2
