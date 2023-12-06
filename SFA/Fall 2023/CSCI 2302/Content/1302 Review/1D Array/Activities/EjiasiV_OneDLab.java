/*
Victor Ejiasi
CSCI 2302
Lab 1

This program creates an array of characters and prints out the alphabet.
 */

public class EjiasiV_OneDLab {
    public static void main(String[] args) {
        // 1. Create the alphabet using a for loop
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        // 2. Print out the alphabet using a for each loop
        System.out.print("Alphabet: ");
        for (char c : alphabet) {
            System.out.print(c);
        }
        System.out.println();

        // 3. Print out the alphabet in reverse
        System.out.print("Alphabet in reverse: ");
        for (int i = alphabet.length - 1; i >= 0; i--) {
            System.out.print(alphabet[i]);
        }
        System.out.println();

        // 4. Print out the 10th character
        System.out.println("10th character: " + alphabet[9]);

        // 5. Print out the last character without hardcoding the numeric index value
        System.out.println("Last character: " + alphabet[alphabet.length - 1]);
    }
}
