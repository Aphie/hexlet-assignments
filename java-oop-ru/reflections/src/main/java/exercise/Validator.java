package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        List<String> nullFields = new ArrayList<>();
        for (Field field: address.getClass().getDeclaredFields()) {
            NotNull notNullField = field.getAnnotation(NotNull.class);
            if (notNullField != null) {
                try {
                    field.setAccessible(true);
                    if (field.get(address) == null) {
                        nullFields.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return nullFields;
    }
}
// END
