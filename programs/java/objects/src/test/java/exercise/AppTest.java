package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void testBuildList() {
        String[] items1 = {};
        assertThat(App.buildList(items1)).isEqualTo("");

        String[] items2 = {"apples", "pears", "bananas"};
        String expected2 =
            "<ul>\n  <li>apples</li>\n  <li>pears</li>\n  <li>bananas</li>\n</ul>";
        assertThat(App.buildList(items2)).isEqualTo(expected2);
    }

    @Test
    void testGetUserByYear() {
        String[][] users = {
            {"Andrey Petrov", "1990-11-23"},
            {"Aleksey Ivanov", "1995-02-15"},
            {"Anna Sidorova", "1996-09-09"},
            {"John Smith", "1990-03-11"},
            {"Vanessa Vulf", "1985-11-16"},
            {"Vladimir Nikolaev", "1990-12-27"},
            {"Alice Lucas", "1986-01-01"},
            {"Elsa Oscar", "2000-03-25"},
        };

        String actual1 = App.getUsersByYear(users, 1990);
        String expected1 =
            "<ul>\n  <li>Andrey Petrov</li>\n  <li>John Smith</li>\n  <li>Vladimir Nikolaev</li>\n</ul>";
        assertThat(actual1).isEqualTo(expected1);

        String actual2 = App.getUsersByYear(users, 2000);
        String expected2 = "<ul>\n  <li>Elsa Oscar</li>\n</ul>";
        assertThat(actual2).isEqualTo(expected2);

        String actual3 = App.getUsersByYear(users, 2001);
        assertThat(actual3).isEqualTo("");
    }

    // BEGIN
    
    // END
}
