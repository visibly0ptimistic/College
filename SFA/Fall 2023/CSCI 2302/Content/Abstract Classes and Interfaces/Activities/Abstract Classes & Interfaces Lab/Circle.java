/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose:  this is the circle class that extends the GeometricObject class and implements the Colorable interface
   
   Input:  the input is the radius of the circle
   
   Output:  the output is the area and perimeter of the circle
   
   Other associated files: Ejiasiv_ACI_Lab.java, Colorable.java, GeometricObject.java
   
   Sample Run: a circle is colored red
   
   
*/

// **********************************************************************************

class Circle extends GeometricObject implements Colorable {
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

  @Override /** Return area */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /** Return diameter */
  public double getDiameter() {
    return 2 * radius;
  }

  @Override /** Return perimeter */
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  /* Print the circle info */
  public void printCircle() {
    System.out.println("The circle is created " + getDateCreated() +
      " and the radius is " + radius);
  }

  @Override
  public void howToColor(String st) {
    System.out.println("Coloring Circle: " + st);
  }
  
}// end Circle class