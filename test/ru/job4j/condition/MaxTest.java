package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenThirdMax() {
        int result = Max.max(1, 2, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenFourthMax() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void max() {
        int left = 4;
        int right = 2;
        boolean result = left > right;
        assertThat(result, is(true));
    }

    @Test
    public void summation() {
        int result = Max.summation(3, 5);
        assertThat(result, is(8));
    }

    @Test
    public void totalMax() {
        int result = Max.totalMax(4, 2);
        assertThat(result, is(6));
    }
}