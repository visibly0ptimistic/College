/* This file:
         instantiates CheeseBurger objects, BigMac objects, and polymorphic objects
         defines a CheeseBurger object
         defines a BigMac object
         
 * The purpose of this is to have an example of inheritance and polymorphism
 
 * Sample input: hard coded into program
 *
 * Sample run/output: to the screen
          This program will instantiate CheeseBurger, BigMac, and polymorphic objects
       asIsBurger: A cheese burger with ground beef meat, American cheese, condiments are: mustard, onions, lettuce, tomato, pickle, and a white yeast type of bun.
       asIsBigMac:  two all-beef patties, special sauce, lettuce, cheese, pickles, onions, on a sesame seed bun
       bigMacCheeseBurger:  two all-beef patties, special sauce, lettuce, cheese, pickles, onions, on a sesame seed bun
       Keeping program robust - bigMacCheeseBurger:  two all-beef patties, special sauce, lettuce, cheese, pickles, onions, on a sesame seed bun
   
 *
 *
 * */

import java.io.*;
import java.util.*;

public class AllAboutBurgers {
  public static void main(String[] args) {

  	System.out.println("This program will instantiate CheeseBurger, BigMac, and polymorphic objects");
   
   CheeseBurger asIsBurger = new CheeseBurger();  // what happens when this is invoked?  Object created first, then the CheeseBurger
   System.out.println("asIsBurger: " + asIsBurger);  // equivalent of System.out.println(asIsBurger.toString());
   
   BigMac asIsBigMac = new BigMac(); // what happens when this is invoked?  Object created first, then the CheeseBurger & then BigMac
   System.out.println("asIsBigMac:  " + asIsBigMac);  // equivalent of System.out.println(asIsBigMac.toString()); 
   
   // syntax of declaring and assigning:
   // dataType identifier = value;
   // dataType is the DECLARED data type
   // value is the ACTUAL value / data type
   
   // since all Big Macs have cheese - otherwise it is not a Big Mac - all BigMacs are CheeseBurgers, and we can do this by:
   CheeseBurger bigMacCheeseBurger = new BigMac();  // a polymorphic object
   System.out.println("bigMacCheeseBurger:  " + bigMacCheeseBurger ); 
      // what happens in this statement:  On Object is instantiated, then the CheeseBurger, then the BigMac
         // keep in mind that the DECLARED data type is CheeseBurger and the ACTUAL data type is BigMac
         // this means that to get to features of the BigMac - this object HAS TO BE (or should be) cast as a BigMac
         // but, to keep the program robust - test prior to casting!
   if(bigMacCheeseBurger instanceof BigMac){
      System.out.println( "Keeping program robust - bigMacCheeseBurger:  " + ((BigMac)bigMacCheeseBurger)  );  // equivalent of System.out.println(((BigMac)bigMacCheeseBurger).toString());
   }
      
  }// end main
}// end of AllAboutBurgers

class CheeseBurger{ // extends Object by default

   // states/fields
   private String meat = "ground beef";
   private String cheese = "American cheese";
   private String condiments = "mustard, onions, lettuce, tomato, pickle";
   private String bun = "white yeast";
   
   public CheeseBurger(){}
   
   public CheeseBurger(String meat, String cheese, String condiments, String bun){
      this.meat = meat;
      this.cheese = cheese;
      this.condiments = condiments;
      this.bun = bun;
   }
   
   public void setMeat(String meat){
      this.meat = meat;
   }
   
   public String getMeat(){
      return this.meat;
   }
   
   public void setCheese(String cheese){
      this.cheese = cheese;
   }
   
   public String getCheese(){
      return this.cheese;
   }
   
   public void setCondiments(String condiments){
      this.condiments = condiments;
   }
   
   public String getCondiments(){
      return this.condiments;
   }
   
   public void setBun(String bun){
      this.bun = bun;
   }
   
   public String getBun(){
      return this.bun;
   }
   
   @Override
   public String toString(){
      return "A cheese burger with " + this.meat + " meat, " + this.cheese + ", condiments are: " + this.condiments +
            ", and a " + this.bun + " type of bun.";
   }

}// end CheeseBurger

class BigMac extends CheeseBurger{  // is-a CheeseBurger and it is-an Object

   // states/fields
   private int howManyPatties = 2;
   private boolean hasBigMacSauce = true;
   
   public BigMac(){
      super("ground beef", "American Cheese", "shredded lettuce, Pickles, Onions", "Big Mac"); 
   }
   
   public BigMac(String meat, String cheese, String condiments, String bun, int howManyPatties, boolean hasBigMacSauce){
      super(meat, cheese, condiments, "Big Mac");
      this.howManyPatties = howManyPatties;
      this.hasBigMacSauce = hasBigMacSauce;
   }
   
   public void setHowManyPatties(int howManyPatties){
      this.howManyPatties = howManyPatties;
   }
   
   public int getHowManyPatties(){
      return this.howManyPatties;
   }
   
   public void setHasBigMacSauce(boolean hasBigMacSauce){
      this.hasBigMacSauce = hasBigMacSauce;

   }
   
   public  boolean getBigMacSauce(){
      return this.hasBigMacSauce;
   }
   
   @Override
   public String toString(){
      return "two all-beef patties, special sauce, lettuce, cheese, pickles, onions, on a sesame seed bun";
   }

}// end BigMac