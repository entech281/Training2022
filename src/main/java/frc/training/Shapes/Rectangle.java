package frc.training.Shapes;

import frc.training.Point;

public class Rectangle extends Shape{

    protected double width;
    
    public Rectangle (Point center, double length, double width) 
    {
        super(center, Math.abs(length));

        this.width = Math.abs(width);
    }

    public Rectangle (Point topRight, Point bottomLeft) {

        this(getCenter(topRight, bottomLeft), getLength(topRight, bottomLeft), getWidth(topRight, bottomLeft));
    
    }


    protected static double getLength(Point point1, Point point2)
    {
        return Math.abs(point1.getX() - point2.getX());
    }

    protected static double getWidth (Point point1, Point point2) 
    {
        return Math.abs(point1.getY() - point2.getY());
    }

    protected static Point getCenter (Point point1, Point point2)
    {
        return new Point ((point1.getX() + point2.getX()) / 2, (point1.getY() + point2.getY()) / 2);
    }


    @Override
    public double getArea()
    {
        return length * width;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * length + 2 * width;
    }
}
