/* Java version: 8
 * This application program shows inheritance, polymorphism, casting, instanceof, and abstract classes & Interfaces
*/


import java.io.*;
import java.util.*;

public abstract class Animal {

	public Animal(){
		System.out.println("Animal created");
	}

	public String animal(){
		return "animal";
	}

	@Override
	public String toString(){
		return "the animal - ";
	}

	public abstract String livesIn();

}// end of Animal
