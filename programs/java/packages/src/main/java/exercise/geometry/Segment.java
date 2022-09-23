// BEGIN
package exercise.geometry;

public class Segment {
    public static double[][] makeSegment(double[] x, double[] y) {
        double[][] segment = new double[2][2];
        for (int i= 0; i < 2; i++) {
                segment[0][i] = x[i];
                segment[1][i] = y[i];
        }
        return segment;
    }

    public static double[] getBeginPoint (double[][] segment) {
        double[] beginPoint = new double[2];
        for (int i=0; i < 2; i++) {
            beginPoint[i] = segment[0][i];
        }
        return beginPoint;
    }

    public static double[] getEndPoint (double[][] segment) {
        double[] endPoint = new double[2];
        for (int i=0; i < 2; i++) {
            endPoint[i] = segment[1][i];
        }
        return endPoint;
    }

}
// END
