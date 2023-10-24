import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Ejiasi_CH3ProgrammingExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // boolean variables
        double gpa = 3.6;// assign GPA here
        boolean canGraduate = gpa >= 2.0;

        int age = 24;// assign age here
        boolean canVote = age >= 18;
        boolean canDrink = age >= 21;
        boolean canGetMedicare = age >= 65;
        boolean canDrive = age >= 16;

        boolean passedBar = false;// assign whether the person passed the bar here
        boolean canBeLawyer = passedBar;

        boolean hasLicense = true;// assign whether the person has a license here
        boolean canSellInsurance = hasLicense;

        // sorting numbers
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int[] nums = {num1, num2, num3};
        Arrays.sort(nums);
        System.out.println("Sorted numbers: " + nums[2] + ", " + nums[1] + ", " + nums[0]);

        // Go Jacks!
        System.out.println("Enter the home team score:");
        int home = scanner.nextInt();
        System.out.println("Enter the visitor team score:");
        int visitor = scanner.nextInt();
        if (home > visitor) {
            System.out.println("SFA wins! Go Jacks!");
        } else {
            System.out.println("Next time – Axe 'em Jacks!");
        }

        // Hi Lo Card Game
        int computerHand = random.nextInt(13) + 1;
        int playerHand = random.nextInt(13) + 1;
        if (playerHand > computerHand) {
            System.out.println("Player wins!");
        } else if (playerHand < computerHand) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("It's a tie!");
        }

        // degree plan – graduation
        System.out.println("Enter the number of hours you have earned:");
        int hours = scanner.nextInt();
        if (hours >= 95) {
            System.out.println("File for graduation & degree audit");
        } else if (hours >= 30) {
            System.out.println("File your degree plan");
        }

        // gas tank
        System.out.println("Enter the fuel level in your gas tank:");
        double fuel = scanner.nextDouble();
        if (fuel <= 0.2) {
            System.out.println("Refill");
        } else if (fuel <= 0.4) {
            System.out.println("Start looking for a gas station");
        } else {
            System.out.println("You are good to go!");
        }

        // pick 4 Lottery
        int[] quickPick = {random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10)};
        int[] winningNumbers = {1, 3, 5, 8};
        if (Arrays.equals(quickPick, winningNumbers)) {
            System.out.println("You won the lottery!");
        } else {
            System.out.println("Better luck next time!");
        }

        // course titles
        System.out.println("Enter a course number:");
        int courseNumber = scanner.nextInt();
        switch (courseNumber) {
            case 1300:
                System.out.println("Introduction to Problem Solving");
                break;
            case 1301:
                System.out.println("Introduction to Computing");
                break;
            case 1302:
                System.out.println("Computer Science Principles");
                break;
            case 2301:
                System.out.println("Introduction to Information Technology");
                break;
            case 2302:
                System.out.println("Computer Programming Principles");
                break;
            default:
                System.out.println("Invalid course number");
        }

        // letter grade
    System.out.println("Enter the desired letter grade for the course:");
    char grade = scanner.next().charAt(0);
    switch (grade) {
        case 'A':
            System.out.println("You need to earn between 1000 and 900 points");
            break;
        case 'B':
            System.out.println("You need to earn between 899 and 800 points");
            break;
        case 'C':
            System.out.println("You need to earn between 799 and 700 points");
            break;
        case 'D':
            System.out.println("You need to earn between 699 and 600 points");
            break;
        case 'F':
            System.out.println("You need to earn between 599 and 0 points");
            break;
        default:
            System.out.println("Invalid grade");
    }

    scanner.close();
}
}