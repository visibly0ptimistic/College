/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose:  this program creates a GeometricObject class that implements the Cloneable interface.
   
   Input:  the input is hard coded
   
   
   Output:  the output is printed to the console
   
   Other associated files: Ejiasiv_Cloneable_Lab.java
   
   Sample Run:  See Ejiasiv_Cloneable_Lab.java for a sample run that uses this class.
   
   
   
*/

import java.util.Date;

public class GeometricObject implements Cloneable {
  private String color = "white";
  private boolean filled;
  private Date dateCreated;

  /** Construct a default geometric object */
  public GeometricObject() {
    dateCreated = new Date();
  }

  /** Construct a geometric object with color and filled value */
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
    return (Date)dateCreated.clone();
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    // new object using the default constructor
    GeometricObject cloned = (GeometricObject)super.clone();
    
    // deep copy for mutable fields
    cloned.dateCreated = (Date)dateCreated.clone();
    
    return cloned;
  }

  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }
}
