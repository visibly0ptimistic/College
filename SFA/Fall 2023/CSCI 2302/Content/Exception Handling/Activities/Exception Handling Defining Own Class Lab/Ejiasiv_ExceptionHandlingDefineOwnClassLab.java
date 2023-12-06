/**
  Victor Ejiasi
  
  CSCI 2302-001

  Java Version 8

 *	Purpose:	Work with exception handling and files
 *
 *	This program works with Triangle.java which extends Geometric Object,
 *					utilizes IllegalTraingleException.java to ensure valid Triangles,
 *					and uses ehIn.txt (the data file)
 *
 *	input:	ehIn.txt
 *	output: to the screen
 *
 *	sample run:		Trying to construct a triangle
					With sides: 5.0, 6.0, and 7.0, the color is: purple
					Perimeter for triangle: 18.0
					Area for triangle: 14.70

					Trying to construct a triangle
					With sides: 4.0, 8.0, and 2.0, the color is: yellow
					The sum of any two sides has to be greater than the other side
					Illegal triangle - can't construct a triangle with given sides.
					Side1: 4.0
					Side2: 8.0
					Side3: 2.0

					Trying to construct a triangle
					With sides: 7.0, 9.0, and 15.0, the color is: gray
					Perimeter for triangle: 31.0
					Area for triangle: 20.69

 */
import java.io.*;
import java.util.*;

public class Ejiasiv_ExceptionHandlingDefineOwnClassLab {

  public static void main(String[] args) throws IOException{

  	Scanner input = new Scanner(new File("/Applications/College/SFA/Fall 2023/CSCI 2302/Content/Exception Handling/Activities/Exception Handling Defining Own Class Lab/ehIn.txt"));
  	double s1, s2, s3;
  	boolean filled;
  	String color;

	while(input.hasNext()){
		try {
	      System.out.println("Trying to construct a triangle");
	      s1 = input.nextDouble();
	      s2 = input.nextDouble();
	      s3 = input.nextDouble();
	      filled = input.nextBoolean();
	      color = input.next();
	      System.out.println("With sides: " + s1 + ", " + s2 + ", and " + s3 + ", the color is: " + color);
	      Triangle t = new Triangle(s1, s2, s3, filled, color);
	      System.out.println("Perimeter for triangle: " + t.getPerimeter());
	      System.out.printf("Area for triangle: %5.2f", t.getArea());
	      System.out.println();
		}// end try
	    catch (IllegalTriangleException ex) {
	      System.out.println("Illegal triangle - can't construct a triangle with given sides.");
	      System.out.println("Side1: " + ex.getSide1());
	      System.out.println("Side2: " + ex.getSide2());
	      System.out.println("Side3: " + ex.getSide3());
	    }// end catch
	    System.out.println();
	}// end while

  }// end main
}// end ExceptionHandlingDefineOwnClassLab

// ************************************************************************************

abstract class GeometricObject {
  private String color = "white";
  private boolean filled;
  private Date dateCreated;

  /** Construct a default geometric object */
  protected GeometricObject() {
    this.dateCreated = new Date();
  }

  /** Construct a geometric object with color and filled value */
  protected GeometricObject(boolean filled, String color) {
    this.dateCreated = new Date();
    this.filled = filled;
    this.color = color;
  }

  /** Return color */
  public String getColor() {
    return this.color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
   *  the get method is named isFilled */
  public boolean isFilled() {
    return this.filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  public Date getDateCreated() {
    return this.dateCreated;
  }

  @Override
  public String toString() {
    return "created on " + this.dateCreated + "\ncolor: " + this.color + " and filled: " + this.filled;
  }

  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();
  
}// end GeometricObject class

// ****************************************************************************************************

/*
   Uses IllegalTriangleException to ensure Triangles are valid Triangles
*/

/* 
   You need to modify this program so that it adheres to the rule:
   In a triangle, the sum of any two sides has to be greater than the other side
*/

// ****************************************************************************************************

/*
   3.	In a triangle, the sum of any two sides has to be greater than the other side; 
      your class must abide by this rule.  
   a.	Define/Create an IllegalTriangleException class to throw an IllegalTriangleException 
      object if the input received to create a triangle will violate that rule.
*/