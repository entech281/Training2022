package frc.training;

public class Circle {

    protected Point centerPoint;
    protected double Radius;
    protected double Area;

    public Circle(Point centerPoint, double Radius) throws Exception {
        if (Radius <= 0.0) {
            throw new Exception("Radius must be greater than 0."); 
        }
        this.centerPoint = centerPoint;
        this.Radius = Radius;
    }

    public Point getCenter() {
        return this.centerPoint;
    }

    public double getArea() {
        return Math.PI*(this.Radius*this.Radius);
    }

    public double getCircumference() {
        return Math.PI*this.Radius*2;
    }
    public double getRadius() {
        return this.Radius;
    }

    @Override
    public String toString(){
        return "(" + this.getCenter() + ", r=" + this.getRadius() + ")";
    }

}
