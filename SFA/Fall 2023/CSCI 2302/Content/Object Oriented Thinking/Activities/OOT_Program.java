/*
    Victor Ejiasi

    CSCI 2302-001

    Java version:  18

    Purpose: Testing and demonstrating the functionality of SpiderMan and WebShooter classes.

    Input: hard coded the values are declared in the code

    Output: to the console

    Other associated files: SpiderMan.java, WebShooter.java

    Sample Run: Spider-Man introduces himself, uses his web shooter, swings between buildings, saves people, fights villains, and outputs his state along with the state of his web shooter.
*/

public class OOT_Program {
    public static void main(String[] args) {
        WebShooter myWebShooter = new WebShooter("Standard WebShooter", 100);
        SpiderMan peterParker = new SpiderMan("Peter Parker", 8, "sticky", myWebShooter);

        peterParker.introduce();
        peterParker.useTool();
        peterParker.swingBetweenBuildings();
        peterParker.savePeople();
        peterParker.fightVillains();

        System.out.println(peterParker);
        System.out.println(myWebShooter);
    }
}
