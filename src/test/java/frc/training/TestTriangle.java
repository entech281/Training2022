package frc.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import frc.training.Shapes.Triangle;

public class TestTriangle {
    
    //TO DO
    //finish this test
    @Test
    public void testingTriangleArea() {
        
        Point point1 = new Point(0, 0);
        Point point2 = new Point(-1, -1);
        Point point3 = new Point(1, 2);

        Triangle recyclingSymbol = new Triangle(point1, point2, point3);

        //happy path
        assertEquals(0.5, recyclingSymbol.getArea(), 0.001);

        //null points
        try
        {
            Triangle nullTriangle = new Triangle(null, null, null);

            assertEquals(null, nullTriangle.getArea());
        } 
        catch (Exception exception)
        {
            assertEquals("java.lang.NullPointerException", exception.getClass().getName());
        }   

        //two of the points are the same
        point1 = point2;

        Triangle glorifiedLineSegment = new Triangle(point1, point2, point3);

        assertEquals(0.0, glorifiedLineSegment.getArea(), 0.001);

        //all of the points are the same
        point3 = point2;

        Triangle glorifiedPoint = new Triangle(point1, point2, point3);

        assertEquals(0.0, glorifiedPoint.getArea(), 0.001);

        //Easter Egg
        //come back for this
        //assertEquals(0.0, formulas.areaOfTriangle(new Point(-1, 1), new Point(-2, -1), new Point(-1, -1), "Give me an Easter Egg"), 0.001);

    }



    @Test
    public void testingTrianglePerimeter() {
        
         
        Point point1 = new Point(0, 0);
        Point point2 = new Point(-1, -1);
        Point point3 = new Point(1, 2);

        Triangle recyclingSymbol = new Triangle(point1, point2, point3);

        //happy path
        assertEquals(7.256, recyclingSymbol.getPerimeter(), 0.001);

        //null points
        try
        {
            Triangle nullTriangle = new Triangle(null, null, null);

            assertEquals(null, nullTriangle.getPerimeter());
        } 
        catch (Exception exception)
        {
            assertEquals("java.lang.NullPointerException", exception.getClass().getName());
        }   

        //two of the points are the same
        point1 = point2;

        Triangle glorifiedLineSegment = new Triangle(point1, point2, point3);

        //double the length between the two idendical points because
        //you said triangle so I'm going to give as if the line segment is repeated 
        //twice (once from point1 to point 3 then from point3 to point 2) which is
        //more like perimeter than just length
        assertEquals(3.60555127546 * 2, glorifiedLineSegment.getPerimeter(), 0.001);

        //all of the points are the same
        point3 = point2;

        Triangle glorifiedPoint = new Triangle(point1, point2, point3);

        assertEquals(0.0, glorifiedPoint.getPerimeter(), 0.001);


    }

}
