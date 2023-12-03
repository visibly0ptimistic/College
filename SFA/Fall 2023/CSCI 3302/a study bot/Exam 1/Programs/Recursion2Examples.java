public class Recursion2Examples {

    private int[] intArray = {23, 34, 45, 56, 67, 78};

    // Towers of Hanoi
    public static void solveHanoi(int n, String startPole, String intermediatePole, String endPole) {
        if (n == 0) return;
        solveHanoi(n - 1, startPole, endPole, intermediatePole);
        System.out.println("Move disk " + n + " from " + startPole + " to " + endPole);
        solveHanoi(n - 1, intermediatePole, startPole, endPole);
    }

    // Head Recursion to find max
    private int findMaxHR(int index) {
        if (index == intArray.length - 1)
            return intArray[index];
        else {
            int maxFromRest = findMaxHR(index + 1);
            if (maxFromRest > intArray[index])
                return maxFromRest;
            else
                return intArray[index];
        }
    }

    public int findMaxHR() {
        return findMaxHR(0);
    }

    // Tail Recursion to find max
    private int findMaxTR(int index, int maxSoFar) {
        if (index == intArray.length)
            return maxSoFar;
        else {
            if (intArray[index] > maxSoFar)
                return findMaxTR(index + 1, intArray[index]);
            else
                return findMaxTR(index + 1, maxSoFar);
        }
    }

    public int findMaxTR() {
        return findMaxTR(0, intArray[0]);
    }

    // Binary Search
    private static int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int x) {
        return binarySearch(arr, 0, arr.length - 1, x);
    }

    // Sum by Head Recursion
    private int sumByHead(int index) {
        if (index == intArray.length - 1)
            return intArray[index];
        else
            return intArray[index] + sumByHead(index + 1);
    }

    public int sumByHead() {
        return sumByHead(0);
    }

    // Sum by Tail Recursion
    private int sumByTail(int index, int s) {
        if (index == intArray.length - 1)
            return s + intArray[index];
        else
            return sumByTail(index + 1, s + intArray[index]);
    }

    public int sumByTail() {
        return sumByTail(0, 0);
    }

    public static void main(String[] args) {
        Recursion2Examples examples = new Recursion2Examples();

        // Solving Towers of Hanoi
        System.out.println("Towers of Hanoi Solution:");
        solveHanoi(3, "A", "B", "C");

        // Finding Maximum using Head Recursion
        System.out.println("\nMaximum using Head Recursion: " + examples.findMaxHR());

        // Finding Maximum using Tail Recursion
        System.out.println("Maximum using Tail Recursion: " + examples.findMaxTR());

        // Performing Binary Search
        int[] arr = {23, 34, 45, 56, 67, 78};
        int searchElement = 45;
        System.out.println("Position of " + searchElement + " in array: " + binarySearch(arr, searchElement));

        // Calculating Sum by Head Recursion
        System.out.println("Sum by Head Recursion: " + examples.sumByHead());

        // Calculating Sum by Tail Recursion
        System.out.println("Sum by Tail Recursion: " + examples.sumByTail());
    }
}
