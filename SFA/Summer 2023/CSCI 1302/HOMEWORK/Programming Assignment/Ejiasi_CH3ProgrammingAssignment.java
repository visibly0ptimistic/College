import java.util.Random;

public class Ejiasi_CH3ProgrammingAssignment {
    public static void main(String[] args) {
        Random random = new Random();

        // The Liberty Bell Machine
        System.out.println("Welcome! Let's spin the Liberty Bell Machine and see if you are lucky!");
        System.out.println("Bells are ones, horseshoes are twos, and stars are threes");

        int reelOne = random.nextInt(3) + 1;
        int reelTwo = random.nextInt(3) + 1;
        int reelThree = random.nextInt(3) + 1;

        System.out.println("Reel one is: " + reelOne);
        System.out.println("Reel two is: " + reelTwo);
        System.out.println("Reel three is: " + reelThree);

        if (reelOne == 1 && reelTwo == 1 && reelThree == 1) {
            System.out.println("Congratulations! You won 20 points with 3 bells!");
        } else if (reelOne == 2 && reelTwo == 2 && reelThree == 2) {
            System.out.println("Congratulations! You won 10 points with 3 horseshoes!");
        } else if ((reelOne == 2 && reelTwo == 2 && reelThree == 3) || (reelOne == 2 && reelTwo == 3 && reelThree == 2) || (reelOne == 3 && reelTwo == 2 && reelThree == 2)) {
            System.out.println("Congratulations! You won 5 points with 2 horseshoes and 1 star!");
        } else {
            System.out.println("Sorry, better luck next time!");
        }

        System.out.println("Thanks for playing the Liberty Bell!");

        // Texas Pick 3
        System.out.println("\nWelcome to Texas Pick 3!");
        System.out.println("Let's do a quick pick and check to see if you win!");

        int[] quickPickNumbers = {random.nextInt(10), random.nextInt(10), random.nextInt(10)};
        int[] drawNumbers = {2, 7, 4}; // Hardcoded draw numbers

        System.out.println("Your quick pick numbers are: " + quickPickNumbers[0] + ", " + quickPickNumbers[1] + ", " + quickPickNumbers[2] + ".");
        System.out.println("The Draw Number are: " + drawNumbers[0] + ", " + drawNumbers[1] + ", " + drawNumbers[2] + ".");

        if (quickPickNumbers[0] == drawNumbers[0] && quickPickNumbers[1] == drawNumbers[1] && quickPickNumbers[2] == drawNumbers[2]) {
            System.out.println("Congratulations! You won $250.00 with an exact order match!");
        } else if ((quickPickNumbers[0] == drawNumbers[0] || quickPickNumbers[0] == drawNumbers[1] || quickPickNumbers[0] == drawNumbers[2]) &&
                   (quickPickNumbers[1] == drawNumbers[0] || quickPickNumbers[1] == drawNumbers[1] || quickPickNumbers[1] == drawNumbers[2]) &&
                   (quickPickNumbers[2] == drawNumbers[0] || quickPickNumbers[2] == drawNumbers[1] || quickPickNumbers[2] == drawNumbers[2])) {
            System.out.println("Congratulations! You won $40.00 with an any order match!");
        } else {
            System.out.println("Sorry - not a winner this time, better luck next Draw!");
        }

        System.out.println("Thanks for playing Texas Pick 3!");
    }
}
