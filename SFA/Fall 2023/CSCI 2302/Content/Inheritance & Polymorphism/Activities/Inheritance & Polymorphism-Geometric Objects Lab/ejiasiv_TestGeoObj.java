/*
   Name: Victor Ejiasi
   
   Java version: 8
   
   input: none, hard coded in
   output: to the screen
 
 
 	Purpose:  To learn about Inheritance, constructor chaining, overridden methods and dynamic binding 
 
   Sample run:  

a Triangle created!
a Square created!
a Square with toString() overridden created!
a Square with toString() overridden created!
a Square with toString() overridden created!
created on Mon Oct 18 15:21:00 PDT 2021
color: purple and filled: true
created on Mon Oct 18 15:21:00 PDT 2021
color: grey and filled: false; with side of: 2.0, 2.0, 2.0
created on Mon Oct 18 15:21:00 PDT 2021
color: white and filled: true
SquareWithToStringOverride: Side = 8.0, Area = 64.0
SquareWithToStringOverride: Side = 5.0, Area = 25.0
SquareWithToStringOverride: Side = 4.0, Area = 16.0
java.lang.Object@1a2b3c4
Area: 9.0
Area: 64.0
Area: 25.0
Area: 16.0
false
true

*/

import java.io.*;
import java.util.*;

public class ejiasiv_TestGeoObj {
  public static void main(String[] args) {
      
      //4.	Declare and assign/Instantiate a GeometricObject object with purple and true for its states.
	  GeometricObject geoObj = new GeometricObject("purple", true);


      //5.	Declare and assign/Instantiate a Triangle object with grey, false, 2, 2, and 2 for its states.
	  Triangle triangle1 = new Triangle("grey", false, 2, 2, 2);

      
      //6.	Declare and assign/Instantiate a Square object with white, true, and 3 for its states.
	  Square square1 = new Square("white", true, 3);

      
      //7.	Declare and assign/Instantiate a SquareWithToStringOverride with silver, false, and 8 for its states.
	  SquareWithToStringOverride squareOverride1 = new SquareWithToStringOverride("silver", false, 8);

      
      //8.	Declare and assign/Instantiate a new GeometricObject object with a SquareWithToStringOverride and black, true, and 5 for its states.
	  GeometricObject geoObjWithSquare = new SquareWithToStringOverride("black", true, 5);

      
      //9.	Declare and assign/Instantiate a new SquareWithToStringOverride object with GeometricObject object with red and false for its state.
	  SquareWithToStringOverride squareOverride2 = new SquareWithToStringOverride("red", false, 4);

      
      //10.	Declare and assign/Instantiate an Object object with nothing for its states.
	  Object obj = new Object();

      
      //12.	Make each object from steps 4 � 10 invoke the method created in step 11.
		printToString(geoObj);
        printToString(triangle1);
        printToString(square1);
        printToString(squareOverride1);
        printToString(geoObjWithSquare);
        printToString(squareOverride2);
        printToString(obj);
      
      //14.	Make each object from steps 4 � 10 invoke the method created in step 13.
    	invokeGetArea(geoObj);
        invokeGetArea(triangle1);
        invokeGetArea(square1);
        invokeGetArea(squareOverride1);
        invokeGetArea(geoObjWithSquare);
        invokeGetArea(squareOverride2);
        invokeGetArea(obj);
      //15. Declare and assign/Instantiate a Triangle object with black, true, 2, 2, and 2 for its states.
	  Triangle triangle2 = new Triangle("black", true, 2, 2, 2);

      
      //16.	Declare and assign/Instantiate a Triangle object with purple, true, 2, 1, and 2 for its states.
	  Triangle triangle3 = new Triangle("purple", true, 2, 1, 2);

      
      //17.	Invoke the equals method (defined/implemented in step 2) twice:
      //a.	Once with the Triangle from step 5 to the Triangle from step 15
      System.out.println(triangle1.equals(triangle2));

      //b.	Once with the Triangle from step 5 to the Triangle from step 16
	  System.out.println(triangle1.equals(triangle3));

	
  }// end main
  
  //11.	Define a method that accepts Objects and invoke the toString method in the method.
	public static void printToString(Object obj) {
		System.out.println(obj.toString());
	}
  //13.	Define a method that accepts Objects and if it is a Square object invoke its getArea method, if it is a SquareWithToStringOverride object invoke its getArea method, and if it is a Triangle object invoke its getArea method.
	public static void invokeGetArea(Object obj) {
			if (obj instanceof Square) {
				System.out.println("Area: " + ((Square) obj).getArea());
			} else if (obj instanceof SquareWithToStringOverride) {
				System.out.println("Area: " + ((SquareWithToStringOverride) obj).getArea());
			} else if (obj instanceof Triangle) {
				System.out.println("Area: " + ((Triangle) obj).getArea());
			}
	}
}// end of TestGeoObj

//*********************************************************************************************************

class GeometricObject {
  private String color = "white";
  private boolean filled;
  private Date dateCreated;

  /** Construct a default geometric object */
  public GeometricObject() {
    dateCreated = new Date();
  }

  /** Construct a geometric object with the specified color
    *  and filled value */
  public GeometricObject(String color, boolean filled) {
    dateCreated = new Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
     its get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  public Date getDateCreated() {
    return dateCreated;
  }

  /** Return a string representation of this object */
  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }

}// end GeometricObject

//*********************************************************************************************************

class Square extends GeometricObject{
	private double side;

	public Square(){
		System.out.println("a Square created!");
	}

	public Square(double side){
		this.side = side;
		System.out.println("a Square created!");
	}

	public Square(String color, boolean filled, double side){
		super(color, filled);
		this.side = side;
		System.out.println("a Square created!");
	}

	public void setSide(double side){
		this.side = side;
	}
	public double getSide(){
		return this.side;
	}

	public double getPerimeter(){
		return this.side * 4;
	}

	public double getArea(){
		return this.side * this.side;
	}

}// end of Square

//*********************************************************************************************************

class SquareWithToStringOverride extends GeometricObject{
	private double side;

	public SquareWithToStringOverride(){
		System.out.println("a Square with toString() overridden created!");
	}

	public SquareWithToStringOverride(String color, boolean filled, double side){
		super(color, filled);
		this.side = side;
		System.out.println("a Square with toString() overridden created!");
	}

	public void setSide(double side){
		this.side = side;
	}
	public double getSide(){
		return this.side;
	}

	public double getPerimeter(){
		return this.side * 4;
	}

	public double getArea(){
		return this.side * this.side;
	}

	//3.	In the SquareWithToStringOverride, implement/define the toString method.
    @Override
    public String toString() {
        return "SquareWithToStringOverride: Side = " + getSide() + ", Area = " + getArea();
    }
}// end of SquareWithToStringOverride

//*********************************************************************************************************

class Triangle extends GeometricObject{
	private double side1, side2, side3;

	public Triangle(){
		System.out.println("a Triangle created!");
	}

	public Triangle(String color, boolean filled, double side1, double side2, double side3){
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		System.out.println("a Triangle created!");
	}

	public void setSide1(double side1){
		this.side1 = side1;
	}
	public double getSide1(){
		return this.side1;
	}

	public void setSide2(double side2){
		this.side2 = side2;
	}
	public double getSide2(){
		return this.side2;
	}

	public void setSide3(double side3){
		this.side3 = side3;
	}
	public double getSide3(){
		return this.side3;
	}

	public double getPerimeter(){
		return this.side1 + this.side2 + this.side3;
	}

	public double getArea(){
		double p = (getPerimeter()/2.0);
		return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
	}

	@Override
	public String toString(){
		return super.toString() + "; with side of: " + this.side1 + ", " + this.side2 + ", " + this.side3;
	}
   
   //2.	In the Triangle class, implement/define an equals method, which will compare the area of two triangles to determine if the two triangles have the same area.
    public boolean equals(Triangle other) {
        return this.getArea() == other.getArea();
    }
}// end of Triangle
