import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejiasi_CH7ProgrammingAssignment {
    public static void main(String[] args) {
        // Find the longest word in the list
        String longestWord = findLongestWord("spellingList.txt");
        System.out.println("The hardest word in the list is: " + longestWord + " with a length of " + longestWord.length());

        // Print the elements of the array backwards (String version)
        String[] words = readWordsFromFile("wordlist.txt");
        writeWordsBackwardsToFile(words, "backwards_words.txt");

        // Print the elements of the array backwards (int version)
        int[] numbers = readNumbersFromFile("numberlist.txt");
        writeNumbersBackwardsToFile(numbers, "backwards_numbers.txt");
    }

    public static String findLongestWord(String filename) {
        String longestWord = "";
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            int size = scanner.nextInt();
            String[] words = new String[size];
            scanner.nextLine(); // Consume the newline character after the size

            for (int i = 0; i < size; i++) {
                words[i] = scanner.nextLine();
                if (words[i].length() > longestWord.length()) {
                    longestWord = words[i];
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
        return longestWord;
    }

    public static String[] readWordsFromFile(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            int size = scanner.nextInt();
            String[] words = new String[size];
            scanner.nextLine(); // Consume the newline character after the size

            for (int i = 0; i < size; i++) {
                words[i] = scanner.nextLine();
            }
            scanner.close();
            return words;
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
        return null;
    }

    public static int[] readNumbersFromFile(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            int size = scanner.nextInt();
            int[] numbers = new int[size];
            scanner.nextLine(); // Consume the newline character after the size

            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }
            scanner.close();
            return numbers;
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
        return null;
    }

    public static void writeWordsBackwardsToFile(String[] words, String filename) {
        try {
            PrintWriter writer = new PrintWriter(filename);
            for (String word : words) {
                writer.println(reverseString(word));
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + filename);
        }
    }

    public static void writeNumbersBackwardsToFile(int[] numbers, String filename) {
        try {
            PrintWriter writer = new PrintWriter(filename);
            for (int i = numbers.length - 1; i >= 0; i--) {
                writer.println(reverseString(Integer.toString(numbers[i])));
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + filename);
        }
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
