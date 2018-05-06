import java.util.*;

/**
 * Problem 1. (Guessing Game) In this problem you will be creating a game that you play
 * against the computer. Make a class named GuessingGame - when executed, this program
 * should randomly generate a secret integer from 1 to 100, and then instruct the user to
 * try to guess what it is. After each guess the program will tell them if they are too high,
 * too low, or if they got it right - and if they got it right it will congratulate them, tell them
 * how many guesses it took them, and offer to either play again or exit the program.
 * An example interaction with this program follows:
 * ----------------------------------------Please guess a number
 * between 1 and 100:
 * 50
 * Too low! Guess again: 75
 * Too high! Guess again: 63
 * Good job, you got it after 3 guesses! Want to play again (Y or N)?
 * N
 * Thanks for playing!
 * -----------------------------------------
 * After you have made this game, play it some and try to figure out the best strategy. In a
 * text file called HowToGuess.txt, explain the best strategy you employed to play the game
 * and about how many guesses it usually took you to get the answer.
 *
 * @author Patrick O'Brien
 * @version 1.0
 * */


public class GuessingGame {

    public static void main(String[] args) {

        testCalculation();
    }

    public static void testCalculation() {
        try {
            Random randomNumber = new Random();
            int numberToGuess, numberOfTries;

            Scanner keyInput = new Scanner(System.in);
            int playerGuess;
            boolean win;
            boolean playAgain = true;
            String ans;

            while (playAgain == true) {
                numberToGuess = randomNumber.nextInt(100) + 1;
                numberOfTries = 0;
                win = false;
                System.out.println("Please guess a number between 1 and 100");

                while (win == false) {
                    System.out.print("\nEnter your number: ");
                    playerGuess = keyInput.nextInt();
                    numberOfTries++;
                    if (playerGuess == numberToGuess) {
                        win = true;
                    } else if (playerGuess > numberToGuess) {
                        System.out.println("Too high! Guess again: ");
                    } else if (playerGuess < numberToGuess) {
                        System.out.println("Too low! Guess again!");
                    }
                }

                if (win == true) {
                    System.out.println("Good job! You got it right after " + numberOfTries + " guesses!");
                }

                if (win == true) {

                    System.out.print("Want to play again (Y or N)? ");
                    ans = keyInput.next();

                    if (ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"))
                        playAgain = true;

                    else
                        playAgain = false;
                }
            }

        } catch (Exception e) {
            String answer;
            Scanner keyInput = new Scanner(System.in);
            System.out.println("You did not enter an integer!");
            System.out.println("Would you like to restart? Please enter: Y/n");
            answer = keyInput.next();

            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"))
            testCalculation();
            else
                System.exit(0);
        }
    }
}