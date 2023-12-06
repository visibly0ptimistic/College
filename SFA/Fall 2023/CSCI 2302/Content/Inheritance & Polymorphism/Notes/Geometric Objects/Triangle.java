/*Triangle Object
 *
 *
 * */

import java.io.*;
import java.util.*;

public class Triangle extends GeometricObject{
	private double side1, side2, side3;

	public Triangle(){
		System.out.println("a Triangle created!");
	}

	public Triangle(String color, boolean filled, double side1, double side2, double side3){
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		System.out.println("a Triangle created!");
	}

	public void setSide1(double side1){
		this.side1 = side1;
	}
	public double getSide1(){
		return this.side1;
	}

	public void setSide2(double side2){
		this.side2 = side2;
	}
	public double getSide2(){
		return this.side2;
	}

	public void setSide3(double side3){
		this.side3 = side3;
	}
	public double getSide3(){
		return this.side3;
	}

	public double getPerimeter(){
		return this.side1 + this.side2 + this.side3;
	}

	public double getArea(){
		double p = (getPerimeter()/2.0);
		return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
	}

	@Override
	public String toString(){
		return super.toString() + "; with side of: " + this.side1 + ", " + this.side2 + ", " + this.side3;
	}

}// end of Triangle
