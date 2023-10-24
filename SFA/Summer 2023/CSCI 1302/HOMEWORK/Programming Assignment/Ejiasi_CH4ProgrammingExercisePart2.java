/*
   Name: Victor Ejiasi
   Date: 06/11/2023
   Course Section: CSCI 1302
   Purpose of Program: Chapter 4 Programming Exercises Part 2

*/
import java.util.Scanner;

public class Ejiasi_CH4ProgrammingExercisePart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read in word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println("Word: " + word);
        System.out.println("Length: " + word.length());

        // Read in group of words
        System.out.print("Enter a group of words: ");
        String groupOfWords = scanner.nextLine();
        System.out.println("Group of Words: " + groupOfWords);
        System.out.println("Length: " + groupOfWords.length());

        // Create a substring
        String word2 = groupOfWords.substring(0, word.length());
        System.out.println("Word2: " + word2);

        // Compare word and word2
        System.out.println("Is word the same as word2? " + word.equals(word2));
        System.out.println("Is word the same as word2 (case-insensitive)? " + word.equalsIgnoreCase(word2));
        System.out.println("Is word greater than word2? " + (word.compareTo(word2) > 0));
        System.out.println("Is word and word2 start with the same letter? " + (word.charAt(0) == word2.charAt(0)));
        System.out.println("Is word and word2 end with the same letter? " + (word.charAt(word.length() - 1) == word2.charAt(word2.length() - 1)));

        // Concatenate word and word2
        String joinedWords = word.concat(word2);
        System.out.println("Joined Words: " + joinedWords);

        // Finding substrings
        System.out.println("First occurrence of 'a' in joinedWords: " + joinedWords.indexOf('a'));
        System.out.println("Last occurrence of 'z' in joinedWords: " + joinedWords.lastIndexOf('z'));
        System.out.println("First occurrence of 'abc' in joinedWords: " + joinedWords.indexOf("abc"));
        System.out.println("Last occurrence of 'xyz' in joinedWords: " + joinedWords.lastIndexOf("xyz"));

        // Formatting
        System.out.printf("Formatted joinedWords: %20s%n", joinedWords);
        System.out.printf("Formatted word: %-20s%n", word);
        System.out.printf("Formatted word2: %-20s%n", word2);
        System.out.printf("Formatted $23.65433: %.2f%n", 23.65433);
    }
}
