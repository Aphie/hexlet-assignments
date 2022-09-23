package exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
public class App {

    public static String getForwardedVariables(String inputFile) {
        return   inputFile.lines()
                .filter(str -> str.startsWith("environment"))
                .map(line -> line.replaceAll("environment=",""))
                .map(line -> line.replaceAll("\"",""))
                .map(line -> line.split(","))
                .flatMap(Arrays::stream)
                .filter(element -> element.startsWith("X_FORWARDED_"))
                .map(element -> element.replaceAll("X_FORWARDED_",""))
                .collect(Collectors.joining(","));
    }

    public static void main (String[] args) throws IOException {
//        String path = "exercises/advanced-streams/src/main/java/exercise/s.conf";
//        String content = Files.readString(Paths.get(path));
        String content1 = "[program:prepare]\n" +
                "command=sudo -HEu tirion /bin/bash -c 'cd /usr/src/app && make prepare'\n" +
                "autorestart=false\n" +
                "environment=\"X_FORWARDED_MAIL=tirion@google.com,X_FORWARDED_HOME=/home/tirion,language=en\"\n" +
                "\n" +
                "[program:http_server]\n" +
                "command=sudo -HEu tirion /bin/bash -c 'cd /usr/src/app && make environment'\n" +
                "environment=\"key5=value5,X_FORWARDED_var3=value,key6=value6\"";

// Передаем содержимое файла в метод
        String result = App.getForwardedVariables(content1);
        System.out.println(result); // => "MAIL=tirion@google.com,HOME=/home/tirion,var3=value"
    }
}
//END
