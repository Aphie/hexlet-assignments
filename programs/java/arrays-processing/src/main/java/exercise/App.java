package exercise;

import java.util.Arrays;

class App {
    // BEGIN
    public static int getIndexOfMaxNegative(int[] arr) {
        int minValue = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && arr[i] > minValue) {
                minValue = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int[] getElementsLessAverage(int[] arr) {
        int arrSum = 0;
        for (int a : arr) {
            arrSum += a;
        }

        int[] tempArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arrSum/arr.length) {
                tempArr[j] = arr[i];
                j++;
            }
        }
        return Arrays.copyOf(tempArr, j);
    }

    public static int getSumBeforeMinAndMax(int[] arr) {
        int minValue = arr[0];
        int maxValue = arr[0];
        int indexMinValue = 0;
        int indexMaxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                indexMinValue = i;
            }
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                indexMaxValue = i;
            }
        }

        int sum = 0;
        for (int i = Math.min(indexMinValue,indexMaxValue)+1; i < Math.max(indexMinValue,indexMaxValue); i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main (String[] args) {
        // проверка метода getIndexOfMaxNegative
        int[] numbers1 = {};
        App.getIndexOfMaxNegative(numbers1); // -1
        System.out.println(getIndexOfMaxNegative(numbers1));

        int[] numbers2 = {1, 4, 3, 4, 5};
        App.getIndexOfMaxNegative(numbers2); // -1
        System.out.println(getIndexOfMaxNegative(numbers2));

        int[] numbers3 = {1, 4, -3, 4, -5};
        App.getIndexOfMaxNegative(numbers3); // 2
        System.out.println(getIndexOfMaxNegative(numbers3));

        int[] numbers4 = {1, -3, 5, 4, -3, -10};
        App.getIndexOfMaxNegative(numbers4); // 1
        System.out.println(getIndexOfMaxNegative(numbers4));

        //проверка метода getElementsLessAverage
        int[] numbers = {1, 2, 6, 3, 8, 12};
        int[] result = App.getElementsLessAverage(numbers);
        System.out.println(Arrays.toString(result)); // => [1, 2, 3]

        //проверка метода getSumBeforeMinAndMax
        int[] numbers5 = {5, 4, 34, 8, 11, -5, 1};
        App.getSumBeforeMinAndMax(numbers5); // 19
        System.out.println(getSumBeforeMinAndMax(numbers5));

        int[] numbers6 = {7, 1, 37, -5, 11, 8, 1};
        App.getSumBeforeMinAndMax(numbers6); // 0
        System.out.println(getSumBeforeMinAndMax(numbers6));
    }
    // END
}
