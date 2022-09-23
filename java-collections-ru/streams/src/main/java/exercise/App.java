package exercise;

import java.util.List;
import java.util.Arrays;

public class App {
    public static long getCountOfFreeEmails (List<String> emails) {
        if (emails!=null) {
            return emails.stream()
                    .filter(email -> email.contains("@gmail.com") || email.contains("@yandex.ru") || email.contains("@hotmail.com"))
                    .count();
        }
        else return 0;
    }

    public static void main (String[] args) {
        String[] emails = {
                "info@gmail.com",
                "info@yandex.ru",
                "mk@host.com",
                "support@hexlet.io",
                "info@hotmail.com",
                "support.yandex.ru@host.com"
        };

        List<String> emailsList = Arrays.asList(emails);
        App.getCountOfFreeEmails(emailsList); // 3
        System.out.println("Count free emails: " + App.getCountOfFreeEmails(emailsList));
    }
}