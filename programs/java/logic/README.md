# Логика

## src/main/java/exercise/App.java

## Задачи

* В методе `sayEvenOrNot()` при помощи `System.out.println()` выведите на экран слово "yes", если число в переменной `number` является четным и "no" — если не четным.

```java
App.sayEvenOrNot(2); // => "yes"
App.sayEvenOrNot(9); // => "no"
```

* Метод `isBigOdd()` принимает в качестве аргумента целое число. Метод возвращает `true`, если это нечетное число, которое больше или равно 1001 и `false` в остальных случаях. В методе `isBigOdd()` создайте переменную `isBigOddVariable`, которая принимает следующие значения:

* `true`, если число `number` — это нечетное число, которое больше или равно 1001
* `false` во все остальных случаях.

```java
App.isBigOdd(1001); // true
App.isBigOdd(900); // false
```

* В методе `printPartOfHour()` в переменной `minutes` находится число минут, от 0 до 59. Выведите на экран четверть часа, в которую попадает это число. Число от 0 до 14 минут — это первая четверть часа, от 15 и до 30 минут — вторая четверть, от 31 до 45 минут — третья четверть и от 46 до 59 минут — четвертая.

```java
App.printPartOfHour(10); // => "First"
App.printPartOfHour(16); // => "Second"
App.printPartOfHour(35); // => "Third"
App.printPartOfHour(55); // => "Fourth"
```

## Самостоятельная работа

Пройдите модуль "Логика" на [code-basics.com](https://ru.code-basics.com/languages/java)
