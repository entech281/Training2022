package frc.training;

public class Circle extends Shape{

    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    @Override
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

}
