package frc.training;

import org.junit.jupiter.api.Test;

import frc.training.Shapes.Circle;

import static org.junit.jupiter.api.Assertions.*;

public class TestCircle {
    @Test
    public void testCircleCircumference(){

        final Point center = new Point(0, 0);
        Circle c = new Circle(center, 1);

        assertEquals(6.28319,c.getPerimeter(), 0.001);

    }

    @Test
    public void testCircleArea(){

        final Point center = new Point(0,0);
        Circle c = new Circle(center, 1);

        assertEquals(3.14159, c.getArea(), 0.001);
    }
}