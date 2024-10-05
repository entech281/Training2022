package frc.training.Shapes;

import frc.training.Point;


public class Triangle extends Shape {

    protected Point point1;
    protected Point point2;
    protected Point point3;

    public Triangle (Point point1, Point point2, Point point3)
    {
        //TO DO: Calculate center and altitude if its worth it
        super(null, 1);

        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Triangle (Point mPoint1, Point mPoint2, Point mPoint3, boolean easterEgg)
    {
        this (mPoint1, mPoint2, mPoint3);

        if (easterEgg)
        {
            System.out.println("You found an easter egg!\nHere's a Wikipedia article:\n\thttps://en.wikipedia.org/wiki/Larqanku\nThe time is " + System.currentTimeMillis() + " tau is better than pi\n//codes make you happy");
        }
    }

    @Override
    public double getArea() {

        if (point1.equals(point2) || point1.equals(point3) || point2.equals(point3))
        {
            return 0.0;
        }

        double slopeOfBase = (point1.getY() - point2.getY()) / (point1.getX() - point2.getX());
        double yInterceptOfBase = -(slopeOfBase * point1.getX() - point3.getY());
        double slopeOfAltitude = -slopeOfBase;
        double yInterceptOfAltitude = -(slopeOfAltitude * point3.getX() - point3.getY());

        //Equation for linear functions y = mx + b
        double subtractedSlopes = slopeOfBase - slopeOfAltitude;
        double subtractedYIntercepts = yInterceptOfBase - yInterceptOfAltitude;

        double x = -(subtractedYIntercepts) / subtractedSlopes;
        double y = slopeOfBase * x + yInterceptOfBase;

        Point intersectionOfAltitudeAndBase = new Point(x, y);

        double height = Math.sqrt(Math.pow(intersectionOfAltitudeAndBase.getX() - point3.getX(), 2) + Math.pow(intersectionOfAltitudeAndBase.getY() - point3.getY(), 2));
        double base = Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));

        return base * height / 2;
    }

    @Override
    public double getPerimeter() {
        
        double length1 = Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
        double length2 = Math.sqrt(Math.pow(point2.getX() - point3.getX(), 2) + Math.pow(point2.getY() - point3.getY(), 2));
        double length3 = Math.sqrt(Math.pow(point1.getX() - point3.getX(), 2) + Math.pow(point1.getY() - point3.getY(), 2));

        return length1 + length2 + length3;
    }


}
