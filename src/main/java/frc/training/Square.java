package frc.training;

public class Square {

    protected Point CenterPoint;
    protected double Length;

    public Square(Point centerPoint, double length)  throws Exception{

        if (length <= 0.0) {
            throw new Exception("Square length must be greater than zero.");
        }

        this.CenterPoint = centerPoint;
        this.Length = length;
    }

    public Point getCenter() {
        return this.CenterPoint;
    }

    public double getLength() {
        return this.Length;
    }

    public double getArea() {
        return this.Length*this.Length;
    }

    public double getPerimeter() {
        return this.Length*4;
    }

    @Override
    public String toString() {
        return "(" + this.getCenter() + ", l=" + this.getLength() + ", Square)";
    }

    public Point getCorner(int corner) throws Exception {

        double cA = 0.0;
        double cB = 0.0;
        int counter = 0;
        
        //Bottom left corner (1)
        if (corner == 1) {
            cA = this.CenterPoint.getX() - (this.Length/2);
            cB = this.CenterPoint.getY() - (this.Length/2);
            ++counter;
        }

        //Top left corner (2)
        if (corner == 2) {
            cA = this.CenterPoint.getX() + (this.Length/2);
            cB = this.CenterPoint.getY() - (this.Length/2);
            ++counter;
        }

        //Top right corner (3)
        if (corner == 3) {
            cA = this.CenterPoint.getX() + (this.Length/2);
            cB = this.CenterPoint.getY() + (this.Length/2);
            ++counter;
        }

        //Bottom right corner (4)
        if (corner == 4) {
            cA = this.CenterPoint.getX() - (this.Length/2);
            cB = this.CenterPoint.getY() + (this.Length/2);
            ++counter;
        }
        if (counter == 0) {
            throw new Exception("Must specify a corner 1-4.");
        }

        return new Point(cA, cB);
    }
}
