package frc.training;

public class Circle extends Shape {

    protected double Radius;

    public Circle(Point centerPoint, double Radius) {
        super(centerPoint);
        if (Radius <= 0.0) {
            throw new ZeroOrNegitiveValueError("Radius must be greater than 0."); 
        } 
        this.Radius = Radius;
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
        return "(" + this.getCenter() + ", r=" + this.getRadius() + ", Circle)";
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
