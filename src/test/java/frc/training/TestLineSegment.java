package frc.training;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLineSegment {

    @Test
    public void testGettingDistance(){
        LineSegment Q1 = new LineSegment(
            new Point(0, 0), 
            new Point(3, 4)
        );
        LineSegment Q2 = new LineSegment(
            new Point(-2, 3),
            new Point(-3, 4)
        );
        LineSegment Q3 = new LineSegment(
            new Point(-1, -2),
            new Point(-3, -5)
        );
        LineSegment Q4 = new LineSegment(
            new Point(3, -3),
            new Point(8, -15)
        );
        LineSegment Degenerate = new LineSegment(
            new Point(-2, 3),
            new Point(-2, 3)
        );
        LineSegment MultipleQuadrants = new LineSegment(
            new Point(-3, -1),
            new Point(2, 1)
        );
        assertEquals(5, Q1.getLength(), 0.01);
        assertEquals(Math.sqrt(2), Q2.getLength(), 0.01);
        assertEquals(Math.sqrt(13), Q3.getLength(), 0.01);
        assertEquals(13, Q4.getLength(), 0.01);
        assertEquals(0, Degenerate.getLength(), 0.01);
        assertEquals(Math.sqrt(29), MultipleQuadrants.getLength(), 0.01);
    }
    
}
