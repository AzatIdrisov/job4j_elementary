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
    public void whenMax5To1Then5() {
        int result = Max.max(5, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax10To10Then10() {
        int result = Max.max(10, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax5To1T010Then10() {
        int result = Max.max(5, 1, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax5To1To10To666Then666() {
        int result = Max.max(5, 1, 10, 666);
        assertThat(result, is(666));
    }
}