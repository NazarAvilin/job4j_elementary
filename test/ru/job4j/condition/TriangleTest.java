package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    /**
     * Точки Point Случайние!
     */
    @Test
    public void whenExist() {
        Point a = new Point(1, 3);
        Point b = new Point(2, 2);
        Point c = new Point(2, 4);
        Triangle triangle = new Triangle(a, b, c);
        boolean result = triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }
}