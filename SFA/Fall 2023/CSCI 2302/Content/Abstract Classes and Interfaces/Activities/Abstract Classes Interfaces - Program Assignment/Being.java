/*
    Victor Ejiasi

    CSCI 2302-001

    Java version:  18

    Purpose: Being class that represents a being with a name and age.

    Input: hard coded the values are declared in the code

    Output: outputs the details of the Being object.

    Other associated files: SpiderMan.java, GreenGoblin.java, and ejiasiv_InheritanceAndPolymorphismProgram.java

    Sample Run: Being [name=Peter Parker, age=25]
*/

public abstract class Being {
    protected String name;
    protected int age;
    protected Planet homePlanet;

    public Being(String name, int age, Planet homePlanet) {
        this.name = name;
        this.age = age;
        this.homePlanet = homePlanet;
    }

    public abstract void makeSound();  // Abstract method

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Being [name=" + this.name + ", age=" + this.age + "]";
    }
}
