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
        //run testCalculation class and start program
        testCalculation();
    }

    public static void testCalculation() {
        try { //start try-catch block
            Random randomNumber = new Random();
            int numberToGuess, numberOfTries, playerGuess; //initiate ints

            Scanner keyInput = new Scanner(System.in);
            boolean win;
            boolean playAgain = true;
            String answer;

            while (playAgain == true) { //while play again is equal to true, run loop
                numberToGuess = randomNumber.nextInt(100) + 1; //difference of 1 range of 100
                numberOfTries = 0; //start tries at 0
                win = false; //win is false while playAgain = true
                System.out.println("Please guess a number between 1 and 100");

                while (win == false) { //run this loop if the player has not won
                    System.out.print("\nEnter your number: ");
                    playerGuess = keyInput.nextInt(); //takes the int input from the player
                    numberOfTries++;
                    //if player guess is the correct number, then win == true and the player wins the game.
                    if (playerGuess == numberToGuess) {
                        win = true;
                        //if the player guess is larger than, print
                    } else if (playerGuess > numberToGuess) {
                        System.out.println("Too high! Guess again: ");
                        //if the player is less than, print.
                    } else if (playerGuess < numberToGuess) {
                        System.out.println("Too low! Guess again!");
                    }
                }
                //if the win condition is met, print
                if (win == true) {
                    System.out.println("Good job! You got it right after " + numberOfTries + " guesses!");
                }
                //then if the win condition is met, start nested if-else
                if (win == true) {
                    //prompt the player to play again
                    System.out.print("Want to play again (Y or N)? ");
                    answer = keyInput.next();
                    //take the player input after the prompt and check answer string for condition
                    //if player enters yes, then repeat loop
                    if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"))
                        playAgain = true;
                    //if player enters anything that is not yes, exit the program.
                    else
                        playAgain = false;
                        System.exit(0);
                }
            }
        //catch exception that is not int while running, for instance "exit" or "q"
        } catch (Exception e) {
            String answer;
            Scanner keyInput = new Scanner(System.in);
            System.out.println("You did not enter an integer!");
            System.out.println("Would you like to restart? Please enter: Y/n");
            answer = keyInput.next();

            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"))
            testCalculation(); //if user does want to restart after the error, enter Y or yes
            else
                System.exit(0); //otherwise exit
        }
    }
}