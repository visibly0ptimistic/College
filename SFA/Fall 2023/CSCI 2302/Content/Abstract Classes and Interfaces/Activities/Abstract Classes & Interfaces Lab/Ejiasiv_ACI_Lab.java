/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
*/

/*Purpose:  to learn about Interfaces
 *
 *input:  none - hard coded into the program
 *
 *outout:  to the screen
 *
 *Sample run:
 *		Coloring the Circle object!
		Color purple the circumference of the circle!

		Coloring the Rectangle object!
		Outline the rectangle with purple

		Coloring the Triangle object!
		Outline the triangle with purple


		Does the circle and the rectangle have the same area? false

		Does the circle and the triangle have the same area? false

		Does the rectangle and the triangle have the same area? false


		Circle! - to the displayGeometricObject
		The area is 78.53981633974483
		The perimeter is 31.41592653589793

		Rectangle!  - to the displayGeometricObject
		The area is 15.0
		The perimeter is 16.0

		Triangle!  - to the displayGeometricObject
		The area is 3.897114317029974
		The perimeter is 9.0

		Coloring the GeoObjects!
		Color purple the circumference of the circle!

		Outline the rectangle with purple

		Outline the triangle with purple

		Does the geoObj circle and the geoObj rectangle have the same area? false

		Does the geoObj circle and the geoObj triangle have the same area? false

		Does the geoObj rectangle and the geoObj triangle have the same area? false

		GeometricObject Circle  - to the displayGeometricObject
		The area is 78.53981633974483
		The perimeter is 31.41592653589793

		GeometricObject Rectangle  - to the displayGeometricObject
		The area is 15.0
		The perimeter is 16.0

		GeometricObject Triangle  - to the displayGeometricObject
		The area is 6.928203230275509
		The perimeter is 12.0
 *
 */

public class Ejiasiv_ACI_Lab {
  /** Main method */
  public static void main(String[] args) {
      
      // 3.3.	Instantiate the following objects:  a Circle, a Rectangle, and a Triangle.
      Circle circle = new Circle(5);
      // 3.4.	Invoke the howToColor method for each object.
      circle.howToColor("purple");
      /* 3.5.	Invoke the equalArea method three times: 
            comparing the Circle to the Rectangle, 
            the Circle to the Triangle, and the Rectangle to the Triangle.
      */
      Rectangle rectangle = new Rectangle(3, 5);
      rectangle.howToColor("purple");
      Triangle triangle = new Triangle(3, 4, 5);
      triangle.howToColor("purple");
      System.out.println();
      System.out.println("Does the circle and the rectangle have the same area? " + equalArea(circle, rectangle));
      // 3.6.	Invoke the displayGeometricObject method for each object
      displayGeometricObject(circle);
      displayGeometricObject(triangle);
      displayGeometricObject(rectangle);

  }// end main

  // 3.1.	Implement the equalArea method in the ACI_Lab.java 
  /** A method for comparing the areas of two geometric objects */
  public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
    return object1.getArea() == object2.getArea();
  }

  // 3.2.	Implement the displayGeometricObject method in the ACI_Lab.java 
  /** A method for displaying a geometric object */
  public static void displayGeometricObject(GeometricObject object) {
    System.out.println("Geometric Object: " + object.getClass().getSimpleName());
    System.out.println("The area is " + object.getArea());
    System.out.println("The perimeter is " + object.getPerimeter());
  }

}// end ACI_Lab









