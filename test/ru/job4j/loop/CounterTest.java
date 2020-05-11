package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sum() {
        int result = Counter.sum(0,10);
        assertThat(result, is(55));
    }

    @Test
    public void sumByEven() {
        int result = Counter.sumByEven(1,10);
        assertThat(result, is(30));
    }

    @Test
    public void whenStart3AndFinish8JustForEven() {
        int result = Counter.sumByEven(3,8);
        assertThat(result, is(18));
    }

    @Test
    public void ItIsEven() {
        int result = (Counter.sumByEven(0,10) % 2);
        assertThat(result, is(0));
    }

}