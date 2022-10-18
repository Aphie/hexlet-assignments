package exercise;

// BEGIN
public class Circle {
    public Point point;
    public int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public double getSquare() throws NegativeRadiusException {
        double square = 0;
        if (this.radius < 0) {
            throw new NegativeRadiusException("Не удалось посчитать площадь");
        } else {
            square = Math.PI * this.radius * this.radius;
        }
        return square;
    }
}
// END
