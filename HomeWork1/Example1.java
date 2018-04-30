// H1P1 class implementation
public class Example1
{
   // bmiOne method implementation
   public static double bmiOne(double m, double h)
   {
       return m / (h * h);
   } // end of bmiOne method
  
   // bmiTwo method implementation
   public static double bmiTwo(double w, double h)
   {
       return 703.0 * w / (h * h);
   } // end of bmiTwo method
  
   // bmiPrinter method implementation
   public static void bmiPrinter(double bmi)
   {
       System.out.printf("Your BMI is: %.2f.\n", bmi);
       System.out.println("Please refer to check the category for this value.");
       System.out.println("-----------------------------------");
       System.out.println("| From |   To   |    BMI Category |");
       System.out.println("|--------|--------|---------------|");
       System.out.println("| 16.0 | 18.5 | Underweight       |");
       System.out.println("| 18.5 | 25.0 | Normal            |");
       System.out.println("| 25.0 | 30.0 | Overweight        |");
       System.out.println("| 30.0 | 35.0 | Moderately obese  |");
       System.out.println("| 35.0 | 40.0 | Severely obese    |");
       System.out.println("-----------------------------------");
       System.out.println();
   } // end of bmiPrinter method
  
   // start main method
   public static void main(String[] args)
   {
       double bmi1 = bmiOne(50, 1.6);
       double bmi2 = bmiOne(60, 1.9);
       double bmi3 = bmiOne(55, 1.2);
       double bmi4 = bmiOne(60, 1.1);
       double bmi5 = bmiOne(45, 1.0);
      
       double bmi6 = bmiTwo(1085, 172);
       double bmi7 = bmiTwo(1268, 165);
       double bmi8 = bmiTwo(1191, 154);
       double bmi9 = bmiTwo(960, 181);
       double bmi10 = bmiTwo(1273, 162);
      
       bmiPrinter(bmi1);
       bmiPrinter(bmi2);
       bmiPrinter(bmi3);
       bmiPrinter(bmi4);
       bmiPrinter(bmi5);
       bmiPrinter(bmi6);
       bmiPrinter(bmi7);
       bmiPrinter(bmi8);
       bmiPrinter(bmi9);
       bmiPrinter(bmi10);
   } // end of main method
} // end of H1P1 class