package frc.training;

public class Square extends Shape {

    protected double Length;

    enum corner {
        Bottom_Left,
        Top_Left,
        Top_Right,
        Bottom_Right
    }

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

    public Point getCorner(corner corner) {

        double leftSide = this.getCenter().getX() - (this.getLength()/2);
        double bottomSide = this.getCenter().getY() - (this.getLength()/2);

        switch (corner) {
            case Bottom_Left:
                return new Point(leftSide, bottomSide);
            case Top_Left:
                return new Point(leftSide, bottomSide+this.getLength());
            case Top_Right:
                return new Point(leftSide+this.getLength(), bottomSide+this.getLength());
            case Bottom_Right:
                return new Point(leftSide+this.getLength(), bottomSide);
            default:
                return new Point(0.0, 0.0);
        }
    }
}
