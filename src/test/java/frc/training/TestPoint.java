package frc.training;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.beans.Transient;


public class TestPoint {



    @Test
    public void testGettingCoordinats(){
        Point p = new Point(1.0, 2.0);
        assertEquals(1.0, p.getX(), 0.001);
        assertEquals(2.0, p.getY(), 0.001);
    }

    @Test
    public void testToString(){
        assertEquals("(0.0,1.0)", new Point(0.0,1.0) + "");
    }

/*
    These need to be converted to use the new classes
 
    @Test
    public void testingCircleCircumference() {
        Calculations formulas = new Calculations();

        //this point doesn't really matter because this formula
        //does not need it but the instructions said this was the
        //input so I incorporated it.
        final Point center = new Point(0, 0);


        //happy path
        assertEquals(18.8496, formulas.circumferenceOfCircle(center, 3), 0.001);

        //null center
        assertEquals(18.8496, formulas.circumferenceOfCircle(null, 3), 0.001);

        //negative radius
        assertEquals(18.8496, formulas.circumferenceOfCircle(center, -3), 0.001);
        
    }



    @Test
    public void testingCircleArea() {
        Calculations formulas = new Calculations();

        //this point doesn't really matter because this formula
        //does not need it but the instructions said this was the
        //input so I incorporated it.
        final Point center = new Point(0, 0);


        //happy path
        assertEquals(28.2743339, formulas.areaOfCircle(center, 3), 0.001);

        //null center
        assertEquals(28.2743339, formulas.areaOfCircle(null, 3), 0.001);

        //negative radius
        assertEquals(28.2743339, formulas.areaOfCircle(center, -3), 0.001);
        
    }
    
    @Test
    public void testingSquareArea() {
        Calculations formulas = new Calculations();

        //this point doesn't really matter because this formula
        //does not need it but the instructions said this was the
        //input so I incorporated it.
        final Point center = new Point(0, 0);

        //happy path
        assertEquals(25, formulas.areaOfSquare(center, 5), 0.001);

        //length of zero
        assertEquals(0, formulas.areaOfSquare(center, 0), 0.001);
        
        //wait...negative length? I think you meant that to be positive
        assertEquals(25, formulas.areaOfSquare(center, -5), 0.001);

        //null center
        assertEquals(25, formulas.areaOfSquare(null, 5), 0.001);


    }




    @Test
    public void testingSquarePerimeter() {
        Calculations formulas = new Calculations();

        //this point doesn't really matter because this formula
        //does not need it but the instructions said this was the
        //input so I incorporated it.
        final Point center = new Point(0, 0);

        //happy path
        assertEquals(20, formulas.perimeterOfSquare(center, 5), 0.001);

        //length of zero
        assertEquals(0, formulas.areaOfSquare(center, 0), 0.001);
        
        //wait...negative length? I think you meant that to be positive
        assertEquals(20, formulas.perimeterOfSquare(center, -5), 0.001);

        //null center
        assertEquals(20, formulas.perimeterOfSquare(null, 5), 0.001);

        
    }

    
    @Test
    public void testingRectangleArea() {
        Calculations formulas = new Calculations();

        //happy path
        Point bottomLeft = new Point(0, 0);
        Point topRight = new Point(1, 1);
        
        assertEquals(1, formulas.areaOfRectangle(bottomLeft, topRight), 0.001);


        //testing when points are the same
        bottomLeft = new Point(0, 0);
        topRight = new Point(0, 0);
        
        assertEquals(0, formulas.areaOfRectangle(bottomLeft, topRight), 0.001);



        //testing points are passed in reverse
        bottomLeft = new Point(-1, -1);
        topRight = new Point(0, 0);

        assertEquals(1, formulas.areaOfRectangle(topRight, bottomLeft), 0.001);


        //testing when points are just in the wrong position
        Point topLeft = new Point(-1, 1);
        Point bottomRight = new Point(0, 0);

        assertEquals(1, formulas.areaOfRectangle(topLeft, bottomRight), 0.001);

        
        //testing when points are just in the wrong position (reversed)
        assertEquals(1, formulas.areaOfRectangle(bottomRight, topLeft), 0.001);


        //testing when points have the same y-value (line segment)
        bottomLeft = new Point(0, 0);
        topRight = new Point(2, 0);

        assertEquals(0, formulas.areaOfRectangle(bottomLeft, topRight), 0.001);


        //testing when points have the same x-value (line segment)
        bottomLeft = new Point(0, 0);
        topRight = new Point(0, 2);

        assertEquals(0, formulas.areaOfRectangle(bottomLeft, topRight), 0.001);

        //null points
        assertEquals(null, formulas.areaOfRectangle(null, null));
        
    }

    @Test
    public void testingRectanglePerimeter() {
        Calculations formulas = new Calculations();

        //happy path
        Point bottomLeft = new Point(0, 0);
        Point topRight = new Point(1, 1);
        
        assertEquals(4, formulas.perimeterOfRectangle(bottomLeft, topRight), 0.001);


        //testing when points are the same
        bottomLeft = new Point(0, 0);
        topRight = new Point(0, 0);
        
        assertEquals(0, formulas.perimeterOfRectangle(bottomLeft, topRight), 0.001);


        //testing points are passed in reverse
        bottomLeft = new Point(-1, -1);
        topRight = new Point(0, 0);

        assertEquals(4, formulas.perimeterOfRectangle(topRight, bottomLeft), 0.001);


        //testing when points are just in the wrong position
        Point topLeft = new Point(-1, 1);
        Point bottomRight = new Point(0, 0);

        assertEquals(4, formulas.perimeterOfRectangle(topLeft, bottomRight), 0.001);

        
        //testing when points are just in the wrong position (reversed)
        assertEquals(4, formulas.perimeterOfRectangle(bottomRight, topLeft), 0.001);


        //testing when points have the same y-value (line segment)
        bottomLeft = new Point(0, 0);
        topRight = new Point(2, 0);

        assertEquals(2, formulas.perimeterOfRectangle(bottomLeft, topRight), 0.001);


        //testing when points have the same x-value (line segment)
        bottomLeft = new Point(0, 0);
        topRight = new Point(0, 2);

        assertEquals(2, formulas.perimeterOfRectangle(bottomLeft, topRight), 0.001);

        //null points
        assertEquals(null, formulas.perimeterOfRectangle(null, null));
        
    }


    @Test
    public void testingTriangleArea() {
        Calculations formulas = new Calculations();

        //happy path
        assertEquals(0.5, formulas.areaOfTriangle(new Point(0, 0), new Point(-1, -1), new Point(1, 2)), 0.001);

        //null points
        assertEquals(null, formulas.areaOfTriangle(null, null, null));

        //two of the points are the same
        assertEquals(0.0, formulas.areaOfTriangle(new Point(0, 0), new Point(0, 0), new Point(1, 2)), 0.001);

        //all of the points are the same
        assertEquals(0.0, formulas.areaOfTriangle(new Point(-1, -1), new Point(-1, -1), new Point(-1, -1)), 0.001);

        //Easter Egg
        assertEquals(0.0, formulas.areaOfTriangle(new Point(-1, 1), new Point(-2, -1), new Point(-1, -1), "Give me an Easter Egg"), 0.001);

    }



    @Test
    public void testingTrianglePerimeter() {
        Calculations formulas = new Calculations();

        //happy path
        assertEquals(Math.sqrt(2) + Math.sqrt(13) + Math.sqrt(5), formulas.perimeterOfTriangle(new Point(0, 0), new Point(-1, -1), new Point(1, 2)), 0.001);

        //null points
        assertEquals(null, formulas.perimeterOfTriangle(null, null, null));

        //two of the points are the same (line segment)
        assertEquals(Math.sqrt(5), formulas.perimeterOfTriangle(new Point(0, 0), new Point(0, 0), new Point(1, 2)), 0.001);

        //all of the points are the same
        assertEquals(0.0, formulas.perimeterOfTriangle(new Point(-1, -1), new Point(-1, -1), new Point(-1, -1)), 0.001);

    }

    */

    @Test
    public void testSquare()
    {
        assertEquals(16, new Square(new Point(1, 2), 4).getArea());
    }

}
 