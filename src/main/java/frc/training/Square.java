package frc.training;

public class Square extends Shape {

    protected double length;
    protected Point centerPoint;

    enum Corner {
        BOTTOM_LEFT,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT
    }

    public Square(Point centerPoint, double length) {
        if (length <= 0.0) {
            throw new ZeroOrNegitiveValueError("Square length must be greater than zero.");
        }
        this.centerPoint = centerPoint;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return length*this.length;
    }

    public double getPerimeter() {
        return length*4;
    }

    @Override
    public String toString() {
        return "(" + getCenter() + ", p=" + Math.round(getPerimeter() * 1000.0) / 1000.0 + ", a=" + Math.round(getArea() * 1000.0) / 1000.0 + ", Square)";
    }

    @Override
    public Point getCenter() {
        return centerPoint;
    }

    public Point getCorner(Corner corner) {

        double leftSide = getCenter().getX() - (getLength()/2);
        double bottomSide = getCenter().getY() - (getLength()/2);

        switch (corner) {
            case BOTTOM_LEFT:
                return new Point(leftSide, bottomSide);
            case TOP_LEFT:
                return new Point(leftSide, bottomSide+getLength());
            case TOP_RIGHT:
                return new Point(leftSide+getLength(), bottomSide+getLength());
            case BOTTOM_RIGHT:
                return new Point(leftSide+getLength(), bottomSide);
            default:
                throw new HowDidWeGetHere("No really how did you get this error");
        }
    }
}
