package frc.training;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCircle {
    
    @Test
    public void testGettingArea(){
        Circle c = new Circle(1);
        assertEquals(Math.PI, c.getArea(), 0.01);
    }

    @Test
    public void testGettingPerimeter(){
        Circle c = new Circle(1);
        assertEquals(2*Math.PI, c.getPerimeter(), 0.01);
    }

}
