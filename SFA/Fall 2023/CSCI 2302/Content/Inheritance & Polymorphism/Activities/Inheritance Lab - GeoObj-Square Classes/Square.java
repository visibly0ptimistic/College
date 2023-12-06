/**
    Victor Ejiasi

    CSCI 2302-001

    Java version:  18

    Purpose: Represents a Square object that extends the GeometricObject class. It allows for the creation of a Square with properties such as side length, color, and fill status.

    Input:  Values are received either through constructors or setter methods. Initial values are hard coded when an object is instantiated.

    Output: Relevant details about the Square are outputted to the console via the toString method.

    Other associated files: GeometricObject.java

    Sample Run: 
            Square square = new Square("blue", true, 4);
            System.out.println(square);
           // Output: Square with side 4.0 created on <date> color: blue and filled: true
*/


public class Square extends GeometricObject {
    private double side;

    // Constructors
    // this is a no-args constructor
    public Square() {
        super(); // Calls the superclass no-args constructor
        this.side = 1.0; // Default value
    }

    // this is a constructor that takes in a side length
    public Square(double side) {
        super();
        this.side = side;
    }

    // this is a constructor that takes in a color, fill status, and side length
    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    // Getters and Setters
    // this is a method that returns the area of the Square
    public double getSide() {
        return this.side;
    }

    // this is a method that returns the area of the Square
    public void setSide(double side) {
        this.side = side;
    }

    // Another method
    // this is a method that returns the area of the Square
    public String anotherMethodToGetDateCreated() {
        return "The creation date is: " + this.getDateCreated().toString();
    }

    // this is a method that returns the area of the Square
    @Override
    public String toString() {
        return "Square with side " + this.side + " " + super.toString();
    }
}
