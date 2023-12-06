/* Java version: 8
 * This application program shows examples of inheritance, polymorphism, casting, instanceof, and equals method
 *
 * Sample input: hard coded into the program
 *
 * Sample run/output:
 *      Animal created
     Mammal created
     Cat created
     The mammal - Cat
     
     Animal created
     Mammal created
     Dog created
     The mammal - Dog
     
     Animal created
     Dove created
     The animal - Dove
     
     Animal created
     Mammal created
     Lion created
     The mammal - Lion
     
     whatAmI method
     A cat says meow
     whatAmI method
     A dog says woof
     whatAmI method
     A dove says coo coo
     whatAmI method
     A lion says roar
     
     Animal created
     whatAmI method
     I am an animal
     
     whatAmI method
     An object java.lang.Object@3f99bd52
     
     
     animalMethod
     The mammal - Cat
     animalMethod
     The mammal - Dog
     animalMethod
     The animal - Dove
     animalMethod
     The mammal - Lion
     animalMethod
     java.lang.Object@3f99bd52
     
     Testing if two animals are the same class
     Animal created
     Are animal & anotherAnimal the same class?  true
     Are cat & dog the same class?  false
 *
 *
 * */

import java.io.*;
import java.util.*;

public class Inheritance_Polymorhism_instanceof_equalsMethod_Example {
  public static void main(String[] args) {

  	// Inheritance chain & Polymorhic objects
   Object cat = new Cat();
  	System.out.println(cat.toString());
  	System.out.println();

  	Object dog = new Dog();
  	System.out.println(dog.toString());
  	System.out.println();

  	Object dove = new Dove();
  	System.out.println(dove.toString());
  	System.out.println();

  	Object lion = new Lion();
  	System.out.println(lion.toString());
  	System.out.println();

  	// polymorphic calls to methods that use the instanceof
   whatAmI(cat);
  	whatAmI(dog);
  	whatAmI(dove);
  	whatAmI(lion);

  	System.out.println();

  	Animal animal = new Animal();
  	whatAmI(animal);

  	System.out.println();

  	Object o = new Object();
  	whatAmI(o);

  	System.out.println();
  	System.out.println();

  	animalMethod(cat);
  	animalMethod(dog);
  	animalMethod(dove);
  	animalMethod(lion);
  	animalMethod(o);
   
   System.out.println();
   
   // equals method
   System.out.println("Testing if two animals are the same class");
   Animal anotherAnimal = new Animal();
   System.out.println("Are animal & anotherAnimal the same class?  " + animal.equals(anotherAnimal));
   System.out.println("Are cat & dog the same class?  " + cat.equals(dog));
   

  }// end main

  public static void whatAmI(Object obj){

  	System.out.println("whatAmI method");

  	if(obj instanceof Cat){
  		System.out.println("A cat says " + ((Cat)obj).meow());
  	}
  	else if(obj instanceof Dog){
  		System.out.println("A dog says " + ((Dog)obj).woof());
  	}
  	else if(obj instanceof Dove){
  		System.out.println("A dove says " + ((Dove)obj).coo());
  	}
  	else if(obj instanceof Lion){
  		System.out.println("A lion says " + ((Lion)obj).roar());
  	}
  	else if(obj instanceof Animal){
  		System.out.println("I am an " + ((Animal)obj).animal());
  	}
  	else{
  		System.out.println("An object " + obj.toString());
  	}
  }// end whatAmI

  public static void animalMethod(Object o){
  	System.out.println("animalMethod");
  	System.out.println(o.toString());// no need to cast - all Objects have the method toString()
  									 // dynamic binding makes it go to the corresponding datatype toString()
  }//  end animalMethod
  
}// end of Inheritance_Polymorhism_instanceof_equalsMethod_Example
