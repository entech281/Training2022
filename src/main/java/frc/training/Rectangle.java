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

    public Point getCorners(Corner corner) {

        double width = topRightCorner.getX() - bottomLeftCorner.getX();
        double hight = topRightCorner.getY() - bottomLeftCorner.getY();

        double leftSide = bottomLeftCorner.getX();
        double bottomSide = bottomLeftCorner.getY();

        switch (corner) {
            case BOTTOM_LEFT:
                return new Point(leftSide, bottomSide);
            case TOP_LEFT:
                return new Point(leftSide, bottomSide+hight);
            case TOP_RIGHT:
                return new Point(leftSide+width, bottomSide+hight);
            case BOTTOM_RIGHT:
                return new Point(leftSide+width, bottomSide);
            default:
                throw new HowDidWeGetHere("No really how did you getthis error");
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
        double width = topRightCorner.getX() - bottomLeftCorner.getX();
        double hight = topRightCorner.getY() - bottomLeftCorner.getY();

        return Math.abs(width * hight);
    }

    @Override
    public String toString() {
        double width = topRightCorner.getX() - bottomLeftCorner.getX();
        double hight = topRightCorner.getY() - bottomLeftCorner.getY();
        return "(" + getCenter() + ", w=" + width + ", h=" + hight + ", Rectangle)";
    }
}
