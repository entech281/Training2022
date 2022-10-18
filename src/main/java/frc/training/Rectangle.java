package frc.training;

public class Rectangle extends Shape {

    protected Point bottomLeftCorner;
    protected Point topRightCorner;
    
    enum Corner {
        BOTTOM_LEFT,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT
    }


    public Rectangle(Point bottomLeftCorner, Point topRightCorner) {

        if ((bottomLeftCorner + "").equals(topRightCorner + "")) {
            throw new ZeroOrNegitiveValueError("Both points for Rectangle must have diiferent coordinents.");
        }

        this.bottomLeftCorner = bottomLeftCorner;
        this.topRightCorner = topRightCorner;
    }

    public double getWidth() {
        return topRightCorner.getX() - bottomLeftCorner.getX();
    }

    public double getHight() {
        return topRightCorner.getY() - bottomLeftCorner.getY();
    }

    public Point getCorners(Corner corner) {

        double leftSide = bottomLeftCorner.getX();
        double bottomSide = bottomLeftCorner.getY();

        switch (corner) {
            case BOTTOM_LEFT:
                return new Point(leftSide, bottomSide);
            case TOP_LEFT:
                return new Point(leftSide, bottomSide+getHight());
            case TOP_RIGHT:
                return new Point(leftSide+getWidth(), bottomSide+getHight());
            case BOTTOM_RIGHT:
                return new Point(leftSide+getWidth(), bottomSide);
            default:
                throw new HowDidWeGetHere("No really how did you get this error");
        }
    }

    @Override
    public Point getCenter() {

        double xSum = bottomLeftCorner.getX() + topRightCorner.getX();
        double ySum = bottomLeftCorner.getY() + topRightCorner.getY();

        return new Point(xSum/2, ySum/2);
    }

    @Override
    public double getArea() {
        return Math.abs(getWidth() * getHight());
    }

    @Override
    public String toString() {
        return "(" + getCenter() + ", p=" + Math.round(getPerimeter() * 1000.0) / 1000.0 + ", a=" + Math.round(getArea() * 1000.0) / 1000.0 + ", Rectangle)";
    }

    @Override
    public double getPerimeter() {
        return (getWidth() * 2) + (getHight() * 2);
    }
}
