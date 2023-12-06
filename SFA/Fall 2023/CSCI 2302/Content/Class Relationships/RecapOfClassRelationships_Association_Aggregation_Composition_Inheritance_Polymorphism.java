/*
   java 8
   
   purpose:
      recap of:
          the relationships between objects:
               association
               aggregation
               composition
               inheritance
         polymorphism         
         
   input:
      harded in
      
   output:
      to the screen
      
*/

import java.util.*;

public class RecapOfClassRelationships_Association_Aggregation_Composition_Inheritance_Polymorphism {
   
   public static void main(String[] args){
   
      //__________________________________
      //  instantiating objects
      //__________________________________
      
      // association relationship
      System.out.println("association relationship");
      Universe universe = new Universe();
      System.out.println(universe);
      System.out.println();
      
      // aggregation relationship
      System.out.println("aggregation relationship");
      Planet pa_99_n2 = new Planet("Andromeda", "Mayall II", "PA-99-N2");
      System.out.println(pa_99_n2);
      System.out.println();
      
      System.out.println("another aggregation example:");
      Planet earth = new Planet("Milkway", "Solar System", "Earth");
      System.out.println(earth);
      System.out.println();      
      
      // composition relationship
      System.out.println("composition relationship");
      Atom atom = new Atom();
      System.out.println(atom);
      System.out.println();
      
      System.out.println("composition relationship");
      Nucleus nucleus = new Nucleus();
      System.out.println(nucleus);
      System.out.println();
                  
      // association & aggregation & inheritance:
      System.out.println("association & aggregation & inheritance");
      BigFoot bigfoot = new BigFoot();
      System.out.println(bigfoot); 
      System.out.println();
      
      // polymorphism
      System.out.println("polymorphism");
      Cryptoid cryptoidThatIsABigFoot = new BigFoot();
      System.out.println(cryptoidThatIsABigFoot); 
      System.out.println();
      System.out.println();
      System.out.println();
      
      //__________________________________
      //  using methods
      //__________________________________
      System.out.println("Invoking the methodThatAcceptsObjects_ToString method:");
      methodThatAcceptsObjects_ToString(universe);
      methodThatAcceptsObjects_ToString(pa_99_n2);
      methodThatAcceptsObjects_ToString(earth);
      methodThatAcceptsObjects_ToString(atom);
      methodThatAcceptsObjects_ToString(nucleus);
      methodThatAcceptsObjects_ToString(bigfoot);
      methodThatAcceptsObjects_ToString(cryptoidThatIsABigFoot);
      System.out.println();
      System.out.println();
      System.out.println();
      
      System.out.println("Invoking the methodThaAcceptsCryptoids_PrintsPlanetName method:");
      methodThaAcceptsCryptoids_PrintsPlanetName(bigfoot);
      methodThaAcceptsCryptoids_PrintsPlanetName(cryptoidThatIsABigFoot);
      System.out.println();
      System.out.println();
      System.out.println();
      
      System.out.println("Invoking the methodThatAcceptsObject_BigFootUsesStick method:");
      methodThatAcceptsObject_BigFootUsesStick(bigfoot, "Speak softly, Bigfoot is carrying a big stick");
      methodThatAcceptsObject_BigFootUsesStick(cryptoidThatIsABigFoot, "as a Walking Cane!  Score! ");      
      
   }// end main
   
   public static void methodThatAcceptsObjects_ToString(Object o){ // polymorphic method:  accepts Objects
      // Reminder:  all ADTs/objects automatically inherit from the Object class in Java
      System.out.println(o);  // as such, all have the toString method
   }// end methodThatAcceptsObjects_ToString
   
   public static void methodThaAcceptsCryptoids_PrintsPlanetName(Cryptoid c){
      System.out.println(c.getFromPlanet());
   }
   
   public static void methodThatAcceptsObject_BigFootUsesStick(Object o, String howToUse){
      if (o instanceof BigFoot){
         ((BigFoot)o).bfUsingStick(howToUse);
      }
   }
   
}// end RecapOfClassRelationships_Association_Aggregation_Composition_Inheritance_Polymorphism

class Universe{   // extends Object class by default
   //data fields/states
      
   
   //behaviors/methods
   public Universe(){
   }
   
   @Override
   public String toString(){
      return "The Universe ";
   }   

}// end class Universe

class Galaxy{  // extends Object class by default
   //data fields/states
   private String galaxyName;
      
   //behaviors/methods
   public Galaxy(String galaxyName){
      this.galaxyName = galaxyName;
   }
   
   public void setGalaxyName(String galaxyName){
      this.galaxyName = galaxyName;
   }
   
   public String getGalaxyName(){
      return this.galaxyName;
   }
   
   @Override   // override the toString in the Object class
   public String toString(){
      return this.galaxyName + " Galaxy";
   }

}// end class Galaxy

class PlanetarySystem{ // extends Object class by default
   //data fields/states
   String planetarySystemName;
   
   //behaviors/methods
   public PlanetarySystem(String planetarySystemName){
      this.planetarySystemName = planetarySystemName;
   }
   
   public void setPlanetarySystemName(String planetarySystemName){
      this.planetarySystemName = planetarySystemName;
   }
   
   public String getPlanetarySystemName(){
      return this.planetarySystemName;
   }
   
   @Override
   public String toString(){
      return "Planetary System:  " + this.planetarySystemName;
   } 

}// end class SolorSystem

class Planet{
   //data fields/states
   Galaxy galaxy;
   PlanetarySystem planetarySystem;
   String planetName;
   
   //behaviors/methods
   public Planet(String galaxyName, String planetarySystemName, String planetName){
      this.galaxy  = new Galaxy(galaxyName);
      this.planetarySystem = new PlanetarySystem(planetarySystemName);
      this.planetName = planetName;
   }
   
   // setter & getter for Galaxy object
   public void setGalaxy(String galaxyName){
      this.galaxy.setGalaxyName(galaxyName);
   }
   
   public String getGalaxy(){
      return this.galaxy.getGalaxyName();
   }
   
   // setter & getter for PlanetarySystem object
   public void setPlanetarySystem(String planetarySystemName){
      this.planetarySystem.setPlanetarySystemName(planetarySystemName);
   }
      
   public String getPlanetarySystem(){
      return this.planetarySystem.getPlanetarySystemName();
   }
   
   // setter & getter for the planetName
   public void setPlanetName(String planetName){
      this.planetName = planetName;
   }
   
   public String getPlanetName(){
      return this.planetName;
   }
      
   @Override
   public String toString(){
      return this.planetName + " that is located in " + this.planetarySystem.toString() + " which is in " +this.galaxy.toString();
   }

}// end class Planet

class Cryptoid{ // does not extend, so extends Object class by default
   //data fields/states
   private String description = "a cryptoid creature";
   private String livesIn = "folklore";
                           //Planet(String galaxyName, String planetarySystemName, String planetName)
   private Planet planet = new Planet("Galaxy", "Imagination Planet System", "planet of imagination");   // has-a or comes from a planet object
   
   //behaviors/methods
   public Cryptoid(){}
   
   public Cryptoid(String description, String livesIn, String galaxyName, String planetarySystemName, String planetName){
      this.description = description;
      this.livesIn = livesIn;
      this.planet = new Planet(galaxyName, planetarySystemName, planetName);
   }
   
   public void setDescription(String description){
      this.description = description;
   }
   
   public void setLivesIn(String livesIn){
      this.livesIn = livesIn;
   }
   
   public void setFromPlanet(String planetName){
      planet.setPlanetName(planetName);
   }
   
   public String getDescription(){
      return this.description;
   }
   
   public String getLivesIn(){
      return this.livesIn;
   }
   
   public String getFromPlanet(){
      return planet.getPlanetName();
   }
   
   @Override   // override the toString in the Object class
   public String toString(){
      return "a cryptoid; description: " + this.description + "; that lives in:  " + this.livesIn + "\n On planet: " + planet.toString();
   }

}// end class Cryptiod

class BigFoot extends Cryptoid{  // inheritance chain is:  1) Object, 2) Cyrptoid
   //data fields/states
   private String name = "BigFoot";
   private Stick stick = new Stick();
      
   //behaviors/methods
   public BigFoot(){
            //String description,          String livesIn,                String galaxyName, String planetarySystemName, String planetName
      super("Tall, hairy, ape-like human", "northwest forest of America", "Milkway", "Solar System", "Earth");  
      // name is BigFoot
      // has-a Stick   
   }
   
   public void bfUsingStick(String doing){
      stick.useStickTo(doing);
   }
   
   @Override   // override the toString in the Cryptoid class
   public String toString(){
      return this.name + "\n Uses a " + stick.toString() + "\n" + this.name + " is " + super.toString();
   }
   
} // end class BigFoot

class Stick{  // does not extend, so extends Object class by default
   //data fields/states
   private String stick = "straight tree branch";
      
   //behaviors/methods
   public Stick(){}
   
   public void useStickTo(String use){
      System.out.println("Stick being used to " + use);
   }
   
   @Override   //override the toString from the Object class
   public String toString(){
      return "Stick object that is a " + this.stick;
   }
   
}// end class Stick

class Atom{    // composition object made up of a neucleus and 1 or more electrons
   
   private Nucleus nucleus = new Nucleus();
   private Electron electron = new Electron();
   
   public Atom(){}
   
   @Override
   public String toString(){
      return "Every atom is composed of a nucleus and one or more electrons bound to the nucleus.";
   }

}// end class Atom

class Nucleus{ // composition object made up of proton(s) and neutron(s)
   
   private Proton proton = new Proton();
   private Neutron neutron = new Neutron();
   
   public Nucleus(){}
   
   @Override
   public String toString(){
      return "A nucleus is made of one or more protons and a number of neutrons";
   }

}// end class Nucleus

class Proton{
   
   public Proton(){}
   
   @Override
   public String toString(){
      return "proton";
   }

}// end class Proton

class Neutron{
   
   public Neutron(){}
   
   @Override
   public String toString(){
      return "neutron";
   }

}// end class Neutron

class Electron{

   public Electron(){}
   
   @Override
   public String toString(){
      return "electron";
   }

}// end class Electron