package exercise;

import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    List<Integer> list;

    @BeforeEach
    void initList() {
        this.list = new ArrayList<>();
        int listSize = 5;
        for (int i = 0; i < listSize; i++) {
            this.list.add((int) (Math.random()*(20+1)) - 10);
        }
    }

    @Test
    void testTake_countEqualToListSize() {
        List<Integer> expectedList = new ArrayList<>();
        int count = 5;
        for (int i = 0; i < count; i++) {
            expectedList.add(list.get(i));
        }
        Assertions.assertEquals(expectedList, App.take(list,count));
    }

    @Test
    void testTake_countLessThanListSize() {
        List<Integer> expectedList = new ArrayList<>();
        int count = 4;
        for (int i = 0; i < count; i++) {
            expectedList.add(list.get(i));
        }
        Assertions.assertEquals(expectedList, App.take(list,count));
    }

    @Test
    void testTake_countMoreThanListSize() {
        List<Integer> expectedList = new ArrayList<>();
        int count = 7;
        for (int i = 0; i < list.size(); i++) {
            expectedList.add(list.get(i));
        }
        Assertions.assertEquals(expectedList, App.take(list,count));
    }

    @Test
    void testTake_countEqualsZero() {
        List<Integer> expectedList = new ArrayList<>();
        int count = 0;
        Assertions.assertEquals(expectedList, App.take(list,count));
    }

    @Test
    void testTake_listIsEmpty() {
        List<Integer> expectedArray = new ArrayList<>();
        List<Integer> checkedList = new ArrayList<>();
        int count = 5;
        Assertions.assertEquals(expectedArray, App.take(checkedList,count));
    }

    @Test
    void testTake_checkResultType() {
        boolean expectedResult = true;
        int count = 5;
        Assertions.assertEquals(expectedResult, App.take(list,count) instanceof List);
    }

    @Test
    void testTake_checkMethodResultType() {
        String expectedResult = "ArrayList";
        int count = 5;
        Assertions.assertEquals(expectedResult, App.take(list,count).getClass().getSimpleName());
    }
}
