package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

// BEGIN
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// END
class Car {
    int id;
    @NonNull
    String brand;
    @NonNull
    String model;
    @NonNull
    String color;
    @NonNull
    User owner;

    // BEGIN
    public String serialize() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return e.getMessage();
        }
    }

    public static Car unserialize(String carAsString) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(carAsString, Car.class);
    }
    // END
}