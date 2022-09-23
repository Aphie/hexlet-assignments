# Классы

## main/java/exercise/Kennel.java

## Задачи

* Создайте класс `Kennel`, представляющий питомник. Класс позволяет добавлять щенков в питомник и вести учет их количества. Каждый щенок представлен массивом строк из двух элементов. Первый элемент — имя щенка, второй — его порода.

Реализуйте следующие публичные статические методы:

* `addPuppy()` — принимает в качестве аргумента щенка и добавляет его в питомник.
* `addSomePuppies()` — принимает в качестве аргумента массив щенков и добавляет их в питомник.
* `getPuppyCount()` — возвращает общее количество щенков, находящихся на данный момент в питомнике.
* `isContainPuppy()` — принимает в качестве аргумента имя щенка и проверяет, есть ли в питомнике щенок с таким именем. Если щенок есть, метод возвращает `true`, в ином случае — `false`.
* `getAllPuppies()` — возвращает всех щенков, имеющихся в питомнике, в виде вложенного массива (смотрите пример вызова метода). Щенки в массиве должны располагаться в том порядке, в каком они были добавлены в питомник.
* `getNamesByBreed()` — принимает в качестве аргумента породу и возвращает массив с именами щенков этой породы.
* `resetKennel()` — очищает питомник, не оставляя в нем ни одного щенка.

```java
String[] puppy1 = {"Rex", "boxer"};
Kennel.addPuppy(puppy1);
Kennel.getPuppyCount(); // 1

String[][] puppies2 = {
    {"Buddy", "chihuahua"},
    {"Toby", "chihuahua"},
};
Kennel.addSomePuppies(puppies);
Kennel.getPuppyCount(); // 3
Kennel.isContainPuppy("Buddy"); // true
String[][] puppies = Kennel.getAllPuppies();
System.out.println(Arrays.deepToString(puppies));
// => [[Rex, boxer], [Buddy, chihuahua], [Toby, chihuahua]]


String[] names = Kennel.getNamesByBreed("chihuahua");
System.out.println(Arrays.toString(names)); // => [Buddy, Toby]

Kennel.resetKennel();
Kennel.getPuppyCount(); // 0
```

## Самостоятельная работа

* Создайте публичный статический метод `removePuppy()`, который позволяет выдавать щенка из питомника новому хозяину. Метод принимает в качестве аргумента имя щенка. Если щенок с таким именем есть в питомнике, метод удаляет его из питомника и возвращает `true`. Если щенок отсутствует, метод просто возвращает `false`.

```java
String[][] puppies = {
    {"Teddy", "dog"},
    {"Lessie", "doberman"},
};
Kennel.addSomePuppies(puppies);
Kennel.removePuppy("Jack"); // false
Kennel.removePuppy("Lessie"); // true

String[][] allPuppies = Kennel.getAllPuppies();
System.out.println(Arrays.deepToString(allPuppies));
// => [[Teddy, dog]]
```
