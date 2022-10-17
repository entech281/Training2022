package frc.training;

import java.lang.Math;

public class Triangle extends Shape {

    protected Point pointA;
    protected Point pointB;
    protected Point pointC;

    enum Corner {
        CORNER_A,
        CORNER_B,
        CORNER_C
    }

    //Haven't got how to condense this in to another maethod yet
    public Triangle(Point pointA, Point pointB, Point pointC) {

        if (pointA.getY() == pointB.getY() && pointA.getY() == pointC.getY()) {
            throw new ZeroOrNegitiveValueError("No triangle can not form a line the line formed has slope: Zero.");
        }

        if (pointA.getX() == pointB.getX() && pointA.getX() == pointC.getX()) {
            throw new ZeroOrNegitiveValueError("No triangle can not form a line the line formed has slope: Undifined.");
        }

        double slopeA = Math.abs((pointA.x - pointB.x)/(pointA.y - pointB.y));
        double slopeB = Math.abs((pointA.x - pointC.x)/(pointA.y - pointC.y));

        if (slopeA == slopeB) {
            throw new ZeroOrNegitiveValueError("No triangle can not form a line the line formed has slope: " + slopeA);
        }
        
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Point getCorner(Corner corner) {
        switch (corner) {
            case CORNER_A:
                return pointA;
            case CORNER_B:
                return pointB;
            case CORNER_C:
                return pointC;
            default:
                throw new HowDidWeGetHere("No really how did you getthis error");
        }
    }

    public double getArea() {

        double pairA = pointA.getX() * (pointB.getY() + pointC.getY());
        double pairB = pointB.getX() * (pointC.getY() + pointA.getY());
        double pairC = pointC.getX() * (pointA.getY() + pointB.getY());

        double pairSum = Math.abs(pairA + pairB + pairC); 

        return pairSum/2;
    }

    @Override
    public Point getCenter() {
        double xSum = pointA.getX() + pointB.getX() + pointC.getX();
        double ySum = pointA.getY() + pointB.getY() + pointC.getY();
        return new Point(xSum/3.0, ySum/3.0);
    }
}
