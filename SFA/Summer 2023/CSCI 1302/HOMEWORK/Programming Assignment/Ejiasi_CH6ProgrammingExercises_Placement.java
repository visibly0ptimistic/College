/*
   Name: Victor Ejiasi
   Date: 06/26/2023
   Course Section: CSCI 1302
   Purpose of Program: Chapter 6 Programming Exercises Placement
*/
public class Ejiasi_CH6ProgrammingExercises_Placement {

    public static void main(String[] args) {
        // Corrected method headers
        one(5, 10);
        int result = thisone(3.14f);
        double value = yetanother();
        double calcResult = mycalc(2.5f, 1.8f);

        // Additional method headers
        char letterResult = firstOne(7);
        String wordResult = secondOne("Hello", "World");
        lastOne(5, 'A');

        // Corrected method invocations
        double x = max(5, 6);
        int y = max(4, 5);
        long small = max(2, 1);
        
        // Method calls validity and corrections
        double num1, num2, num3;
        int int1, int2, int3;
        
        System.out.println(cube(num1, num3, num2));
        double value1 = cube(num1, num2, num3);
        double value2 = cube(num1, int2, num3);
        double value3 = cube(2.0 * int1, num3, num1);
        
        String word;
        int a, b, c;
        char ch;

        word = theMethod(a, b, c, ch);
        c = theMethod(b, ch, word, a);
        System.out.println(theMethod(b, ch, word, a));
        
        // Method header receiving two numbers and a letter, returning a word
        String wordResult2 = myMethod(5, 10, 'C');
        
        // Overloading method headers
        boolean result1 = thisTime(1, 2, 3);
        boolean result2 = thisTime(1, 2, 3, 1.5);
        boolean result3 = thisTime(1, 2, 3, 1.5, 2.5);
    }

    // Corrected method headers
    public static void one(int a, int b) {
    }

    public static int thisone(float x) {
        return 0;
    }

    public static double yetanother() {
        return 0.0;
    }

    public static double mycalc(float x, float y) {
        return 0.0;
    }

    // Additional method headers
    public static char firstOne(int number) {
        return 'A';
    }

    public static String secondOne(String word1, String word2) {
        return "";
    }

    public static void lastOne(int number, char letter) {
    }

    // Corrected method header for max method
    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    // Method header receiving two numbers and a letter, returning a word
    public static String myMethod(double number1, double number2, char letter) {
        return "";
    }

    // Overloading method headers
    public static boolean thisTime(int num1, int num2, int num3) {
        return true;
    }

    public static boolean thisTime(int num1, int num2, int num3, double num4) {
        return true;
    }

    public static boolean thisTime(int num1, int num2, int num3, double num4, double num5) {
        return true;
    }

    // Method header for cube method
    public static double cube(double a, double b, double c) {
        return 0.0;
    }

    // Method header for theMethod
    public static int theMethod(int num4, char letter, String term, int num) {
        return 0;
    }
}