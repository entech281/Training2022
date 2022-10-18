package frc.training;

import org.junit.Test;

import frc.training.Triangle.Corner;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;

public class TestTriangle extends TestNeeds {
    
    protected static final double SMALLDIFFERENCE = 0.001;
    
    @Test
    public void testConstuctorErrorForMakingLineZero() {
        assertThrows(Exception.class, () -> new Triangle(new Point(0,0), new Point(1,0), new Point(2,0)));
    }

    @Test
    public void testConstuctorErrorForMakingLineUndifined() {
        assertThrows(Exception.class, () -> new Triangle(new Point(1,7), new Point(1,6), new Point(1,2)));
    }

    @Test
    public void testConstuctorErrorForMakingLine() {
        assertThrows(Exception.class, () -> new Triangle(new Point(3,4), new Point(6,8), new Point(0,0)));
    }

    @Test
    public void testGetCenterPoint() {
        Point a = new Point(0,1);
        Point b = new Point(-1,-1);
        Point c = new Point(1,0);

        Triangle T = new Triangle(a, b, c);

        assertEquals(0.0, T.getCenter().getY(), SMALLDIFFERENCE);
        assertEquals(0.0, T.getCenter().getX(), SMALLDIFFERENCE);
    }

    @Test
    public void testGetCenterPointForNegitiveCentroid() {
        Point a = new Point(-1,-1);
        Point b = new Point(-2,0);
        Point c = new Point(-3,-2);

        Triangle T = new Triangle(a, b, c);

        assertEquals(-1.0, T.getCenter().getY(), SMALLDIFFERENCE);
        assertEquals(-2.0, T.getCenter().getX(), SMALLDIFFERENCE);
    }

    @Test
    public void testGetCenterPointForPositiveCentroid() {
        Point a = new Point(1,1);
        Point b = new Point(8,9);
        Point c = new Point(0,2);

        Triangle T = new Triangle(a, b, c);

        assertEquals(4.0, T.getCenter().getY(), SMALLDIFFERENCE);
        assertEquals(3.0, T.getCenter().getX(), SMALLDIFFERENCE);
    }

    @Test
    public void testGetCorners() {
        Point a = new Point(0,1);
        Point b = new Point(-1,-1);
        Point c = new Point(1,0);

        Triangle T = new Triangle(a, b, c);

        assertEquals("(0.0,1.0)", T.getCorner(Corner.CORNER_A) + "");
        assertEquals("(-1.0,-1.0)", T.getCorner(Corner.CORNER_B) + "");
        assertEquals("(1.0,0.0)", T.getCorner(Corner.CORNER_C) + "");
    }

    @Test
    public  void testGetArea() {
        Point a = new Point(0,0);
        Point b = new Point(-10,0);
        Point c = new Point(0,-10);

        Triangle T = new Triangle(a, b, c);

        assertEquals(50.0, T.getArea(), SMALLDIFFERENCE);
    }

    @Test
    public void testGetPerimeter() {
        Point a = new Point(0,1);
        Point b = new Point(-1,-1);
        Point c = new Point(1,0);

        Triangle T = new Triangle(a, b, c);

        assertEquals(5.886, T.getPerimeter(), SMALLDIFFERENCE);
    }

    @Test
    public void testToString() {
        Point a = new Point(0,1);
        Point b = new Point(-1,-1);
        Point c = new Point(1,0);

        Triangle T = new Triangle(a, b, c);

        assertEquals("((0.0,0.0), p=5.886, a=1.5, Triangle)", T + "");
    }
}
