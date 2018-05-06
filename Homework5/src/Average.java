import java.util.Scanner; //scanner package was not imported.

/**
 * Find and fix all the bugs in this program. Turn in to Canvas a file called Average.java
 * containing the correct version of this code with in-line comments explaining each fix.
 * @author Patrick O'Brien
 * @version 1.0
 * */

public class Average {
    public static void main(String[] args) {
        int n = 0, numInput; //incompatible types, change to int, has to be 0 because no input
        Scanner scanner = new Scanner(System.in); //System not capitalized
        System.out.println("This program calculates " + "the average (mean) of entered numbers.");
        int x = 0; //x must be initialized

        do {
            System.out.println("Enter another number " + "(or 0 to stop and show the average): ");
            numInput = scanner.nextInt(); //string can't be converted to integer, so nextInt
            x += numInput; //logic error, cannot += x and scanner without first initializing x
            n++;
        } while (numInput != 0); //change x to numInput --> otherwise always not 0 and infinite loop.

        System.out.printf("Your final average is: %f", + x / (float) (n - 1));
        //formatting is not correct --> change to printf, average value will be a float. Last input 0
    }
}