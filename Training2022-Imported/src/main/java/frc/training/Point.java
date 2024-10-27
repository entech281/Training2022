package frc.training;

public class Point {

    protected double x = 0;
    protected double y = 0;

    public Point(double x, double y){
        this.x = x;
        this.y = y;

    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    @Override
    public String toString(){
        return "(" + getX() + "," + getY() + ")";
    }
    
    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

}
