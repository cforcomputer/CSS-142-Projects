/**
 *   Problem 2. The game of Pig is a simple two-player dice game in which the first player to reach 100 or
 *   more points wins. Players take turns. On each turn, a player rolls a fair six-sided die:
 *  • If the player rolls a 1, then the player gets no new points and it becomes the other player’s turn.
 *  • If the player rolls 2 through 6, then he or she can either:
 *  – ROLL AGAIN or
 *  – HOLD. At this point, the sum of all rolls is added to the player’s score and it becomes the
 *  other player’s turn.
 *  In a class called H4P2, write a program that plays the game of Pig, where one player is a human and the
 *  other is the computer. When it is the human’s turn, the program should show the score of both players
 *  and the previous roll. Allow the human to input “R” to roll again or “H” to hold.
 *  The computer program should play according to the following rule: keep rolling when it is the
 *  computer’s turn until it has accumulated 20 or more points for that turn, then hold (of course, if the
 *  computer rolls a 1, then it is the humans’ turn again). If the computer wins or rolls a 1, then the turn
 *  ends immediately. Allow the human to roll first.
 *
 * @author Patrick O'Brien
 * @version 1.0
 */

import java.util.Scanner;

 public class H4P2
{
    //assign boolean values
    Boolean playerTurn = true;
    Boolean aiTurn = true;
    
    int aiTotalPoints = 0;
    int playerTurnPoints, aiTurnPoints;
    int playerTotalPoints = 0;
    int dice;
         

    public static void main(String[] args)
    {
        new H4P2(); //new creates an object and instantiates a class -- H4P2 - runs the class H4P2 when main is called
    }
    
    public H4P2() //if not the human's turn, the ai's turn. call on new class object
    {
        playerGame();
        if(!playerTurn) //if does not equal boolean playerTurn then --->
        {
            aiTurn();
        }
    }
    
    public void rollDice()
    {
        dice = (int)(Math.random()*6) + 1; //this generates a random number between 1 and 6  ex: return (int)(Math.random() * range) + min;  
    }    
  
    public int playerTurnScore() //prints the human player's score
    {
        {
            playerTurnPoints = dice + playerTurnPoints;
            System.out.println("YOU ROLLED: " + dice);
            System.out.println("YOUR SCORE: " + playerTurnPoints);
        } 
        return playerTurnPoints;
    }
    public void playerTurnZero() //starts the human score at 0
    {
        playerTurnPoints = 0;
    }

    public int aiTurnScore() //calculates the end turn score for the AI
    {
        {
            aiTurnPoints = dice + aiTurnPoints;
            System.out.println("AI SCORED: " + aiTurnPoints + " DURING ITS TURN.");
        } return aiTurnPoints;
    }   
    
    public void aiTurnZero() //starts the AI score at 0
    {
        aiTurnPoints = 0;
    }
                  
    public int playerGame()
    {    
        System.out.println("PRESS R TO START");
        Scanner key = new Scanner(System.in);
        String start = key.nextLine();
        if(!start.equalsIgnoreCase("R")) //check to see if a different key is being pressed | note: start. is key.nextLine() = 
        {
            System.out.println("YOU FAILED TO PRESS R");
            System.out.println("GET IT RIGHT CADET");
            playerGame(); //reinitialized playerGame()
        }

        if(start.equalsIgnoreCase("R"))
        {
            System.out.println("YOU HAVE SELECTED R");
            System.out.println("GAME START");   
  
     
            do{ //do-while loop starts the game
                rollDice();  
  

                if(dice == 1) //call playerTurnZero | ends player turn | call start aiTurn | starts ai turn
                {
                    System.out.println("YOU ROLLED 1 AND FAILED TO MEET THE SCORE REQUIREMENT");
                    System.out.println("AI TOTAL SCORE IS: " + aiTotalPoints);
                    playerTurnZero(); //end player turn
                    aiTurn(); //start ai turn

                }   
                else if(dice != 1) //game completed message and conditions
                {
  
                    playerTotalPoints += dice;   
                    if(playerTotalPoints >= 100)
                    {
                        System.out.println("--------------------------");
                        System.out.println("-  YOU ROLLED: " + dice + "         -");
                        System.out.println("--------------------------");
                        System.out.println("-  YOUR TOTAL SCORE: " + playerTotalPoints + " -");
                        System.out.println("--------------------------\n");
                        System.out.println("******CONGRATS CADET******");
                        System.out.println(" YOU WIN - GAME COMPLETED ");
                        System.exit(0);
                    }
                    playerTurnScore();  
                    System.out.println("YOUR TOTAL SCORE: " + playerTotalPoints);
                    System.out.println("AI TOTAL SCORE: " + aiTotalPoints);
                    System.out.println("-------------------------\n\n");
                    System.out.println("ROLL AGAIN OR SKIP?");
                    System.out.println("-------------------------\n\n");
                    System.out.println("PRESS R TO ROLL AGAIN, PRESS H TO SKIP YOUR TURN");
                    Scanner keyboard = new Scanner(System.in);
                    String choice = keyboard.nextLine();

                    if (choice.equalsIgnoreCase("R"))
                    {
                        System.out.println("OPTION R SELECTED");
                        System.out.println("DO A BARREL ROLL");   
                        rollDice();   
  
                        if (!choice.equalsIgnoreCase("R"))
                        {
                            System.out.println("DON'T FAIL ME AGAIN CADET, PRESS R TO ROLL OR H TO HOLD");
                            playerGame();
                        }
                    }
      
                    if (choice.equalsIgnoreCase("h")) 
                    {   
                        System.out.println("DON'T RUN FROM A CHALLENGE CADET");
                        System.out.println("YOUR TOTAL POINTS: " + playerTotalPoints);
                        playerTurnZero();
                        aiTurn();
                    }   

                }   
  
            }while(playerTurn);   
   
        }return dice;  
        
    }
    
    public int aiTurn()
    {
        System.out.println("THE AI HAS AWOKEN! ELIMINATE IT BEFORE IT GETS TOO STRONG!\n");

        do {
            rollDice();

            if(dice != 1) //if not equal to 1, continue
            {
                aiTotalPoints += dice;
                if(aiTotalPoints >=100) //print final message if score >= 100 threshhold
                {
                    System.out.println("AI ROLLED " + dice + "WHEN TOSSING THE DICE");
                    System.out.println("AI TOTAL SCORE : " + aiTotalPoints);
                    System.out.println("< < < G A M E  O V E R > > > \n GET IN LINE");
                    System.exit(0); //exit the VM when the game ends
                }   
                System.out.println("AI ROLLED: " + dice);
                System.out.println("AI's TOTAL IS: " + aiTotalPoints);
                System.out.println("YOUR TOTAL IS: " + playerTotalPoints);
                aiTurnScore();
                rollDice();
            }

            if(dice == 1) //kill the machines, change turn to player 
            {
                System.out.println("AI ROLLED 1 AND FAILED TO MEET THE SCORE REQUIREMENT");
                aiTurnZero(); //end ai turn
                playerGame(); //start player turn
            }

            if(aiTurnPoints >= 20) //ai score alert
            {
                System.out.println("AI HAS A HIGH SCORE " + aiTurnPoints + " \nFEELING LUCKY?");
                System.out.println("KEEP GOING SPACE CADET");
                playerGame();
            }   

        }while (aiTurn);
        return dice;
    }     
}


