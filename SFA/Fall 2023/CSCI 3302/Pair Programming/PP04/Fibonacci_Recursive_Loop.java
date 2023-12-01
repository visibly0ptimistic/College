/* 
    Hunter Havard / Victor Ejiasi

    10/25/2023

    CSCI 3302 Section 002

    PP04

    Files: none

    Purpose: This program computes the Nth Fibonacci number using both a recursive and loop method. It then compares the time it takes to compute the Nth Fibonacci number using each method.
*/


public class Fibonacci_Recursive_Loop {
    // Recursive version with memoization
    private static long fib_recursive(long n, long[] memo) {
        if (memo[(int) n] != 0) {
            return memo[(int) n];
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        memo[(int) n] = fib_recursive(n - 1, memo) + fib_recursive(n - 2, memo);
        return memo[(int) n];
    }

    // Loop version
    private static long fib_loop(long n) {
        long prev = 1;
        long current = 1;
        for (int i = 2; i < n; i++) {
            long temp = current;
            current = prev + current;
            prev = temp;
        }
        return current;
    }

    public static void main(String[] args) {
        // Initialize the array for memoization
        long[] memo = new long[51];
        
        // Compute and time the Fibonacci numbers for N = 10, 20, 30, 40, 50
        int[] testValues = {10, 20, 30, 40, 50};
        for (int n : testValues) {
            // Measure time for the recursive version
            long start_time = System.nanoTime();
            long fib_recursive_result = fib_recursive(n, memo);
            // System.out.println("Fibonacci Number (Recursive): " + fib_recursive_result);
            
            long end_time = System.nanoTime();
            long recursive_time = end_time - start_time;

            // Measure time for the loop version
            start_time = System.nanoTime();
            long fib_loop_result = fib_loop(n);
            // System.out.println("Fibonacci Number (Loop): " + fib_loop_result);
            
            end_time = System.nanoTime();
            long loop_time = end_time - start_time;

            // Print the results
            System.out.println("N = " + n);
            System.out.println("Time to Compute Recursively: " + recursive_time + " ns");
            System.out.println("Time to Compute with Loop: " + loop_time + " ns");
            System.out.println();
        }
    }
}
