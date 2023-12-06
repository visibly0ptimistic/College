/* This application program is to learn the concepts covered in the Inheritiance & Polymorphism Chapter
 *
 * Sample input: hard coded into program
 *
 * Sample run/output:
 *
 *
 * */
 

import java.io.*;
import java.util.*;

public class InheritanceAndPolymorphismChapterLearning {
  public static void main(String[] args) {

  	  	System.out.println("Inheritiance & Polymorphism Chapter concepts");
      /*
         This chapter covers the last two concpts of OOP - inheritance and polymorphism.         
         Out of these, inheritance is usually easier to understand, polymorphism is usually harder to grasp.
         
         Inheritance is defining a new class from existing classes.  Meaning you can use the 
            states and behaviors of an already defined class.
            
         Polymorphism means that a variable of a supertype can refer to a subtype.  Meaning you can 
            define an object with the super class data type (the defined type) that really refers to the sub type class ( the actual type).
            This allows for flexibility in using your objects and how you define code to be used by
            those objects.
         
         With inheritance and polymorphism, we have to understand the following concepts:
            constructor chaining
            dynamic and static binding
            override/overriding methods
         And add to our vocabulary:  extends, super and instanceof keywords         
      */
      
      //**************************
      
      /*
         Inheritance & super keyword & constructor chaining
         
         Why do you want to use inheritance?
         Because it allows you to create a common class that can be used by several other classes - 
            meaning, you only have to define these states and behaviors only once & get to use them the other classes
            benefits:  reuse software, this makes the software modularized which inturn makes it easier to maintain
               AND easier for us programmers to comprehend/understand the code
         
         When an object inherits from another object, that inheriting object becomes more specific of the inherited-from object
            meaning you are adding (getting more specific) states and behaviors to the inheriting object
            
         How does the JVM know that an object is inheriting from another object?
         by using the keyword extends on the class header
         Example:  class InherintingObject extends InheritFromObject{
         
         the InheritFromObject is called the super class, aka: parent class, base class
         the InheritingObject is called the sub class, aka:  child class, derived class
      */
      
      //**************************
      
      /*
         inheritance chain
         constructor chaining
         
         Java only has SINGLE inheritance
         
         but - you can chain classes to inherit from = inheritance chain
         
         Every ADT/object automatically inherits from Java's Object class
            automatically means that extends keyword does/is not on the class header
            
         Example:
         
         class MyObject {   is the same as  class MyObject extends Object {
            
         What does this mean?
         It means that every Object/ADT that is defined automatically - through inheritance - has the following methods:
            toString, equals, compareTo
         
         How do we, as programmers, define our objects to have the inheritance chain?
         We define a base class with just the most generalized common states and behaviors for the super,
            add another subclass with "the next level" of common states and behaviors, 
            add another subclass with "the next level" of common states and behaviors, and so on
         
         Examples:  Flora and PineTree
                    Black  Red      White
                           Blue     
                           Yellow   
         
      */
      //instantiation of a Flora object 
		Flora f = new Flora();// the Object constructor is invoked first, then the Flora constructor
		// dynamic binding - which toString will JVM invoke?  the one found in Flora
		System.out.println(f);
		System.out.println();
      
      PineTree pt = new PineTree("tap", "Loblolly");// Object constructor is invoked first, then Flors, then PinetTree
      // dynamic binding - which toString will JVM invoke?  the one found in PineTree
		System.out.println(pt);
		System.out.println();
      
      Black blackObj = new Black(); // constructor chain/inheritence chain:  Object - Black
      // dynamic binding - which toString will JVM invoke?  the one found in Black
		System.out.println(blackObj);
		System.out.println();
      
      Red redObj = new Red(); // constructor chain/inheritence chain:  Object - Black - Red
      // dynamic binding - which toString will JVM invoke?  the one found in Red
		System.out.println(redObj);
		System.out.println();
      
      Blue blueObj = new Blue(); // constructor chain/inheritence chain:  Object - Black - Blue
      // dynamic binding - which toString will JVM invoke?  the one found in Blue
		System.out.println(blueObj);
		System.out.println();
      
      Yellow yellowObj = new Yellow(); // constructor chain/inheritence chain:  Object - Black - Yellow
      // dynamic binding - which toString will JVM invoke?  the one found in Yellow
		System.out.println(yellowObj);
		System.out.println();
      
      White whiteObj = new White(); // constructor chain/inheritence chain:  Object - Black - Red - White
      // dynamic binding - which toString will JVM invoke?  the one found in White
		System.out.println(whiteObj);
		System.out.println();
      
      //**************************
      
      /*
         overriding methods
         
         methods that are defined in the superclass can be overridden
         How to override a method?  By using the exact same signature
         (overloading is also using the signature, but the parameter have to be different - same name though)
         
         And you HAVE/should use the @Override - in fact, some IDE do require it
         
         Example:  REMEMBER this is a METHOD - which CANNOT be inside the main method
         @Override
         public static returnType methodName(parameterList)
         
         in practice - see the examples in all the following classes
         
         The question then is, how does the JVM know which method to use?
         the @Override helps
         The JVM looks in the class of the declared data type to see if that method exists there,
            if it does, it executes that method
            if it does not, it goes to the super class and looks - on up the chain
         The compiler - during compile time - ensures that the method is in the inheritance chain with the correct parameter list, return type, and name.
         
      */
      
      //**************************
      
      /*
         Polymorphism
         
         Polymorphism means that a variable of a supertype can refer to a subtype object; 
            the subtypes have the states and behaviors of its supertypes, 
            but supertypes do NOT have the states and behaviors of any subtypes
            Since all subtypes have the state and behaviors of it supertypes; 
            the sypertypes can refer to a subtype.  It CANNOT be the other way around.
         
         Why do we want to use polymorphism?  
         Polymorphism helps simplify the code and provides flexibility; 
            you can create one method to that can access all the states of the superclass.
         You can define a method that accepts the super data type and use the methods that are 
            defined/overriden  - simpliefies code = flexibility
         
       */
       //Examples:
       Flora floraIsReallyAPineTree = new PineTree();  // a super class referring to the subclass
       // declared data type = Flora
       // actual data type = PineTree
       
       superTypeMethods_method(floraIsReallyAPineTree); // polymorphic call
         
       Object objectIsReallyABlueObject = new Blue();  // a super class referring to the subclass
       // declared data type = Object
       // actual data type = Blue
       
       superTypeMethods_method(objectIsReallyABlueObject); // polymorphic call
      
      //**************************
      
      /*
         dynamic and static binding
         
         dynamic binding is the JVM trying to figure out which method to use during runtime
            the use of the @Override helps - it also helps us programmers to know that this method is defined in the super class too
         
         static binding occurs during compile time
            the compiler is matching up:
                  the method name
                  the parameter list - the number of arguments, the order of the arguments - the data type of the arguments
                  the return type
         
         the methods can be anywhere along the inheritance chain
         
      */
      
      //**************************
      
      /*
         instanceof
         
         when using polymorphism, it is important to know how to get to the subtype's states
         BUT before you try to access the subtype's states, you need to test if that variable is an instance of
            the actual data type
         
         To test, you use the keyword instanceof - notice that there is not the camelback notation
         
         THEN you HAVE to cast!  and pay attention to your . operator - you will have to use parenthesis
                  
      */
      //Example:
      subTypeMethods_methods(f);
      subTypeMethods_methods(pt);
      subTypeMethods_methods(blackObj);
      subTypeMethods_methods(redObj);
      subTypeMethods_methods(blueObj);
      subTypeMethods_methods(yellowObj);
      subTypeMethods_methods(whiteObj);
      
      Object objectIsPineTree = new PineTree();
      if(objectIsPineTree instanceof PineTree)
         System.out.println(((PineTree)objectIsPineTree).getLeaves());
      
      //**************************
      
      /*
         final keyword stops the inheritance chain
            & prevents overriding methods
            
         
         The final keyword prevents changes.

         Just like in your learned in CSCI 1302, final prevented a variable from having the value changed, final can prevent changes to a class and to a method.

         Examples:
         private int NUM_STAYS_THE_SAME = 42;	// the variable cannot be changed
         public final void cannotOverrideMethod()// the method cannot be overridden
         public final ClassCannotBeExtended		// the class cannot be a superclass, if it is a subclass it is the end of the inheritance chain         
         
      */


  }// end main
  
  public static void superTypeMethods_method(Object o){// polymorphic method - it accepts all variables that inherit from Object
      
      System.out.println("printing the toString method in the superTypeMethods_method:  " + o); 
      /*  Object has the toString method, all the classes in this program have overriden this method
          and the JVM will use dynamic binding to figure out which toString to use
      */
      System.out.println();
  
  }// end superTypeMethods_method
  
  public static void subTypeMethods_methods(Object o){// polymorphic method - it accepts all variables that inherit from Object
  
      System.out.println("printing the toString method in the superTypeMethods_method:  " + o);
      // you can always access the superclass data type's info
      
      // you ALWAYS HAVE to test to access the subclass data type's info by using the instanceof keyword
      if(o instanceof Flora){
         System.out.println(((Flora)o).getRoot());
      }
      
      if(o instanceof PineTree){
         System.out.println(((PineTree)o).getLeaves());
      }
      
      if(o instanceof Black){
         ((Black)o).blackMethod();
      }
      
      if(o instanceof Red){
         ((Red)o).redMethod();
      }
      
      if(o instanceof Blue){
         ((Blue)o).blueMethod();
      }
      
      if(o instanceof Yellow){
         ((Yellow)o).yellowMethod();
      }
      
      if(o instanceof White){
         ((White)o).whiteMethod();
      }
        
  }// end subTypeMethods_methods
  
  
}// end of InheritanceAndPolymorphismChapterLearning

//****************************************************************************************

/*
   inherited methods from the Object class that you should/need to implement in your ADTs
   +toString():  String
   +compareTo(): int
   +equals(Object o): boolean
*/

//****************************************************************************************

class Super_Parent_Base_Class{// this class automatically inherits from Object class by default

}// end Super_Parent_Base_Class

//****************************************************************************************

class Sub_Child_Derived_Class extends Super_Parent_Base_Class{  // this class inherits from Super_Parent_Base_Class and Object class

}// end Sub_Child_Derived_Class

//****************************************************************************************

// ******************************************************************************************

class Flora{  // since Flora does not have extends here - it automatically inherits from Object

	private String root;
	private String energy = "photosynthesis";

	public Flora(){}

	public Flora(String root){
		this.root = root;
	}

	public void setRoot(String root){
		this.root = root;
	}

	public String getRoot(){
		return this.root;
	}

	public String getEnergy(){
		return this.energy;
	}

	// from the Object class
	@Override
	public String toString(){
		return "Flora with " + this.root + " root system.";
	}

	// from the Object class
	@Override
	public boolean equals(Object o){

		// tests if the two objects are from the same class
		if (this.getClass() != o.getClass()){
         	return false;	// if the two objects are not from the same class, it returns false
     	}

     	// This statement eliminates runtime error of default objects created without root being assigned
     	if(this.root == null){
     		return false;
     	}

		// tests if the two objects that are Flora type have the same kind of root
		if (o instanceof Flora){
			if( this.root.equals( ((Flora)o).root ) )// have to cast bue to polymorphism
				return true;
		}

		return false;

	}// end equals

}// end Flora

// ******************************************************************************************

class PineTree extends Flora{	// inherits from Flora and from Object
	/*the PineTree class has:
	 *	the states of root and energy defined in this class
	 *	the behaviors of Flora(), Flora(String root), setRoot(String root), getRoot(), getEnergy() defined in the Flora class
	 *	toString() and equals(Object o) are overridden from the Object class
	 */
	private String leaves = "needle-shaped";
	private String reproduction = "pine cones";
	private String type;

	// constructors
	// in order for a PineTree object to be created, JVM invokes the Flora constructor, which then invokes the Object constructor
		// then instantiates an Object - returns to Flora, instantiates Flora, returns to PineTree and instantiates the PineTree object
	public PineTree(){}

	public PineTree(String root, String type){
		super(root);
		this.type = type;
	}

	public String getLeaves(){
		return this.leaves;
	}

	public String getReproduction(){
		return this.reproduction;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return this.type;
	}

	// from the Flora & Object class
	@Override
	public String toString(){
		return super.toString() + " " + this.type + " kind and has " + this.leaves + " leaves, and " + this.reproduction;
	}

	// from the Flora & Object class
	@Override
	public boolean equals(Object o){

		boolean theSame = false;

		// tests if the two objects are of the same class
		if (this.getClass() != o.getClass()){
         	return theSame;
     	}

     	// This statement eliminates runtime error of default objects created without root & type being assigned
     	if(this.type == null || ((PineTree)o).type == null || super.getRoot() == null || ((PineTree)o).getRoot() == null){
     		return theSame;
     	}

     	// tests if the two objects that are of PineTree type are the same
		if (o instanceof PineTree){
			if( this.type.equals( ((PineTree)o).type ) && (super.getRoot()).equals( ((PineTree)o).getRoot() )){
				theSame = true;
			}
		}

		return theSame;

	}// end equals

}// end PineTree

class Black{   // automatically extends Object
   String colorMix;
   
   public Black(){
      this.colorMix = "Black is the absence of all colors";
   }
   
   public void blackMethod(){
      System.out.println("a method just for Black objects");
   }
   
   @Override
   public String toString(){
      return this.colorMix;
   }
}// end Black

class Red extends Black{ // inheritance chain:  Object - Black - Red
   String baseColor;
   
   public Red(){
      baseColor = "Red is the color at the beginning of the visible spectrum of light";
   }
   
   public void redMethod(){
      System.out.println("a method just for Red objects");
   }
   
   @Override
   public String toString(){
      return super.toString() + " " + this.baseColor;
   }
} // end Red

class Blue extends Black{ // inheritance chain:  Object - Black - Blue
   String baseColor;
   
   public Blue(){
      baseColor = "Blue is the color at the beginning of the last third of the visible spectrum of light, between green and violet";
   }
   
   public void blueMethod(){
      System.out.println("a method just for Blue objects");
   }
   
   @Override
   public String toString(){
      return super.toString() + " " + this.baseColor;
   }
} // end Blue

class Yellow extends Black{ // inheritance chain:  Object - Black - Yellow
   String baseColor;
   
   public Yellow(){
      baseColor = "Yellow is the color at the beginning of the second third of the visible spectrum of light, between orange and green";
   }
   
   public void yellowMethod(){
      System.out.println("a method just for Yellow objects");
   }
   
   @Override
   public String toString(){
      return super.toString() + " " + this.baseColor;
   }
} // end Yellow

class White extends Red{ // inheritance chain:  Object - Black - Red - White
      
   public White(){
      super();  // no new data here - using the super class' constructor
   }
   
   public void whiteMethod(){
      System.out.println("a method just for White objects");
   }
   
   @Override
   public String toString(){
      return super.toString() + ", white is all the colors of the spectrum";
   }
} // end Yellow



