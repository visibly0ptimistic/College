/*
    Victor Ejiasi

    CSCI 2302-001

    Java version:  18

    Purpose: Extends the Apple class to define a GoldenDelicious class.

    Input: Hard coded

    Output: To the screen

    Other associated files: Fruit.java, Apple.java, ejiasiv_InheritPolyTestFruit.java

    Sample Run: Not applicable this is an extended class.
*/
public class GoldenDelicious extends Apple {
    public GoldenDelicious(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Golden Delicious: " + name;
    }
}
