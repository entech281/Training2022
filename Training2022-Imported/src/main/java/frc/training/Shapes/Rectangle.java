package frc.training.Shapes;

import frc.training.Point;

public class Rectangle extends Shape {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    @Override
    public double getArea() {        
        double width = topRight.getX() - bottomLeft.getX();
        double height = topRight.getY() - bottomLeft.getY();
        return width * height;
    }

    @Override
    public double getPerimeter() {
        double width = topRight.getX() - bottomLeft.getX();
        double height = topRight.getY() - bottomLeft.getY();
        return 2 * (width + height);
    }
}
