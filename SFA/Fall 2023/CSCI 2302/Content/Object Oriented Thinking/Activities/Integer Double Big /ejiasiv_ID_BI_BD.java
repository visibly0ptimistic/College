    /*
    Victor Ejiasi

    CSCI 2302-001
    
    Java version:  18
    
    Purpose:
    The program demonstrates the use of Java's primitive data types, wrapper classes,
    BigInteger, and BigDecimal. It reads various types of input values, parses them into appropriate data types, performs certain operations, and explains concepts like autoboxing, unboxing, and radix. The program prints the results of the operations and explanations to the screen.

    Input:
    1. "idbb.txt" containing string representations of numeric values.
    2. Hard coding, specific values are declared directly within the code.

    Output:
    The program prints parsed values, results of operations, and explanations of various concepts.

    Other associated files:
    1. "idbb.txt" - It is an input file that needs to be in the same directory as the program.

    Sample Run:
    The expected output of a sample run would be a series of printed statements, displaying parsed values, results of operations, and explanations of different concepts.
    
    
    */

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

// declare class name same as file name (must be public)
public class ejiasiv_ID_BI_BD {

    // declare main method (must be public) with String array as argument (args)
    public static void main(String[] args) {
        // 1. Display why Java uses primitive data types
        System.out.println("1. Java uses primitive data types due to performance considerations. "
                + "Primitive data types are more memory efficient and have faster processing times "
                + "compared to object/reference data types.");

        // 2. Display why the wrapper classes do not have no-arg constructors
        System.out.println("2. Wrapper classes do not have no-arg constructors because they are "
                + "immutable and need a value at the time of their creation.");

        try { // try-catch block to handle exceptions (file not found, etc.) when reading file
            Scanner fileScanner = new Scanner(new File("/Applications/College/SFA/Fall 2023/CSCI 2302/Content/Object Oriented Thinking/Activities/Integer Double Big /idbb.txt"));

            // 3. Parse String to Integer
            Integer intValue = Integer.parseInt(fileScanner.next());
            System.out.println("3. Parsed Integer value: " + intValue);

            // 4. Parse String to Double
            Double doubleValue = Double.parseDouble(fileScanner.next());
            System.out.println("4. Parsed Double value: " + doubleValue);

            // 5. Parse next four values with different radix
            int[] radixValues = new int[4];
            for (int i = 0; i < 4; i++) {
                radixValues[i] = Integer.parseInt(fileScanner.next(), Integer.parseInt(fileScanner.next()));
                System.out.println("5. Parsed value with radix: " + radixValues[i]);
            }

            // 6. Explain the radix argument
            System.out.println("6. The radix argument is used to specify the base of the numeral system to interpret the string.");

            // 7. Integer valueOf method
            Integer valueOfInt = Integer.valueOf("2302");
            System.out.println("7. Integer created using valueOf: " + valueOfInt);

            // 8. Integer valueOf method with non-numeric string
            try {
                Integer invalidValue = Integer.valueOf("lumberjacks");
                System.out.println("8. Invalid value: " + invalidValue);
            } catch (NumberFormatException e) {
                System.out.println("8. Invalid value 'lumberjacks'. Cannot parse to Integer.");
            }

            // 9. Double valueOf method
            Double valueOfDouble = Double.valueOf("2302.001");
            System.out.println("9. Double created using valueOf: " + valueOfDouble);

            // 10. Autoboxing Integer
            Integer autoBoxedInt = 2302;
            System.out.println("10. Autoboxed Integer: " + autoBoxedInt);

            // 11. Autoboxing Double
            Double autoBoxedDouble = 2302.123;
            System.out.println("11. Autoboxed Double: " + autoBoxedDouble);

            // 12. BigInteger from String
            BigInteger bigIntFromString = new BigInteger(fileScanner.next());
            System.out.println("12. BigInteger from String: " + bigIntFromString);

            // 13. BigInteger from int
            BigInteger bigIntFromInt = BigInteger.valueOf(fileScanner.nextInt());
            System.out.println("13. BigInteger from int: " + bigIntFromInt);

            // 14. Explain the difference between the variables from #12 & #13
            System.out.println("14. " + (bigIntFromString.equals(bigIntFromInt) ? "No difference" : "They are different"));

            // 15. BigDecimal from String
            BigDecimal bigDecimalFromString = new BigDecimal(fileScanner.next());
            System.out.println("15. BigDecimal from String: " + bigDecimalFromString);

            // 16. BigDecimal from double
            BigDecimal bigDecimalFromDouble = BigDecimal.valueOf(fileScanner.nextDouble());
            System.out.println("16. BigDecimal from double: " + bigDecimalFromDouble);

            // 17. Explain the difference between the variables from #15 & #16
            System.out.println("17. " + (bigDecimalFromString.compareTo(bigDecimalFromDouble) == 0 ? "No difference" : "They are different"));

            // 18. Divide the variables from #15 & #16 and print the result
            try {
                System.out.println("18. Division Result: " + bigDecimalFromString.divide(bigDecimalFromDouble));
            } catch (ArithmeticException e) {
                System.out.println("18. Cannot perform division. Non-terminating decimal.");
            }

            // 19. Compare the variables from #15 & #16 using the compareTo method
            int compareResult = bigDecimalFromString.compareTo(bigDecimalFromDouble);
            System.out.println("19. Comparison Result: " + (compareResult == 0 ? "Equal" : (compareResult < 0 ? "Lesser" : "Greater")));

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
