/* Java version: 8
 * This program shows:
 *		Objects, and Object-Oriented Thinking,
 *		Inheritance, Inheritance chaining,
 *		Polymorphism, polymorphic methods and calls
 *		Dynamic Binding, Static Binding
 *		Abstract Classes, Interfaces
 *		Comparable Interface,
 *		Cloneable Interface
 *		and defining your own Interface
 *
 * Sample input: none - it is hardcoded into the program
 *
 * Sample run/output:
 *
 *		creating objects:
		instantion of a Container object cannot happen as the class is an Abstract class

		a GiftBox:
		a Container that is empty, it is a giftbox, with dimensions of:  2.0 x 2.0 x 2.0

		a GlassJar
		a Container that is empty, it is a glass jar with a radius of 2.0 and a height of 4.0

		printing out the array of containers
		a Container that is empty, it is a giftbox, with dimensions of:  2.0 x 2.0 x 2.0
		a Container that is empty, it is a glass jar with a radius of 2.0 and a height of 4.0
		a Container that is empty, it is a giftbox, with dimensions of:  2.0 x 2.0 x 2.0
		a Container that is filled, it is a giftbox, with dimensions of:  3.0 x 6.0 x 9.0
		a Container that is empty, it is a glass jar with a radius of 2.0 and a height of 4.0
		a Container that is filled, it is a glass jar with a radius of 3.0 and a height of 3.0

		And another way:
		a Container that is empty, it is a giftbox, with dimensions of:  2.0 x 2.0 x 2.0 and has a volume of:  8.0
		a Container that is empty, it is a glass jar with a radius of 2.0 and a height of 4.0 and has a volume of:  50.26548245743669
		a Container that is empty, it is a giftbox, with dimensions of:  2.0 x 2.0 x 2.0 and has a volume of:  8.0
		a Container that is filled, it is a giftbox, with dimensions of:  3.0 x 6.0 x 9.0 and has a volume of:  162.0
		a Container that is empty, it is a glass jar with a radius of 2.0 and a height of 4.0 and has a volume of:  50.26548245743669
		a Container that is filled, it is a glass jar with a radius of 3.0 and a height of 3.0 and has a volume of:  84.82300164692441

		Just the Volume info:
		The volume is:  8.0
		The volume is:  50.26548245743669
		The volume is:  8.0
		The volume is:  162.0
		The volume is:  50.26548245743669
		The volume is:  84.82300164692441


		Ways that we can compare objects:

		Using the equalVolume method:
		notice that it does not matter if the container is a GiftBox or a GlassJar
		of course, these are false as the dimensions do not allow for an equal volume
		GiftBox 0 to GlassJar 1:  false
		GlassJar 1 to GiftBox 2:  false
		GiftBox 2 to GiftBox 3:  false
		GiftBox 3 to  GlassJar 4:   false
		GlassJar 4 to GlassJar 5:  false

		but these dimensions match :
		GiftBox 0 to GiftBox 2 :  true
		GlassJar 1 to GlassJar 4:  true

		Using the equals method - overriden from the Object Class:
		notice that it matters the subclass for this one as the method, as the equals method is defined in that class, it looks for the class to match, then will compare the volume
		GiftBox 0 to GlassJar 1:  false
		GlassJar 1 to GiftBox 2:  false
		GiftBox 2 to GiftBox 3:  false
		GiftBox 3 to  GlassJar 4:   false
		GlassJar 4 to GlassJar 5:  false

		these classes match and so do the volumes:
		GiftBox 0 to GiftBox 2 :  true
		GlassJar 1 to GlassJar 4:  true

		Using the compareTo method - overriden from the Comparable Interface:
		notice that it matters the subclass type, as the compareTo method is defined in that class & only takes it's specific data type
		GiftBox 0 to GiftBox 2 :  0
		GiftBox 0 to GiftBox 3 :  -1
		GiftBox 2 to GiftBox 3 :  -1

		GlassJar 1 to GlassJar 4:  0
		GlassJar 1 to GlassJar 5:  -1
		GlassJar 4 to GlassJar 5:  -1


		Cloning the objects using the clone method - overriden from the Cloneable Interface
		the clone method returns an Object - have to use polymorphism to get the specific subclass type
		a Container that is empty, it is a giftbox, with dimensions of:  2.0 x 2.0 x 2.0

		a Container that is empty, it is a glass jar with a radius of 2.0 and a height of 4.0

 *
 *
 * */

import java.io.*;
import java.util.*;

public class AbstractClassesInterfacesChapterExample {
  public static void main(String[] args) throws CloneNotSupportedException{

  	System.out.println("creating objects:  ");
  	//instantiation of objects
  	System.out.println("instantion of a Container object cannot happen as the class is an Abstract class");
  	//Container c1 = new Container();		can NOT do, because Container is Abstract & cannot create an instance of an Abstract class
  	//System.out.println(c1);
  	System.out.println();

  	// can instantiate concrete classes
  	System.out.println("a GiftBox:");
  	GiftBox gb1 = new GiftBox(2, 2, 2);
  	System.out.println(gb1);  	// = System.out.println(gb1.toString());	this is an example of dynamic binding
  	System.out.println();

  	System.out.println("a GlassJar");
  	GlassJar gj1 = new GlassJar(2, 4);
  	System.out.println(gj1);	// = System.out.println(gj1.toString());	this is an example of dynamic binding
  	System.out.println();

  	// an array of Container objects
  	Container[] containers = new Container[6];
  	// even though Container is Abstract, it can be a data type = polymorphism
  	containers[0] = gb1;
  	containers[1] = gj1;
  	containers[2] = new GiftBox(2, 2, 2);
  	containers[3] = new GiftBox(true, 3, 6, 9);
  	containers[4] = new GlassJar(2, 4);
  	containers[5] = new GlassJar(true, 3, 3);

  	System.out.println("printing out the array of containers");
  	for(Container c: containers){
  		System.out.println(c);	// this is an example of dynamic binding
  	}
  	System.out.println();

  	System.out.println("And another way:");
  	for(Container c: containers){
  		displayContainerInfo(c);	// polymorphic calls & static binding
  	}
  	System.out.println();

  	System.out.println("Just the Volume info:");
  	for(Container c: containers){
  		displayContainerVolume(c);	// polymorphic calls & static binding
  	}
  	System.out.println();
  	System.out.println();

  	System.out.println("Ways that we can compare objects:");
  	System.out.println();
  	System.out.println("Using the equalVolume method:");		// these are polymorphic calls & static binding
  	System.out.println("notice that it does not matter if the container is a GiftBox or a GlassJar");
  	System.out.println("of course, these are false as the dimensions do not allow for an equal volume");
  	System.out.println("GiftBox 0 to GlassJar 1:  " + equalVolume(containers[0], containers[1]));
  	System.out.println("GlassJar 1 to GiftBox 2:  " + equalVolume(containers[1], containers[2]));
  	System.out.println("GiftBox 2 to GiftBox 3:  " + equalVolume(containers[2], containers[3]));
  	System.out.println("GiftBox 3 to  GlassJar 4:   " + equalVolume(containers[3], containers[4]));
  	System.out.println("GlassJar 4 to GlassJar 5:  " + equalVolume(containers[4], containers[5]));
  	System.out.println();
  	System.out.println("but these dimensions match :");
  	System.out.println("GiftBox 0 to GiftBox 2 :  " + equalVolume(containers[0], containers[2]));
  	System.out.println("GlassJar 1 to GlassJar 4:  " + equalVolume(containers[1], containers[4]));
  	System.out.println();

  	System.out.println("Using the equals method - overriden from the Object Class:");	// these are polymorphic calls & dynamic binding
  	System.out.println("notice that it matters the subclass for this one as the method, as the equals method is defined in that class, it looks for the class to match, then will compare the volume");
  	System.out.println("GiftBox 0 to GlassJar 1:  " + containers[0].equals(containers[1]));
  	System.out.println("GlassJar 1 to GiftBox 2:  " + containers[1].equals(containers[2]));
  	System.out.println("GiftBox 2 to GiftBox 3:  " + containers[2].equals(containers[3]));
  	System.out.println("GiftBox 3 to  GlassJar 4:   " + containers[3].equals(containers[4]));
  	System.out.println("GlassJar 4 to GlassJar 5:  " + containers[4].equals(containers[5]));
  	System.out.println();
  	System.out.println("these classes match and so do the volumes:");
  	System.out.println("GiftBox 0 to GiftBox 2 :  " + containers[0].equals(containers[2]));
  	System.out.println("GlassJar 1 to GlassJar 4:  " + containers[1].equals(containers[4]));
  	System.out.println();

  	System.out.println("Using the compareTo method - overriden from the Comparable Interface:");	// these are polymorphic calls & dynamic binding
  	System.out.println("notice that it matters the subclass type, as the compareTo method is defined in that class & only takes it's specific data type");
  	System.out.println("GiftBox 0 to GiftBox 2 :  " + ((GiftBox)containers[0]).compareTo((GiftBox)containers[2]));
  	System.out.println("GiftBox 0 to GiftBox 3 :  " + ((GiftBox)containers[0]).compareTo((GiftBox)containers[3]));
  	System.out.println("GiftBox 2 to GiftBox 3 :  " + ((GiftBox)containers[2]).compareTo((GiftBox)containers[3]));
  	System.out.println();
  	System.out.println("GlassJar 1 to GlassJar 4:  " + ((GlassJar)containers[1]).compareTo((GlassJar)containers[4]));
  	System.out.println("GlassJar 1 to GlassJar 5:  " + ((GlassJar)containers[1]).compareTo((GlassJar)containers[5]));
  	System.out.println("GlassJar 4 to GlassJar 5:  " + ((GlassJar)containers[4]).compareTo((GlassJar)containers[5]));
  	System.out.println();
  	System.out.println();



  	System.out.println("Cloning the objects using the clone method - overriden from the Cloneable Interface");
  	System.out.println("the clone method returns an Object - have to use polymorphism to get the specific subclass type");
  	System.out.println();
  	GiftBox gbClone = (GiftBox)gb1.clone();		// polymorphism & dynamic binding
  	System.out.println(gbClone);

  	System.out.println();
  	GlassJar gjClone = (GlassJar)gj1.clone();	// polymorphism & dynamic binding
  	System.out.println(gjClone);

  }// end main

  public static boolean equalVolume(Container c1, Container c2){

  	return c1.getVolume() == c2.getVolume();

  }// end equalVolume

  public static void displayContainerVolume(Container c){

  	System.out.println("The volume is:  " + c.getVolume());

  }// end displayContainerVolume

  public static void displayContainerInfo(Container c){

  	System.out.println(c.toString() + " and has a volume of:  " + c.getVolume());

  }// end displayContainerInfo

}// end of AbstractClassesInterfacesChapterExample

// ***********************************************************

// Abstract class & Inheritance - inherits from Object class by default
abstract class Container{

	protected boolean filled = false;

	public Container(){}

	public Container(boolean filled){
		this.filled = filled;
	}

	public void setFilled(boolean filled){
		this.filled = filled;
	}

	public boolean getFilled(){
		return this.filled;
	}

	public abstract double getVolume();		// abstract method; hence the class HAS to be Abstract

	//inherits from the Object class
	@Override
	public String toString(){
		if(this.filled){
			return "a Container that is filled";
		}
		else{
			return "a Container that is empty";
		}
	}// end toString

}// end Container

// ***********************************************************

// inheritance & inheritance chaining as it inherits from Container which inherits from Object; can only inherit from ONE class
// implements interfaces; can implement as many as needed
class GiftBox extends Container implements Open, Comparable<GiftBox>, Cloneable{

	private double width;
	private double height;
	private double length;

	public GiftBox(){}

	public GiftBox(double width, double height, double length){
		this.width = width;
		this.height = height;
		this.length = length;
	}

	public GiftBox(boolean filled, double width, double height, double length){
		super(filled);
		this.width = width;
		this.height = height;
		this.length = length;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public void setHeight(double height){
		this.height = height;
	}

	public void setLength(double length){
		this.length = length;
	}

	public double getWidth(){
		return this.width;
	}

	public double getHeight(){
		return this.height;
	}

	public double getLength(){
		return this.length;
	}

	//defining the abstract methods and overriding all the methods that are inherited from classes and interfaces

	// from the Abstract class that this class inherits from
	@Override
	public double getVolume(){
		return this.width * this.height * this.length;
	}

	// from the Object class - automatically inherited
	@Override
	public String toString(){
		return super.toString() + ", it is a giftbox, with dimensions of:  " + this.width + " x " + this.height + " x " + this.length;
	}

	// from the Object class - automatically inherited
	@Override
	public boolean equals(Object o){

		// tests if the two objects are from the same class
		if (this.getClass() != o.getClass()){
         	return false;	// if the two objects are not from the same class, it returns false
     	}

		if(o instanceof GiftBox){
			return this.getVolume() == ((GiftBox)o).getVolume();
		}
		else{
			return false;
		}
	}

	// from the Open Interface
	@Override
	public String howToOpen(){
		return "untie bow and lift lid";
	}

	// from the Comparable Interface
	@Override
	public int compareTo(GiftBox giftbox){
		if(this.getVolume() > giftbox.getVolume()){
			return 1;
		}
		else if (this.getVolume() == giftbox.getVolume()){
			return 0;
		}
		else{  //this.getVolume() < giftbox.getVolume()
			return -1;
		}
	}

	// from the Cloneable Interface
	@Override
	public Object clone() throws CloneNotSupportedException{
		// shallow copy
		return super.clone();  // this works since the states are primitive data types
	}

}// end GiftBox

// ***********************************************************

// inheritance and inheritance chaining as it inherits from Container which inherits from Object; can only inherit from ONE class
// implements interfaces; can implement as many as needed
class GlassJar extends Container implements Open, Comparable<GlassJar>, Cloneable{

	private double radius;
	private double height;

	public GlassJar(){}

	public GlassJar(double radius, double height){
		this.radius = radius;
		this.height = height;
	}

	public GlassJar(boolean filled, double radius, double height){
		super(filled);
		this.radius = radius;
		this.height = height;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	public void setHeight(double height){
		this.height = height;
	}

	public double getRadius(){
		return this.radius;
	}

	public double getHeight(){
		return this.height;
	}

	//defining the abstract methods and overriding all the methods that are inherited from classes and interfaces

	// from the Abstract class that this class inherits from
	@Override
	public double getVolume(){
		return Math.PI * Math.pow(this.radius, 2) * this.height;
	}

	// from the Object class - automatically inherited
	@Override
	public String toString(){
		return super.toString() + ", it is a glass jar with a radius of " + this.radius + " and a height of " + this.height;
	}

	// from the Object class - automatically inherited
	@Override
	public boolean equals(Object o){

		// tests if the two objects are from the same class
		if (this.getClass() != o.getClass()){
         	return false;	// if the two objects are not from the same class, it returns false
     	}

		if(o instanceof GlassJar){
			return this.getVolume() == ((GlassJar)o).getVolume();
		}
		else{
			return false;
		}
	}

	// from the Open Interface
	@Override
	public String howToOpen(){
		return "unscrew lid and lift lid";
	}

	// from the Comparable Interface
	@Override
	public int compareTo(GlassJar glassjar){
		if(this.getVolume() > glassjar.getVolume()){
			return 1;
		}
		else if (this.getVolume() == glassjar.getVolume()){
			return 0;
		}
		else{  //this.getVolume() < glassjar.getVolume()
			return -1;
		}
	}

	// from the Cloneable Interface
	@Override
	public Object clone() throws CloneNotSupportedException{
		// shallow copy
		return super.clone();  // this works since the states are primitive data types
	}

}// end GlassJar

// ***********************************************************

interface Open{
	String howToOpen();
}// end interface Open
