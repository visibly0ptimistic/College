/*
    Victor Ejiasi

    CSCI 2302-001

    Java version:  18

    Purpose: the main driver class for the program. It instantiates a SpiderMan and GreenGoblin object, and then invokes methods from both classes. It also demonstrates implicit casting and polymorphism.

    Input: hard coded the values are declared in the code

    Output: outputs the details of the SpiderMan and GreenGoblin objects.

    Other associated files: Being.java, SpiderMan.java, and ejiasiv_InheritanceAndPolymorphismProgram.java

    Sample Run: GreenGoblin [name=Norman Osborn, age=45, gadgets=Pumpkin Bombs, motive=Revenge, hideout=Abandoned Oscorp Facility]
    SpiderMan [name=Peter Parker, agilityLevel=9, webType=sticky, tool=WebShooter [name=WebShooter, webCapacity=9]]


*/

public class ejiasiv_InheritanceAndPolymorphismProgram {
    public static void main(String[] args) {
        // Task 4a: Instantiate SpiderMan
        WebShooter webShooter = new WebShooter("WebShooter", 10);
        SpiderMan spiderMan = new SpiderMan("Peter Parker", 25, 9, "sticky", webShooter);

        spiderMan.introduce();
        spiderMan.useTool();
        
        // Task 4b: Instantiate GreenGoblin
        GreenGoblin greenGoblin = new GreenGoblin("Norman Osborn", 45, "Pumpkin Bombs", "Revenge", "Abandoned Oscorp Facility");
        System.out.println(greenGoblin.toString());
        
        // Task 4c: Scenario
        spiderMan.swingBetweenBuildings();
        greenGoblin.getGadgets();
        spiderMan.savePeople();
        greenGoblin.getHideout();
        
        // Task 4d and 4e: Implicit Casting (Polymorphism)
        Being peterParker = spiderMan;
        Being normanOsborn = greenGoblin;
        
        // Task 4f: Method that accepts Being objects
        describeBeing(peterParker);
        describeBeing(normanOsborn);
        
        // Task 4g: Method that accepts Being objects and invokes subtype-specific behavior
        invokeSubtypeBehavior(peterParker);
        invokeSubtypeBehavior(normanOsborn);
    }
    
    public static void describeBeing(Being being) {
        System.out.println(being.toString());
    }
    
    public static void invokeSubtypeBehavior(Being being) {
        if (being instanceof SpiderMan) {
            ((SpiderMan) being).swingBetweenBuildings();
        } else if (being instanceof GreenGoblin) {
            System.out.println("Green Goblin is using his gadgets: " + ((GreenGoblin) being).getGadgets());
        }
    }
}
