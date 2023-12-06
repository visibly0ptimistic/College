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

public class Being {
    protected String name;
    protected int age;

    public Being(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
