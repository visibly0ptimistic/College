/**
  Victor Ejiasi
  
  CSCI 2302-001

  Java Version 8

**/

class Triangle extends GeometricObject {

  private double side1, side2, side3;

  /** Constructor */
  public Triangle(double side1, double side2, double side3, boolean filled, String color) throws IllegalTriangleException {
      if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
          throw new IllegalTriangleException(side1, side2, side3);
      }
      // Set the sides and other properties
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
      setFilled(filled);
      setColor(color);
  }// end constructor

  public void setSide1(double side1) throws IllegalTriangleException {
      if (!isValidTriangle(side1, this.side2, this.side3)) {
          throw new IllegalTriangleException(side1, this.side2, this.side3);
      }
      this.side1 = side1;
  }
  public double getSide1(){
    return this.side1;
  }

  public void setSide2(double side2) throws IllegalTriangleException {
      if (!isValidTriangle(this.side1, side2, this.side3)) {
          throw new IllegalTriangleException(this.side1, side2, this.side3);
      }
      this.side2 = side2;
  }
  public double getSide2(){
    return this.side2;
  }

  public void setSide3(double side3) throws IllegalTriangleException {
      if (!isValidTriangle(this.side1, this.side2, side3)) {
          throw new IllegalTriangleException(this.side1, this.side2, side3);
      }
      this.side3 = side3;
  }
  public double getSide3(){
    return this.side3;
  }

  private boolean isValidTriangle(double s1, double s2, double s3) {
    return s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1;
}

  /** Implement the abstract method getArea in GeometricObject */
  public double getArea() {
    double s = (this.side1 + this.side2 + this.side3) / 2;
    return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
  }

  /** Implement the abstract method getPerimeter in GeometricObject */
  public double getPerimeter() {
    return this.side1 + this.side2 + this.side3;
  }

  @Override
  public String toString() {
    // Implement it to return the three sides
    return super.toString() + "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
  }
  
}// end Triangle class
