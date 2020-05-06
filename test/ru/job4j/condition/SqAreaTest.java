package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        int expected = 1;
        double out = SqArea.square(4, 1);
        Assert.assertEquals(expected, out, 0.01);
    }
}