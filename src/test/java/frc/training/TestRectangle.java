package frc.training;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import frc.training.Rectangle.Corner;

public class TestRectangle extends TestNeeds {

    protected static final double SMALLDIFFERENCE = 0.001;

    @Test
    public void testGetArea() {
        Rectangle rPostive = new Rectangle(new Point(0,0), new Point(2,2));
        Rectangle rMidway = new Rectangle(new Point(-1,-1), new Point(1,1));
        Rectangle rNegitive = new Rectangle(new Point(0,0), new Point(-2,-2));

        assertEquals(4.0, rPostive.getArea(), SMALLDIFFERENCE);
        assertEquals(4.0, rMidway.getArea(), SMALLDIFFERENCE);
        assertEquals(4.0, rNegitive.getArea(), SMALLDIFFERENCE);
    }

    @Test
    public void testGetCenterPoint() {
        Rectangle rPostive = new Rectangle(new Point(0,0), new Point(2,2));
        Rectangle rMidway = new Rectangle(new Point(-1,-1), new Point(1,1));
        Rectangle rNegitive = new Rectangle(new Point(0,0), new Point(-2,-2));

        assertEquals("(1.0,1.0)", rPostive.getCenter() + "");
        assertEquals("(0.0,0.0)", rMidway.getCenter() + "");
        assertEquals("(-1.0,-1.0)", rNegitive.getCenter() + "");
    }

    @Test
    public void testGetCorners() {
        Rectangle r = new Rectangle(new Point(-1,-1), new Point(1,1));

        assertEquals("(-1.0,-1.0)", r.getCorners(Corner.BOTTOM_LEFT) + "");
        assertEquals("(1.0,1.0)", r.getCorners(Corner.TOP_RIGHT) + "");
        assertEquals("(-1.0,1.0)", r.getCorners(Corner.TOP_LEFT) + "");
        assertEquals("(1.0,-1.0)", r.getCorners(Corner.BOTTOM_RIGHT) + "");
    }

    @Test
    public void testToString() {
        Rectangle r = new Rectangle(new Point(-1,-1), new Point(1,1));

        assertEquals("((0.0,0.0), p=8.0, a=4.0, Rectangle)", r + "");
    }

    @Test
    public void testGetPerimeter() {
        Rectangle r = new Rectangle(new Point(-1,-1), new Point(1,1));

        assertEquals(8, r.getPerimeter(), SMALLDIFFERENCE);
    }

    @Test
    public void testGetHight() {
        Rectangle r = new Rectangle(new Point(-1,-1), new Point(2,1));

        assertEquals(2.0, r.getHight(), SMALLDIFFERENCE);
    }

    @Test
    public void testGetWidth() {
        Rectangle r = new Rectangle(new Point(-1,-1), new Point(2,1));

        assertEquals(3.0, r.getWidth(), SMALLDIFFERENCE);
    }
}
