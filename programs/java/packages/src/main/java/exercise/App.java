package exercise;// BEGIN
import exercise.geometry.Point;
import exercise.geometry.Segment;

import java.util.Arrays;

class App {
    public static double[] getMidpointOfSegment(double[][] segment) {
        double[] midPoint = new double[2];
        midPoint[0] = (segment[0][0] + segment[1][0])/2;
        midPoint[1] = (segment[0][1] + segment[1][1])/2;
        return midPoint;
    }

    public static double[][] reverse(double[][] segment) {
        double[][] reversedSegment = new double[2][2];
        for (int i=0; i < 2; i++) {
                reversedSegment[1][i] = segment[0][i];
                reversedSegment[0][i] = segment[1][i];
        }
        return reversedSegment;
    }

    public static void main (String[] args) {
        double[] point1 = Point.makePoint(3, 4);
        double[] point2 = Point.makePoint(6, 7);
        double[][] segment = Segment.makeSegment(point1, point2);

        double[] midPoint = App.getMidpointOfSegment(segment);
        System.out.println(Arrays.toString(midPoint)); // => [4.5, 5.5]

        double[][] reversedSegment = App.reverse(segment);
        double[] beginPoint = Segment.getBeginPoint(reversedSegment);
        double[] endPoint = Segment.getEndPoint(reversedSegment);
        System.out.println(Arrays.toString(beginPoint)); // => [6, 7]
        System.out.println(Arrays.toString(endPoint)); // => [3, 4]
    }
}
// END
