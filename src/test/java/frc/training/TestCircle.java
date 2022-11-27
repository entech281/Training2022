package frc.training;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCircle {
    
    @Test
    public void testGettingArea(){
        Point p = new Point(1.0, 2.0);
        Circle c = new Circle(2, p);
        assertEquals(12.566, c.getArea(), 0.001);
    }

    @Test
    public void testGettingPerimeter(){
        Point p = new Point(1.0, 2.0);
        Circle c = new Circle(3, p);
        assertEquals(18.849, c.getPerimeter(), 0.001);
    }

    @Test
    public void testToString(){
        assertEquals("Area = 50.26548245743669, Perimeter = 25.132741228718345", new Circle(4, new Point(0.0,1.0)) + "");
    }
}
