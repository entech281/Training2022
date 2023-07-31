package frc.training;

public class LineSegment {

    private Point a;
    private Point b;

    public LineSegment(Point a, Point b){
        this.a = a;
        this.b = b;
    }

    public Point getFirstPoint(){
        return this.a;
    }

    public Point getSecondPoint(){
        return this.b;
    }
        
    public double getLength(){
        double xDifference = a.getX()-b.getX();
        double yDifference = a.getY()-b.getY();
        return Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
    }

}
