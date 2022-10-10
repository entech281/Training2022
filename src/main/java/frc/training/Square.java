package frc.training;

public class Square extends Shape {

    protected double Length;

    public Square(Point centerPoint, double length) {
        super(centerPoint);
        if (length <= 0.0) {
            throw new ZeroOrNegitiveValueError("Square length must be greater than zero.");
        }
        this.Length = length;
    }

    public double getLength() {
        return this.Length;
    }

    @Override
    public String toString() {
        return "(" + this.getCenter() + ", l=" + this.getLength() + ", Square)";
    }
}
