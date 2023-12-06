import java.util.*;

public class GeometricObject {
  private String color = "white";
  private boolean filled;
  private Date dateCreated;

  /** Construct a default geometric object */
  public GeometricObject() {
    this.dateCreated = new Date();
  }

  /** Construct a geometric object with the specified color
    *  and filled value */
  public GeometricObject(String color, boolean filled) {
    this.dateCreated = new Date();
    this.color = color;
    this.filled = filled;
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
    return this.dateCreated;
  }

  /** Return a string representation of this object */
  @Override
  public String toString() {
    return "created on " + this.dateCreated + "\ncolor: " + this.color +
      " and filled: " + this.filled;
  }

}// end GeometricObject
