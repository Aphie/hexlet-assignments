package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

class ConverterTest {
    @Test
    void testConvertWithBite() {
        int result = Converter.convert(10, "b");
        assertThat(result).isEqualTo(10240);
    }

    @Test
    void testConvertWithKb() {
        int result = Converter.convert(4096, "Kb");
        assertThat(result).isEqualTo(4);
    }

    @Test
    void testConvertWithMb() {
        int result = Converter.convert(100, "mb");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void testMain() throws Exception {
        String result = tapSystemOut(() -> {
            Converter.main(null);
        });
        assertThat(result.trim()).isEqualTo("10 Kb = 10240 b");
    }
}
