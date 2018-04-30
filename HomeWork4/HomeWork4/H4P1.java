
/**
 *  In crypt-arithmetic puzzles, mathematical equations are written using letters. Each letter
 *  can be a digit from 0 to 9, but no two letters can be the same. Here is a sample problem:
 *  SEND + MORE = MONEY
 *  A solution to the puzzle is S = 9, R = 8, O = 0, M = 1, Y = 2, E = 5, N = 6, D = 7.
 *  In a class called H4P1, write a program that finds and prints all solutions to the crypt-arithmetic puzzle
 *  TOO + TOO + TOO + TOO = GOOD
 *
 * @Patrick O'Brien
 * @1.0 
 */
public class H4P1
{
    public static void main(String args[]) //main to run 
    {
        cryptPuzzle();
    }
    public static void cryptPuzzle() //calculate all possible combinations 
    {        
        //declare variables
        int T, O, G, D;
        
        for (T = 0; T <= 9; T++)
        {
            
            for (O = 0; O <= 9; O++)
            {
                
                for (G = 0; G <= 9; G++)
                {
                    
                    for (D = 0; D <= 9; D++)
                    {
                        if ((D != G) && (D != O) && (D != T) && (G != O) && (G != T) && (O != T))
                        { // check to see if the numbers are unique                            
                            int lhs = (T * 100 + O * 10 + O);  
                            
                            if (4 * lhs == (G*1000+O*100+O*10+D)) //parse -- if the sides are equal then print
                            {
                                System.out.printf("T = %d ", T);
                                System.out.printf("O = %d ", O);
                                System.out.printf("G = %d ", G);
                                System.out.printf("D = %d \n", D);                            
                            }
                        }
                    }
                }
            }   
        }
    }    
}
