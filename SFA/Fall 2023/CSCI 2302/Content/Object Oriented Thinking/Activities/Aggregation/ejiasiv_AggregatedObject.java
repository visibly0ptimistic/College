/*
   Name: Victor Ejiasi
   
   java version:  18
   
   Purpose: To understand and apply the concept of an aggregated object.
   
   The EnhancedBicycle is an aggregated object; it has-a User object.
   User can exist on its own; thus, EnhancedBicycle is an aggregated object.
   
   Input: Hard coded into the program.
   
   Output: To the screen.
   
   Sample output:
   This bicycle has 10 gears, is electrified, and has a Turbo Boost enhancement.
   Using the Turbo Boost enhancement!
*/

import java.io.*;
import java.util.*;

public class ejiasiv_AggregatedObject {
   public static void main(String[] args) {
      // Instantiate a User object with the given data fields
      User user = new User("Lance Armstrong", 33, "Advanced");

      // Instantiate an EnhancedBicycle object with a User and given data fields
      EnhancedBicycle bicycle = new EnhancedBicycle(10, true, "Turbo Boost", user);

      // Describe the bicycle with the user details
      System.out.println(user);
      System.out.println(bicycle);
      System.out.println(bicycle.describeBicycle());

      // Use the enhancement
      bicycle.useEnhancement();

   }// end main
}// end AggregatedObject

// ******************************************************************
//          EnhancedBicycle Object
//********************************************************************
class EnhancedBicycle {
   //data field dictionary/database
   // complete this section with the fields of this object
   // States
   private int gearCount;
   private boolean isElectrified;
   private String enhancement;
   private User user;

   // Default constructor
   public EnhancedBicycle() {
      this.gearCount = 5; // Default 5 gears
      this.isElectrified = false; // Not electrified by default
      this.enhancement = "None"; // No enhancements by default
      this.user = new User("Default User", 0, "Beginner"); // Default user
   }

   // parameterized constructor
   public EnhancedBicycle(int gearCount, boolean isElectrified, String enhancement, User user) {
      this.gearCount = gearCount;
      this.isElectrified = isElectrified;
      this.enhancement = enhancement;
      this.user = user;
   }

   // complete the behaviors/methods section
   // Setters and getters
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

   public void setUser(User user) {
      this.user = user;
   }

   public User getUser() {
      return this.user;
   }

   public String describeBicycle() {
      return "This bicycle has " + this.gearCount + " gears, is " 
         + (this.isElectrified ? "electrified" : "not electrified") 
         + ", and has a " + this.enhancement + " enhancement." 
         + "\nOwned by: " + user.toString();
   }


   public void useEnhancement() {
      System.out.println("Using the " + enhancement + " enhancement!");
   }

   @Override
   public String toString(){
      return "EnhancedBicycle object, consists of:  " + 
         this.gearCount + " gears, is " + (this.isElectrified ? "electrified" : "not electrified") + ", and has a " + this.enhancement + " enhancement.";
   }// end toString method
} // end EnhancedBicycle class

// **********************************************************************
//          User Object (aggregated object, it has-an EnhancedBicycle object)
//***********************************************************************
class User {
   
   //data field dictionary/database
   private String name;
   private int age;
   private String experienceLevel; 

   // Constructor
   public User(String name, int age, String experienceLevel) {
      this.name = name;
      this.age = age;
      this.experienceLevel = experienceLevel;
   }  // end constructor

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public int getAge() {
      return age;
   }

   public void setExperienceLevel(String experienceLevel) {
      this.experienceLevel = experienceLevel;
   }

   public String getExperienceLevel() {
      return experienceLevel;
   }

   @Override
   public String toString() {
      return "User named " + this.name + ", aged " + this.age + " with " + this.experienceLevel + " level experience.";
   } // end toString method

} // end User class

