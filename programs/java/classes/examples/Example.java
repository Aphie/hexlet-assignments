package exercise;

import java.util.Date;
// import java.util.Objects;

public class Example {
    public static void main(String[] args) {
        // Класс
//        Book book = new Book();
//        book.setYear(2021);
//        book.setName("ExampleName");

//        Author author = new Author();
//        author.setBirthDate(new Date(-1L));
//        author.setName("Egor");
//
//        book.setAuthor(author);
//
//        book.printInfo();

//        Book.printInfo(book);
//
//        // Object
//        Object object = new Object();
//        System.out.println(object.getClass());
//        System.out.println(object.toString());
//        System.out.println(object.hashCode());
//        System.out.println(object.equals("object"));
//
////
//        System.out.println(book.getClass());
//        System.out.println(book.toString());
//        System.out.println(book.hashCode());
//        System.out.println(book.equals(object));
//
//        // типичная ошибка
//        Object nullObj = null;
//        if (nullObj != null) {
//            System.out.println(nullObj.equals("ssd"));
//        }
//
//        "ssd".equals(nullObj);
//        Objects.equals(nullObj, "ssd");
//
        //hashCode и equals
        //что будет, если не прописать hashcode и equals
        Author author = new Author();
        author.setName("Egor");
        author.setBirthDate(new Date(-1));
//
        Book book1 = new Book();
        book1.setAuthor(author);
        book1.setName("Example");
        book1.setYear(2021);
//
        Book book2 = new Book();
        book2.setAuthor(author);
        book2.setName("Example");
        book2.setYear(2021);

        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
//
//        System.out.println(book1.equals(book2));
//
//        //Objects.equals(book1, book2);
//

    }
}
