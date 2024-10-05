package frc.training.Shapes;

import frc.training.Point;

public class Square extends Rectangle {

    public Square (Point center, double length)
    {
        super (center, length, length);
    }

    public Square (double length)
    {
        this(new Point(0, 0), length);
    }
    
}
