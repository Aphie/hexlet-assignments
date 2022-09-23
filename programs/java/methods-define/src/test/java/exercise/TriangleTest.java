package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;


class TriangleTest {
    @Test
    void testGetSquare() {
        double result1 = Triangle.getSquare(10, 10, 60);
        assertThat(result1).isCloseTo(43.3, within(0.05));

        double result2 = Triangle.getSquare(4, 5, 45);
        assertThat(result2).isCloseTo(7.07, within(0.05));
    }

    @Test
    void testMain() throws Exception {
        String result = tapSystemOut(() -> {
            Triangle.main(null);
        });
        double square = Double.parseDouble(result);
        assertThat(square).isCloseTo(7.07, within(0.05));
    }
}
