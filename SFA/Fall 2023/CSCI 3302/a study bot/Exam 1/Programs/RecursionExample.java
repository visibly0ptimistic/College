// main method: Demonstrates the usage of head and tail recursion methods to find the maximum value in an array.
// findMaxHead method: Implements head recursion to find the maximum value in the array.
// If the last element is reached, it returns the last element.
// Otherwise, it calls itself recursively with the next index and compares the current element with the maximum of the remaining elements on the way back.
// findMaxTail method: Implements tail recursion to find the maximum value in the array.
// It maintains a variable maxSoFar to keep track of the maximum value found in the processed elements.
// If the last element is reached, it returns the maximum between the last element and the maxSoFar.
// Otherwise, it calls itself recursively with the next index and the updated maxSoFar.



public class RecursionExample {

    public static void main(String[] args) {
        // Define an array of integers.
        int[] array = {1, 5, 3, 9, 2};

        // Find the maximum value in the array using head recursion and print the result.
        int maxHead = findMaxHead(array, 0); // Pass 0 as the starting index.
        System.out.println("Maximum using Head Recursion: " + maxHead);

        // Find the maximum value in the array using tail recursion and print the result.
        int maxTail = findMaxTail(array, 0, array[0]); // Pass 0 as the starting index and array[0] as the initial maximum.
        System.out.println("Maximum using Tail Recursion: " + maxTail);
    }

    /**
     * A head recursive function to find the maximum value in an array.
     *
     * @param arr   The input array.
     * @param index The current index being processed.
     * @return The maximum value in the array.
     */
    public static int findMaxHead(int[] arr, int index) {
        // Base Case: If the last element is reached, return the last element.
        if (index == arr.length - 1)
            return arr[index];

        // Recursive Case: Call the function with the next index.
        int max = findMaxHead(arr, index + 1);

        // Return the maximum between the current element and the maximum of the remaining elements.
        return Math.max(arr[index], max);
    }

    /**
     * A tail recursive function to find the maximum value in an array.
     *
     * @param arr     The input array.
     * @param index   The current index being processed.
     * @param maxSoFar The maximum value found so far.
     * @return The maximum value in the array.
     */
    public static int findMaxTail(int[] arr, int index, int maxSoFar) {
        // Base Case: If the last element is reached, return the maximum between the last element and the maxSoFar.
        if (index == arr.length - 1)
            return Math.max(arr[index], maxSoFar);

        // Update the maxSoFar by comparing it with the current element.
        int newMaxSoFar = Math.max(arr[index], maxSoFar);

        // Recursive Case: Call the function with the next index and the updated maxSoFar.
        return findMaxTail(arr, index + 1, newMaxSoFar);
    }
}
