/**Point.java**/

class Point {
    private double x,y;
    public Point(double x_coord,double y_coord)
    {
        x=x_coord;
        y=y_coord;

    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public boolean equals(Point anotherPoint) {

        if((x==anotherPoint.getX()) &&(y==anotherPoint.getY()) )
        {
            return true;
        }
        else
            return false;
    }

    public boolean lessThan(Point anotherPoint) {

        if(y<anotherPoint.getY() || ((y==anotherPoint.getY())&&(x==anotherPoint.getX())))
            return true;
        else
            return false;
    }

    public double slopeTo(Point anotherPoint) {

        double slope= (anotherPoint.getY()-y)/( anotherPoint.getX()-x );
        return slope;
    }

    public int compareSlopes(Point anotherPoint) {

        Point origin=new Point(0,0);
        double slope1= slopeTo(origin);
        double slope2= anotherPoint.slopeTo(origin);
        if(slope1==slope2)
            return 0;

        else if(slope1<slope2)
            return -1;

        else
            return 1;
    }

    public String toString() {

        return "("+x+","+y+")";
    }
}