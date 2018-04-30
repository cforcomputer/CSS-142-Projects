/* mets practice for chapter 1*/

//start main class
public class CalorieCalculation
{
    //start main method
    public static void main(String[] args)
    {
        //A double to hold the weight of the person
        double weight = 68.18;
        //Variables to store METs
        //for each activity.
        double basketball = 8;
        double running = 10;
        double sleeping = 1;
        
        //Calculate the calories burned from each
        //activity for using the formula, and sum them,
        //then show the user the total
        System.out.print( "Calories burned per minute:" );
        
        System.out.print( 0.0175 * weight * 30 * basketball 
        + 0.0175 * weight * 30 * running 
        + 0.0175 * weight * 360 * sleeping );
    }
}