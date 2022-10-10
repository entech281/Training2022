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

    @Override
    public String toString(){
        return "(" + this.getCenter() + ", r=" + this.getRadius() + ", Circle)";
    }
}
