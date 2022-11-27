package frc.training;

public class Circle {
    protected double r = 0;
    protected Point point;

    public Circle(double r, Point point){
        this.r = r;
        this.point = point;
        System.out.println(point);
    }

    public double getArea(){
        return Math.PI * this.r * this.r;
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.r;
    }

    @Override
    public String toString(){
        return "Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}
