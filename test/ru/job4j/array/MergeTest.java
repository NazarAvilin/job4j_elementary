package ru.job4j.array;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@Ignore
public class MergeTest {
    @Test
    public void whenBothEmpty() {
        Merge algo = new Merge();
        int[] expect = new int[0];
        int[] result = algo.merge(
                new int[0],
                new int[0]
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenAscOrder() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftLess() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = algo.merge(
                new int[] {1, 2, 3},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftGreat() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = algo.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftEmpty() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(
                new int[] {},
                new int[] {1, 2, 3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenNewTest() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 7, 8, 9, 10, 11};
        int[] result = algo.merge(
                new int[] {7, 8, 9, 11},
                new int[] {1, 2, 3, 10}
        );
        assertThat(result, is(expect));
    }
}