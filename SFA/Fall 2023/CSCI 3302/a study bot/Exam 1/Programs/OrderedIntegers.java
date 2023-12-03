// Importing necessary libraries
import java.util.ArrayList; // For using ArrayList data structure
import java.io.DataInputStream; // For reading binary file
import java.io.FileInputStream; // For file input stream
import java.io.IOException; // For handling input-output exceptions

// Defining a public class OrderedIntegers
public class OrderedIntegers {
    
    // Declaring a private ArrayList to hold Integer values
    private ArrayList<Integer> numbers; // Encapsulation: not accessible from outside this class

    // Constructor to initialize the ArrayList
    public OrderedIntegers() {
        this.numbers = new ArrayList<>(); // Initializing the numbers ArrayList
    }

    // Method to get the size of the ArrayList
    public int getSize() {
        return this.numbers.size(); // Returning the size of numbers ArrayList
    }

    // Method to get a value from the ArrayList at a given index
    public int getValue(int index) {
        // Checking if index is valid
        if (index < 0 || index >= this.numbers.size()) {
            throw new OrderedIntegersException("Index out of range."); // Throwing exception if index is invalid
        }
        return this.numbers.get(index); // Returning the value at the specified index
    }

    // Method to add a value to the ArrayList while maintaining the ascending order
    public void addValue(int newNumber) {
        int index = 0;
        // Finding the correct position to insert newNumber in ascending order
        while (index < this.numbers.size() && this.numbers.get(index) < newNumber) {
            index++; // Incrementing index to traverse through the ArrayList
        }
        this.numbers.add(index, newNumber); // Adding the newNumber at the found index
    }

    // Method to remove a value from the ArrayList at a given index
    public void removeValue(int index) {
        // Checking if index is valid
        if (index < 0 || index >= this.numbers.size()) {
            throw new OrderedIntegersException("Index out of range."); // Throwing exception if index is invalid
        }
        this.numbers.remove(index); // Removing the value at the specified index
    }

    // Method to load integer values from a binary file and add them to the ArrayList
    public void loadFileData(String filename) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            // Reading integers from file until no more data is available
            while (dis.available() > 0) {
                int number = dis.readInt(); // Reading an integer from the binary file
                addValue(number); // Adding the read integer to the ArrayList in ascending order
            }
        } catch (IOException ex) {
            // Handling exceptions related to file reading
            throw new OrderedIntegersException("Error reading from the file."); // Throwing custom exception on file reading error
        }
    }

    // Overriding toString() method to return a String representation of the ArrayList
    @Override
    public String toString() {
        return this.numbers.toString(); // Returning String representation of numbers ArrayList
    }

    // Overriding equals() method to compare two OrderedIntegers objects
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof OrderedIntegers)) return false; // Checking if the passed object is of type OrderedIntegers
        OrderedIntegers secondList = (OrderedIntegers) o; // Casting Object to OrderedIntegers
        return this.numbers.equals(secondList.numbers); // Comparing the numbers ArrayList of both objects
    }

    // Main method to run the program
    public static void main(String[] args) {
        OrderedIntegers ordered = new OrderedIntegers(); // Creating an instance of OrderedIntegers
        ordered.loadFileData("numbers_test.bin"); // Loading data from a binary file into the instance
        // Printing the ordered integers to the console
        System.out.println("Ordered integers: " + ordered); 
    }
}
