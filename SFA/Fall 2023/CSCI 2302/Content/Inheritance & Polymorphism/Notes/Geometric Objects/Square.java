/*Square Object
 *
 *
 * */

import java.io.*;
import java.util.*;

public class Square extends GeometricObject{
	private double side;

	public Square(){
		System.out.println("a Square created!");
	}

	public Square(String color, boolean filled, double side){
		super(color, filled);
		this.side = side;
		System.out.println("a Square created!");
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

}// end of Square
