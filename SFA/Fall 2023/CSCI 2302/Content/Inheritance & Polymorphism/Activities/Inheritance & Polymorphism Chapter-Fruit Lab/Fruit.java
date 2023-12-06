/*
    Victor Ejiasi

    CSCI 2302-001

    Java version:  18

    Purpose: Defines a basic Fruit class with a name attribute.

    Input: Hard coded

    Output: To the console

    Other associated files: Apple.java, GoldenDelicious.java, ejiasiv_InheritPolyTestFruit.java

    Sample Run: Not applicable this is a base class.
*/

public class Fruit {
    protected String name;

    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit: " + name;
    }

    public boolean equals(Fruit other) {
        return this.name.equals(other.name);
    }
}
