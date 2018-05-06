import java.io.*;
import java.util.*;
/**
 *(File I/O) The Fibonacci numbers F n are defined as follows: F 0 is 0, F 1 is 1,
 * and
 * F i+2 = F i + F i+1 for i = 0,1,2,...
 * In other words, each number is the sum of the previous two numbers. The first few
 * Fibonacci numbers are 0, 1, 1, 2, 3, 5, and 8.
 * One place where these numbers occur is as certain population growth rates. If a
 * population has no deaths, then the series shows the size of the population after each
 * time period. It takes an organism two time periods to mature to reproducing age, and
 * then the organism reproduces once every time period. The formula applies most
 * straightforwardly to asexual reproduction at a rate of one offspring per time period. In
 * any event, the green crud population grows at this rate and has a time period of five
 * days. Hence, if a green crud population starts out as 10 pounds of crud, then in 5 days,
 * there is still 10 pounds of crud; in 10 days, there is 20 pounds of crud; in 15 days, 30
 * pounds; in 20 days, 50 pounds; and so forth.
 * Write a program that takes both the initial size of a green crud population (in pounds)
 * and a number of days as input from a file greencrud.txt (organized as initial size ‘space’
 * number of days), and outputs the number of pounds of each green crud population after
 * that many days to an output file called crudout.txt (make sure each output is labeled
 * somehow). Assume that the population size is the same for four days and then increases
 * every fifth day.
 * Input file: greencrud.txt
 * @author Patrick O'Brien
 * @version 1.0
 * */

public class Greencrud {
    public static void main(String[] args) {
        Scanner fileIn = null;
        try {
            fileIn = new Scanner(new File("greencrud.txt"));
        }
        catch(FileNotFoundException FNFE) {
            System.out.println("File not fund ");
        }
        if(fileIn!=null) {
            while(fileIn.hasNext()) {
                int initial_size = 0;
                int next_size = fileIn.nextInt();
                int number_of_days = fileIn.nextInt();
                int end_size=0;
                for(int i=1; i<=number_of_days; i+=5) {
                    end_size = initial_size + next_size;
                    initial_size = next_size;
                    next_size = end_size;
                }
                System.out.println("After "+number_of_days + " days Size of population is " + end_size);
            }
            fileIn.close();
        }
    }
}