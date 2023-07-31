package frc.training;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRectangle {

    @Test
    public void testGettingArea(){
        Rectangle r = new Rectangle(
            new Point(-2, -3),
            new Point(5, 1)
        );
        assertEquals(28, r.getArea(), 0.01);
    }

    @Test
    public void testGettingPerimeter(){
        Rectangle r = new Rectangle(
            new Point(-2, -3),
            new Point(5, 1)
        );
        assertEquals(22, r.getPerimeter(), 0.01);
    }
}
