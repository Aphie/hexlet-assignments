package hexlet.hw.pr3;

public class Example {
    public static void main(String[] args) {
    //    // Логический тип. Операции сравнения.

    //    System.out.println("5 > 6 -> " + (5 > 6));
    //    System.out.println("5 < 6 -> " + (5 < 6));
    //    System.out.println("5 <= 6 -> " + (5 <= 6));
    //    System.out.println("5 >= 6 -> " + (5 >= 6));
//        // не тоже самое, что присваивание '='
//        System.out.println("5 == 6 -> " + (5 == 6));
//        System.out.println("5 != 6 -> " + (5 != 6));

//        boolean a = 5 > 6;
//        boolean b = false;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

//        // Предикат.
//
//        String exampleABCStr = "abc";
//        String exampleEmptyStr = "";//
//        System.out.println(
//           "Is 'abc' empty? " + LiveCoding.isEmpty(exampleABCStr)
//        );
//        System.out.println(
//            "Is '' empty? " + LiveCoding.isEmpty(exampleEmptyStr)
//        );

//        // Логические операции.

//        System.out.println("NOT true -> " + !true);
//        System.out.println("NOT false -> " + !false);
//
//        System.out.println("true AND true -> " + (true && true));
//        System.out.println("true AND false -> " + (true && false));
//        System.out.println("false AND true -> " + (false && true));
//        System.out.println("false AND false -> " + (false && false));
//
//        System.out.println("true OR true -> " + (true || true));
//        System.out.println("true OR false -> " + (true || false));
//        System.out.println("false OR true -> " + (false || true));
//        System.out.println("false OR false -> " + (false || false));

//        // описано в булевой алгебре - см. таблицы истинности
//
//        boolean a = true;
//        boolean b = false;
//        boolean c = true;
//        System.out.println(!a);
//
//        System.out.println(a || b || c);
//        System.out.println(a && !b && c);
//        System.out.println((a && b) || c);
//        //так не принято...
//        System.out.println((a & (a | c) & b));

//        // Условный оператор if.

//        if (true) {
//            System.out.println("Мы зашли в тело if...");
//        }
//        if (false) {
//            System.out.println("Надпись невидимка...");
//        }
//
//        int number = 22;
//
//        // number % 2 == 1
//        // 1 == 1
//        // true
//        if (number % 2 == 1) {
//            System.out.println("Число нечётное.");
//        }

//        String str = "";
//        if (!LiveCoding.isEmpty(str)) {
//            System.out.println("String str is not empty.");
//        }

//        // Расширенный оператор if с использованием else.

//        // Бывают чётные и нечётные числа...
//        int number = 1;//
//        if (number % 2 == 1) {
//            System.out.println("Число нечётное.");
//        } else {
//            System.out.println("Число чётное.");
//        }

//        int number = -7;
//        if (number > 0) {
//            System.out.println("Число положительное.");
//        } else {
//            System.out.println("Число отрицательное.");
//        }

//        int number = -9;
//        if (number > 0) {
//            System.out.println("Положительное число.");
//        } else if (number == 0) {
//            System.out.println("Ноль.");
//        } else {
//            System.out.println("Отрицательно число.");
//        }

//        // Тернарный оператор.

//        int number = 22;
//        int nextEvenNumber;
//        if (number % 2 == 0) {
//            nextEvenNumber = number + 2;
//        } else {
//            nextEvenNumber = number + 1;
//        }
//        System.out.println("Next even number: " + nextEvenNumber);

//        int number = 89;
//        int nextEvenNumber = number % 2 == 0 ? number + 2 : number + 1;
//        System.out.println("Next even number: " + nextEvenNumber);

////         Для удобства написания и чтения условных выражений всегда можно
////         использовать скобки
//        int nextEvenNumber = number % 2 == 0 ? (number + 2) : (number + 1);

          // Switch-case.

        int mark = 1;
        switch (mark) {
            case 1:
                System.out.println("Вы получили кол!");
                break;
            case 2:
                System.out.println("Вы получили двойку!");
                break;
            case 3:
                System.out.println("Вы получили тройку!");
                break;
            case 4:
                System.out.println("Вы получили хорошую отметку!");
                break;
            case 5:
                System.out.println("Похоже, Вы проявили себя на отлично!");
                break;
            default:
                System.out.println("Таких оценок не бывает!");
                break;
        }
    }

    /*
     * Метод (функция) определет, является ли строка input пустой
     * (то есть не содержит ни одного символа,
     * а соответсвенно её длина будет равна нулю).
     * Если строка не пустая - метод возвращает false.
     * Если строка пустая - метод возвращает true.
     */
    static boolean isEmpty(String input) {
        return input.length() == 0;
    }
}
