package exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {
    public static void main(String[] args) {
//        // Boxing and Unboxing
//        int a = 5;
//        //boxing
//        Integer aObj = a;
//        //unboxing
//        int b = aObj;
//
//
//        System.out.println(aObj.shortValue());

        Double d1 = 0.2;
        Double d2 = 0.3;

//
//        System.out.println(d1 == d2);
//        System.out.println(d1.equals(d2));
//        System.out.println(d1.compareTo(d2));

        // Из String в Double
        String numStr = "0.1";
        double num = Double.parseDouble(numStr);
        System.out.println("Result: " + (num + .1));

//
//        StringBuilder

//        String str1 = "abc";
//        String str2 = "abc";
//
//        System.out.println(str1 == str2);
//
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(str1);
//        stringBuilder.append(str2);
//
//        System.out.println(stringBuilder);
//


//        String aStr = "a";
//        String bStr = "b";
//        String cStr = "c";
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(aStr);
//        sb.append(bStr);
//        sb.append(cStr);
//
//        System.out.println(sb);
//
//        System.out.println(sb);
//        // полезные методы
//        System.out.println(sb.reverse());
//        System.out.println(sb.insert(1, " example "));
//        System.out.println(sb.capacity());
//        System.out.println(sb.delete(1, 2));

        // Даты

        // в принципе дату можно записать, например, так
//        String dateStr = "1 марта 2021";
//        System.out.println(dateStr);
//
//        // класс Date
//        Date date = new Date();
//        System.out.println(date);
////
//        Date date2 = new Date(-1212121212121L);
//        System.out.println(date2);
////
//        System.out.println(date.before(date2));
//        System.out.println(date.after(date2));
//        System.out.println(date.getTime());
//
//        // Java Calendar
//        date.getDay();
//        date.getHours();
//        date.getMonth();
//
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getTime());
////
//        calendar.set(Calendar.YEAR, 2021);
//        calendar.set(Calendar.MONTH, 2);
//        calendar.set(Calendar.DAY_OF_MONTH, 29);
//        System.out.println(calendar.getTime());
//
//        System.out.println(calendar.get(Calendar.MONTH));
////
//        calendar.add(Calendar.YEAR, -1);
//        System.out.println(calendar.getTime());
//
        // simple date format
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        // hh - часы (12-часовой формат), HH - 24-часовой формат
        // mm - минуты
        //ss - секунды
        Date dateExample = new Date();

        System.out.println(simpleDateFormat.format(dateExample));
    }
}
