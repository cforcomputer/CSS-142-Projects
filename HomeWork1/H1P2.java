import java.util.Scanner;

public class H1P2
{
    public static double money;
    
    public static int dollars;
    public static int quarters;
    public static int dimes;
    public static int nickels;
    public static int cents;
    
    public static void main(String[] args)
    {        
        Scanner keyInput = new Scanner(System.in);
        
        System.out.println("Convert money into different amounts of change.");
        System.out.println("Enter your balance: ");
        //assign keyInput to double
        money = keyInput.nextDouble();
        change();
        
        System.out.println("Input your quarters: ");
        //quarters = integer not a double
        quarters = keyInput.nextInt();
        
        inCents();
                
    }    
    public static void change()
    {
       System.out.printf("%2.0f Dollars %n", money); 
       System.out.printf("%3.0f Quarters %n", money * 4); 
       System.out.printf("%3.0f Dimes %n", money * 10); 
       System.out.printf("%3.0f Nickels %n", money * 20); 
       System.out.printf("%4.0f Cents %n", money * 100);
    }
    public static void inCents()
    {
        //Add the identifying text each monetary amount
        System.out.println( dollars + " dollars, " + quarters + " quarters, " + dimes +  "dimes and " + nickels + "nickels, " + cents + "cents");
        //Calculate the amount of total cents
        System.out.println( ((dollars * 100) + (quarters * 25) + (dimes * 10) + (nickels * 5) + cents) + " cents.");
    }
}