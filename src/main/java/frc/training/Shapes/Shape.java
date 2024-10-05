package frc.training.Shapes;

import frc.training.Point;

public abstract class Shape {
    
    protected Point center;
    protected double length;

    public Shape (Point center, double length)
    {
        this.center = center;
        this.length = length;
    }

    public static double getDistance(Point point1, Point point2)
    {
        return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(),2));
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
