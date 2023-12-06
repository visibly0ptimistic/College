/* Java version: 8

	Inheritance is one of the pillars of Object-Oriented Programming
	Inheritance relationship description is "is-a" relationship
		the derived class is-a base class, just more specialized (not a sub-set)
	Java is only single-inheritance
	It allows for re-use of code
		by allowing a derived class to have all the state and behaviors of the base class
	It keeps objects easy to maintain
	Inheritance happens during compile time

	input:  hard coded in program
	output:  to the screen
	sample run:
		A Fairy wizard, from A Midsummer Night's Dream, and does clever and mischievous deeds and Puck is my name!
		A sorcerer wizard, from olden times, and does arcane magic spells

*/

import java.io.*;
import java.util.*;

public class InheritanceExample{
	public static void main(String [] args){

		Puck p = new Puck();
		System.out.println(p.toString());

		Wizard sorcerer = new Wizard("sorcerer", "olden times", "arcane magic spells");
		System.out.println(sorcerer.toString());

	}// end main
}// InheritanceExample

class Wizard{
	private String type;
	private String from;
	private String does;

	Wizard(){}
	Wizard(String type, String from, String does){
		this.type = type;
		this.from = from;
		this.does = does;
	}

	public void setType(String type){
		this.type = type;
	}
	public void setFrom(String from){
		this.from = from;
	}
	public void setDoes(String does){
		this.does = does;
	}
	public String getType(){
		return this.type;
	}
	public String getFrom(){
		return this.from;
	}
	public String getDoes(){
		return this.does;
	}
	@Override
	public String toString(){
		return "A " + this.type + " wizard, from " + this.from + ", and does " + this.does;
	}
} // end Wizard class

// the keyword extends denotes inheritance; meaning all states and behaviors are inherited from the base class
class Puck extends Wizard{
	private String name = "Puck";
	// a default Puck that sets default values to the base class
	Puck(){
		super.setType("Fairy");
		super.setFrom("A Midsummer Night's Dream");
		super.setDoes("clever and mischievous deeds");
	}
	// an explicit Puck that takes arguments to construct that Puck
	Puck(String type, String from, String does, String name){
		super(type, from, does);
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	@Override
	public String toString(){
		return super.toString() + " and " + this.name + " is my name!";
	}
}// end Puck
