// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.training;

/** Add your docs here. */
public class Square {
    public static Point point (Point squareCenterPoint) {
        return squareCenterPoint;
    }

    public static double perimeterMethod (double sideLength) {
		double perimeter = 4 * sideLength;
        perimeter = Math.round(perimeter);

		return perimeter;
	}

    public static double areaMethod (double sideLength) {
		double area = sideLength * sideLength;
        area = Math.round(area);
        
		return area;
	}

    public static void main (String[]args){
        
    }
}
