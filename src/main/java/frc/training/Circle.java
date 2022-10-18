package frc.training;

public class Circle extends Shape {

    protected double Radius;
    protected Point centerPoint;

    public Circle(Point centerPoint, double Radius) {
        if (Radius <= 0.0) {
            throw new ZeroOrNegitiveValueError("Radius must be greater than 0."); 
        } 
        this.Radius = Radius;
        this.centerPoint = centerPoint;
    }

    public double getArea() {
        return Math.PI*(this.Radius*this.Radius);
    }
    
    public double getRadius() {
        return this.Radius;
    }

    @Override
    public String toString(){
        return "(" + getCenter() + ", p=" + Math.round(getPerimeter() * 1000.0) / 1000.0 + ", a=" + Math.round(getArea() * 1000.0) / 1000.0 + ", Circle)";
    }

    @Override
    public Point getCenter(){
        return centerPoint;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*this.Radius*2;
    }

    /*
    public void moveCenter(double x, double y) {
        this.centerPoint.move(x, y);
    }

    public void changeRadius(double z) {
        if (Radius + z <= 0.0) {
            throw new ZeroOrNegitiveValueError("Radius must remain greater than 0."); 
        }
        this.Radius = this.Radius + z;
    }
    */
    
}
