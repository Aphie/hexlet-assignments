package exercise;

import java.util.Arrays;

class App {
    // BEGIN
    public static int[] reverse (int[] numbers) {
        int reverseNumbersLength = numbers.length;
        int[] reverseNumbers = new int[reverseNumbersLength];
        if (numbers.length == 0) {
            return reverseNumbers;
        }
        for (int i = 0; i < numbers.length; i++) {
            reverseNumbers[i] = numbers[reverseNumbersLength - i -1];
        }
        return reverseNumbers;
    }

    public static int mult (int[] numbers) {
        int result = 1;
        for (int i = 0; i < numbers.length; i++) {
            result *= numbers[i];
        }
        return result;
    }

    public static int[] flattenMatrix(int arr[][]) {
        int[] arrResultNull = {};
        if (arr.length == 0) {
            return arrResultNull;
        }

        int[] arrResult = new int[arr.length * arr[0].length];
        int k = 0;
        for (int[] coloumn : arr) {
            for (int a : coloumn) {
                arrResult[k] = a;
                k++;
            }
        }
        return arrResult;
    }

    public static void main (String[] args) {
        //проверяем работу метода reverse()
        int[] numbers = {1, 2, -6, 3, 8};
        int[] result = App.reverse(numbers);
        System.out.println(Arrays.toString(result)); // => [8, 3, -6, 2, 1]

        //проверяем работу метода mult()
        int[] numbers1 = {};
        App.mult(numbers1); // 1
        System.out.println(App.mult(numbers1)); // => [8, 3, -6, 2, 1]

        int[] numbers2 = {1, 4, 3, 4, 5};
        App.mult(numbers2); // 240
        System.out.println(App.mult(numbers2));

        int[] numbers3 = {1, 4, -3, 2};
        App.mult(numbers3); // -24
        System.out.println(App.mult(numbers3));

        int[] numbers4 = {1, -3, 5, 4, -3, 0};
        App.mult(numbers4); // 0
        System.out.println(App.mult(numbers4));

        //проверяем работу метода flattenMatrix()
        int[][] matrix1 = new int[0][0];
        int[] result1 = App.flattenMatrix(matrix1);
        System.out.println(Arrays.toString(result1));
// => []

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[] result2 = App.flattenMatrix(matrix2);
        System.out.println(Arrays.toString(result2));
// => [1, 2, 3, 4, 5, 6]

    }
    // END
}
