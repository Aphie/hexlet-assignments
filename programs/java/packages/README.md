# Пакеты

## src/main/java/exercise/geometry/Point.java

## Задачи

* В файле определите имя пакета так, чтобы класс `Point` принадлежал пакету `exercise.geometry`.

## src/main/java/exercise/geometry/Segment.java

Отрезок — еще один примитив на плоскости. В коде описывается парой точек, одна из которых — начало отрезка, другая — конец.
## Задачи

* В файле определите имя пакета `exercise.geometry`.
* Создайте публичный класс `Segment`, который представляет отрезок. В классе определите следующие публичные статические методы:

  * `makeSegment()` — принимает на вход две точки и возвращает отрезок.
  * `getBeginPoint()` —  принимает на вход отрезок и возвращает точку начала отрезка.
  * `getEndPoint()` — Принимает на вход отрезок и возвращает точку конца отрезка.

```java
double[] point1 = Point.makePoint(2, 3);
double[] point2 = Point.makePoint(4, 5);
double[][] segment = Segment.makeSegment(point1, point2);
double[] beginPoint = Segment.getBeginPoint(segment);
double[] endPoint = Segment.getEndPoint(segment);
System.out.println(Arrays.toString(beginPoint)); // => [2, 3]
System.out.println(Arrays.toString(endPoint)); // => [4, 5]
```

## src/main/java/exercise/App.java

## Задачи

* В файле определите пакет `exercise` и подключите классы `Point` и `Segment` из пакета `exercise.geometry`.
* Cоздайте класс `App` и в нём определите следующие публичные статические методы:

  * `getMidpointOfSegment()` — принимает в качестве аргумента отрезок и возвращает точку середины отрезка.
  * `reverse()` — принимает в качестве аргумента отрезок и возвращает новый отрезок с точками, добавленными в обратном порядке (begin меняется местами с end). Точки в результирующем отрезке должны быть копиями (по значению) соответствующих точек исходного отрезка. То есть они не должны быть ссылкой на одну и ту же точку, так как это разные точки (пускай и с одинаковыми координатами).

```java
double[] point1 = Point.makePoint(3, 4);
double[] point2 = Point.makePoint(6, 7);
double[][] segment = Segment.makeSegment(point1, point2);

double[] midPoint = App.getMidpointOfSegment(segment);
System.out.println(Arrays.toString(midPoint)); // => [4.5, 5.5]

double[][] reversedSegment = App.reverse(segment);
double[] beginPoint = Segment.getBeginPoint(reversedSegment);
double[] endPoint = Segment.getEndPoint(reversedSegment);
System.out.println(Arrays.toString(beginPoint)); // => [6, 7]
System.out.println(Arrays.toString(endPoint)); // => [3, 4]
```

## Самостоятельная работа

* В классе `App` создайте публичный статический метод `isBelongToOneQuadrant()`. Метод принимает на вход отрезок и определяет, лежит ли весь отрезок целиком в одном квадранте. Если начало и конец отрезка лежат в одном квадранте, метод возвращает `true`, иначе —  `false`. Если хотя бы одна из точек лежит на оси координат, то считается, что отрезок не находится целиком в одном квадранте.

```java
double[][] segment1 = Segment.makeSegment(Point.makePoint(1, 4), Point.makePoint(5, 8));
App.isBelongToOneQuadrant(segment1); // true

double[][] segment2 = Segment.makeSegment(Point.makePoint(1, 4), Point.makePoint(-2, 8));
App.isBelongToOneQuadrant(segment2); // false

double[][] segment3 = Segment.makeSegment(Point.makePoint(1, 4), Point.makePoint(0, 0));
App.isBelongToOneQuadrant(segment3); // false
```
