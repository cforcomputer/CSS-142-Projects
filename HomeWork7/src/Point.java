/**
 * Class : Point
 * Part a: Write an immutable class called Point to represent a point on the two
 * dimensional Cartesian plane, with the following variables and methods:
 * 1. Private data fields: x of type double and y of type double;
 * 2. Public constructor: only one constructor that takes a double x_coord and a double
 * y_coord as arguments;
 * 3. Public methods:
 * • boolean equals(Point anotherPoint) : returns true if the invoking Point is equal
 * to the argument Point. Two points are equal if they have the same x
 * coordinate and the same y coordinate;
 * • boolean lessThan(Point anotherPoint) : returns true if a Point is less than
 * another Point by the following rule: first compare points by their
 * ycoordinates, breaking ties by their x-coordinates.
 * Formally, the invoking Point (x 0 ,y 0 ) is less than the argument Point (x 1 ,y 1 ) if
 * and only if either y 0 < y 1 or if y 0 = y 1 and x 0 < x 1 ;
 * • double slopeTo(Point anotherPoint) : returns the slope between the invoking
 * Point and the argument Point. The slope between two points is given by the
 * formula: (y 1 − y 0 )/(x 1 − x 0 ). The slope of a vertical line segment should be
 * 1positive infinity, while the slope between a point and itself should be negative
 * infinity.
 * • int compareSlopes(Point anotherPoint) : returns −1 if the invoking Point has
 * slope less than the argument Point from the origin, 0 if both points have equal
 * slopes from the origin, and +1 if the invoking Point has slope greater than the
 * argument Point from the origin. Note: the origin is the point (0,0);
 * • String toString() : returns the string representation of a Point objects as
 * follows: (x, y).
 *
 * @author Patrick O'Brien
 * @version 1.0
 * */

// File: Point.java
public class Point {
    // data fields x and y
    private double x;
    private double y;

    // the constructor, takes x-coordinate and y-coordinate
    public Point(double x_coordinate, double y_coordinate) {
        x = x_coordinate;
        y = y_coordinate;
    }

    // the check if equals method, x==x and y==y, returns a boolean value
    public boolean equals(Point anotherPoint) {

        if(x == anotherPoint.x && y == anotherPoint.y)
            return true; //condition met
        else
            return false; //condition not met
    }

    // lessThan method, if y is less than an
    public boolean lessThan(Point anotherPoint) {

        if((y < anotherPoint.y) || (y == anotherPoint.y && x < anotherPoint.x))
            return true;
        else
            return false;
    }

    // slopeTo --> if x -x does not equal zero, the slope is equal to anotherPoint.y - y / (anotherPoint.x-x)
    public double slopeTo(Point anotherPoint) {

        double slope = 0;

        if(anotherPoint.x - x != 0)
            slope = (anotherPoint.y - y) / (anotherPoint.x - x);

        return slope;
    }

    //compare slopes is never used
    int compareSlopes(Point anotherPoint) {
        Point origin = new Point(0, 0);

        if(slopeTo(origin) < anotherPoint.slopeTo(origin))
            return -1;
        else if(slopeTo(origin) == anotherPoint.slopeTo(origin))
            return 0;
        else // if(slopeTo(origin) > anotherPoint.slopeTo(origin))
            return 1;
    }

    // the toString method --> convert values x and y to string and return
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}