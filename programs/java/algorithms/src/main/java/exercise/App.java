package exercise;

import java.util.Arrays;

class App {
    // BEGIN

    public static int[] sort (int[] arr) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    arr[i] += arr[i+1];
                    arr[i+1] = arr[i] - arr[i+1];
                    arr[i] = arr[i] - arr[i+1];
                    sorted = false;
                }
            }
        }
        return arr;
    }

    public static int[] modifiedSort (int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    index = j;
                    min = arr[j];
                }
            }
            arr[index] = arr[i];
            arr[i] = min;
        }
        return arr;
    }

    public static void main (String[] args) {
        //проверяем метод sort
        int[] numbers = {3, 10, 4, 3};
        int[] sorted = App.sort(numbers);
        System.out.println(Arrays.toString(sorted)); // => [3, 3, 4, 10]

        //проверяем метод modifiedSort
        int[] numbers1 = {3, 10, 4, 3};
        int[] sorted1 = App.modifiedSort(numbers1);
        System.out.println(Arrays.toString(sorted1)); // => [3, 3, 4, 10]
    }
    // END
}
