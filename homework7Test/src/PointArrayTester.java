/**PointArrayTester.java**/
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PointArrayTester
{
    public static void main(String arg[]) throws IOException
    {

            Scanner input = new Scanner("/home/anon/Desktop/CSS-142-Projects/HomeWork7/src/fivePoints.txt");
            int[] numbers = new int[5];

            for (int i = 0; i < numbers.length; i++)
            {
                numbers[i] = input.nextInt();
                System.out.println(i);
            }


        //assign text file to file
        File file=new File("/home/anon/Desktop/CSS-142-Projects/HomeWork7/src/fivePoints.txt");

        //assign contents of array1 and array2
        double array1[]={2.4, 3.5, 4.7, 1.0, 6.4, 11.01};
        double array2[]={2.4, 3.5, 4.7, 1.0, 6.4, 11.01};

        //start read of the text file
        FileInputStream inputStream = new FileInputStream(file);

        PointArray P1=new PointArray(inputStream);
        PointArray P2=new PointArray(array1);

        System.out.println("Point Array1: ");
        System.out.println(P2.toString());
        System.out.println("Point Array2: ");
        System.out.println(P1.toString());
        //checking collinear or not

        if(P1.contains3collinear())
            System.out.println(P1.toString()+" are collinear");

        else
            System.out.println(P1.toString()+" are not collinear");
        PointArray P3=new PointArray(array2);

        //sorting the points in the pointArray P3

        P2.sort();
        System.out.println("After sorting P2 : "+P2.toString());

        //checking whether P2=P3 or not
        System.out.println(" P2: "+P2.toString());
        System.out.println(" P3: "+P3.toString());

        if(P2.equals(P3))
        {
            System.out.println("P2 and P3 are equal");
        }

        else
        {
            System.out.println("P2 and P3 are not equal");
        }

        //checking whether P1=P3 or not
        System.out.println("P2: "+P1.toString());
        System.out.println("P3: "+P3.toString());

        if(P1.equals(P3))
        {
            System.out.println("P1 and P3 are equal");
        }
        else
        {
            System.out.println("P1 and P3 are not equal");
        }
    }
}