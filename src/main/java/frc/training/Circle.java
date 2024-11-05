// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.training;

/** Add your docs here. */
public class Circle {
    public  Point point (Point circleCenterPoint) {
        return circleCenterPoint;
    }

    public  double perimeterMethod (double radius) {
		double perimeter = 2 * Math.PI * radius;
        perimeter = Math.round(perimeter);

		return perimeter;
	}

    public  double areaMethod (double radius) {
		double area = Math.PI * radius * radius;
        area = Math.round(area);
        
		return area;
	}

    public static void main (String[]args){
        Circle newCircle1 = new Circle();
        System.out.println(newCircle1.perimeterMethod(3));
    }
}
