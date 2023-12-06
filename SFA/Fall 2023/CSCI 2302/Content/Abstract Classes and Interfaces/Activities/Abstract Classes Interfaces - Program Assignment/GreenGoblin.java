/*
    Victor Ejiasi

    CSCI 2302-001

    Java version:  18

    Purpose: This class is a subclass of Being and is used to create a Green Goblin object.

    Input: hard coded the values are declared in the code

    Output: outputs the Green Goblin's gadgets, motive, and hideout

    Other associated files: Being.java, SpiderMan.java, and ejiasiv_InheritanceAndPolymorphismProgram.java

    Sample Run: GreenGoblin [name=Norman Osborn, age=45, gadgets=Pumpkin Bombs, motive=Revenge, hideout=Abandoned Oscorp Facility]
*/

public class GreenGoblin extends Being implements Movement {
    private String gadgets;
    private String motive;
    private String hideout;

    public GreenGoblin(String name, int age, String gadgets, String motive, String hideout, Planet homePlanet) {
        super(name, age, homePlanet); 
        this.gadgets = gadgets;
        this.motive = motive;
        this.hideout = hideout;
    }

    public String getGadgets() {
        System.out.println("Green Goblin's gadgets: " + this.gadgets);
        return this.gadgets;
    }

    public String getMotive() {
        return this.motive;
    }

    public String getHideout() {
        System.out.println("Green Goblin's hideout: " + this.hideout);
        return this.hideout;
    }

    @Override
    public String toString() {
        return "GreenGoblin [name=" + this.name + ", age=" + this.age + ", gadgets=" + this.gadgets + ", motive=" + this.motive + ", hideout=" + this.hideout + ", homePlanet=" + this.homePlanet.toString() + "]";
    }

    @Override
    public void makeSound() {
        System.out.println("Laughing menacingly...");
    }

    @Override
    public void modeOfMovement() {
        System.out.println("Flying on the glider.");
    }
}
