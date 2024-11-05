// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.training;

/** Add your docs here. */
public class Rectangle {
    public static Point point1 (Point bottomLeftPoint) {
        return bottomLeftPoint;
    }

    public static Point point2 (Point topRightPoint) {
        return topRightPoint;
    }

    public static double lengthMethod (Point bottomLeftPoint, Point topRightPoint) {
        double length = Math.abs(bottomLeftPoint.getY() - topRightPoint.getY());

        return length;
    }

    public static double widthMethod (Point bottomLeftPoint, Point topRightPoint) {
        double width = Math.abs(bottomLeftPoint.getX() - topRightPoint.getX());

        return width;
    }

    public static double perimeterMethod (Point bottomLeftPoint, Point topRightPoint) {
		double perimeter = (2 * lengthMethod(bottomLeftPoint, topRightPoint)) + (2 * widthMethod(bottomLeftPoint, topRightPoint));
        perimeter = Math.round(perimeter);

		return perimeter;
	}

    public static double areaMethod (Point bottomLeftPoint, Point topRightPoint) {
		double area = lengthMethod(bottomLeftPoint, topRightPoint) * widthMethod(bottomLeftPoint, topRightPoint);
        area = Math.round(area);
        
		return area;
	}

    public static void main (String[]args){

    }
}
