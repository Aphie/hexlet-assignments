package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

class AppTest {
    @Test
    void testNumbers() throws Exception {
        String result = tapSystemOut(() -> {
            App.numbers();
        });
        assertThat(result.trim()).isEqualTo("5");
    }

    @Test
    void testStrings() throws Exception {
        String result = tapSystemOut(() -> {
            App.strings();
        });
        assertThat(result.trim()).isEqualTo("Java works on JVM");
    }

    @Test
    void testConverting() throws Exception {
        String result = tapSystemOut(() -> {
            App.converting();
        });
        assertThat(result.trim()).isEqualTo("300 spartans");
    }
}
