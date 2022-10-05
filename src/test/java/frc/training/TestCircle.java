package frc.training;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestCircle {

    @Test
    public void testInputAndReturnRadiusOfUnitCicle() throws Exception {
        Circle c = new Circle(new Point(1.0, 0.0), 1.0);
        assertEquals(1.0, c.getRadius(), 0.001);
    }

    @Test
    public void testInputAndReturnCenterPointOfUnitCicle() throws Exception {
        Circle c = new Circle(new Point(1.0, 0.0), 1.0);
        assertEquals("(1.0,0.0)", c.getCenter() + "");
    }

    @Test
    public void testOutputAreaOfUnitCicle() throws Exception {
        Circle c = new Circle(new Point(1.0, 0.0), 1.0);
        assertEquals(Math.PI, c.getArea(), 0.001);
    }

    @Test
    public void testOutputCircumferenceOfUnitCircle() throws Exception {
        Circle c = new Circle(new Point(1.0, 0.0), 1.0);
        assertEquals(Math.PI*2, c.getCircumference(), 0.001);
    }

    @Test
    public void testConstructorNegitiveOrZeroRadiusError() throws Exception {
        assertThrows(Exception.class, () -> new Circle(new Point(1.0, 0.0), 0.0));
    }

    @Test
    public void testToStringForUnitCircle() throws Exception {
        Circle c = new Circle(new Point(1.0, -1.5), 2.0);
        assertEquals("((1.0,-1.5), r=2.0, Circle)", c + "");
    }
    /*
    @Test
    public void testMovingCircleCenterPoint() throws Exception {
        Circle c = new Circle(new Point(0.0, 0.0), 1.0);
        c.moveCenter(0.5, 0.5);
        assertEquals("(0.5,0.5)", c.getCenter() + "");
        c.moveCenter(-1, -1);
        assertEquals("(-0.5,-0.5)", c.getCenter() + "");
    }

    @Test
    public void testChangingCircleRadius() throws Exception {
        Circle c = new Circle(new Point(0.0, 0.0), 1.0);
        c.changeRadius(0.5);
        assertEquals("((0.0,0.0), r=1.5, Circle)", c + "");
        c.changeRadius(-1);
        assertEquals("((0.0,0.0), r=0.5, Circle)", c + "");
    }

    @Test
    public void testChangingCircleRadiusErrorReachedZero() throws Exception {
        Circle c = new Circle(new Point(0.0, 0.0), 1.0);
        assertThrows(Exception.class, () -> c.changeRadius(-1.0));
    }*/
}
