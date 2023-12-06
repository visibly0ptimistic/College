/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose: the rectangle class that extends the GeometricObject class and implements the Colorable interface
   
   Input:  the input is the width and height of the rectangle
   
   Output: the output is the area and perimeter of the rectangle
   
   Other associated files:  Ejiasiv_ACI_Lab.java, Colorable.java, GeometricObject.java
   
   Sample Run:  a rectangle is colored red
   
   
*/

// **********************************************************************************

// 2.	Modify Rectangle.java to implement the howToColor method.

class Rectangle extends GeometricObject implements Colorable   {

  private double width;
  private double height;

  public Rectangle() {}

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

  @Override /** Return area */
  public double getArea() {
    return width * height;
  }

  @Override /** Return perimeter */
  public double getPerimeter() {
    return 2 * (width + height);
  }

    @Override
  public void howToColor(String st) {
    System.out.println("Coloring Rectangle: " + st);
  }
}
// end Rectangle class