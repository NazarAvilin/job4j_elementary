package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        int expected = 2;
        Point a = new Point(0, 0, 3);
        Point b = new Point(0, 2, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}