import java.util.Scanner;


public class H1P1
{   
    public static double BMI;
    public static double m;
    public static double h;
    public static double w;
    
    
   public static void main(String[] args)
   {
       Scanner keyInput = new Scanner(System.in);
       
       System.out.println("Your height (m):");
       h = keyInput.nextDouble();
       System.out.println();
       
       System.out.println("Your mass (kg):");
       m = keyInput.nextDouble();
       System.out.println();
       
       System.out.println("Your BMI (metric): "); //bmi calculation for metric (bmiOne())
       bmiOne();
       System.out.println();
       
       System.out.println("Your weight (lbs): ");
       w = keyInput.nextDouble();
       System.out.println();
       
       System.out.println("Your height (inch):");
       h = keyInput.nextDouble();
       System.out.println();
       
       System.out.println("Your BMI (imperial): "); //bmi calculation for imperial (bmiTwo())
       bmiTwo();
       System.out.println();
    
       bmiPrinter(); //print table
    }
    public static void bmiOne()
    {
        BMI = (m / ( h * h )) * 10000; //multiply by 10,000 because  
        System.out.printf("%2.2f %n", BMI); //print f, round to second decimal
    }
        public static void bmiTwo()
    {
        BMI = (w / ( h * h )) * 703; //multiply by 703 because
        System.out.printf("%2.2f %n", BMI);
    }
    public static void bmiPrinter()
   {
       System.out.printf("Your BMI is: %.2f.\n", BMI);
       System.out.println("----------------------------------");
       System.out.println("| From |   To |    BMI Category   |");
       System.out.println("|------|------|-------------------|");
       System.out.println("| 16.0 | 18.5 | Underweight       |");
       System.out.println("| 18.5 | 25.0 | Normal            |");
       System.out.println("| 25.0 | 30.0 | Overweight        |");
       System.out.println("| 30.0 | 35.0 | Moderately obese  |");
       System.out.println("| 35.0 | 40.0 | Severely obese    |");
       System.out.println("----------------------------------");
   }
   

}