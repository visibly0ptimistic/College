/*
   Victor Ejiasi

   CSCI 2302-001
   
   Java version:  18
   
   Purpose:  This class defines the properties and behaviors of an enhanced bicycle. It allows for the creation of bicycle objects with various attributes such as gear count, electrification, and enhancements.
   
   Input:  The input is provided through the class constructors and setter methods. 
   
   Output:  The output is returned through the class's methods, especially the describeBicycle() method.
   
   Other associated files:
         OC_Program.java
   
   Sample Run:  
         EnhancedBicycle myBike = new EnhancedBicycle(7, true, "Rocket Booster");
         System.out.println(myBike.describeBicycle()); // Expected Output: "This bicycle has 7 gears, is electrified, and has a Rocket Booster enhancement."
   
*/


public class EnhancedBicycle {

   // States
   private int gearCount;
   private boolean isElectrified;
   private String enhancement;

   // Default constructor
   public EnhancedBicycle() {
      this.gearCount = 5; // Default 5 gears
      this.isElectrified = false; // Not electrified by default
      this.enhancement = "None"; // No enhancements by default
   }

   // Constructor with parameters
   public EnhancedBicycle(int gearCount, boolean isElectrified, String enhancement) {
      this.gearCount = gearCount;
      this.isElectrified = isElectrified;
      this.enhancement = enhancement;
   }

   // Accessors and Mutators
   public void setGearCount(int gearCount) {
      this.gearCount = gearCount;
   }

   public int getGearCount() {
      return this.gearCount;
   }

   public void setElectrified(boolean isElectrified) {
      this.isElectrified = isElectrified;
   }

   public boolean getIsElectrified() {
      return this.isElectrified;
   }

   public void setEnhancement(String enhancement) {
      this.enhancement = enhancement;
   }

   public String getEnhancement() {
      return this.enhancement;
   }


   // Behaviors
   public String describeBicycle() {
      return "This bicycle has " + this.gearCount + " gears, is " + (this.isElectrified ? "electrified" : "not electrified") + ", and has a " + this.enhancement + " enhancement.";
   }
   
   public void useEnhancement() {
      System.out.println("Using the " + enhancement + " enhancement!");
   }
}