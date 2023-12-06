/*
    Victor Ejiasi

    CSCI 2302-001

    Java version:  18

    Purpose: Extends the Fruit class to define an Apple class.

    Input: Hard coded

    Output: To the console

    Other associated files: Fruit.java, GoldenDelicious.java, ejiasiv_InheritPolyTestFruit.java

    Sample Run: Not applicable this is an extended class.
*/

public class Apple extends Fruit {
    public Apple(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Apple: " + name;
    }
}
