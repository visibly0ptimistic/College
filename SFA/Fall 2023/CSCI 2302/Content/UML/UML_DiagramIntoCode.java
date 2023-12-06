/*Java version 8
 *
 *This program is example of taking a UML diagram into code
 *
 * Sample input:  some values can have a default value and some will be set by
 *		the program utilizing the object
 *
 */

import java.io.*;
import java.util.*;

public class UML_DiagramIntoCode {

	// list of states - the variables
	private int state1;
	private char state2;
	private String state3;
	// if they have an initial state you can assign that here or in the default constructor
	// for example:
	private String state4 = "initial value";
	private String word;


	// default constructor - should be listed first
	public UML_DiagramIntoCode(){
		// the default constructor does not take in any variables
		// it can assign default - or initial - values here or when the variable is declared
		// for example
		this.state1 = 1;

	}// end UML_DiagramIntoCode default constructor

	// constructor that accepts all the variables
	public UML_DiagramIntoCode(int state1, char state2, String state3, String state4){
		this.state1 = state1;
		this.state2 = state2;
		this.state3 = state3;
		this.state4 = state4;

	}// end UML_DiagramIntoCode constructor that accepts all the variables

	// constructor that accepts some variables
	// please note that you can have as many constructors as needed - you see fit -
	// having a class that is user friendly is the goal
	public UML_DiagramIntoCode(char state2, String state3){
		this.state2 = state2;
		this.state3 = state3;
	}// end UML_DiagramIntoCode constructor that accepts some variables

	// once you have completed all the constructors, do the setters & getters
	/* It is your choice if you want to do all the setters then the getters or
	 * do the setters first, then do the getters.
	 */

	 public void setState1 (int state1){
	 	this.state1 = state1;
	 }

	 public int getState1(){
	 	return this.state1;
	 }

	 public void setState2(char state2){
	 	this.state2 = state2;
	 }

	 public char getState2(){
	 	return this.state2;
	 }

	 public void setState3(String state3){
	 	this.state3 = state3;
	 }

	 public String getState3(){
	 	return this.state3;
	 }

	 public void setState4(String state4){
	 	this.state4 = state4;
	 }

	 public String getState4(){
	 	return this.state4;
	 }

	 // after the setters and getters, layout the methods for the object/class
	 public void method1(String word){
	 	System.out.println("a method with a value given " + word);
	 }

	 public String method2(){
	 	return "another method";
	 }

	 // finish with the toString method for easy access of the object/class data
	 public String toString(){
	 	return "The _object_ has " + this.state1 + " and " + this.state2 + " and " +
	 		this.state3 + " and " + this.state4;
	 }

}// end of UML_DiagramIntoCode
