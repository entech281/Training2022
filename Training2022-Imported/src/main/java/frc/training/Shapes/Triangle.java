package frc.training.Shapes;

import frc.training.Point;

public class Triangle extends Shape {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public double getArea() {

        return Math.abs(p1.getX() * (p2.getY() - p3.getY()) + 
                        p2.getX() * (p3.getY() - p1.getY()) + 
                        p3.getX() * (p1.getY() - p2.getY())) / 2.0;
    }

    @Override
    public double getPerimeter() {
        double side1 = p1.distanceTo(p2);
        double side2 = p2.distanceTo(p3);
        double side3 = p3.distanceTo(p1);
        return side1 + side2 + side3;
    }
}

