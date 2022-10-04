package frc.training;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestCircle {
    public static void main(String[] args) throws Exception {
        System.out.println("Emergency testing only.");
    } 

    @Test
    public void testInputInputAndReturnRadiusOfUnitCicle() throws Exception {
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
        assertEquals("((1.0,-1.5), r=2.0)", c + "");
    }
}
