/* Java version: 8
 * This application program shows examples of Inheritance and Abstract methods
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

public class AbstractExample1 {
  public static void main(String[] args) {

  	Cat cat = new Cat();
  	System.out.println(cat.livesIn());
  	System.out.println();

  	Dog dog = new Dog();
  	System.out.println(dog.livesIn());
  	System.out.println();

  	Dove dove = new Dove();
  	System.out.println(dove.livesIn());
  	System.out.println();

  	Lion lion = new Lion();
  	System.out.println(lion.livesIn());
  	System.out.println();

  }// end main

}// end of AbstractExample1
