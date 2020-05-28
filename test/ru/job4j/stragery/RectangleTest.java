package ru.job4j.stragery;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void whenDrawRectangle() {
        Rectangle rect = new Rectangle();
        assertThat(rect.draw(), is(new StringJoiner(System.lineSeparator())
                                    .add("++++++++++++++++++")
                                    .add("+                +")
                                    .add("+                +")
                                    .add("++++++++++++++++++")
                                    .toString()
                )
        );
    }

}