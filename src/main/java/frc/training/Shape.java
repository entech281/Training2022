package frc.training;

public abstract class Shape {
    public abstract Point getCenter();
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public abstract String toString();
}
