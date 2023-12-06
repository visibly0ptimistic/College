/*
Class relationships

Association / uses: any kind of association between two objects - both objects can exists individually
Aggregation / has-a: one object is used to make up/enhance the other object - both(all) objects can exists individually
Composition / owns/made-up-of: one object is made up of the other object (or objects) - one (the compostion) cannot exist without the other object(s)
	the object(s) that makes up the composition can exist individually


a Person can exists individually - without relying on another class/entity to exists

a ToolBelt can exists individually - without relying on another class/entity to exists

a Hammer can exists individually - without relying on another class/entity to exists

a ToolBelt can have many Hammers - aggregation & association; it is wrong to say that a toolBelt cannot exist without a Hammer

a Person can have/uses many Hammers - association

a Person can have many ToolBelts - association

Measurements exists but not necessarily individually - they have to be on something to be seen

a Ruler measures things, but not without Measurements - it cannot exist on its own - it has to have measurements;
    it is made up of Measurements - composition

Also take a look at:  https://www.geeksforgeeks.org/association-composition-aggregation-java/
   for more explanation

Other examples:
FaceBook IS-A SocialNetwork website.(Inheritance)
FaceBook HAS-A User(actually Million users).(Aggregation/Composition)
FaceBook USES-A FaceBookWall to post any status updates.(Association)

a Zoo is MADE-UP-OF Animals.(Composition)
Animals exist individually
*/


import java.util.*;

public class Relationships_BTW_Objects{
	public static void main(String[] args){

		// a Hammer object
		Hammer hammer1 = new Hammer("rubber", "wood");
		System.out.println(hammer1.toString());
		System.out.println();
		System.out.println();

		// a ToolBelt object that has a Hammer
		ToolBelt toolBelt1 = new ToolBelt("belt", "leather", "steel", "wood");
		System.out.println(toolBelt1.toString());
		System.out.println();
		System.out.println();

		// a Person object
		Person person1 = new Person("PersonOne");
		System.out.println(person1.toString());
		System.out.println();
		System.out.println();

		// a Person object with a Hammer
		Person person2 = new Person("PersonWithHammer", hammer1);
		System.out.println(person2.toString());
		System.out.println();
		System.out.println();

		// a Person object with a ToolBelt
		Person person3 = new Person("PersonWithToolBelt", toolBelt1);
		System.out.println(person3.toString());
		System.out.println();
		System.out.println();

		// a Person object with a ToolBelt that has a Hammer
		Person person4 = new Person("PersonWithToolBeltAndHammer", "utility", "black tough material", "steel", "comfort grip", "inches");
		System.out.println(person4.toString());
		System.out.println();
		System.out.println();


		//a Ruler object
		Ruler ruler1 = new Ruler();
		System.out.println(ruler1.toString());
		System.out.println();
		System.out.println();

		// a Ruler object
		Ruler ruler2 = new Ruler("centimeters");
		System.out.println(ruler2.toString());
		System.out.println();
		System.out.println();

		// a Person object with a Ruler
		Person person5 = new Person("PersonWithARuler", ruler1);
		System.out.println(person5.toString());

	}// end main

}// end class Relationships_BTW_Objects

class Person{
	private String name;
	private ToolBelt toolBelt = new ToolBelt();
	private Hammer hammer = new Hammer();
	private Ruler ruler = new Ruler();

	public Person(String name){
		this.name = name;
	}// end constructor

	public Person(String name, Hammer hammer){
		this.name = name;
		this.hammer = hammer;
	}// end constructor

	public Person(String name, ToolBelt toolBelt){
		this.name = name;
		this.toolBelt = toolBelt;
	}// end constructor

	public Person(String name, Ruler ruler){
		this.name = name;
		this.ruler = ruler;
	}// end constructor

	public Person(String name, ToolBelt toolBelt, Hammer hammer){
		this.name = name;
		this.hammer = hammer;
		this.toolBelt = toolBelt;
	}// end constructor

	public Person(String name, ToolBelt toolBelt, Hammer hammer, Ruler ruler){
		this.name = name;
		this.hammer = hammer;
		this.toolBelt = toolBelt;
		this.ruler = ruler;
	}// end constructor

	public Person(String name, String type, String material, String head, String handle, String measurement){
		this.name = name;
		this.hammer = new Hammer(head, handle);
		this.toolBelt = new ToolBelt(type, material, hammer);
		this.ruler = new Ruler(measurement);
	}// end constructor

	public String getName(){
		return this.name;
	}// end getName

	public String toString(){
		return this.name + " using a " + (this.toolBelt).toString() + (this.ruler).toString();
	}// end toString

}// end Person

class ToolBelt{
	private String type;
	private String material;
	private Hammer hammer = new Hammer();

	public ToolBelt(){
		this.type = "tool rig";
		this.material = "tough fabric";
	}// end default = no-args constructor

	public ToolBelt(String type, String material, Hammer hammer){
		this.type = type;
		this.material = material;
		this.hammer = hammer;
	}// end explicit constructor

	public ToolBelt(String type, String material, String head, String handle){
		this.type = type;
		this.material = material;
		this.hammer = new Hammer(head, handle);
	}// end explicit constructor

	public String getType(){
		return this.type;
	}// end getType

	public String getMaterial(){
		return this.material;
	}// end getMaterial

	public String toString(){
		return this.type + " tool belt made of " + this.material + " and a " + hammer.toString();
	}// end toString


}// end ToolBelt

class Hammer{
	private String head;
	private String handle;

	public Hammer(){
		this.head = "metal";
		this.handle = "composite";
	}// end Hammer default = no-args constructor

	public Hammer(String head, String handle){
		this.head = head;
		this.handle = handle;
	}// end Hammer explicit constructor

	public String getHead(){
		return this.head;
	}// end getHead

	public String getHandle(){
		return this.handle;
	}// end getHandle

	public String toString(){
		return "hammer made of a " + this.head + " head and a " + this.handle + " handle.  ";
	}// end toString

}// end Hammer

class Ruler{
	private Measurments measurements = new Measurments();

	public Ruler(){}// end constructor

	public Ruler(String type){
		this.measurements = new Measurments(type);
	}// end constructor

	public String toString(){
		return "The ruler's measurement is in " + measurements.getType() + ".";
	}
}// end Ruler

class Measurments{
	private String type;

	public Measurments(){
		this.type = "inches";
	}// end constructor

	public Measurments(String type){
		this.type = type;
	}// end constructor

	public String getType(){
		return this.type;
	}

	public String toString(){
		return "Measurements are in " + this.type;
	}// end toString
}// end Measurements