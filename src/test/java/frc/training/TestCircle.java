package frc.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import frc.training.Shapes.Circle;

public class TestCircle {
    
    @Test
    public void testingCircleCircumference() {
 

        //this point doesn't really matter because this formula
        //does not need it but the instructions said this was the
        //input so I incorporated it.
        final Point center = new Point(0, 0);

        Circle quarter = new Circle(center, 3);


        //happy path
        assertEquals(18.8496, quarter.getPerimeter(), 0.001);
        
        //null center
        Circle badCenter = new Circle (null, 3);
        
        assertEquals(18.8496, badCenter.getPerimeter(), 0.001);

        //negative radius
        Circle negRadius = new Circle(center, -3);
        assertEquals(18.8496, negRadius.getPerimeter(), 0.001);
        
    }



    @Test
    public void testingCircleArea() {
        

        //this point doesn't really matter because this formula
        //does not need it but the instructions said this was the
        //input so I incorporated it.
        final Point center = new Point(0, 0);

        Circle penny = new Circle(center, 3);


        //happy path
        assertEquals(28.2743339, penny.getArea(), 0.001);

        //null center
        Circle badCenter = new Circle(null, 3);
        assertEquals(28.2743339, badCenter.getArea(), 0.001);

        //negative radius
        Circle negRadius = new Circle(center, -3);
        assertEquals(28.2743339, negRadius.getArea(), 0.001);
        
    }
    
}
