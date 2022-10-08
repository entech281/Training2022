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

    public double getArea() {
        return this.Length*this.Length;
    }

    public double getPerimeter() {
        return this.Length*4;
    }

    @Override
    public String toString() {
        return "(" + this.getCenter() + ", l=" + this.getLength() + ", Square)";
    }

    public Point getCorner(int corner) {

        double leftSide = this.getCenter().getX() - (this.getLength()/2);
        double bottomSide = this.getCenter().getY() - (this.getLength()/2);

        switch (corner) {
            case 1:
                return new Point(leftSide, bottomSide);
            case 2:
                return new Point(leftSide, bottomSide+this.getLength());
            case 3:
                return new Point(leftSide+this.getLength(), bottomSide+this.getLength());
            case 4:
                return new Point(leftSide+this.getLength(), bottomSide);
            default:
                throw new RuntimeException("Invalid corner selected: " + corner + " Options are 1-4 going bottom left, top left, top right, bottom right");
        }
    }
}
