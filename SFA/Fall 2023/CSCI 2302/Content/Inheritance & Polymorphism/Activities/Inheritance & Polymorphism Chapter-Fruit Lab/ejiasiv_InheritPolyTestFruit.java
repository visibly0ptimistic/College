/*
    Victor Ejiasi

    CSCI 2302-001

    Java version:  18

    Purpose: Demonstrates polymorphism and inheritance using Fruit, Apple, and GoldenDelicious classes.

    Input: Hard coded

    Output: To the screen/console

    Other associated files: Fruit.java, Apple.java, GoldenDelicious.java

    Sample Run: 
    Fruit: fruit
    Apple: apple
    Golden Delicious: Golden Delicious
    Apple: apple
    Golden Delicious: Golden Delicious
    java.lang.Object@15db9742
    Name: fruit
    Name: apple
    Name: Golden Delicious
    Name: apple
    Name: Golden Delicious
    true
    false
*/

public class mysfaUsername_InheritPolyTestFruit {
    public static void main(String[] args) {
        // a
        Fruit fruit = new Fruit("fruit");
        // b
        Apple apple = new Apple("apple");
        // c
        GoldenDelicious goldenDelicious = new GoldenDelicious("Golden Delicious");
        // d
        Fruit fruitApple = new Apple("apple");
        // e
        Apple appleGoldenDelicious = new GoldenDelicious("Golden Delicious");
        // f
        Object obj = new Object();

        // Invoke printFruit
        printFruit(fruit);
        printFruit(apple);
        printFruit(goldenDelicious);
        printFruit(fruitApple);
        printFruit(appleGoldenDelicious);
        printFruit(obj);

        // Invoke printName
        printName(fruit);
        printName(apple);
        printName(goldenDelicious);
        printName(fruitApple);
        printName(appleGoldenDelicious);

        // Bonus: Invoke equals method
        System.out.println(fruit.equals(new Fruit("fruit"))); // Should return true
        System.out.println(apple.equals(new Apple("orange"))); // Should return false
    }

    public static void printFruit(Object obj) {
        System.out.println(obj.toString());
    }

    public static void printName(Fruit fruit) {
        System.out.println("Name: " + fruit.name);
    }
}
