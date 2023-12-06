/*
    Victor Ejiasi

    CSCI 2302-001

    Java version:  18

    Purpose: the Ejiasiv_ACI_Program class is used to create a SpiderMan and Green Goblin object and call their methods.

    Input: hard coded the values are declared in the code

    Output: outputs the details of the Being object.

    Other associated files: SpiderMan.java, GreenGoblin.java, Being.java, and Planet.java

    Sample Run: a SpiderMan and Green Goblin object are created and their methods are called.
*/

public class Ejiasiv_ACI_Program {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", "Milky Way");
        WebShooter standardWebShooter = new WebShooter("Standard WebShooter", 10);

        SpiderMan peterParker = new SpiderMan("Peter Parker", 25, 95, "Silk", earth, standardWebShooter);
        System.out.println(peterParker.toString());
        peterParker.makeSound();
        peterParker.modeOfMovement();

        GreenGoblin normanOsborn = new GreenGoblin("Norman Osborn", 45, "Pumpkin Bombs", "Take over the city", "Underground Lair", earth);
        System.out.println(normanOsborn.toString());
        normanOsborn.makeSound();
        normanOsborn.modeOfMovement();
    }
}


