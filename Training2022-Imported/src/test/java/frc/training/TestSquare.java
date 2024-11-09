package frc.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import frc.training.Shapes.Square;

public class TestSquare {
    
    @Test
    public void testSquarePerimeter(){

        final Point center = new Point(0,0);

        Square s = new Square(center, 3);

        assertEquals(12.0, s.getPerimeter(), 0.001);
    }

    @Test
    public void testSquareArea(){
        
        
        final Point center = new Point(0,0);
        
        Square s = new Square(center, 3);

        assertEquals(9.0, s.getArea(), 0.001);

    }
    
}
