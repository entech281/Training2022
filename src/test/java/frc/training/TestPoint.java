package frc.training;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPoint {

    protected static final double SMALLDIFFERENCE = 0.001;

    @Test
    public void testGettingCoordinats(){
        Point p = new Point(1.0, 2.0);
        
        assertEquals(1.0, p.getX(), SMALLDIFFERENCE);
        assertEquals(2.0, p.getY(), SMALLDIFFERENCE);
    }

    @Test
    public void testToString(){
        assertEquals("(0.0,1.0)", new Point(0.0,1.0) + "");
    }

    /*
    @Test
    public void testMovingCoordinatsPositive(){
        Point p = new Point(0.0, 0.0);
        p.move(1.0, 2.0);
        assertEquals(1.0, p.getX(), SMALLDIFFERENCE);
        assertEquals(2.0, p.getY(), SMALLDIFFERENCE);
    }

    @Test
    public void testMovingCoordinatsNegitive(){
        Point p = new Point(0.0, 0.0);
        p.move(-1.0, -2.0);
        assertEquals(-1.0, p.getX(), SMALLDIFFERENCE);
        assertEquals(-2.0, p.getY(), SMALLDIFFERENCE);
    }
    */


}
