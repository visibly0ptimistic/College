/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose:  This program serves two main functions. The first is to validate phone numbers input by the user according to a specific format (###-###-####). The second is to validate license plate formats stored in a text file (regexlab.txt), with a pattern (AAA 1111).
   
   Input:  User input for phone numbers is collected from the console. License plate data is read from regexlab.txt.
   
   Output:  Validation results for phone numbers and license plates are displayed on the console/screen.
   
   Other associated files: regexlab.txt
   
   Sample Run:  
           1. The program prompts the user to input a phone number. 
           2. It then validates this phone number and displays the result on the screen.
           3. The program reads license plates from regexlab.txt.
           4. It validates these license plates and displays the validation results on the screen.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ejiasiv_regexLab {
    public static void main(String[] args) {
        // Phone number validation
        phoneNumberValidation();

        // License plate validation
        licensePlateValidation();
    }

    private static void phoneNumberValidation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your phone number:");
        String phoneNumber = scanner.nextLine();

        if (phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}")) {
            System.out.println(phoneNumber + " is a valid phone number format");
        } else {
            System.out.println(phoneNumber + " is not a valid phone number format");
        }
    }

    private static void licensePlateValidation() {
        try {
            File file = new File("/Applications/College/SFA/Fall 2023/CSCI 2302/Content/Object Oriented Thinking/Activities/Regex/regex.txt");
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String licensePlate = fileScanner.nextLine();
                if (licensePlate.matches("[A-Z0-9]{3} [A-Z0-9]{4}")) {
                    System.out.println("The proposed license plate is " + licensePlate);
                    System.out.println("It is a valid license plate.");
                } else {
                    System.out.println("The proposed license plate is " + licensePlate);
                    System.out.println("It is not a valid license plate.");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please make sure 'regex.txt' exists in the project directory.");
        }
    }
}
