/*
   Name: Victor Ejiasi
   Date: 06/26/2023
   Course Section: CSCI 1302
   Purpose of Program: Chapter 6 Programming Assignment
*/

import java.util.Scanner;

public class Ejiasi_CH6ProgrammingAssignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the 1800 phone number (with a space after the 1800): ");
        int number = scanner.nextInt();
        String logo = scanner.nextLine().trim();

        String translatedNumber = convertToDigitPhoneNumber(logo);
        System.out.println("That phone number is: " + number + " " + translatedNumber);
    }

    public static String convertToDigitPhoneNumber(String stringContainingLetters) {
        String stringContainingNumbers = "";

        for (int i = 0; i < stringContainingLetters.length(); i++) {
            char c = stringContainingLetters.charAt(i);
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                if (c >= 'a' && c <= 'c')
                    stringContainingNumbers += "2";
                else if (c >= 'd' && c <= 'f')
                    stringContainingNumbers += "3";
                else if (c >= 'g' && c <= 'i')
                    stringContainingNumbers += "4";
                else if (c >= 'j' && c <= 'l')
                    stringContainingNumbers += "5";
                else if (c >= 'm' && c <= 'o')
                    stringContainingNumbers += "6";
                else if (c >= 'p' && c <= 's')
                    stringContainingNumbers += "7";
                else if (c >= 't' && c <= 'v')
                    stringContainingNumbers += "8";
                else if (c >= 'w' && c <= 'z')
                    stringContainingNumbers += "9";
            } else {
                stringContainingNumbers += c;
            }
        }

        return stringContainingNumbers;
    }
}
