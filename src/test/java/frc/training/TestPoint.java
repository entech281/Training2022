package frc.training;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

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

}
