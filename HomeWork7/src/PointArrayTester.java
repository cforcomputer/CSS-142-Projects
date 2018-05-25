/**
 * PointArrayTester
 * Part c: In a class called PointArrayTester, write a main method to test each of your
 * constructors and methods from the PointArray class. Make at least three distinct
 * PointArray objects and one non-distinct (to test the equals method). To test the
 * constructor that takes a FileInputStream argument, download some of my test files from
 * the Canvas assignment page. Note: if you wish you may pass in the test files to main as
 * command line arguments, however this is not required.
 * */

// File: PointArrayTester.java
import java.io.*;
import java.util.*;

public class PointArrayTester
{
    //main method
    public static void main(String[] args) throws IOException
    {
        //array for gathering inputs from pointsFile.txt

        FileInputStream file = new FileInputStream(new File("/home/anon/Desktop/CSS-142-Projects/HomeWork7/src/fivePoints.txt"));

        double arr1[] = {2.4, 3.5, 4.7, 1.0, 6.4, 11.01};
        double arr2[] = {4.2, 5.3, 7.4, 0.1, 4.6, 1.11};
        double arr3[] = {2.4, 3.5, 4.7, 1.0, 6.4, 11.01};

        PointArray pa1 = new PointArray(file);
        PointArray pa2 = new PointArray(arr1);
        PointArray pa3 = new PointArray(arr2);
        PointArray pa4 = new PointArray(arr3);

        System.out.println("Points Array #1: " + pa1);
        System.out.println("Points Array #2: " + pa2);
        System.out.println("Points Array #3: " + pa3);
        System.out.println("Points Array #4: " + pa4);

        //Points Array #1
        System.out.println("\nThe first points array is collinear.(T/F): " + pa1.contains3collinear());
        //Points Array #2
        System.out.println("The second points array is collinear.(T/F): " + pa2.contains3collinear());
        //Points Array #3
        System.out.println("The third points array is collinear.(T/F): " + pa3.contains3collinear());
        //Points Array #4
        System.out.println("The fourth points array is collinear.(T/F): " + pa4.contains3collinear());
        //Points Array #1 == Points Array #3
        System.out.println("\nPoints Array #1 is equal to Points Array #3.(T/F): " + pa1.equals(pa3));
        //Points Array #2 == Points Array #4
        System.out.println("Points Array #2 is equal to Points Array #4.(T/F): " + pa2.equals(pa4));

        //Sort the inputs
        pa1.sort();
        pa2.sort();
        pa3.sort();
        pa4.sort();
        System.out.println("\nSorted Points Array #1: " + pa1);
        System.out.println("Sorted Points Array #2: " + pa2);
        System.out.println("Sorted Points Array #3: " + pa3);
        System.out.println("Sorted Points Array #4: " + pa4);

        //close the stream
        file.close();
    }
}