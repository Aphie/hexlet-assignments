//package hexlet.hw.pr6;
package exercise;

public class Example {
    public static void main(String[] args) {
        /*
        Стектрейс
         */
//        myMethod1();

//        System.out.println(10 / 0);
//        divideByZero(10);

//        /*
//        Отладчик
//         */
//        int index = 3;
//        int fib = getFibbonaciNumber(index);
//        System.out.println("Число Фибоначчи с индексом " + index + " равно " + fib);

//        /**
//         * Ошибки
//         */
//        // Syntax
//        System.out.println(Hello, world!);

//            int x = 0;
//            if x == 0 {
//      }

        // Reference

//        System.out.println(myVar);

//          // Type error
//        final int MY_CONSTANT = 22;
//        MY_CONSTANT = MY_CONSTANT + 1;

//         //logic
//        String num1 = "1";
//        String num2 = "2";
//        System.out.println(num1 + num2);

//        // handle exceptions and errors
//        int apples = 10;
//        int kids = 0;
//        System.out.println("Каждый ребёнок получит по " + apples / kids + " яблок (яблока)");

//        int res = divideWithCode(10, 0);
//        if (res == -1) {
//            System.out.println("[err] Dividing by zero is not allowed!");
//        }
//        else {
//            System.out.println("result of dividing = " + res);
//        }

//        int applePerPerson = divideApplesForKids(10, 11);
//        if (applePerPerson == -2) {
//            System.out.println("Ой, кажется детей нет - некому раздавать яблоки...");
//        }
//        else if (applePerPerson == -3) {
//            System.out.println("К сожалению, яблок на всех не хватит...");
//        }
//        else {
//            System.out.println("Каждый ребёнок получит " + applePerPerson + " шт (ябл.)");
//        }

    }

    static int divideApplesForKids(int apples, int kids) {
        int applePerPerson = divideWithCode(apples, kids);
        if (applePerPerson == 0) {
            return -3;
        }
        return applePerPerson == -1 ? -2 : applePerPerson;
    }

    static int divideWithCode(int input1, int input2) {
        if (input2 == 0) {
            return -1;
        }
        return input1 / input2;
    }

    static void myMethod1() {
        System.out.println("----- myMethod1 [START] -----");
        myMethod2();
        System.out.println("----- myMethod1 [FINISH] -----");
    }

    static void myMethod2() {
        System.out.println("----- myMethod2 [START] -----");
        myMethod3();
        System.out.println("----- myMethod2 [FINISH] -----");
    }

    static void myMethod3() {
        System.out.println("----- myMethod3 [START] -----");
        System.out.println("----- myMethod3 [FINISH] -----");
    }

    static int divideByZero(int input) {
        return input / 0;
    }

    static int getFibbonaciNumber(int input) {
        System.out.println("getFibbonaciNumber [START] input = " + input);
        if (input < 1) {
            System.out.println("getFibbonaciNumber return value = " + input + " [1]");
            return input;
        }
        System.out.println("getFibbonaciNumber return input value = " + input + "[2]");
        return getFibbonaciNumber(input - 2) + getFibbonaciNumber(input - 1);
    }

}
