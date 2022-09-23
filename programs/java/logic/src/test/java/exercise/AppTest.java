package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

class AppTest {
    @Test
    void testQuarter1() throws Exception {
        String result1 = tapSystemOut(() -> {
            App.printPartOfHour(5);
        });
        assertThat(result1.trim()).isEqualTo("First");

        String result2 = tapSystemOut(() -> {
            App.printPartOfHour(16);
        });
        assertThat(result2.trim()).isEqualTo("Second");

        String result3 = tapSystemOut(() -> {
            App.printPartOfHour(35);
        });
        assertThat(result3.trim()).isEqualTo("Third");

        String result4 = tapSystemOut(() -> {
            App.printPartOfHour(55);
        });
        assertThat(result4.trim()).isEqualTo("Fourth");
    }

    @Test
    void isBigOdd() throws Exception {
        assertThat(App.isBigOdd(0)).isFalse();
        assertThat(App.isBigOdd(1)).isFalse();
        assertThat(App.isBigOdd(999)).isFalse();
        assertThat(App.isBigOdd(1000)).isFalse();
        assertThat(App.isBigOdd(1010)).isFalse();
        assertThat(App.isBigOdd(1011)).isTrue();
    }

    @Test
    void sayEvenOrNot() throws Exception {
        String result1 = tapSystemOut(() -> {
            App.sayEvenOrNot(1);
        });
        assertThat(result1.trim()).isEqualTo("no");

        String result2 = tapSystemOut(() -> {
            App.sayEvenOrNot(2);
        });
        assertThat(result2.trim()).isEqualTo("yes");

        String result3 = tapSystemOut(() -> {
            App.sayEvenOrNot(100);
        });
        assertThat(result3.trim()).isEqualTo("yes");

        String result4 = tapSystemOut(() -> {
            App.sayEvenOrNot(101);
        });
        assertThat(result4.trim()).isEqualTo("no");
    }
}
