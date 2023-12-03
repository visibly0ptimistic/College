// The funcA and funcB illustrate indirect recursion, where each function calls the other one in turn until a base case is met.

// The fib function is an example of using memoization to optimize the calculation of Fibonacci numbers by storing previously calculated values in an array to avoid redundant calculations.

// The parseNestedList function is an example of parsing a nested list structure by checking the type of each item in the list and calling the function recursively if the item is also a list, or printing the item if it is a leaf element.


import java.util.*;

public class MixedExample {

    /**
     * Function A in Indirect Recursion
     * @param n a positive integer
     */
    public static void funcA(int n) {
        if (n <= 0)
            return;
        System.out.println("A: " + n); // print the value of n in function A
        funcB(n - 1); // call function B with the decremented value of n
    }

    /**
     * Function B in Indirect Recursion
     * @param n a positive integer
     */
    public static void funcB(int n) {
        if (n <= 1)
            return;
        System.out.println("B: " + n); // print the value of n in function B
        funcA(n - 2); // call function A with the value of n decreased by 2
    }

    /**
     * Fibonacci function with Memoization
     * @param n    the n-th number in Fibonacci sequence
     * @param memo an array used to store already calculated Fibonacci numbers
     * @return the n-th Fibonacci number
     */
    public static int fib(int n, int[] memo) {
        if (n <= 1)
            return n; // base case, return n if it is 0 or 1
        if (memo[n] == 0) 
            memo[n] = fib(n - 1, memo) + fib(n - 2, memo); // if fib(n) is not calculated, calculate and store in memo
        return memo[n]; // return the stored value of fib(n)
    }

    /**
     * Parses Nested List structure and prints elements
     * @param list a nested list object
     */
    public static void parseNestedList(List<Object> list) {
        for (Object item : list) {
            if (item instanceof List) {
                // if item is a List, call parseNestedList recursively
                parseNestedList((List<Object>) item);
            } else {
                // if item is not a List, print the item
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        // Testing Indirect Recursion
        System.out.println("Indirect Recursion Output:");
        funcA(5);

        // Testing Fibonacci with Memoization
        int n = 10;
        int[] memo = new int[n + 1];
        System.out.println("\nFibonacci with Memoization Output:");
        System.out.println(fib(n, memo));  // Output: 55

        // Testing Nested Structure Parsing
        List<Object> nestedList = Arrays.asList(1, Arrays.asList(2, Arrays.asList(3, 4)), 5);
        System.out.println("\nNested Structure Parsing Output:");
        parseNestedList(nestedList);  // Output: 1 2 3 4 5
    }
}
