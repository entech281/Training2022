package frc.training;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(Point corner1, Point corner2){
        length = Math.abs(corner1.getX()-corner2.getX());
        width = Math.abs(corner1.getY()-corner2.getY());
    }
    
    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

}
