package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

class AppTest {
    @Test
    void testMain() throws Exception {
        String result = tapSystemOut(() -> {
            App.main(null);
        });
        assertThat(result.trim()).isEqualTo("Hello! This is Hexlet!");
    }
}
