package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void testSort() {
        int[] numbers1 = {};
        int[] result1 = App.sort(numbers1);
        assertThat(result1).isEmpty();

        int[] numbers2 = {10, 1, 3};
        int[] result2 = App.sort(numbers2);
        int[] expected2 = {1, 3, 10};
        assertThat(result2).containsExactly(expected2);

        int[] numbers3 = {0, 4, 0, 10, -3};
        int[] result3 = App.sort(numbers3);
        int[] expected3 = {-3, 0, 0, 4, 10};
        assertThat(result3).containsExactly(expected3);
    }
}
