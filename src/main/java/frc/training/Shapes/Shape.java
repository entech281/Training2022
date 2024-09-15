package main.java.frc.training.Shapes;

public abstract class Shape {
    
    protected Point center;
    protected double length;

    public Shape (Point mCenter, double mLength)
    {
        center = mCenter;
        length = mLength;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
