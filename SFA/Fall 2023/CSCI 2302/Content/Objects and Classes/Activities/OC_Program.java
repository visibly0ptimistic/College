/*
    Victor Ejiasi

    CSCI 2302-001

    Java version:  18

    Purpose:  This program demonstrates the usage of the EnhancedBicycle class. It creates an instance of the EnhancedBicycle, describes the bicycle, and uses its enhancement.

    Input:  The input is hard-coded in the main method where an instance of the EnhancedBicycle is created.

    Output:  The program outputs the description of the bicycle and the usage of its enhancement.

    Other associated files:
        EnhancedBicycle.java

    Sample Run:  
        This bicycle has 7 gears, is electrified, and has a Rocket Booster enhancement. Using the Rocket Booster enhancement!

*/

public class OC_Program {

    public static void main(String[] args) {
        // Create an instance of the EnhancedBicycle
        EnhancedBicycle myBike = new EnhancedBicycle(7, true, "Rocket Booster", null);

        // Describe the bicycle
        System.out.println(myBike.describeBicycle());

        // Use the bicycle's enhancement
        myBike.useEnhancement();
    }
}
