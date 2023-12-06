/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18

    This lab is providing an example of using an ArrayList and a Stack
    
    Input:  hard coded
    Output: to the screen
    Sample run: the output is arraylist of coffecups logo1 logo2 logo3
                dequestack of coffecups stacklogo3 stacklogo2 stacklogo1

*/

import java.util.*;  

public class Ejiasiv_A_S_Lab  {  
   public static void main(String[] args)  { 
      
      //2.	Instantiate an ArrayList of CoffeeCup objects and print the logos.
      ArrayList<CoffeeCup> coffeeCups = new ArrayList<>();
      coffeeCups.add(new CoffeeCup("Logo1", true, 3.2, 5.0, true));
      coffeeCups.add(new CoffeeCup("Logo2", true, 3.5, 4.8, false));
      coffeeCups.add(new CoffeeCup("Logo3", false, 3.0, 5.5, true));

      System.out.println("ArrayList of CoffeeCups:");
      for (CoffeeCup cup : coffeeCups) {
         System.out.println(cup.getLogo());
      }
      
      //3.	Instantiate a DequeStack of CoffeeCup objects and print the logos.
      Deque<CoffeeCup> stack = new ArrayDeque<>();
      stack.push(new CoffeeCup("StackLogo1", true, 3.2, 5.0, true));
      stack.push(new CoffeeCup("StackLogo2", true, 3.5, 4.8, false));
      stack.push(new CoffeeCup("StackLogo3", false, 3.0, 5.5, true));

      System.out.println("\nDequeStack of CoffeeCups:");
      while (!stack.isEmpty()) {
          CoffeeCup cup = stack.pop();
          System.out.println(cup.getLogo());
      }
   
   }// end main
}// end A_S_Lab

class CoffeeCup{
   
   // states = data fields = variables
   private String logo = "SFA";
   private boolean handle = true;
   private double diameter = 3.2;
   private double height = 5.0;
   private boolean isItFilled = true;
   
   public CoffeeCup(){}
   
   public CoffeeCup(String logo, boolean handle, double diameter, double height, boolean isItFilled){
      this.logo = logo;
      this.handle = handle;
      this.diameter = diameter;
      this.height = height;
      this.isItFilled = isItFilled;
   }
   
   public void setLogo(String logo){
      this.logo = logo;
   }
        
   public String getLogo(){
      return this.logo;
   }
   
   public void setHandle(boolean handle){
      this.handle = handle;
   }
   
   public boolean getHandle(){
      return this.handle;
   }
   
   public void setDiameter(double diameter){
      this.diameter = diameter;
   }
   
   public double getDiameter(){
      return this.diameter;
   }
   
   public void setHeight(double height){
      this.height = height;
   }
   
   public double getHeight(){
      return this.height;
   }
   
   public void setIsItFilled(boolean isItFilled){
      this.isItFilled = isItFilled;
   }
   
   public boolean getIsItFilled(){
      return this.isItFilled;
   }
   
   
   public void canDrinkFromCup(){
      if(isItFilled){
         System.out.println("Yes, you can drink from the coffee cup");
      }
      else{
         System.out.println("Nope, it's empty - go fill it up!");
      }      
   }
   
   @Override
   public boolean equals(Object o){
      // compare logo, handle, isItFilled, height, diameter
      if(o instanceof  CoffeeCup){
         if(this.logo.equals( ((CoffeeCup)o).logo) &&
            this.handle == ((CoffeeCup)o).handle &&
            this.isItFilled == ((CoffeeCup)o).isItFilled &&
            this.height == ((CoffeeCup)o).height &&
            this.diameter == ((CoffeeCup)o).diameter){
               return true;
         }
         
      }
      return false;
   }// ends equals
      
}//  end CoffeeCup class
