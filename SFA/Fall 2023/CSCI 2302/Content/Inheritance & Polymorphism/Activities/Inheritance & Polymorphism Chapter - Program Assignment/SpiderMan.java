/*
    Victor Ejiasi

    CSCI 2302-001

    Java version:  18

    Purpose: Represents Spider-Man, his states and behaviors.

    Input: hard coded the values are declared in the code

    Output: to the console

    Other associated files: WebShooter.java, Being.java, and ejiasiv_InheritanceAndPolymorphismProgram.java

    Sample Run: SpiderMan [name=Peter Parker, agilityLevel=9, webType=sticky, tool=WebShooter [name=WebShooter, webCapacity=9]]
*/


public class SpiderMan extends Being{
    private int agilityLevel;
    private String webType;
    private WebShooter tool;

    public SpiderMan(String name, int age, int agilityLevel, String webType, WebShooter tool) {
        super(name, age);  // Call Being's constructor
        this.agilityLevel = agilityLevel;
        this.webType = webType;
        this.tool = tool;
    }

    public void introduce() {
        System.out.println("I am " + this.name + ", your friendly neighborhood Spider-Man!");
    }

    public void useTool() {
        this.tool.action();
    }

    public void swingBetweenBuildings() {
        System.out.println(this.name + " is swinging between buildings with agility level " + this.agilityLevel + "!");
    }

    public void savePeople() {
        System.out.println(this.name + " is saving people in distress!");
    }

    public void fightVillains() {
        System.out.println(this.name + " is fighting villains with his " + this.webType + " webs!");
    }

    // Accessors and mutators for SpiderMan properties here...

    @Override
    public String toString() {
        return "SpiderMan [name=" + this.name + ", agilityLevel=" + this.agilityLevel + ", webType=" + this.webType + ", tool=" + this.tool + "]";
    }
}
