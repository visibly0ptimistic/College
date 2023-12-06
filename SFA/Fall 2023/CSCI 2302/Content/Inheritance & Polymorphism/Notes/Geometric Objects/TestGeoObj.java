/*Java version: 8
 *This application program does creates Geometric Objects
 *
 * Sample input: none
 *
 * Sample run/output:
 *	The area of t2 is 1.984313483298443
	The area of s2 is 4.0
 *
 *
 * */

import java.io.*;
import java.util.*;

public class TestGeoObj {
  public static void main(String[] args) {


  	System.out.println();
	System.out.println("Square s1");
	Square s1 = new Square();
	System.out.println("side value is: " + s1.getSide());
	System.out.println("The perimeter of s1 is " + s1.getPerimeter());
	System.out.println("The area of s1 is " + s1.getArea());
  	System.out.println();
  	System.out.println("Giving Square s1 a side value!");
  	s1.setSide(3.0);
  	System.out.println("side value is now: " + s1.getSide());
	System.out.println("The perimeter of s1 is now " + s1.getPerimeter());
  	System.out.println("The area of s2 is now " + s1.getArea());
  	System.out.println("the toString() method - " + s1.toString());



	System.out.println();
	System.out.println("SquareWithToStringOverride s2");
	SquareWithToStringOverride s2 = new SquareWithToStringOverride("purple", true, 2.0);
	System.out.println("side value is: " + s2.getSide());
	System.out.println("The perimeter of s1 is " + s2.getPerimeter());
	System.out.println("The area of s2 is " + s2.getArea());
	System.out.println("the toString() method - " + s2.toString());


	System.out.println();
	System.out.println("Triangle t1");
  	Triangle t1 = new Triangle();
  	System.out.println("Side1 value is: " + t1.getSide1());
  	System.out.println("Side2 value is: " + t1.getSide2());
  	System.out.println("Side3 value is: " + t1.getSide3());
  	System.out.println("The perimeter of t1 is " + t1.getPerimeter());
  	System.out.println("The area of t1 is " + t1.getArea());
  	System.out.println();
  	System.out.println("Giving Triangle t1 values!");
  	t1.setSide1(3.5);
  	t1.setSide2(2.9);
  	t1.setSide3(4.1);
  	System.out.println("Side1 value is now: " + t1.getSide1());
  	System.out.println("Side2 value is now: " + t1.getSide2());
  	System.out.println("Side3 value is now: " + t1.getSide3());
  	System.out.println("The perimeter of t1 is now " + t1.getPerimeter());
  	System.out.println("The area of t1 is now " + t1.getArea());
  	System.out.println("the toString() method - " + t1.toString());

  	System.out.println();
  	System.out.println("Triangle t2");
  	Triangle t2 = new Triangle("purple", true, 2.0, 2.0, 3.0);
  	System.out.println("Side1 value is: " + t2.getSide1());
  	System.out.println("Side2 value is: " + t2.getSide2());
  	System.out.println("Side3 value is: " + t2.getSide3());
  	System.out.println("The perimeter of t1 is " + t2.getPerimeter());
  	System.out.println("The area of t2 is " + t2.getArea());
  	System.out.println("the toString() method - " + t2.toString());


  }// end main
}// end of TestGeoObj
