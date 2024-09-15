package main.java.frc.training.Shapes;

public class Square extends Rectangle {

    public Square (Point mCenter, double mLength)
    {
        super (mCenter, mLength, mLength);
    }

    public Square (double mLength)
    {
        this(new Point(0, 0), mLength);
    }
    
}
