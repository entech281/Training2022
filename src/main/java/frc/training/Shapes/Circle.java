package frc.training.Shapes;

import frc.training.Point;

public class Circle extends Shape {

    public Circle (Point center, double radius)
    {
        super (center, Math.abs(radius));
    }

    public Circle (double radius)
    {
        this(new Point(0, 0), radius);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(length, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * length;
    }

}
