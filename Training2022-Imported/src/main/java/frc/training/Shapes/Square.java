package frc.training.Shapes;

import frc.training.Point;

public class Square extends Shape {

    private Point center;
    private double length; 

    public Square(Point center, double length) {
        if(length<0){
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.center = center;
        this.length = length;
    }

    

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    @Override
    public double getPerimeter() {
        return length * 4;
        }
    
}
