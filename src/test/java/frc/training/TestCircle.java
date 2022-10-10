package frc.training;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestCircle extends TestNeeds{

    @Test
    public void testInputAndReturnRadiusOfUnitCicle() {
        Circle c = new Circle(new Point(1.0, 0.0), 1.0);
        assertEquals(1.0, c.getRadius(), SMALLDIFFERENCE);
    }

    @Test
    public void testInputAndReturnCenterPointOfUnitCicle() {
        Circle c = new Circle(new Point(1.0, 0.0), 1.0);
        assertEquals("(1.0,0.0)", c.getCenter() + "");
    }

    @Test
    public void testOutputAreaOfUnitCicle() {
        Circle c = new Circle(new Point(1.0, 0.0), 1.0);
        assertEquals(Math.PI, c.getArea(), SMALLDIFFERENCE);
    }

    //add circumference test

    @Test
    public void testConstructorNegitiveOrZeroRadiusError() {
        assertThrows(Exception.class, () -> new Circle(new Point(1.0, 0.0), 0.0));
    }

    @Test
    public void testToStringForUnitCircle() {
        Circle c = new Circle(new Point(1.0, -1.5), 2.0);
        assertEquals("((1.0,-1.5), r=2.0, Circle)", c + "");
    }
}
