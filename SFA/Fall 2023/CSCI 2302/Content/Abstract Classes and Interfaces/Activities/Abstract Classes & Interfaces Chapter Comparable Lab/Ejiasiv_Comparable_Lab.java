/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose: the purpose of the program is to compare different geometric objects using the compareTo method.
   
   Input:  No input from the user, all values are hard coded
   
   Output: to the console
   
   Other associated files: Circle.java, Rectangle.java, Triangle.java, GeometricObject.java
   
   Sample Run:  Creating 2 circles with the same radius
                  Comparing the circles: 1

                Creating 2 triangles where the second triangle has larger sides
                  Comparing the triangles: -1

                Creating 2 rectangles where the first rectangle has a larger width
                  Comparing the rectangles: 1
   
*/

public class Ejiasiv_Comparable_Lab {

  /** Main method */
  public static void main(String[] args) {
      /*
         4 a.	Instantiate at least two of each geometric object 
         (i. e. 2-3 circles, 2-3 rectangles, 2-3 triangles) 
         and then invoke the compareTo method; see if you can 
         do 2 of the same kind of geometric objects 
         (i. e. circle to circle) and 2 different kinds of 
         geometric objects (i. e. circle to triangle) so 
         you can see how the method works.
      */
      Circle c1 = new Circle(5);
      Circle c2 = new Circle(5);
      Triangle t1 = new Triangle(3, 4, 5);
      Triangle t2 = new Triangle(5, 12, 13);
      Rectangle r1 = new Rectangle(2, 4);
      Rectangle r2 = new Rectangle(3, 6);


      // Compare circles
      System.out.println("Creating 2 circles with the same radius");
      System.out.println("\tComparing the circles: " + c1.compareTo(c2));

      // Compare triangles
      System.out.println("\nCreating 2 triangles where the second triangle has larger sides");
      System.out.println("\tComparing the triangles: " + t1.compareTo(t2));

      // Compare rectangles
      System.out.println("\nCreating 2 rectangles where the first rectangle has a larger width");
      System.out.println("\tComparing the rectangles: " + r2.compareTo(r1));

      // Since you can't compare different types using compareTo, this section is commented out
      // System.out.println("\nComparing rectangle to a circle: " + r1.compareTo(c1));
    }// end main
  
  
}// end Comparable_Lab





