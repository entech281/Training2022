package main.java.frc.training.Shapes;

public class Circle extends Shape {

    public Circle (Point mCenter, double mRadius)
    {
        super (mCenter, mRadius);
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
