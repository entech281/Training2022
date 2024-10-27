package frc.training.Shapes;

import frc.training.Point;

public class Circle extends Shape {
    
    private Point center;
    private double radius;

    public  Circle(Point center, double radius){
        if(radius<0){
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.center = center;
        this.radius = radius;
        }

    @Override
    public double getArea(){
        return Math.PI* Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    
}
