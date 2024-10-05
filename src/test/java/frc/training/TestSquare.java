package frc.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import frc.training.Shapes.Square;

public class TestSquare {
    
    @Test
    public void testingSquareArea() {
        

        //this point doesn't really matter because this formula
        //does not need it but the instructions said this was the
        //input so I incorporated it.
        final Point center = new Point(0, 0);

        Square trafficSign = new Square(center, 5);
        //happy path
        assertEquals(25, trafficSign.getArea(), 0.001);

        //length of zero
        Square zeroLenSquare = new Square(center, 0);
        assertEquals(0, zeroLenSquare.getArea(), 0.001);
        
        //wait...negative length? I think you meant that to be positive
        Square negLenSquare = new Square(center, -5);
        assertEquals(25, negLenSquare.getArea(), 0.001);

        //null center
        //you should really just call the other constructor instead of using a null
        //center but oh well
        Square nullCenterSquare = new Square(null, 5);
        assertEquals(25, nullCenterSquare.getArea(), 0.001);


    }




    @Test
    public void testingSquarePerimeter() {
        
       
        //this point doesn't really matter because this formula
        //does not need it but the instructions said this was the
        //input so I incorporated it.
        final Point center = new Point(0, 0);

        Square trafficSign = new Square(center, 5);
        //happy path
        assertEquals(20, trafficSign.getPerimeter(), 0.001);

        //length of zero
        Square zeroLenSquare = new Square(center, 0);
        assertEquals(0, zeroLenSquare.getPerimeter(), 0.001);
        
        //wait...negative length? I think you meant that to be positive
        Square negLenSquare = new Square(center, -5);
        assertEquals(20, negLenSquare.getPerimeter(), 0.001);

        //null center
        //you should really just call the other constructor instead of using a null
        //center but oh well
        Square nullCenterSquare = new Square(null, 5);
        assertEquals(20, nullCenterSquare.getPerimeter(), 0.001);
        
    }

    
}
