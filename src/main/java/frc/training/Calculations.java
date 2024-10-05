package frc.training;



public class Calculations {
    
    public double areaOfSquare(Point centerPoint, double lengthOfSide) {
        return Math.pow(lengthOfSide, 2);
    }

    public double perimeterOfSquare(Point centerPoint, double lengthOfSide) {
        return Math.abs(lengthOfSide) * 4;
    }

    public double areaOfCircle(Point centerPoint, double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double circumferenceOfCircle(Point centerPoint, double radius) {
        return 2 * Math.PI * Math.abs(radius);
    }

    public Double areaOfRectangle(Point bottomLeft, Point topRight) {
        
        if (bottomLeft == null || topRight == null) {
            return null;
        }

        return Math.abs(topRight.getX() - bottomLeft.getX()) * Math.abs(topRight.getY() - bottomLeft.getY());
    }

    public Double perimeterOfRectangle(Point bottomLeft, Point topRight) {
        
        if (bottomLeft == null || topRight == null) {
            return null;
        }


        if (bottomLeft.getX() == topRight.getX()) {
            return Math.abs(topRight.getY() - bottomLeft.getY());
        } else if (bottomLeft.getY() == topRight.getY()) {
            return Math.abs(topRight.getX() - bottomLeft.getX());
        } else {
            return Math.abs(topRight.getX() - bottomLeft.getX()) * 2 + Math.abs(topRight.getY() - bottomLeft.getY()) * 2;
        }
    }

    public Double areaOfTriangle(Point point1, Point point2, Point point3, String... easterEgg) {
        
        if (point1 == null || point2 == null || point3 == null) {
            return null;
        }

        if (point1.toString().equals(point2.toString()) || point2.toString().equals(point3.toString()) || point1.toString().equals(point3.toString())) {
            return 0.0;
        }


        double deltaX = point1.getX() - point2.getX();
        double deltaY = point1.getY() - point2.getY();

        double slopeOfBase = deltaY / deltaX;
        double yInterceptOfBase = -(slopeOfBase * point1.getX() - point3.getY());
        double slopeOfAltitude = -(deltaX / deltaY);
        double yInterceptOfAltitude = -(slopeOfAltitude * point3.getX() - point3.getY());

        //Equation for linear functions y = mx + b
        double subtractedSlopes = slopeOfBase - slopeOfAltitude;
        double subtractedYIntercepts = yInterceptOfBase - yInterceptOfAltitude;

        double x = -(subtractedYIntercepts) / subtractedSlopes;
        double y = slopeOfBase * x + yInterceptOfBase;

        Point intersectionOfAltitudeAndBase = new Point(x, y);

        double height = Math.sqrt(Math.pow(intersectionOfAltitudeAndBase.getX() - point3.getX(), 2) + Math.pow(intersectionOfAltitudeAndBase.getY() - point3.getY(), 2));
        double base = Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));

        if (easterEgg.length > 0) System.out.println("You found an Easter Egg!\nHere's a short Wikipedia page https://en.wikipedia.org/wiki/Larqanku\n//codes make you happy");
        
        return base * height / 2;
    }

    public Double perimeterOfTriangle(Point point1, Point point2, Point point3) {

        if (point1 == null || point2 == null || point3 == null) {
            return null;
        }

        double length1 = Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
        double length2 = Math.sqrt(Math.pow(point2.getX() - point3.getX(), 2) + Math.pow(point2.getY() - point3.getY(), 2));
        double length3 = Math.sqrt(Math.pow(point1.getX() - point3.getX(), 2) + Math.pow(point1.getY() - point3.getY(), 2));

        if (point1.toString().equals(point2.toString())) {
            return length2;
        }
        if (point2.toString().equals(point3.toString())) {
            return length1;
        }

        if (point1.toString().equals(point3.toString())) {
            return length1;
        }

        return length1 + length2 + length3;
    }

}
