package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = Factorial.calc(5);
        assertThat(expected, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = Factorial.calc(0);
        assertThat(expected, is(1));
    }
}