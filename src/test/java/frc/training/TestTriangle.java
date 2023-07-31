package frc.training;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTriangle {
    
    @Test
    public void testGettingArea(){
        Triangle t = new Triangle(
            new Point(0, 0), 
            new Point(0, 5), 
            new Point(12, 0)
        );
        Triangle Degenerate = new Triangle(
            new Point(3, 4),
            new Point(3, 12),
            new Point(3, 13)
        );
        assertEquals(30, t.getArea(), 0.01);
        assertEquals(0, Degenerate.getArea(), 0.01);
    }

    @Test
    public void testGettingPerimeter(){
        Triangle t = new Triangle(
            new Point(0, 0), 
            new Point(0, 5), 
            new Point(12, 0)
        );
        System.out.println(t.getPerimeter());
    }

}
