/*Polymorphism in Java has two types: Compile time polymorphism (static binding) and
 *Runtime polymorphism (dynamic binding). Method overloading is an example of static
 *polymorphism, while method overriding is an example of dynamic polymorphism.
 *
  An important example of polymorphism is how a parent class refers to a child class object.
  In fact, any object that satisfies more than one IS-A relationship is polymorphic in nature.

  For instance, let’s consider a class Animal and let Cat be a subclass of Animal.
  So, any cat IS animal. Here, Cat satisfies the IS-A relationship for its own type
  as well as its super class Animal.

  Note: It’s also legal to say every object in Java is polymorphic in nature, as
  each one passes an IS-A test for itself and also for Object class.


	Dynamic polymorphism in Java is achieved by method overriding

**************************************************************************************
 *  Suppose a sub class overrides a particular method of the super class. Let’s say, in
 *	the program we create an object of the subclass and assign it to the super class
 *	reference. Now, if we call the overridden method on the super class reference
 *	then the sub class version of the method will be called.

	It should be noted that in the first call to move(), the reference type is
	Vehicle and the object being referenced is MotorBike. So, when a call to move()
	is made, Java waits until runtime to determine which object is actually being
	pointed to by the reference.  In this case, the object is of the class MotorBike.
	So, the move() method of MotorBike class will be called. In the second call to move(),
	the object is of the classVehicle. So, the move() method of Vehicle will be called.

	As the method to call is determined at runtime, this is called dynamic binding or late binding.

 *
 *	The concept will be clear in this example:
 **/


import java.io.*;
import java.util.*;

class Vehicle{
    public void move(){
    	System.out.println("Vehicles can move!!");
    }
}

class MotorBike extends Vehicle{
    @Override
    public void move(){
    	System.out.println("MotorBike can move and accelerate too!!");
    }
}

class Test{
    public static void main(String[] args){
	    Vehicle vh = new MotorBike();
	    vh.move();    // prints MotorBike can move and accelerate too!!
	    vh = new Vehicle();
	    vh.move();    // prints Vehicles can move!!


		System.out.println();
	    Vehicle newV = new Vehicle();
	    MotorBike mb = new MotorBike();
	    System.out.println("Vehicle - newV");
	    printMove(newV);
	    System.out.println();
	    System.out.println("MotorBike - mb");
	    printMove(mb);
	    System.out.println();
	    System.out.println("Vehicle - vh");
		printMove(vh);
    }

    public static void printMove(Vehicle v){
    	if(v instanceof MotorBike){
    		System.out.println("MotorBike");
    		v.move();
    	}

    	if(v instanceof Vehicle){
    		System.out.println("Vehicle");
    		v.move();
    	}
    }
}

