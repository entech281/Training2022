package frc.training;

import org.junit.Test;

import frc.training.Square.Corner;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;

public class TestSquare  extends TestNeeds{

    protected static final double SMALLDIFFERENCE = 0.001;

    @Test
    public void testGetCenterPoint() {
        Square S = new Square(new Point(1.0, 1.0), 2);
        
        assertEquals("(1.0,1.0)", S.getCenter() + "");
    }

    @Test
    public void testGetLength() {
        Square S = new Square(new Point(1.0, 1.0), 2);

        assertEquals(2, S.getLength(), SMALLDIFFERENCE);
    }

    @Test
    public void testGetArea() {
        Square S = new Square(new Point(1.0, 1.0), 2);

        assertEquals(4, S.getArea(), SMALLDIFFERENCE);
    }

    @Test
    public void testGetPerimeter() {
        Square S = new Square(new Point(1.0, 1.0), 2);

        assertEquals(8, S.getPerimeter(), SMALLDIFFERENCE);
    }

    @Test
    public void testConstructorNegitiveOrZeroLengthError() {
        assertThrows(Exception.class, () -> new Square(new Point(1.0, 1.0), 0.0));
    }
    
    @Test
    public void testGetCorners() {
        Square S = new Square(new Point(1.0, 1.0), 2);

        assertEquals("(0.0,0.0)", S.getCorner(Corner.BOTTOM_LEFT).toString());
        assertEquals("(0.0,2.0)", S.getCorner(Corner.TOP_LEFT).toString());
        assertEquals("(2.0,2.0)", S.getCorner(Corner.TOP_RIGHT).toString());
        assertEquals("(2.0,0.0)", S.getCorner(Corner.BOTTOM_RIGHT).toString());
    }

    @Test
    public void testToString() {
        Square S = new Square(new Point(1.0, 2.1), 2);

        assertEquals("((1.0,2.1), p=8.0, a=4.0, Square)", S + "");
    }
}
