/*Square Object
 *
 *
 * */

import java.io.*;
import java.util.*;

public class SquareWithToStringOverride extends GeometricObject{
	private double side;

	public SquareWithToStringOverride(){
		System.out.println("a Square with toString() overridden created!");
	}

	public SquareWithToStringOverride(String color, boolean filled, double side){
		super(color, filled);
		this.side = side;
		System.out.println("a Square with toString() overridden created!");
	}

	public void setSide(double side){
		this.side = side;
	}
	public double getSide(){
		return this.side;
	}

	public double getPerimeter(){
		return this.side * 4;
	}

	public double getArea(){
		return this.side * this.side;
	}

	@Override
	public String toString(){
		return "Square " + super.toString() + " with side: " + this.side + ", perimeter is: " + this.getPerimeter() + ", and area is: " + this.getArea();
	}

}// end of SquareWithToStringOverride
