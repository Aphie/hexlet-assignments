package exercise;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> inputUsers) {
        List<String> result = inputUsers.stream()
                .filter(user -> user.get("gender").equals("male"))
                .sorted(Comparator.comparing(user-> getAge(user.get("birthday"))))
                .map(user -> user.get("name"))
                .collect(Collectors.toList());
        return result;
    }
    public static int getAge (String inputDate) {
        LocalDate birthDate = LocalDate.parse(inputDate);
        LocalDate currentDate = LocalDate.now();
        return (Period.between(currentDate, birthDate)).getYears();
    }
}

// END
