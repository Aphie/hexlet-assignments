package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

class SentenceTest {
    @Test
    void testPrintSentence1() throws Exception {
        String result = tapSystemOut(() -> {
            Sentence.printSentence("HeLLo, WorlD");
        });
        assertThat(result.trim()).isEqualTo("hello, world");
    }

    @Test
    void testPrintSentence2() throws Exception {
        String result = tapSystemOut(() -> {
            Sentence.printSentence("HellO, woRlD!");
        });
        assertThat(result.trim()).isEqualTo("HELLO, WORLD!");
    }
}
