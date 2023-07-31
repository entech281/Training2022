package frc.training;

public class Square extends Shape{
    
    private double sideLength;
    public static final int NUM_SIDES = 4;

    public Square(double sideLength){
        this.sideLength = sideLength;
    }

    public double getSideLength(){
        return this.sideLength;
    }

    @Override
    public double getArea(){
        return Math.pow(sideLength, 2);
    }

    @Override
    public double getPerimeter(){
        return sideLength*NUM_SIDES;
    }

}
