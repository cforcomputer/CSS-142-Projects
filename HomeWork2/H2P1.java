import java.util.Scanner;
/**
 * H2P1
 *
 * @Patrick O'Brien
 * @1.0
 */
public class H2P1
{
    public static double a, b, c, x, y; //declare input variables
    public static void main(String[] args)
    {
        Scanner keyInput = new Scanner(System.in);
        //gather inputs
        System.out.println("Please input the a value for y = ax^2+bx+C");
        a = keyInput.nextDouble();
        System.out.println("Please enter the value for b");
        b = keyInput.nextDouble();
        System.out.println("Please enter the value for c");
        c = keyInput.nextDouble();
        System.out.println("... \n Calculation Complete!");
        //b and c if someone wants to add incrementally
        
        x = b / (2 * a); //equation for vertex
        if (x != 0.0) // this removes the negative sign when the x or the y value is 0
        {
            x = -x;
        }
        
        y = (a * ( x * x )) + ( b * x ) + c; //equation for quadtratic function
        System.out.println("The vertex of the corresponding parabola is: ");
        System.out.println("( " + x + " , " + y + " )"); //output
        if (x == 0.0) //y intercept
        {
            System.out.println("This vertex is also the y-intercept of your parabola.");
        }
        if (y == 0.0) //x intercept
        {
            System.out.println(" This vertex is also the zero of your parabola ");
        }
        
    }
}

