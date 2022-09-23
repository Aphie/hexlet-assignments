package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void testReverse() {
        int[] numbers1 = {};
        int[] result1 = App.reverse(numbers1);
        assertThat(result1).isEmpty();

        int[] numbers2 = {1, 7, 23, 15, 0, 5, 8};
        int[] expected2 = {8, 5, 0, 15, 23, 7, 1};
        int[] result2 = App.reverse(numbers2);
        assertThat(result2).containsExactly(expected2);
    }

    @Test
    void testMult() {
        int[] numbers1 = {};
        int result1 = App.mult(numbers1);
        assertThat(result1).isEqualTo(1);

        int[] numbers2 = {2, 4, 1};
        int result2 = App.mult(numbers2);
        assertThat(result2).isEqualTo(8);

        int[] numbers3 = {2, 4, 1, 0};
        int result3 = App.mult(numbers3);
        assertThat(result3).isEqualTo(0);

        int[] numbers4 = {2, 3, 5, -10};
        int result4 = App.mult(numbers4);
        assertThat(result4).isEqualTo(-300);
    }

    // BEGIN
    
    // END
}
