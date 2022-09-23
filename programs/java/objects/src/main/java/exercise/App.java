package exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

class App {
    // BEGIN
    static public String buildList(String[] listInString) {
        StringBuilder list = new StringBuilder();
        if (listInString.length == 0) {
            return list.toString();
        }

        String startList = "<ul>\n";
        list.append(startList);

        String listElementStart = "  <li>";
        String listElementEnd = "</li>\n";

        for (int i = 0; i < listInString.length; i++) {
            if (listInString[i] != null) {
                list.append(listElementStart).append(listInString[i]).append(listElementEnd);
            }
        }

        String endList = "</ul>";
        list.append(endList);

        return list.toString();

    }

    static public String getUsersByYear(String[][] users, int yearToCheck) {
        String[] foundUsers = new String[users.length];
        int countUsers = 0;
        Integer yearToInt;
        for (int i = 0; i < users.length; i++) {
            yearToInt = Integer.valueOf(users[i][1].substring(0,4));
            if (yearToInt == yearToCheck) {
                foundUsers[countUsers] = users[i][0];
                countUsers ++;
            }
        }

        if (countUsers == 0) {
            return "";
        } else {return buildList(foundUsers);}
    }

    // END

    // Это дополнительная задача, которая выполняется по желанию.
    public static String getYoungestUser(String[][] users, String date) throws ParseException {
        // BEGIN

        String youngestUserName = new String();
        LocalDate minUserDate = LocalDate.MIN;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");

        LocalDate userDateToCompare = LocalDate.parse(date, formatter);

        for (int i = 0; i < users.length; i++) {
            for (int j=0; j < users[0].length; j++) {
                if (LocalDate.parse(users[i][1]).isAfter(minUserDate) && LocalDate.parse(users[i][1]).isBefore(userDateToCompare)) {
                    youngestUserName = users[i][0];
                    minUserDate = LocalDate.parse(users[i][1]);
                }
            }
        }
        return youngestUserName;
    }

        // END

    static public void main(String[] args) throws ParseException {
        String[] animals = {"cats", "dogs", "birds"};
        App.buildList(animals);
        System.out.println(buildList(animals));
// <ul>
//   <li>cats</li>
//   <li>dogs</li>
//   <li>birds</li>
// </ul>

        String[][] users = {
                {"Andrey Petrov", "1990-11-23"},
                {"Aleksey Ivanov", "1995-02-15"},
                {"John Smith", "1990-03-11"},
                {"Vanessa Vulf", "1985-11-16"},
                {"Vladimir Nikolaev", "1990-12-27"},
                {"Alice Lucas", "1986-01-01"},
        };
        App.getUsersByYear(users, 1990);
        System.out.println(getUsersByYear(users, 1990));
// <ul>
//   <li>Andrey Petrov</li>
//   <li>John Smith</li>
//   <li>Vladimir Nikolaev</li>
// </ul>

        String[][] users1 = {
                {"Andrey Petrov", "1990-11-23"},
                {"Aleksey Ivanov", "2000-02-15"},
                {"Anna Sidorova", "1996-09-09"},
                {"John Smith", "1989-03-11"},
                {"Vanessa Vulf", "1985-11-16"},
                {"Vladimir Nikolaev", "1990-12-27"},
                {"Alice Lucas", "1986-01-01"},
                {"Elsa Oscar", "1989-03-10"},
        };
        App.getYoungestUser(users1, "11 Jul 1989"); // "John Smith"
        System.out.println(getYoungestUser(users1, "11 Jul 1989"));

    }
}


