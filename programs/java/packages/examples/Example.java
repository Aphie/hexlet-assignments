package org.extra.hw.hexlet.pr14;

import  exercise.stack.Stack;

public class Example {
    public static void main(String[] args) {
//        // пакеты
////        // получили пользователя по сети
//        org.extra.hw.hexlet.pr14.request.User inputUser = new org.extra.hw.hexlet.pr14.request.User();
//        inputUser.setId(1);
//        inputUser.setEmail("egor@yakovlev.ru");
//
//        org.extra.hw.hexlet.pr14.request.Password password = new org.extra.hw.hexlet.pr14.request.Password();
//        password.setPassword("qwerty1234");
//        password.setConfirmation("qwert1234");
//
//        inputUser.setPassword(password);
//        inputUser.setUsername("EgorYakovlev");
//        System.out.println(inputUser);
////
//        //сохранили нового пользователя в БД и вернули "сокращенную" версию пользователя
//        org.extra.hw.hexlet.pr14.response.User outputUser = new org.extra.hw.hexlet.pr14.response.User(
//            "EgorYakovlev", "egor@yakovlev.ru"
//        );
//        System.out.println(outputUser);
//
//        System.out.println(Objects.equals(inputUser, outputUser));

        // import

//        User inputUser = new User();
    //    org.extra.hw.hexlet.pr14.response.User outputUser = new org.extra.hw.hexlet.pr14.response.User(
    //        "", "egor@yakovlev.ru"
    //    );


        // задача с собеседования о стеке - проверить, является ли скобочная последовательность правильной
//        String example = "{}[)";
//
//        if (check(example) == 0) {
//            System.out.println("Правильная скобочная последовательность");
//        } else {
//            System.out.println("Скобочная последовательность неверная");
//        }
    }

    private static int check(String example) {
        Stack stack = new Stack();
        for (char ch : example.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.put(ch);

            //  если скобка закрывающаяся
            } else {
                if (stack.getSize() == 0) {
                    return -1;
                }
                if ((stack.pop() == '(' && ch == ')')
                    || (stack.pop() == '[' && ch == ']')
                    || (stack.pop() == '{' && ch == '}')) {
                    stack.delete();
                }
            }
        }
        return stack.getSize();
    }
}
