package frc.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import frc.training.Shapes.Rectangle;

public class TestRectangle {

    @Test
    public void testingRectangleArea() {
        

        //happy path
        Point bottomLeft = new Point(0, 0);
        Point topRight = new Point(2, 1);

        Rectangle room = new Rectangle(topRight, bottomLeft);
        
        assertEquals(2, room.getArea(), 0.001);


        //testing when points are the same
        bottomLeft = new Point(0, 0);
        topRight = new Point(0, 0);
        
        Rectangle noSize = new Rectangle(topRight, bottomLeft);

        assertEquals(0, noSize.getArea(), 0.001);



        //testing points are passed in reverse
        bottomLeft = new Point(-1, -2);
        topRight = new Point(0, 0);

        Rectangle backwards = new Rectangle(bottomLeft, topRight);

        assertEquals(2, backwards.getArea(), 0.001);


        //testing when points are just in the wrong position
        Point topLeft = new Point(-1, 2);
        Point bottomRight = new Point(0, 0);

        Rectangle justPlainWrong = new Rectangle(topLeft, bottomRight);

        assertEquals(2, justPlainWrong.getArea(), 0.001);

        
        //testing when points are just in the wrong position (reversed)
        Rectangle wrongPlainJust = new Rectangle(bottomRight, topLeft);
        assertEquals(2, wrongPlainJust.getArea(), 0.001);


        //testing when points have the same y-value (line segment)
        bottomLeft = new Point(0, 0);
        topRight = new Point(2, 0);

        Rectangle verticalLine = new Rectangle(topRight, bottomLeft);

        assertEquals(0, verticalLine.getArea(), 0.001);


        //testing when points have the same x-value (line segment)
        bottomLeft = new Point(0, 0);
        topRight = new Point(0, 2);

        Rectangle horizontalLine = new Rectangle(topRight, bottomLeft);

        assertEquals(0, horizontalLine.getArea(), 0.001);

        //null points
        try
        {
            Rectangle nullRect = new Rectangle(null, null);

            assertEquals(null, nullRect.getArea());
        } 
        catch (Exception exception)
        {
            assertEquals("java.lang.NullPointerException", exception.getClass().getName());
        }
        
    }

    @Test
    public void testingRectanglePerimeter() {
        
               

        //happy path
        Point bottomLeft = new Point(0, 0);
        Point topRight = new Point(2, 1);

        Rectangle room = new Rectangle(topRight, bottomLeft);
        
        assertEquals(6, room.getPerimeter(), 0.001);


        //testing when points are the same
        bottomLeft = new Point(0, 0);
        topRight = new Point(0, 0);
        
        Rectangle noSize = new Rectangle(topRight, bottomLeft);

        assertEquals(0, noSize.getPerimeter(), 0.001);



        //testing points are passed in reverse
        bottomLeft = new Point(-1, -2);
        topRight = new Point(0, 0);

        Rectangle backwards = new Rectangle(bottomLeft, topRight);

        assertEquals(6, backwards.getPerimeter(), 0.001);


        //testing when points are just in the wrong position
        Point topLeft = new Point(-1, 2);
        Point bottomRight = new Point(0, 0);

        Rectangle justPlainWrong = new Rectangle(topLeft, bottomRight);

        assertEquals(6, justPlainWrong.getPerimeter(), 0.001);

        
        //testing when points are just in the wrong position (reversed)
        Rectangle wrongPlainJust = new Rectangle(bottomRight, topLeft);
        assertEquals(6, wrongPlainJust.getPerimeter(), 0.001);


        //this needs to be fixed
        //testing when points have the same y-value (line segment)
        bottomLeft = new Point(0, 0);
        topRight = new Point(2, 0);

        Rectangle verticalLine = new Rectangle(topRight, bottomLeft);

        assertEquals(4, verticalLine.getPerimeter(), 0.001);


        //testing when points have the same x-value (line segment)
        bottomLeft = new Point(0, 0);
        topRight = new Point(0, 2);

        Rectangle horizontalLine = new Rectangle(topRight, bottomLeft);

        assertEquals(4, horizontalLine.getPerimeter(), 0.001);

        //null points
        try
        {
            Rectangle nullRect = new Rectangle(null, null);

            assertEquals(null, nullRect.getPerimeter());
        } 
        catch (Exception exception)
        {
            assertEquals("java.lang.NullPointerException", exception.getClass().getName());
        }        
    }


}
