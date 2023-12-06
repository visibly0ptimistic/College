/*  This is an example of inheritance, inheritance chain,
 *		polymorphism, polymorphic calls,
 *		dynamic and static binding
 **/


import java.io.*;
import java.util.*;

public class TestFloraPineTree{

	public static void main(String[] args){
		//instantiation of a Flora object
		Flora f = new Flora();
		// dynamic binding - which toString will JVM invoke?  the one found in Flora
		System.out.println(f);
		System.out.println();

		//instantiations of Flora objects
		Flora f1 = new Flora("fibrous");
		Flora f2 = new Flora("fibrous");
		// dynamic binding - which equals will JVM invoke?  the one found in Flora
		System.out.println("Are f1 & f2 the same?  " + f1.equals(f2));
		System.out.println();

		// polymorphic calls - dynamic binding - which equals will JVM invoke?  the one found in Flora
		System.out.println("Are f & f1 the same?  " + f.equals(f1));
		System.out.println();

		//polymorphic instantiations of Objects that are referring to PineTree objects
		Object pt1 = new PineTree("tap", "Loblolly");
		Object pt2 = new PineTree("tap", "Long Needle");
		Object pt3 = new PineTree("tap", "Long-Needle");
		Object pt4 = new PineTree("tap", "Long-Needle");

		// polymorphic calls - dynamic binding - which toString will the JVM invoke?
			//the one in the PineTree class, since these objects refer to PineTree
		System.out.println(pt1.toString()); // or System.out.println(pt1);
		System.out.println(pt2);
		System.out.println(pt3.toString());
		System.out.println(pt4);
		System.out.println();

		// polymorphic calls - dynamic binding - which equals will the JVM invoke?
			//the one in the PineTree class, since these objects refer to PineTree
		System.out.println("Are pt1 & pt2 the same?  " + pt1.equals(pt2));
		System.out.println("Are pt1 & pt3 the same?  " + pt1.equals(pt3));
		System.out.println("Are pt2 & pt3 the same?  " + pt2.equals(pt3));
		System.out.println("Are pt3 & pt4 the same?  " + pt3.equals(pt4));

	}// end main

}// end TestFloraPineTree class

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
			if( this.root.equals( ((Flora)o).root ) )
				return true;
		}

		return false;

	}// end equals

}// end Flora

// ******************************************************************************************

class PineTree extends Flora{	// inherits from Flora and from Object
	/*the PineTree class has:
	 *	the states of root and energy
	 *	the behaviors of Flora(), Flora(String root), setRoot(String root),
	 *		getRoot(), getEnergy()
	 *		toString() and equals(Object o) are overridden
	 */
	private String leaves = "needle-shaped";
	private String reproduction = "pine cones";
	private String type;

	// constructors
	// in order for a PineTree object to be created, JVM invokes the Flora constructor, which then invokes the Object constructor
		// then creates the Object - returns to Flora, instantiates Flora, returns to PineTree and instantiates the PineTree object
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