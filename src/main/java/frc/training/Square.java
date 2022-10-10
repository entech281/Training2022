package frc.training;

public class Square extends Shape {

    protected double Length;

    enum Corner {
        BOTTOM_LEFT,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT
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

    public Point getCorner(Corner corner) {

        double leftSide = this.getCenter().getX() - (this.getLength()/2);
        double bottomSide = this.getCenter().getY() - (this.getLength()/2);

        switch (corner) {
            case BOTTOM_LEFT:
                return new Point(leftSide, bottomSide);
            case TOP_LEFT:
                return new Point(leftSide, bottomSide+this.getLength());
            case TOP_RIGHT:
                return new Point(leftSide+this.getLength(), bottomSide+this.getLength());
            case BOTTOM_RIGHT:
                return new Point(leftSide+this.getLength(), bottomSide);
            default:
                return new Point(0.0, 0.0);
        }
    }
}
