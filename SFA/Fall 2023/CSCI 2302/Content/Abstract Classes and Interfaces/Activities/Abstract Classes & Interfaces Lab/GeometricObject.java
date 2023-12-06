/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose:  this is the GeometricObject abstract class that is extended by the Circle, Rectangle, and Triangle classes
   
   Input:  the input is the radius of the circle, the width and height of the rectangle, and the sides of the triangle
   
   Output:  the output is the area and perimeter of the circle, rectangle, and triangle
   
   Other associated files: Ejiasiv_ACI_Lab.java, Colorable.java
   
   Sample Run:  geometric objects are generated and colored
   
   
*/

// **********************************************************************************

abstract class GeometricObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  /** Construct a default geometric object */
  protected GeometricObject() {
    dateCreated = new java.util.Date();
  }

  /** Construct a geometric object with color and filled value */
  protected GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
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
   *  the get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }

  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();
  
}// end GeometricObjects abstract class