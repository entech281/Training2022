package frc.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import frc.training.Shapes.Rectangle;

public class TestRectangle {
    
    @Test
    public void testRectanglePerimeter(){

        final Point bottomLeft = new Point(0,0);
        final Point topRight = new Point(6,8);

        Rectangle r = new Rectangle(bottomLeft, topRight);
        
        assertEquals(28.0, r.getPerimeter(), 0.001);
    }

    @Test
    public void testRectangleArea(){

        final Point bottomLeft = new Point(0,0);
        final Point topRight = new Point(6,8);

        Rectangle r = new Rectangle(bottomLeft, topRight);

        assertEquals(48, r.getArea(), 0.001);

    }
}
