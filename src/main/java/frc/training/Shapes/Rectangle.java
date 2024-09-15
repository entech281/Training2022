package main.java.frc.training.Shapes;

public class Rectangle extends Shape{

    protected double width;
    
    public Rectangle (Point mCenter, double mLength, double mWidth) 
    {
        super(mCenter, mLength);

        width = mWidth;
    }

    public Rectangle (Point topLeft, Point bottomRight) {
        Point mCenter = new Point ((topLeft.getX() + bottomRight.getX()) / 2, (topLeft.getY() + bottomRight.getY()) / 2);

        double mLength = Math.abs(topLeft.getX() - bottomRight.getX());
        double mWidth = Math.abs(topLeft.getY() - bottomRight.getY());
        
        Rectangle(mCenter, mLength, mWidth);
    }

    @Override
    public double getArea()
    {
        return length * width;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * length + 2 * width;
    }
}
