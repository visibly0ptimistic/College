/**
 * Author: Hunter Havard / Victor Ejiasi
 * Date: 9/17/23
 * This class performs basic array operation on an array of numbers. All private
 * methods are done recursively.
 * 
 */
public class ArrayOps {

    private int[] nums; // the numbers on which we are performing the statistics

    /**
     * Constructs the object ready to integer data of the given
     * sample size
     * 
     * @param sampleSize - a positive integer
     */
    public ArrayOps(int sampleSize) {
        this.nums = new int[sampleSize];
    }

    /**
     * Sets a data point at a given index
     * 
     * @param index - index of the data point to set
     * @param value - value of the data point
     */
    public void set(int index, int value) {
        this.nums[index] = value;
    }

    /**
     * Gets a data point at a given index
     * 
     * @param index - an index in the range 0, 1, ..., this.nums.length-1
     * @return - a data point at the given index
     */
    public int get(int index) {
        return this.nums[index];
    }

    /**
     * Finds the sum total of all numbers in the data set.
     * 
     * @return - the sum of all numbers
     */
    public int total() {
        return this.findTotal(0);
    }

    private int findTotal(int index) {
        if (index == nums.length) {
            return 0;  // base case: if we have reached the end of the array, return 0
        }
        return nums[index] + findTotal(index + 1);  // recursive call: sum the current number and the result from the rest of the array
    }
    

    /**
     * Finds the maximum of all the numbers in the data set.
     * 
     * @return - the maximum data point
     */
    public int max() {
        return this.findMax(0);
    }

    private int findMax(int index) {
        if (index == nums.length - 1) {
            return nums[index];  // base case: return the last element if we've reached the end
        }
        return Math.max(nums[index], findMax(index + 1));  // recursive case: return the larger value between the current number and the result from the rest of the array
    }
    

    /**
     * This minimum of the data points.
     * 
     * @return - the minimum data point
     */
    public int min() {
        return this.findMin(0);
    }

    private int findMin(int index) {
        if (index == nums.length - 1) {
            return nums[index];  // base case: return the last element if we've reached the end
        }
        return Math.min(nums[index], findMin(index + 1));  // recursive case: return the smaller value between the current number and the result from the rest of the array
    }
    

    /**
     * Finds the the first location of a given data point.
     * 
     * @param num - the data point to look for
     * @return - the index of the data point or -1 if the
     *         data point is not in the set
     */
    public int indexOf(int num) {
        return this.findIndexOf(num, 0);
    }

    private int findIndexOf(int num, int index) {
        if (index == nums.length) {
            return -1;  // base case: if we've reached the end of the array and haven't found num
        }
        if (nums[index] == num) {
            return index;  // if the current element is equal to num, return the index
        }
        return findIndexOf(num, index + 1);  // recursive call with the next index
    }
    

    /**
     * Returns an array of the data points in sorted order.
     * 
     * @return - an array contaning all the data points
     *         sorted in ascending order
     */
    public void sort() {
        sortNums(0);
    }

    private void sortNums(int index) {
        if (index >= nums.length - 1) {
            return;  // base case: if we've reached the end of the array
        }
        
        int minIndex = findMinIndex(index);  // find the index of the minimum value from index to the end of the array
        swap(index, minIndex);  // swap the current value with the minimum value
        sortNums(index + 1);  // recursive call with the next index
    }
    
    private int findMinIndex(int start) {
        int minIndex = start;
        for (int i = start + 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex; // return the index of the minimum value
    }
    
    private void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    } // swap the values at indices i and j
    

    /**
     * Finds the average values of all the data points
     * 
     * @return - the average value of all data points in
     *         the set
     */
    public double average() {
        double total = findAvg(0);
        return total / nums.length;
    }
    
    private double findAvg(int index) {
        if (index == nums.length) {
            return 0;  // base case: if we've reached the end of the array, return 0
        }
        return nums[index] + findAvg(index + 1);  // recursive call: add the current number to the result from the rest of the array
    }
    

    /**
     * Creates a string representation of the data points in the format
     * [x1, x2, ...., xn]
     * 
     * @return - a string representation of all the data points
     */
    @Override
    public String toString() {
        return "[" + findString(0) + "]";
    }

    private String findString(int index) {
        if (index == nums.length - 1) {
            return String.valueOf(nums[index]);  // base case: if we've reached the last element, return its value as a string
        }
        return nums[index] + ", " + findString(index + 1);  // recursive call: concatenate the current number with the result from the rest of the array
    }
    

    /***
     * Finds the number of integers in the data set that are even.
     * 
     * @return - the number of even integers in the data set
     */
    public int numEven() {
        return this.findNumEven(0);
    }

    private int findNumEven(int index) {
        if (index == nums.length) {
            return 0;  // base case: if we've reached the end of the array
        }
        if (nums[index] % 2 == 0) {
            return 1 + findNumEven(index + 1);  // if the current number is even, add 1 to the result from the rest of the array
        }
        return findNumEven(index + 1);  // recursive call with the next index without adding to the count
    }
    

    /**
     * Finds the number of integers in the data set that are great than (>)
     * the given value.
     * 
     * @param value - threshold value for comparison
     * @return - the count of the number of integers in the data set that are
     *         > the given value
     */
    public int numOver(int value) {
        return this.findNumOver(value, 0);
    }

    private int findNumOver(int value, int index) {
        if (index == nums.length) {
            return 0;  // base case: if we've reached the end of the array
        }
        if (nums[index] > value) {
            return 1 + findNumOver(value, index + 1);  // if the current number is greater than the given value, add 1 to the result from the rest of the array
        }
        return findNumOver(value, index + 1);  // recursive call with the next index without adding to the count
    }
    

}
