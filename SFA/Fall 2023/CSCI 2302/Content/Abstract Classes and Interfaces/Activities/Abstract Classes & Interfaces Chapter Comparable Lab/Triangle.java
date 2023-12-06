/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose: this is the Triangle class that extends the GeometricObject class and implements the Comparable interface.
   
   Input:  No input from the user, all values are hard coded
   
   Output: to the console
   
   Other associated files: Circle.java, Rectangle.java, GeometricObject.java, Ejiasiv_Comparable_Lab.java
   
   Sample Run:  a triangle is created and all of its attributes are printed to the console
   
*/

// *****************************************************************************************

// modify to implement the Comparble interface
public class Triangle extends GeometricObject implements Comparable<Triangle> {

  private double side1, side2, side3;

  /** Constructor */
   public Triangle(){
   	this.side1 = 7.0;
   	this.side2 = 9.0;
   	this.side3 = 12.0;
   }
   
  public Triangle(double side1, double side2, double side3){
    	this.side1 = side1;
    	this.side2 = side2;
    	this.side3 = side3;
  }
  
  public Triangle(double side1, double side2, double side3, boolean filled, String color){
    	//super(filled, color);
      super.setFilled(filled);
    	super.setColor(color);
    	this.side1 = side1;
    	this.side2 = side2;
    	this.side3 = side3;
  }

  public void setSide1(double side1){
  	this.side1 = side1;
  }

  public void setSide2(double side2){
  	this.side2 = side2;
  }

  public void setSide3(double side3){
  	this.side3 = side3;
  }

  public double getSide1(){
  	return this.side1;
  }

  public double getSide2(){
  	return this.side2;
  }

  public double getSide3(){
  	return this.side3;
  }

  /* Implement the abstract method getArea in GeometricObject */
  public double getArea() {
    double s = (side1 + side2 + side3) / 2;
    double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    return area;
  }

  /* Implement the abstract method getPerimeter in GeometricObject */
  public double getPerimeter() {
    return side1 + side2 + side3;
  }

  @Override
  public String toString(){
   return super.toString() + "It is a triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
  }

  @Override
  public int compareTo(Triangle o) {
    if (this.getArea() > o.getArea())
      return 1;
    else if (this.getArea() < o.getArea())
      return -1;
    else
      return 0;
  }

}// end Triangle
