package frc.training;

import org.junit.Test;

import frc.training.Square.corner;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;

public class TestSquare  extends TestNeeds{

    @Test
    public void testInputCenterPoint() {
        Square S = new Square(new Point(1.0, 1.0), 2);
        assertEquals("(1.0,1.0)", S.getCenter() + "");
    }

    @Test
    public void testInputLength() {
        Square S = new Square(new Point(1.0, 1.0), 2);
        assertEquals(2, S.getLength(), SMALLDIFFERENCE);
    }

    @Test
    public void testOutputArea() {
        Square S = new Square(new Point(1.0, 1.0), 2);
        assertEquals(4, S.getArea(), SMALLDIFFERENCE);
    }

    @Test
    public void testOutputPerimeter() {
        Square S = new Square(new Point(1.0, 1.0), 2);
        assertEquals(8, S.getPerimeter(), SMALLDIFFERENCE);
    }

    @Test
    public void testConstructorNegitiveOrZeroLengthError() {
        assertThrows(Exception.class, () -> new Square(new Point(1.0, 1.0), 0.0));
    }
    
    @Test
    public void testCornersForUnitSquare() {
        Square S = new Square(new Point(1.0, 1.0), 2);
        assertEquals("(0.0,0.0)", S.getCorner(corner.Bottom_Left).toString());
        assertEquals("(0.0,2.0)", S.getCorner(corner.Top_Left).toString());
        assertEquals("(2.0,2.0)", S.getCorner(corner.Top_Right).toString());
        assertEquals("(2.0,0.0)", S.getCorner(corner.Bottom_Right).toString());
    }

    @Test
    public void testToStringForUnitSquare() {
        Square S = new Square(new Point(1.0, 2.1), 2.5);
        assertEquals("((1.0,2.1), l=2.5, Square)", S + "");
    }
}
