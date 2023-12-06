/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose: this is the Circle class that extends the GeometricObject class and implements the Comparable interface.
   
   Input:  No input from the user, all values are hard coded
   
   Output: to the console
   
   Other associated files: Rectangle.java, Triangle.java, GeometricObject.java, Ejiasiv_Comparable_Lab.java
   
   Sample Run:  a circle is created and all of its attributes are printed to the console
   
*/

// *****************************************************************************************

// modify to implement the Comparable interface
public class Circle extends GeometricObject implements Comparable<Circle> {

  private double radius;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /** Return diameter */
  public double getDiameter() {
    return 2 * radius;
  }
  
  /* Implement the abstract method getArea in GeometricObject */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /* Implement the abstract method getPerimeter in GeometricObject */
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  @Override
  public String toString(){
    return super.toString() + " It is a circle with a radius of " + this.radius;
  }

  @Override
  public int compareTo(Circle o) {
    if (this.getArea() > o.getArea())
      return 1;
    else if (this.getArea() < o.getArea())
      return -1;
    else
      return 0;
  }
  
}// end Circle