package ca141.robward;
import java.util.Random;

public class RockPaperScissorGame {

    private static int rockMoves = 0;
    private static int paperMoves = 0;
    private static int scissorMoves = 0;
    private static int totalAI_Wins = 0;
    private static int totalPlayerWins = 0;

    //Assigns the different possible moves
    private static String moves[] = {"Rock" , "Paper" , "Scissor", "Spock"};

    // Assigns string array RESULTS to WIN or LOSS for method Outcome
    private static ca141.robward.Outcome[][] outcome = {

            { ca141.robward.Outcome.Draw , ca141.robward.Outcome.Loss , ca141.robward.Outcome.Win} ,
            { ca141.robward.Outcome.Win , ca141.robward.Outcome.Draw , ca141.robward.Outcome.Loss} ,
            { ca141.robward.Outcome.Loss ,  ca141.robward.Outcome.Win , ca141.robward.Outcome.Draw }  };

    // all results stored in a multidimensional array
    private static String results[][] = {

            {"Rock versus Rock Tie" , "Rock Covered by Paper" , "Rock smashes Scissor"},
            {"Paper covers Rock" , "Paper versus Paper Tie" , "Paper cut by Scissor"},
            {"Scissor smashed by Rock" , "Scissor cuts Paper" , "Scissor versus Scissor Tie"}
    };

    private int winningTotal = 0;
    private int currentPlayerWins = 0;
    private int gamesPlayed = 0;

    private int playerScore = 0;
    private int AI_Score = 0;
    private boolean gameOver = false;
    private int playerMove = 0;
    private int AI_Move = 0;

    public RockPaperScissorGame(int winningTotal)
    {
        super();
        this.winningTotal = winningTotal;
    }
    // Constructor
    public static int getTotalAI_Wins()
    {
        return totalAI_Wins;
    }
    // Constructor
    public static int getTotalPlayerWins()
    {
        return totalPlayerWins;
    }
    // Constructor
    public int getCurrentPlayerWins()
    {
        return currentPlayerWins;
    }
    // Constructor
    public int getGamesPlayed()
    {
        return gamesPlayed;
    }
    // Constructor
    public int getPlayerScore()
    {
        return playerScore;
    }
    // Constructor
    public int getPlayerMove()
    {
        return playerMove;
    }
    // Constructor
    public int getAI_Move()
    {
        return AI_Move;
    }
    // Constructor
    public boolean isGameOver()
    {
        return gameOver;
    }
    //
    public String moveChoices()
    {
        String choices ="";

        for (int i = 0; i < moves.length; i++)
        {
            choices = choices + (i+1) + " " + moves[i] + " ";
        }
        return choices;
    }
    // Input player's move and the ai's move to calculate results --> move outcome
    public String moveOutcome()
    {
        return results[playerMove][AI_Move];
    }
    // Bring value of player Move and AI move into outcome to calculate the player outcome
    public ca141.robward.Outcome getPlayerOutcome()
    {
        return outcome[playerMove][AI_Move];
    }

    public ca141.robward.Outcome getAIOutcome()
    {
        return outcome[AI_Move][playerMove];
    }

    public String currentScore()
    {
        StringBuilder outcome = new StringBuilder();

        if(playerScore >= winningTotal)
        {
            outcome.append("Player Wins: ");
        }

        if(AI_Score >= winningTotal)
        {
            outcome.append("AI Wins this game: ");
        }

        outcome.append("Player Score: ");

        outcome.append(playerScore);

        outcome.append("  AI Score: ");

        outcome.append(AI_Score);

        return outcome.toString();
    }

    public String currentWinTotal()
    {
        StringBuilder outcome = new StringBuilder();

        outcome.append("Player has won ");

        outcome.append(totalPlayerWins);

        outcome.append("   of ");

        outcome.append(gamesPlayed);

        outcome.append("  games played ");


        return outcome.toString();
    }

    public static String overallWinTotals()
    {
        StringBuilder outcome = new StringBuilder();

        outcome.append("Players have won ");

        outcome.append(totalPlayerWins);

        outcome.append("   versus ");

        outcome.append(totalAI_Wins);

        outcome.append("  wins by the computer ");

        return outcome.toString();
    }

    public void reset()
    {
        playerScore = 0;

        AI_Score = 0;

        gameOver = false;

    }

    public void playRound(int playerMove)
    {
        if(gameOver)
        {
            return;
        }

        playerMove = playerMove - 1;

        this.playerMove = playerMove;

        switch(playerMove)
        {
            case 0:
                rockMoves++;
            case 1:
                paperMoves++;
            case 2:
                scissorMoves++;
        }

        Random rand = new Random();

        AI_Move = rand.nextInt(3);

        playerScore += outcome[playerMove][AI_Move].getValue();

        AI_Score += outcome[AI_Move][playerMove].getValue();

        gameOver = (playerScore >= winningTotal || AI_Score  >= winningTotal );

        if(AI_Score  >= winningTotal )
        {
            totalAI_Wins += 1;
            gamesPlayed++;
        }

        if(playerScore  >= winningTotal )
        {
            totalPlayerWins += 1;
            currentPlayerWins +=1;
            gamesPlayed++;
        }
    }
}