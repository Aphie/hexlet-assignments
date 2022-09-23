package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] inputArray) {
        return Arrays.stream(inputArray)
                .map(line -> Arrays.stream(line).flatMap(element -> Stream.of(element,element)).toArray(String[]::new))
                .flatMap(line -> Stream.of(line,line))
                .toArray(String[][]::new);
    }

    public static void main (String[] args) {
        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        System.out.println(Arrays.deepToString(image)); // =>
// [
//     [*, *, *, *],
//     [*,  ,  , *],
//     [*,  ,  , *],
//     [*, *, *, *],
// ]
        String[][] enlargedImage = App.enlargeArrayImage(image);
        System.out.println(Arrays.deepToString(enlargedImage)); // =>
// [
//     [*, *, *, *, *, *, *, *],
//     [*, *, *, *, *, *, *, *],
//     [*, *,  ,  ,  ,  , *, *],
//     [*, *,  ,  ,  ,  , *, *],
//     [*, *,  ,  ,  ,  , *, *],
//     [*, *,  ,  ,  ,  , *, *],
//     [*, *, *, *, *, *, *, *],
//     [*, *, *, *, *, *, *, *],
// ]
        List<Map<String, String>> users = List.of(
                Map.of("name", "Vladimir Nikolaev", "birthday", "1990-12-27", "gender", "male"),
                Map.of("name", "Andrey Petrov", "birthday", "1989-11-23", "gender", "male"),
                Map.of("name", "Anna Sidorova", "birthday", "1996-09-09", "gender", "female"),
                Map.of("name", "John Smith", "birthday", "1989-03-11", "gender", "male"),
                Map.of("name", "Vanessa Vulf", "birthday", "1985-11-16", "gender", "female"),
                Map.of("name", "Alice Lucas", "birthday", "1986-01-01", "gender", "female"),
                Map.of("name", "Elsa Oscar", "birthday", "1970-03-10", "gender", "female")

        );

        List<String> men = Sorter.takeOldestMans(users);
        System.out.println(men); // ["John Smith", "Andrey Petrov", "Vladimir Nikolaev"]


    }
}

// END
