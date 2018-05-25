/**PointArray.java**/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class PointArray
{
    private Point points[];

    public PointArray(double array[])
    {
        points=new Point[3];

        if(array.length%2==0)
        {
            for(int i=0,j=0;i<array.length/2;i++,j=j+2)
            {
                points[i]=new Point(array[j],array[j+1]);
            }
        }

        else
            System.out.println("Your array is not even, please enter an even sized array");
    }

    public PointArray(FileInputStream fis)
    {


    }

    public boolean contains3collinear()
    {
        double s1=points[0].slopeTo(points[1]);
        double s2=points[1].slopeTo(points[2]);
        if(s1==s2)
            return true;
        else
            return false;
    }

    public void sort()
    {
        Point p=new Point(0,0);

        for(int i=0;i<points.length-1;i++)
        {
            for(int j=i+1;j<points.length;j++)
            {
                if(!points[i].lessThan(points[j]))
                {
                    p=points[i];
                    points[i]=points[j];
                    points[j]=p;
                }
            }
        }
    }

    boolean equals(PointArray anotherPointArray)
    {
        boolean equal;

        if(points.length==anotherPointArray.points.length)
        {
            equal=false;
            for(int i=0;i<points.length;i++)
            {
                for(int j=0;j< anotherPointArray.points.length ;j++)
                {

                    if(points[i].equals(anotherPointArray.points[j]))
                    {
                        equal=true;
                        break;
                    }
                }

                if(equal!=true)
                {
                    return false;
                }
                else
                    equal=false;
            }
        }
        else
            System.out.println("Given two arrayPoint arrays does not have equal size");
        return true;

    }
    public String toString()
    {
        String pointString="";
        for(int i=0;i<points.length;i++)
        {
            pointString+=points[i].toString()+" ";
        }

        return pointString;
    }
}