package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

class NumbersTest {
    @Test
    void testPrintHiddenCard1() throws Exception {
        String result = tapSystemOut(() -> {
            Card.printHiddenCard("1234567812345678", 4);
        });
        assertThat(result.trim()).isEqualTo("****5678");
    }

    @Test
    void testPrintHiddenCard2() throws Exception {
        String result = tapSystemOut(() -> {
            Card.printHiddenCard("7645934217542836", 2);
        });
        assertThat(result.trim()).isEqualTo("**2836");
    }
}
