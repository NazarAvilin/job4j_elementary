package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(8, 4, 2);
        assertThat(result, is(8));
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int expected = 3;
        int out = MultiMax.max(1,2,3);
        Assert.assertEquals(expected, out);
    }
}