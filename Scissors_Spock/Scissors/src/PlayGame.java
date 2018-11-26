package ca141.robward;
import java.util.Scanner;

public class PlayGame {

    public static void main(String[] args)
    {
        ca141.robward.RockPaperScissorGame rsg = new ca141.robward.RockPaperScissorGame(3);

        boolean continueGame = true;
        int move;
        @SuppressWarnings("resource")

        Scanner keyboard = new Scanner(System.in);

        while(continueGame)
        {
            System.out.println(rsg.moveChoices());

            System.out.println("Enter Move:(1,2,or 3):");

            move = keyboard.nextInt();

            rsg.playRound(move);

            System.out.printf("AI %s!%n", rsg.getAIOutcome().toString());
            System.out.printf("Player %s!%n", rsg.getPlayerOutcome().toString());


            System.out.println(rsg.moveOutcome());

            System.out.println(rsg.currentScore());

            if(rsg.isGameOver())
            {
                System.out.println(rsg.currentWinTotal());
                System.out.println("Do you want to Play Again(1 - Yes , 2 - No):");

                int answer = keyboard.nextInt();

                if(answer == 2)
                {
                    continueGame = false;
                }
                else
                {
                    rsg.reset();
                }
            }
        }

        System.out.println("Final Totals:");
        System.out.println(rsg.currentWinTotal());

        System.out.println("Overall Totals:");
        System.out.println(ca141.robward.RockPaperScissorGame.overallWinTotals());
    }
}