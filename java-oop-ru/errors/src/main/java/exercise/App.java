package exercise;

// BEGIN
public class App {
    public static void printSquare(Circle circle) throws NegativeRadiusException {
        try {
            System.out.println(Math.round(circle.getSquare()));
        } catch (NegativeRadiusException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Вычисление окончено");
    }

    public static void main (String[] args) throws NegativeRadiusException {
        Point point = new Point(5, 7);
        Circle circle = new Circle(point, 4);
        App.printSquare(circle);
// => "50"
// => "Вычисление окончено"

        Circle circle1 = new Circle(point, -2);
        App.printSquare(circle1);
// => "Не удалось посчитать площадь"
// => "Вычисление окончено"
    }
}
// END
