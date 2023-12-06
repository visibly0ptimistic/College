/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose: this is the Rectangle class that extends the GeometricObject class and implements the Comparable interface.
   
   Input:  No input from the user, all values are hard coded
   
   Output: to the console
   
   Other associated files: Circle.java, Triangle.java, GeometricObject.java, Ejiasiv_Comparable_Lab.java
   
   Sample Run:  a rectangle is created and all of its attributes are printed to the console
   
*/

// *****************************************************************************************

// modify to implement the Comparable interface
public class Rectangle extends GeometricObject implements Comparable<Rectangle> {

  private double width;
  private double height;

  public Rectangle() {
  }

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /** Return width */
  public double getWidth() {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height */
  public double getHeight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }

  /* Implement the abstract method getArea in GeometricObject */
  public double getArea() {
    return width * height;
  }

  /* Implement the abstract method getPerimeter in GeometricObject */
  public double getPerimeter() {
    return 2 * (width + height);
  }

  @Override
  public String toString(){
  	return super.toString() + " It is a rectangle with a width of " + this.width +
  		" and a height of " + this.height + " has a perimeter of " +  this.getPerimeter() +
  		" and an area of " + this.getArea();
  }

  @Override
  public int compareTo(Rectangle o) {
    if (this.getArea() > o.getArea())
      return 1;
    else if (this.getArea() < o.getArea())
      return -1;
    else
      return 0;
  }

}// end Rectangle

