package frc.training;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import frc.training.Rectangle.Corner;

public class TestRectangle extends TestNeeds {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(new Point(-1,-1), new Point(1,1));

        System.out.println(r+"");
    }

    @Test
    public void testGetAreaForUnitRectangle() {
        Rectangle rPostive = new Rectangle(new Point(0,0), new Point(2,2));
        Rectangle rMidway = new Rectangle(new Point(-1,-1), new Point(1,1));
        Rectangle rNegitive = new Rectangle(new Point(0,0), new Point(-2,-2));

        assertEquals(4.0, rPostive.getArea(), SMALLDIFFERENCE);
        assertEquals(4.0, rMidway.getArea(), SMALLDIFFERENCE);
        assertEquals(4.0, rNegitive.getArea(), SMALLDIFFERENCE);
    }

    @Test
    public void testGetCenterForUnitRectangle() {
        Rectangle rPostive = new Rectangle(new Point(0,0), new Point(2,2));
        Rectangle rMidway = new Rectangle(new Point(-1,-1), new Point(1,1));
        Rectangle rNegitive = new Rectangle(new Point(0,0), new Point(-2,-2));

        assertEquals("(1.0,1.0)", rPostive.getCenter() + "");
        assertEquals("(0.0,0.0)", rMidway.getCenter() + "");
        assertEquals("(-1.0,-1.0)", rNegitive.getCenter() + "");
    }

    @Test
    public void testGetCornersForUnitRectangle() {
        Rectangle r = new Rectangle(new Point(-1,-1), new Point(1,1));

        assertEquals("(-1.0,-1.0)", r.getCorners(Corner.BOTTOM_LEFT) + "");
        assertEquals("(1.0,1.0)", r.getCorners(Corner.TOP_RIGHT) + "");
        assertEquals("(-1.0,1.0)", r.getCorners(Corner.TOP_LEFT) + "");
        assertEquals("(1.0,-1.0)", r.getCorners(Corner.BOTTOM_RIGHT) + "");
    }

    @Test
    public void testToString() {
        Rectangle r = new Rectangle(new Point(-1,-1), new Point(1,1));

        assertEquals("((0.0,0.0), w=2.0, h=2.0, Rectangle)", r + "");
    }
}
