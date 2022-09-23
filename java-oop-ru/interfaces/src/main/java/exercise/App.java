package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// BEGIN
public class App {
    public static List<String> buildAppartmentsList(List<Home> appartments, int elements) {
        List<String> result = new ArrayList<>();

        if (appartments.size() > elements) {
            Collections.sort(appartments, (o1, o2) -> (int) (o1.getArea() - o2.getArea()));

            for (int i = 0; i < elements; i++) {
                result.add(appartments.get(i).toString());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Home flat = new Flat(54.5, 4.0, 3);
        double area = flat.getArea(); // 58.5
        System.out.println("area = " + area);
        flat.toString(); // "Квартира площадью 58.5 метров на 3 этаже"
        System.out.println("flat.toString = " + flat.toString());

        Home cottage = new Cottage(135.0, 2);
        double area1 = cottage.getArea(); // 135
        System.out.println("area1 = " + area1);
        cottage.toString(); // "2 этажный коттедж площадью 135 метров"
        System.out.println("cottage.toString() = " + cottage.toString());

        List<Home> appartments = new ArrayList<>(List.of(
                new Flat(41, 3.0, 10),
                new Cottage(125.5, 2),
                new Flat(80.0, 10.0, 2),
                new Cottage(150.0, 3)
        ));

        List<String> result = App.buildAppartmentsList(appartments, 3);
        System.out.println(result);
    }
}
// END
