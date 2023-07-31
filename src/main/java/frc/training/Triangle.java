package frc.training;

public class Triangle extends Shape{

    private LineSegment segment1;
    private LineSegment segment2;
    private LineSegment segment3;

    public Triangle(Point p1, Point p2, Point p3){
        segment1 = new LineSegment(p2, p3);
        segment2 = new LineSegment(p3, p1);
        segment3 = new LineSegment(p1, p2);
    }

    public double getAreaFromHeronsFormula(){
        double semiperimeter = getPerimeter()/2;
        return Math.sqrt(
            (semiperimeter*
                (semiperimeter-segment1.getLength())*
                (semiperimeter-segment2.getLength())*
                (semiperimeter-segment3.getLength())
            )
        );
    }

    public double getArea(){
        return getAreaFromHeronsFormula();
    }

    public double getPerimeter(){
        return segment1.getLength() + segment2.getLength() + segment3.getLength();
    }
    
}
