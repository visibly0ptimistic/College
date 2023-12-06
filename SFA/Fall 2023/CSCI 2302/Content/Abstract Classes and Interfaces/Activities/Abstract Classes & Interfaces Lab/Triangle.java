/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose:  the triangle class that extends the GeometricObject class and implements the Colorable interface
   
   Input:  the input is the three sides of the triangle
   
   Output:  the output is the area and perimeter of the triangle
   
   Other associated files:  Ejiasiv_ACI_Lab.java, Colorable.java, GeometricObject.java
   
   Sample Run:  a triangle is colored red
   
   
*/

// **********************************************************************************

// 2.	Modify Triangle.java to implement the howToColor method.

class Triangle extends GeometricObject implements Colorable {

  private double side1, side2, side3;

  /** Constructor */
   public Triangle(){
   	this.side1 = 7.0;
   	this.side2 = 9.0;
   	this.side3 = 12.0;
   }
  public Triangle(double side1, double side2, double side3)  {

    	this.side1 = side1;
    	this.side2 = side2;
    	this.side3 = side3;

  }// end constructor
  public Triangle(double side1, double side2, double side3, boolean filled, String color)  {

    	setFilled(filled);
    	setColor(color);
    	this.side1 = side1;
    	this.side2 = side2;
    	this.side3 = side3;

  }// end constructor

  /** Implement the abstract method findArea in GeometricObject */
  public double getArea() {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  /** Implement the abstract method findCircumference in
   * GeometricObject
   **/
  public double getPerimeter() {
    return side1 + side2 + side3;
  }

  @Override
  public String toString() {
    // Implement it to return the three sides
    return super.toString() + "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
  }

  @Override
  public void howToColor(String st) {
    System.out.println("Coloring Triangle: " + st);
  }
  
}// end Triangle class