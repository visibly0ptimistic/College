/**
    Victor Ejiasi

    CSCI 2302-001

    Java version:  18

    Purpose: This program showcases the inheritance relationship between GeometricObject and Square classes. It instantiates objects and displays their properties.

    Input: Values for the objects are hard coded in the main method.

    Output: Details about each instantiated object, such as its properties and creation date, are output to the console.

    Other associated files: GeometricObject.java, Square.java

    Sample Run: 
            After instantiating various GeometricObject and Square objects, 
            the program will output details of each object to the console. 
            This includes color, fill status, side length (for Square), and creation date.
*/

public class ejiasiv_InheritanceLab {

    // this is the main method
    public static void main(String[] args) {

        // a. a GeometricObject object
        GeometricObject geoObj = new GeometricObject();

        // b. A Square object with no-args
        Square squareDefault = new Square();

        // c. A Square object with a side value of 2
        Square squareWithSide = new Square(2);

        // d. A Square object with color = purple, filled = true, side = 3
        Square squareWithAll = new Square("purple", true, 3);

        // e. An Object object
        Object obj = new Object();

        // 3. For each instantiated object from step 2, invoke the toString method.
        System.out.println(geoObj);
        System.out.println(squareDefault);
        System.out.println(squareWithSide);
        System.out.println(squareWithAll);
        System.out.println(obj);

        // 4. Invoke the anotherMethodToGetDateCreated method using the Square objects.
        System.out.println(squareDefault.anotherMethodToGetDateCreated());
        System.out.println(squareWithSide.anotherMethodToGetDateCreated());
        System.out.println(squareWithAll.anotherMethodToGetDateCreated());
    }
}
