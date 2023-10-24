    /*
   Name: Victor Ejiasi
   Date: 06/16/2023
   Course Section: CSCI 1302
   Purpose of Program: CH4 Programming Assignment
*/

import java.util.Scanner;

public class Ejiasi_CH4ProgrammingAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = scanner.nextLine().trim();

        System.out.println("Please enter a whole number between 0 and 9: ");
        String numberInput = scanner.nextLine();

        int number;
        if (isDigit(numberInput)) {
            number = Integer.parseInt(numberInput);
            System.out.println(number + " is read in and stored in memory as an int value.");
        } else {
            System.out.println("Invalid input for a number.");
        }
    }

    private static boolean isDigit(String input) {
        return input.matches("\\d");
    }
}

class OctalPermissionChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three digits for the octal permission command: ");
        int digit1 = scanner.nextInt();
        int digit2 = scanner.nextInt();
        int digit3 = scanner.nextInt();

        boolean isValidOctal = checkValidOctal(digit1, digit2, digit3);

        if (isValidOctal) {
            System.out.println("Yes, the input is a valid octal number for the chmod command.");
        } else {
            System.out.println("No, the input is not a valid octal number.");
        }
    }

    private static boolean checkValidOctal(int digit1, int digit2, int digit3) {
        boolean isValid = true;

        if (digit1 < 0 || digit1 > 7 || digit2 < 0 || digit2 > 7 || digit3 < 0 || digit3 > 7) {
            isValid = false;
        }

        return isValid;
    }
}

class IPAddressValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first octet: ");
        int octet1 = scanner.nextInt();
        System.out.println("Please enter the second octet: ");
        int octet2 = scanner.nextInt();
        System.out.println("Please enter the third octet: ");
        int octet3 = scanner.nextInt();
        System.out.println("Please enter the fourth octet: ");
        int octet4 = scanner.nextInt();

        boolean isValidIP = checkValidIPAddress(octet1, octet2, octet3, octet4);

        if (isValidIP) {
            System.out.println("Valid IP Address: " + octet1 + "." + octet2 + "." + octet3 + "." + octet4);
        } else {
            System.out.println("Invalid IP Address: " + octet1 + "." + octet2 + "." + octet3 + "." + octet4);
            checkInvalidOctets(octet1, octet2, octet3, octet4);
        }
    }

    private static boolean checkValidIPAddress(int octet1, int octet2, int octet3, int octet4) {
        return (octet1 >= 0 && octet1 <= 255)
                && (octet2 >= 0 && octet2 <= 255)
                && (octet3 >= 0 && octet3 <= 255)
                && (octet4 >= 0 && octet4 <= 255);
    }

    private static void checkInvalidOctets(int octet1, int octet2, int octet3, int octet4) {
        if (octet1 < 0 || octet1 > 255) {
            System.out.println("1st octet, " + octet1 + ", is incorrect.");
        }
        if (octet2 < 0 || octet2 > 255) {
            System.out.println("2nd octet, " + octet2 + ", is incorrect.");
        }
        if (octet3 < 0 || octet3 > 255) {
            System.out.println("3rd octet, " + octet3 + ", is incorrect.");
        }
        if (octet4 < 0 || octet4 > 255) {
            System.out.println("4th octet, " + octet4 + ", is incorrect.");
        }
    }
}

class UserInputParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = scanner.nextLine().trim();

        System.out.println("Please enter a whole number between 0 and 9: ");
        String numberInput = scanner.nextLine();

        int number;
        if (isDigit(numberInput)) {
            number = Integer.parseInt(numberInput);
            System.out.println(number + " is read in and stored in memory as an int value.");
        } else {
            System.out.println("Invalid input for a number.");
        }
    }

    private static boolean isDigit(String input) {
        return input.matches("\\d");
    }
}

class WordMixer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = scanner.nextLine();

        String mixedWord = mixWord(word);
        System.out.println("Mixed word: " + mixedWord);
    }

    private static String mixWord(String word) {
        int length = word.length();
        int halfLength = length / 2;

        String frontHalf = word.substring(0, halfLength);
        String backHalf = word.substring(halfLength);

        return backHalf + frontHalf;
    }
}
