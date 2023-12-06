/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose:  this program is a driver class that tests the GeometricObject class.
   
   Input:  the input is hard coded
   
   Output:  the output is printed to the console
   
   Other associated files: GeometricObject.java
   
   Sample Run:  * Original Geometric Object:
                * created on Mon Oct 23 16:03:05 PDT 2023
                * color: blue and filled: true
   
   
*/

public class Ejiasiv_Cloneable_Lab {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Instantiate one GeometricObject object with a color and filled state
        GeometricObject originalObject = new GeometricObject("blue", true);
        
        // Invoke the toString on the original object and print
        System.out.println("Original geometric object:");
        System.out.println(originalObject.toString());
        
        // Clone the object from originalObject to clonedObject, casting is required
        GeometricObject clonedObject = (GeometricObject) originalObject.clone();
        
        // Invoke the toString method on the cloned object and print it
        System.out.println("Cloned geometric object:");
        System.out.println(clonedObject.toString());
        
        // Change the states of filled and color of the cloned object
        clonedObject.setFilled(false);
        clonedObject.setColor("red");
        
        // Invoke the toString of each object to confirm the copy
        System.out.println("Original geometric object after cloning:");
        System.out.println(originalObject.toString());
        
        System.out.println("Cloned geometric object after modification:");
        System.out.println(clonedObject.toString());
    }
}
