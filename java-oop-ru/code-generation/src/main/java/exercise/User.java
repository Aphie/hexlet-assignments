package exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Value;

// BEGIN
@Getter
@AllArgsConstructor
@NoArgsConstructor
// END
public class User {
    int id;
    String firstName;
    String lastName;
    int age;
}

