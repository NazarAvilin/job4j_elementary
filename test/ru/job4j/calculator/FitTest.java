package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;


public class FitTest {

    @Test
    public void manWeight() {
        double in = 180;
        double expected = 92.0d ;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out,0.01);
    }

    @Test
    public void womanWeight() {
        double in = 165;
        double expected = 74.75d;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out,0.01);
    }
}