//package hexlet.hw.pr8;
//package exercise;

// import java.util.Arrays;

//CHECKSTYLE:OFF
//public class Example {
    //   public static void main(String[] args) {
//        /**
//         * Пример плохого хранения набора данных
//         */
//        double w1 = 60;
//        double w2 = 90;
//        double w3 = 85;
//        double w4 = 110;
//        double w5 = 110;
//        // а если будет 100 значений...

//        /**
//         * Создание массива
//         */
//        int[] arr = new int[5];

//        String arrOfStr[] = new String[10];
//
//        int[] arr2;
//        arr2 = new int[8];

        /*
         * Заполнение массива
         */
//        int[] arr = new int[3];
//        // Начинаем с нуля
//        arr[0] = 1;
//        arr[1] = 3;
//        arr[2] = 5;
        // ошибка
//        arr[3] = 9;

//        //распечатать массив
//        System.out.println(arr);

//        String[] arrStr = new String[3];
//        arrStr[0] = "Hello";
//        arrStr[1] = ",";
//        arrStr[2] = "world";
//        System.out.println(arrStr);

//        /**
//         * Получение элементов массива
//         */
//
//        int arr1 = arr[0];
//        System.out.println("arr1 = " + arr1);
//
//        System.out.println("Первый элемент массива arr: " + arr[0]);
//        System.out.println("Второй элемент массива arr: " + arr[1]);
//        System.out.println("Третий элемент массива arr: " + arr[2]);
//
//        String str2 = arrStr[1];
//        System.out.println("str2 = " + str2);
//
//        System.out.println("Первый элемент массива arrStr: " + arrStr[0]);
//        System.out.println("Второй элемент массива arrStr: " + arrStr[1]);
//        System.out.println("Третий элемент массива arrStr: " + arrStr[2]);
//        System.out.println("Четвёртый элемент массива arrStr: " + arrStr[3]);
//

//        // инициализация массива
//        int[] arr = {1,6, 2, 3, 4, 5, 6};
//        System.out.println(arr[1]);

//        // длина массива
//        int lenArr = arr.length;
//        System.out.println("Len of arr: " + lenArr);


        // Пустой массив и перезапись
//        int[] arrEmptyInt = new int[2];
//        System.out.println("Второй элемент массива arrEmptyInt: " + arrEmptyInt[1]);

//        String[] arrEmpty = new String[2];
//        System.out.println("Первый элемент массива arrEmpty: " + arrEmpty[0]);
//        arrEmpty[0] = "Yakovlev Egor";
//        System.out.println("Снова печатаем первый элемент arrEmpty: " + arrEmpty[0]);
//        arrEmpty[0] = "Ivanov Ivan";
//        System.out.println(" снова печатаем первый элемент массива arrEmpty: " + arrEmpty[0]);
//

//        // final for arrays
//        final int[] arrFinal = new int[2];
//        arrFinal[0] = 1;
//        arrFinal[1] = 2;
//
//        System.out.println(arrFinal[0]);
//
//        arrFinal[0] = 3;
//        arrFinal[1] = 4;
//
//        System.out.println(arrFinal[0]);

//        /**
//         * Печать элементов массива
//         */
//
//        String[] names = new String[5];
//        names[0] = "ванов ван ванович";
//        names[1] = "Егоров Егор Егорович";
//        names[2] = "Яковлев Яков Яковлевич";
//        names[3] = "Сергеев Сергей Сергеевич";
//        names[4] = "Марьева Мария Александровна";

        /*
         * Способ 1
         */
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("Человек под номером " + i + " : " + names[i]);
//            //names[0], names[1], names[2],..., names[4]
//        }
//
//        /**
//         * Способ 2
//         */
//        for (String name: names) {
//            System.out.println(name);
//        }

        // Способ № 3
//        int[] arr = new int[3];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        System.out.println(Arrays.toString(arr));


//       Заполнение массива
//        int[] arr2 = new int[3];
//        Arrays.fill(arr2, 5);
//        for (int i: arr2) {
//            System.out.println(i);

//        int[] arr3 = new int[4];
//        for (int i = 0; i < arr3.length; i++) {
//            arr3[i] = i;
//        }
//        System.out.println(Arrays.toString(arr3));
////        }
//
//        System.out.println(Arrays.binarySearch(arr3, 3));

//        /**
//         * Массив как аргумент и возвращаемое значение метода
//         */
//        String[] students = getFilledClassList();
//        System.out.println(students[1]);
////
//////        for (String name: students)students
//        for (String name: getFilledClassList()) {
//            System.out.println(name);
//        }

////        // Считаем среднюю температуру
//        double[] temperatures = new double[5];
//        temperatures[0] = -1.5;
//        temperatures[1] = -10.1;
//        temperatures[2] = 0.3;
//        temperatures[3] = 10.2;
//        temperatures[4] = 25.5;
//
//        double avgTemperature = getAvgTemperature(temperatures);
//        System.out.println(avgTemperature);

//        /**
//         * Многомерный массив
//         */
//        // применение: матрицы (таблицы), карты
//        int[][] table = new int[2][2];
//        table[0][0] = 1;
//        table[0][1] = 2;
//        table[1][0] = 3;
//        table[1][1] = 4;
//
//       int[][] arr = new int[2][];
//       arr[0] = new int[6];
//       arr[1] = new int[8];
//       arr[0][4] = 1;
//
//        table[0][0] = -1;
//        System.out.println(table[0][0]);

        // перебор двумерного массива

//        // способ 1
//        for (int i = 0; i < table.length; i++) {
//            for (int k = 0; k < table[i].length; k++) {
//                System.out.println("i = " + i + " k = " + k + " => " + table[i][k]);
//            }
//        }

//        // способ 2
//        for (int[] arr: table) {
//            for (int a: arr) {
//                System.out.println(a);
//            }
//        }

//        // трёхмерный массив
//        int[][][] array3d = new int[1][2][2];
//        array3d[0][0][0] = 1;
//        array3d[0][0][1] = 2;
//        array3d[0][1][0] = 3;
//        array3d[0][1][1] = 4;
//
//        for (int[][] arr2d: array3d) {
//            for (int[] arr: arr2d) {
//                for (int a: arr) {
//                    System.out.println(a);
//                }
//            }
//        }

 //   }

    /*
     * Метод возвращает список учеников класса.
     */
//    static String[] getFilledClassList() {
  //      String[] students = new String[3];
 //       students[0] = "Петров Петр";
 //       students[1] = "ванов ван";
 //       students[2] = "Сергеев Сергей";
 //       return students;
 //   }

    /*
     * Метод считает среднюю температуру
     */
 //   static double getAvgTemperature(double[] temperatures) {
  //      double result = .0;
   //     for (double temperature: temperatures) {
   //         result += temperature;
   //     }
  //      return result / temperatures.length;
 //   }
//}
//CHECKSTYLE:ON
