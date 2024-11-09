package frc.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import frc.training.Shapes.Triangle;

public class TestTriangle {
    @Test
    public void testTrianglePerimeter(){
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);
        Point p3 = new Point(3,1);

        Triangle t = new Triangle(p1, p2, p3);

        assertEquals(4.828, t.getPerimeter(), 0.001);

    }

    @Test
    public void testTriangleArea(){
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);
        Point p3 = new Point(3,1);

        Triangle t = new Triangle(p1, p2, p3);

        assertEquals(1, t.getArea(), 0.001);


    }

}
