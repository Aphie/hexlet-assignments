package exercise;

public class Example {
    public static void main(String[] args) {
//        /*
//         * Копия массива.
//         * copyOf
//         */

//        int[] arrInit = {1, 5, -1, 3, 0};
//        int[] arrCopy = arrInit;
//
//        int[] arrCloned = arrInit.clone();
//
//        arrInit[0] = 6;
//
//        System.out.println("arrInit = " + Arrays.toString(arrInit));
//        System.out.println("arrCopy = " + Arrays.toString(arrCopy));
//        System.out.println("arrInit == arrCopy ? " + (arrCopy == arrInit));
//
//
//
//        System.out.println("arrInit = " + Arrays.toString(arrInit));
//        System.out.println("arrCloned = " + Arrays.toString(arrCloned));
//        System.out.println("arrInit == arrCloned ? " + (arrCloned == arrInit));

//
        /*
         * К слову...
         */
//        String abc1 = new String("abc");
//        String abc2 = new String("abc");
//        System.out.println(abc1);
//        System.out.println(abc2);
//        System.out.println("abc1 == abc2 ? " + (abc1 == abc2));
//

        /*
         * Слайсинг
         */
//        int[] arrInit = {1, 2, 3, 4, 5, 7, 8};
//        int[] arrCopy = Arrays.copyOf(arrInit, 6);
//
//        System.out.println("arrInit = " + Arrays.toString(arrInit));
//        System.out.println("arrCopy = " + Arrays.toString(arrCopy));
//
//        System.out.println("arrInit == arrCopy ? " + (arrCopy == arrInit));
//
//        int[] arr = {-5, 9, 10, 11, -10, 5, 2, 2, 1};
//        int[] arrSlice = Arrays.copyOfRange(arr, 2, 5);
//
//        System.out.println(Arrays.toString(arrSlice));


//        int[] arrNull = null;
//        int[] arrNullSlice = Arrays.copyOfRange(arrNull, 0, 10);
//        System.out.println(Arrays.toString(arrNullSlice));

//
//        int[] arr = {1, 2, 3, 4 , 5, 6};
//        int[] arrResult = new int[5];
//        System.arraycopy(arr, 2, arrResult, 1, 3);
//
//        System.out.println(Arrays.toString(arrResult));


//        /*
//         * Максимальное/минимальное значение в массиве.
//         */
//        int[] arr = {5, -10, 11, 23, -100, 0, -1, 23, -100};
//        int max = getMaxValue(arr);
//        System.out.println("Max value: " + max);
//        int min = getMinValue(arr);
//        System.out.println("Min value: " + min);

//        /*
//         * Поиск индекса конкретного значения.
//         */
//
//        int value = 23;
//        int valueIndex = findValueIndex(arr, value);
//        System.out.println("Index of value: " + valueIndex);

//        /*
//         * Сумма элементов массива.
//         */
//        int[] arr = {1, -1, 2, -2, 5};
//        int sum = getSumOfArrayValues(arr);
//        System.out.println("Sum of array elements: " + sum);

        /*
         * Строки как массив char.
         */
//        String str = "abcde";
//        System.out.println(str);
//        char[] arr = str.toCharArray();
//        System.out.println(Arrays.toString(arr));
//
//        int index = 2;
//        System.out.println("Символ на позиции " + index + ": " + str.charAt(index));
//
        // перебор массива символов в for
//        for (char ch: arr) {
//            System.out.println("symbol = " + ch);
//        }
//
//        // парсинг даты
//        String date = "18/05/2021";
//        System.out.println("Converted str = " + convertToDateWithDots(date));
////
//        // или...
//        System.out.println("Another way... : " + date.replaceAll("/", "."));
    }

    static String convertToDateWithDots(String date) {
        char[] arr = date.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == '/' ? '.' : arr[i];
        }
        // !!! NOT arr.toString() -> hashcode...
        return String.valueOf(arr);
    }

    // no check for null array
    static int getSumOfArrayValues(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

    // no check for null or empty arr
//    static int getMinValue(int[] arr) {
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            min = min > arr[i] ? arr[i] : min;
//        }
//        return min;
//    }

//    // no check for null or empty array
//    // 1 6 9 0 1
//    static int getMaxValue(int[] arr) {
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            max = max < arr[i] ? arr[i] : max;
//        }
//        return max;
//    }

    // no for with index++
    // no check for null array
    static int getMinValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int a : arr) {
            min = a < min ? a : min;
        }
        return min;
    }

    // no for loop with index++
    // no check for null array
    static int getMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int a : arr) {
            max = a > max ? a : max;
        }
        return max;
    }

    // no check for null or empty arr
    static int findValueIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
