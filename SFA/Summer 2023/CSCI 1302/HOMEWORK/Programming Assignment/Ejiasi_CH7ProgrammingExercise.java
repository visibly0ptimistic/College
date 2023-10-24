import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejiasi_CH7ProgrammingExercise {
    public static void main(String[] args) {
        // Declare and create the arrays
        String[] course = new String[5];
        String[] students = new String[35];
        double[] measurements;
        double[] weights;
        char[] grades = new char[150];
        char[] rating = new char[8745];
        char[] initial = new char[60];
        char[] letters;
        String[] orders;

        // Ask the size for the measurements array from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the measurements array: ");
        int measurementsSize = scanner.nextInt();
        measurements = new double[measurementsSize];

        // Read the size for the weights array from the pounds.txt file
        try {
            File file = new File("pounds.txt");
            Scanner fileScanner = new Scanner(file);
            int weightsSize = fileScanner.nextInt();
            weights = new double[weightsSize];
        } catch (FileNotFoundException e) {
            System.out.println("File not found: pounds.txt");
        }

        // Ask the size for the letters array from the user
        System.out.print("Enter the size of the letters array: ");
        int lettersSize = scanner.nextInt();
        letters = new char[lettersSize];

        // Read the size and data for the ages array from the ages.txt file
        try {
            File file = new File("ages.txt");
            Scanner fileScanner = new Scanner(file);
            int agesSize = fileScanner.nextInt();
            int[] ages = new int[agesSize];
            for (int i = 0; i < agesSize; i++) {
                ages[i] = fileScanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: ages.txt");
        }

        // Read the size and data for the numberLine array from the number.txt file
        try {
            File file = new File("number.txt");
            Scanner fileScanner = new Scanner(file);
            int numberLineSize = fileScanner.nextInt();
            int[] numberLine = new int[numberLineSize];
            for (int i = 0; i < numberLineSize; i++) {
                numberLine[i] = fileScanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: number.txt");
        }

        // Ask the size for the ascii array from the user and initialize the first character
        System.out.print("Enter the size of the ascii array: ");
        int asciiSize = scanner.nextInt();
        char[] ascii = new char[asciiSize];
        ascii[0] = '(';
    }
}