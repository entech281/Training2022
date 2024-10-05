package frc.training;

import java.util.stream.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;


import frc.training.Shapes.Shape;


//TO DO
//finsih this
public class TestShape {
    
    @ParameterizedTest
    @MethodSource("providePoints")
    public void staticTestGetDistance(Point point1, Point point2)
    {

        assertEquals(Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2)), Shape.getDistance(point1, point2));
        
        assertEquals(Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2)), Shape.getDistance(point2, point1));
    }


    private static double randNum () {
        return Math.random() * Math.random() * 10;
    }

    private static Stream<Arguments> providePoints() {
        return Stream.of(
            Arguments.of(new Point(0, 0), new Point(0, 0)),
            Arguments.of(new Point(0, 0), new Point(1, 1)),
            Arguments.of(new Point(1, 1), new Point(0, 0)),
            Arguments.of(new Point(1, 1), new Point(702883847, 37658382)),
            Arguments.of(new Point(484848, 39394), new Point(383745, 383874)),
            Arguments.of(new Point(-38484, -39484), new Point(-37487, -3848)),
            Arguments.of(new Point(-393943, 4948), new Point(39284375, -87654))
        );
    }

    @ParameterizedTest
    @MethodSource("provideRandomPoints")
    public void randomizedTestGetDistance(List<Point> points)
    {

        Point point1 = points.get(0);
        Point point2 = points.get(1);

        assertEquals(Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2)), Shape.getDistance(point1, point2));
        
        assertEquals(Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2)), Shape.getDistance(point2, point1));
    }

    private static List<List<Point>> provideRandomPoints ()
    {
        
        List<List<Point>> points = new ArrayList<List<Point>>();

        for (int i = 0; i < 100; i++)
        {

            List<Point> somePoints = new ArrayList<Point>();

            somePoints.add(new Point(randNum(), randNum()));
            somePoints.add(new Point(randNum(), randNum()));

            points.add(somePoints);
        }
        
        return points;
    }



    //Arguments.of(new Point(randNum(), randNum()), new Point(randNum(), randNum()))

}
