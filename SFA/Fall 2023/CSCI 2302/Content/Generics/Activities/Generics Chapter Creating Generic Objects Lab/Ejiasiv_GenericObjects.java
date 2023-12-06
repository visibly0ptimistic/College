/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose:  this program creates generic objects
   Input:  the input is hard coded 
   
   
   Output:  the output is printed to the screen/console
   
   Other associated files: GO_One.java, GO_Two.java
   
   Sample Run:  this is the output of the program when it runs
          2302
          2302.0
          CSCI 2302 Learning Generics!
          How many GO_One objects created? 3 objects
          2302     Generics
          2302.0     Generics
          Learning     Generics
          How many GO_Two objects created? 3 objects
   
*/

public class Ejiasiv_GenericObjects {
    public static void main(String[] args) {
        // Testing GO_One with different data types
        GO_One<Integer> goOneInt = new GO_One<>(2302);
        goOneInt.printData();

        GO_One<Double> goOneDouble = new GO_One<>(2302.000);
        goOneDouble.printData();

        GO_One<String> goOneString = new GO_One<>("CSCI 2302 Learning Generics!");
        goOneString.printData();

        System.out.println("How many GO_One objects created? " + GO_One.getCount() + " objects");

        // Testing GO_Two with different combinations of data types
        GO_Two<Integer, String> goTwoIntString = new GO_Two<>(2302, "Generics");
        goTwoIntString.printData();

        GO_Two<Double, String> goTwoDoubleString = new GO_Two<>(2302.000, "Generics");
        goTwoDoubleString.printData();

        GO_Two<String, String> goTwoStringString = new GO_Two<>("Learning", "Generics");
        goTwoStringString.printData();

        System.out.println("How many GO_Two objects created? " + GO_Two.getCount() + " objects");
    }
}
