package exercise;

class Triangle {
    // BEGIN
    public static double getSquare(int a, int b, int angle) {
        double radiansAngle = angle * Math.PI / 180;
        double sinAngle = Math.sin(radiansAngle);
        return (a*b)/2*sinAngle;
    }

    public static void main (String[] args) {
        System.out.println(getSquare(4, 5, 45));
    }
    // END
}
