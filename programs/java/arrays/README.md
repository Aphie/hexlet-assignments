# Массивы

## src/main/java/exercise/App.java

## Задачи

* Создайте публичный статический метод `reverse()`, который принимает в качестве аргумента массив целых чисел и возвращает новый массив целых чисел с элементами, расположенными в обратном порядке. Если передан пустой массив, метод должен вернуть пустой массив.

```java
int[] numbers = {1, 2, -6, 3, 8};
int[] result = App.reverse(numbers);
System.out.println(Arrays.toString(result)); // => [8, 3, -6, 2, 1]
```

* Создайте публичный статический метод `mult()`. Метод принимает в качестве аргумента массив целых чисел и возвращает произведение всех элементов массива.

```java
int[] numbers1 = {};
App.mult(numbers1); // 1

int[] numbers2 = {1, 4, 3, 4, 5};
App.mult(numbers2); // 240

int[] numbers3 = {1, 4, -3, 2};
App.mult(numbers3); // -24

int[] numbers4 = {1, -3, 5, 4, -3, 0};
App.mult(numbers4); // 0
```

## Самостоятельная работа

* Реализуйте публичный статический метод `flattenMatrix()`. Метод принимает в качестве аргумента матрицу целых чисел (двумерный массив) и записывает все её элементы в одномерный массив. Если на вход передана пустая матрица, метод должен вернуть пустой массив.

```java
int[][] matrix1 = new int[][];
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
```
