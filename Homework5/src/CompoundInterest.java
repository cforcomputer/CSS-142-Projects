/**
 * Problem 2. (Compound Interest) If an amount a is invested at an interest rate r
 * compounded n times per year, then the final value f at the end of one year is given by f
 * = a(1 + r/n) n .
 * This is the familiar formula for compound interest (so if we compound
 * annually, then n = 1). Typically, compounding is done quarterly (n = 4), daily (n = 365)
 * or continuously (n →∞).
 *
 * In a class called CompoundInterest, write a method that implements the compound
 * interest formula f above. This method should take the following parameters: a double a
 * (as in the given formula), a double r (as in the given formula), and an int n (as in the
 * given formula). This method should return the value of the investment at the end of a
 * year (as specified by the formula f). You should NOT use any Math library functions or
 * any imports (hint: you will need a loop).
 *
 * Test your method in main using an initial investment of $100.00, an interest rate of 5
 * percent (i.e. r = 0.05), and the following values for the compound number: 1, 4, 365,
 * 1,000, and 10,000.
 *
 * Explain your results in your program’s comments. For this problem, you should submit
 * to Canvas one file: CompoundInterest.java.
 *
 * @author Patrick
 * @version 1.0
 * */

public class CompoundInterest {

            public static double calculateCompoundInterest(double a,double r,int n )

        {

            r=r/100;//dividing rate of interest into percent
            double amount=(1+r/n);//calculating the value that was in the formula and storing in amount
            double product=1;
            for(int i=1;i<=n;i++)//calculating n power of amount

            {
                product*=amount;
            }

            amount=product*a;//calculating amount with initial amount
            return amount;//returning amount
        }

        public static void main(String[] args) {

            //calling function and printing results
            System.out.println(calculateCompoundInterest(100, 5, 1));
            System.out.println(calculateCompoundInterest(100, 5, 4));
            System.out.println(calculateCompoundInterest(100, 5, 365));
            System.out.println(calculateCompoundInterest(100, 5, 1000));
            System.out.println(calculateCompoundInterest(100, 5, 10000));

        }
    }
