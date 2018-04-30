import java.util.Scanner;

public class TestTax 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double netIncome, tax, fivePercentTax, tenPercentTax;
        System.out.println("Enter net income. /n" //./n means to escape and make a new line
        + "Do not enter a dollar sign or any commas.");
        netIncome = keyboard.nextDouble( );
        
        if (netIncome <= 15000)
            tax = 0;
        else if ((netIncome > 15000) && (netIncome <= 30000))
            tax = (0.05*(netIncome - 15000));
        else 
        {
            fivePercentTax = 0.05*15000;
            tenPercentTax = 0.10*(netIncome-30000);
            tax = (fivePercentTax + tenPercentTax);
        }
        System.out.printf("Tax due = $%.2f", tax);
    }
}
