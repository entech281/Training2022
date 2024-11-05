package frc.training;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPoint {

    @Test
    public void testGettingCoordinates(){
        Point p = new Point(1.0, 2.0);
        assertEquals(1.0, p.getX(), 0.001);
        assertEquals(2.0, p.getY(), 0.001);
    }

    @Test
    public void testToString(){
        assertEquals("(0.0,1.0)", new Point(0.0,1.0) + "");
    }

    @Test
    public void testCircle(){
        Point circleP = new Point(0, 1);
        double radius = 3;

        assertEquals(0.0, Circle.point(circleP).getX());
        assertEquals(1.0, Circle.point(circleP).getY());
        assertEquals(19, Circle.perimeterMethod(radius));
        assertEquals(28, Circle.areaMethod(radius));

        System.out.println("Center point of circle: " + Circle.point(circleP));
        System.out.println("Circle perimeter: " + Circle.perimeterMethod(radius));
        System.out.println("Circle area: " + Circle.areaMethod(radius));
        
    }

    @Test
    public void testSquare(){
        Point squareP = new Point(1, 2);
        double sideLength = 5;

        assertEquals(1, Square.point(squareP).getX());
        assertEquals(2, Square.point(squareP).getY());
        assertEquals(20, Square.perimeterMethod(sideLength));
        assertEquals(25, Square.areaMethod(sideLength));

        System.out.println("Center point of square: " + Square.point(squareP));
        System.out.println("Square perimeter: " + Square.perimeterMethod(sideLength));
        System.out.println("Square area: " + Square.areaMethod(sideLength));
    }

    @Test
    public void testRectangle(){
        Point rectangleP1 = new Point(-1,-1);
        Point rectangleP2 = new Point(1, 2);

        assertEquals(-1, Rectangle.point1(rectangleP1).getX());
        assertEquals(-1, Rectangle.point1(rectangleP1).getY());
        assertEquals(1, Rectangle.point2(rectangleP2).getX());
        assertEquals(2, Rectangle.point2(rectangleP2).getY());
        assertEquals(3, Rectangle.lengthMethod(rectangleP1, rectangleP2));
        assertEquals(2, Rectangle.widthMethod(rectangleP1, rectangleP2));
        assertEquals(10, Rectangle.perimeterMethod(rectangleP1, rectangleP2));
        assertEquals(6, Rectangle.areaMethod(rectangleP1, rectangleP2));

        System.out.println("Bottom left point of rectangle: " + Rectangle.point1(rectangleP1));
        System.out.println("Top right point of rectangle: " + Rectangle.point2(rectangleP2));
        System.out.println("Length of rectangle: " + Rectangle.lengthMethod(rectangleP1, rectangleP2));
        System.out.println("Width of rectangle: " + Rectangle.widthMethod(rectangleP1, rectangleP2));
        System.out.println("Perimeter of rectangle: " + Rectangle.perimeterMethod(rectangleP1, rectangleP2));
        System.out.println("Area of rectangle: " + Rectangle.areaMethod(rectangleP1, rectangleP2));
    }
}
