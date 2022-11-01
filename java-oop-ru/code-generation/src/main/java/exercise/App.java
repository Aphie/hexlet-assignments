package exercise;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;

// BEGIN
public class App {
    public static void save(Path path, Car car) {
        try {
            Files.writeString(path, car.serialize());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Car extract(Path path) throws IOException {
        String content = Files.readString(path);
        return Car.unserialize(content);
    }
}
// END
