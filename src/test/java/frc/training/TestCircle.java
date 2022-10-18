package frc.training;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestCircle extends TestNeeds{

    public static void main(String[] args) {
        Circle c = new Circle(new Point(1.0, -1.5), 1.0);

        System.out.println(c);
    }

    protected static final double SMALLDIFFERENCE = 0.001;

    @Test
    public void testGetRadius() {
        Circle c = new Circle(new Point(1.0, 0.0), 1.0);

        assertEquals(1.0, c.getRadius(), SMALLDIFFERENCE);
    }

    @Test
    public void testGetCenterPoint() {
        Circle c = new Circle(new Point(1.0, 0.0), 1.0);

        assertEquals("(1.0,0.0)", c.getCenter() + "");
    }

    @Test
    public void testGetArea() {
        Circle c = new Circle(new Point(1.0, 0.0), 1.0);
        assertEquals(Math.PI, c.getArea(), SMALLDIFFERENCE);
    }

    @Test
    public void testGetPerimeter() {
        Circle c = new Circle(new Point(1.0, 0.0), 1.0);

        assertEquals(Math.PI*2, c.getPerimeter(), SMALLDIFFERENCE);
    }

    @Test
    public void testConstructorNegitiveOrZeroRadiusError() {
        assertThrows(Exception.class, () -> new Circle(new Point(1.0, 0.0), 0.0));
    }

    @Test
    public void testToString() {
        Circle c = new Circle(new Point(1.0, -1.5), 1.0);
        
        assertEquals("((1.0,-1.5), p=6.283, a=3.142, Circle)", c + "");
    }
    /*
    @Test
    public void testMovingCircleCenterPoint() {
        Circle c = new Circle(new Point(0.0, 0.0), 1.0);
        c.moveCenter(0.5, 0.5);
        assertEquals("(0.5,0.5)", c.getCenter() + "");
        c.moveCenter(-1, -1);
        assertEquals("(-0.5,-0.5)", c.getCenter() + "");
    }

    @Test
    public void testChangingCircleRadius() {
        Circle c = new Circle(new Point(0.0, 0.0), 1.0);
        c.changeRadius(0.5);
        assertEquals("((0.0,0.0), r=1.5, Circle)", c + "");
        c.changeRadius(-1);
        assertEquals("((0.0,0.0), r=0.5, Circle)", c + "");
    }

    @Test
    public void testChangingCircleRadiusErrorReachedZero() {
        Circle c = new Circle(new Point(0.0, 0.0), 1.0);
        assertThrows(Exception.class, () -> c.changeRadius(-1.0));
    }*/
}
