/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose: this is the GeometricObject class that implements the Comparable interface.
   
   Input:  No input from the user, all values are hard coded
   
   Output: to the console
   
   Other associated files: Circle.java, Triangle.java, Rectangle.java, Ejiasiv_Comparable_Lab.java
   
   Sample Run:  a geometric object is created and all of its attributes are printed to the console
   
*/

// *****************************************************************************************

import java.util.Date;

public abstract class GeometricObject {

  private String color = "white";
  private boolean filled;
  protected Date dateCreated;

  /** Construct a default geometric object */
  protected GeometricObject() {
    dateCreated = new Date();
  }

  /** Construct a geometric object with color and filled value */
  protected GeometricObject(String color, boolean filled) {
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
   *  the get method is named isFilled */
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

  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }

  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();
  
}// end GeometricObject