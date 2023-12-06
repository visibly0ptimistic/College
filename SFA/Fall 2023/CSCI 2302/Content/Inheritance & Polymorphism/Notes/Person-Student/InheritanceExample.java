/*Java version:
 *This application program creates a Person object (superclass/Parent) and a Student object (subclass/Child)
 *
 * Sample input:none - hard coded in
 *
 * Sample run/output: to the screen
 *		ZZzzzz, z, Address:  101 Lane
		Abc, a, Address:  77 Alphabet Soup, Major:  CS, Classification:  Sophmore
 *
 *
 * */

import java.io.*;
import java.util.*;

public class InheritanceExample {
  public static void main(String[] args) {

  	Person p1 = new Person("ZZzzzz", 'z', "101 Lane");

  	System.out.println(p1.toString());

  	Student s1 = new Student("Abc", 'a', "77 Alphabet Soup", "CS", "Sophmore");

  	System.out.println(s1.toString());


  }// end main
}// end of InheritanceExample
