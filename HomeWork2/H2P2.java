import java.util.Scanner;

public class H2P2
    {
               public static void main(String[] args)
        {
            double basePay, hoursWorked, totalPay; 
            String fullName;
            
            Scanner keyInput = new Scanner(System.in);
            
            System.out.println("Please enter the employee's name");
            fullName = keyInput.next();
            
            System.out.println("Please enter the employee's pay.");
            basePay = keyInput.nextDouble();
            
            System.out.println("Please enter the employee's hours worked.");
            hoursWorked = keyInput.nextDouble();
            
            System.out.printf("The total pay for %s is %.2f dollars.", fullName, salaryTotal(basePay, hoursWorked));
            //%s = string and $.2f for double
        }
        
        public static double salaryTotal(double basePay, double hoursWorked)
        {
            if ((basePay >= 5.25) && (hoursWorked <= 60))
               if (hoursWorked <= 40)
                  //this calculates hoursWorked without overtime
                  basePay = basePay * hoursWorked;
                  
                  else // this calculates hoursWorked with overtime
                    basePay = basePay = (((hoursWorked - 40) * ((basePay ) * 1.5)) + (basePay * 40));
                    
                        else if ( basePay < 5.25 )
                        { //this is the error message output for below minimum wage
                         basePay = -1;
                         System.out.println( "The base salary you entered does not comply with state law." );
                        }
                                else if ( hoursWorked > 60 )
                                { //this is the error message output for company policy
                                 basePay = -2;
                                 System.out.println( "The number of hours you entered does not comply with company policy." ); 
                                }
           return basePay; // return basePay for main
        }
    }