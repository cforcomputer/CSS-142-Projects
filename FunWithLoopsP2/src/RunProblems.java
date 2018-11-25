package cs141.patrickobrien;

import java.util.Scanner;

public class RunProblems
{
    private static final Scanner keyinput = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Please select the problem to run \n 1. Problem 1 \n 2. Problem 2 \n 3. Problem 3 \n" +
                " 4. Problem 4 \n 5. Problem 5 \n 6. Problem 6 \n 7. Problem 7 \n 8. Problem 8 \n 9. Problem 9");

        int hello = keyinput.nextInt();

        switch (hello)
        {

            case 1:
                problem1();
                break;
            case 2:
                problem2();
                break;
            case 3:
                problem3();
                break;
            case 4:
                problem4();
                break;
            case 5:
                problem5();
                break;
            case 6:
                problem6();
                break;
            case 7:
                problem7();
                break;
            case 8:
                problem8();
                break;
            case 9:
                problem9();
            default:
                System.out.println("Please select a problem that exists");
        }
    }

    private static void problem1()
    {

        System.out.println("Enter a width that is an integer between 1 and 50");
        int width = keyinput.nextInt();

        if (width >= 1 && width <= 50)
        {
            int step;

                for (step = 1; step <= width; step++)
                {
                    System.out.print("*");
                }
        }
    }

    private static void problem2()
    {
        System.out.println("Enter a width that is an integer between 1 and 50");
        int width = keyinput.nextInt();

        if (width >= 1 && width <= 50)
        {
            int step;
            int space = 1;

            while (space <= width)
            {
                for (step = 1; step <= width; step++)
                {
                    System.out.print("*");
                }
                space ++;
                System.out.println();
            }
        }
    }

    private static void problem3()
    {
        System.out.println("Enter a width that is an integer between 1 and 50");
        int width = keyinput.nextInt();

        for (int row = 0; row < width; row++)
        {

            for (int column = 0; column < width; column++)
            {
                if (row == width / 2 && column == width / 2)
                {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println(); //end row
        }

    }
    private static void problem4()
    {
            System.out.println("Enter a width that is an integer between 1 and 50");
            int width = keyinput.nextInt();

        for (int row = 1; row <= width; row++)
        {
            for (int column = 1; column <= width; column++)
            {
                if (column <= row)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void problem5()
    {
        System.out.println("Enter a width that is an integer between 1 and 50");
        int width = keyinput.nextInt();

        for (int row = 1; row <= width; row++)
        {
            for (int col = 1; col <= width; col++)
            {
                if (col <= width - row)
                {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void problem6()
    {
        System.out.println("Enter a positive integer that is less than 100");
        int userInput= keyinput.nextInt();

        if (userInput < 100)
        {

        }
    }

    private static void problem7()
    {

    }

    private static void problem8()
    {
        System.out.println("Enter a positive integer that is less than 100");
        int width= keyinput.nextInt();


    }
    private static void problem9()
    {

    }
}
