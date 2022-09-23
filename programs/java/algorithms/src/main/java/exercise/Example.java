package exercise;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] arr = {5, -1, 4, 0, 1, 9, 8, 7};

//         // Поиск элемента в массиве
//        int value = 322;
//        int index = findElementIndexByValue(arr, value);
//        if (index != -1) {
//            System.out.println("ндекс элемента " + value + " в массиве: " + index);
//        } else {
//            System.out.println("Элемента " + value + " в массиве не существует");
//        }

//        // Сортировка массива.
//        insertionSort(arr);
//        System.out.println(Arrays.toString(arr));

        // Бинарный поиск
        insertionSort(arr);
        // binary search value
        System.out.println(Arrays.toString(arr));
        int bsValue = 1;
        int binarySearchedIndex = binarySearch(arr, bsValue);
        if (binarySearchedIndex != -1) {
            System.out.println("Бинарный поиск: элемент " + bsValue + " находится на позиции " + binarySearchedIndex);
        } else {
            System.out.println("Элемент " + bsValue + " не найден в массиве");
        }
    }

    static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] < value) {
                left = middle + 1;
            } else if (arr[middle] > value) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int k = i; k > 0; k--) {
                if (arr[k] < arr[k - 1]) {
                    //swap elements
                    arr[k] += arr[k - 1];
                    arr[k - 1] = arr[k] - arr[k - 1];
                    arr[k] = arr[k] - arr[k - 1];
                }
            }
        }
    }

    static int findElementIndexByValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
