package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
//        int x1, x2, y1, y2;
//        x1 = 0;
//        x2 = 2;
//        y1 = 0;
//        y2 = 0;
        int expected = 2;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);
    }
}