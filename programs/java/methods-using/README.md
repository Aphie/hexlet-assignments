# Свойства и методы (использование)

## Ссылки

* [Класс String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html) — предоставляет ряд методов для манипуляции строками.
* [Метод format](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)).

## main/java/exercise/Card.java

## Задачи

* В методе `printHiddenCard()` в переменной `cardNumber` в виде строки находится номер кредитной карты, состоящий из 16 цифр. Выведите на экран скрытую версию номера, которая может использоваться на сайте для отображения. Если исходная карта имела номер "2034399002125581", то скрытая версия выглядит так "\*\*\*\*5581". Другими словами, нужно заменить первые 12 символов на звездочки. Количество звездочек указано в переменной `starsCount`.

```java
Card.printHiddenCard("4567214587350971", 4); // => "****0971"
Card.printHiddenCard("4567214587350971", 3); // => "***0971"
```

## main/java/exercise/Sentence.java

## Задачи

* В методе `printSentence()` выведите на экран предложение, которое находится в переменной `sentence`. Если предложение восклицательное, выведите его в верхнем регистре, если нет — в нижнем. Предложение считается восклицательным, если у него в конце стоит восклицательный знак.

```java
Sentence.printSentence("HellO, World!"); // => "HELLO, WORLD!"
Sentence.printSentence("HellO, World"); // => "hello, world"
```

## Самостоятельная работа

Пройдите модуль "Использование методов" на [code-basics.com](https://ru.code-basics.com/languages/java)
