package frc.training;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSquare {
    
    @Test
    public void testGettingArea(){
        Square s = new Square(1);
        assertEquals(1, s.getArea(), 0.01);
    }

    @Test
    public void testGettingPerimeter(){
        Square s = new Square(1);
        assertEquals(4, s.getPerimeter(), 0.01);
    }

}
