import java.io.*;
/**
 * PointArray
 * Part b: Write a class called PointArray to represent an array of Point objects containing
 * the following variables and methods:
 * 1. Private data field: points an array of type Point;
 * 2. Public constructors:
 * • a constructor that takes an array of doubles containing the x and y values of
 * each point consecutively. That is, if we have the following array of doubles:
 * {2.4, 3.5, 4.7, 1.0, 6.4, 11.01} then we can construct the
 * array of three points:
 * {new Point(2.4, 3.5), new Point(4.7, 1.0), new Point(6.4, 11.01)} Note: this
 * constructor should only accept arrays of even length.
 * • a constructor that takes an argument of type FileInputStream, and constructs
 * the points array by reading a text file containing the points. For example, if
 * the file has the following content:
 * 3
 * 2 4
 * 3.5 -1 0
 * 17
 * then the first number is the number of points, and below it, each line is a
 * point with x being the first number and y being the second. So we can read
 * the first number in the file to construct a points array of that size, then loop
 * through the file to construct each new Point and store it into the points array.
 * 3. Public methods:
 * • boolean contains3collinear() : returns true if a PointArray contains three points
 * which are collinear. For example, the points P 0 : (x 0 ,y 0 ), P 1 : (x 1 ,y 1 ), and P 2 :
 * 2(x 2 ,y 2 ) are collinear if the slope between P 0 and P 1 is the same as the slope
 * between P 1 and P 2 ;
 * • void sort() : sorts the invoking PointArray object using selection sort: the sort
 * is by the ascending order specified by the lessThan method from the Point
 * class above;
 * • boolean equals(PointArray anotherPointArray) : returns true if the invoking
 * PointArray is equal to the argument PointArray. Two arrays of points are equal
 * if all the points are the same. Note: order does not matter for equality;
 * • String toString() : returns the string representation of a PointArray. For
 * example, a PointArray with 3 points P 0 : (x 0 ,y 0 ), P 1 : (x 1 ,y 1 ), and P 2 : (x 2 ,y 2 ) would
 * be printed as follows: {(x0, y0), (x1, y1), (x2,y2)}.
 *
 * @author Patrick O'Brien
 * @version 1.0
 * */

public class PointArray {

    // contains3collinear method returns true if a PointArray contains three points that are collinear.
    public boolean contains3collinear() {

        if(points[0].slopeTo(points[1]) == points[1].slopeTo(points[2]))
            return true;
        else
            return false;
    }

    // sort method
    public void sort() {
        for(int i = 0; i < points.length - 1; i++)
        {
            int minimumIndex = i;

            for(int j = i + 1; j < points.length; j++)
            {
                if(points[j].lessThan(points[minimumIndex]))
                    minimumIndex = j;
            }

            if(minimumIndex != i)
            {
                Point temporary = points[i];
                points[i] = points[minimumIndex];
                points[minimumIndex] = temporary;
            }
        }
    }

    // equals method
    public boolean equals(PointArray anotherPointArray) {
        if(points.length != anotherPointArray.points.length)
            return false;

        boolean founds[] = new boolean[points.length];

        for(int i = 0; i < points.length; i++)
        {
            for(int j = 0; j < anotherPointArray.points.length; j++)
            {
                if(points[i].equals(anotherPointArray.points[j]) && founds[j] == false)
                {
                    founds[j] = true;
                    break;
                }
            }
        }

        for(int i = 0; i < founds.length; i++)
        {
            if(founds[i] == false)
                return false;
        }

        return true;
    }

    // toString method
    public String toString() {
        String result = "{";

        for(int i = 0; i < points.length; i++)
        {
            if(i != points.length - 1)
            {
                result += points[i] + ", ";
            }
            else result += points[i];
        }

        result += "}";

        return result;
    }

    // data field
    private Point points[];

    // Constructor part 1
    public PointArray(double array[])
    {
        points = new Point[array.length / 2];

        int i = 0;
        int j = 0;
        while(i < array.length)
        {
            points[j] = new Point(array[i], array[i + 1]);

            i += 2;
            j++;
        }
    }

    // Constructor part 2
    public PointArray(FileInputStream net) throws IOException {
        byte b1[] = new byte[net.available()];
        net.read(b1, 0, b1.length);

        char ch = (char) b1[0];
        int size = Integer.parseInt("" + ch);

        String lines[] = new String[size];
        for(int i = 0; i < lines.length; i++)
            lines[i] = "";

        int k = 0;
        int count = 0;

        for(int i = 3; i < b1.length; i++)
        {
            if(b1[i] == '\n')
            {
                count++;

                if(count == 1)
                    k++;
            }

            else
            {
                lines[k] += (char) b1[i];
                count = 0;
            }
        }

        points = new Point[size];

        int j = 0;
        for(int i = 0; i < lines.length; i++)
        {
            String line = lines[i];
            String tokens[] = line.split(" ");

            double x_coordinate = Double.parseDouble(tokens[0]);
            double y_coordinate = Double.parseDouble(tokens[1]);
            points[j] = new Point(x_coordinate, y_coordinate);
            j++;
        }

        net.close();
    }
}

