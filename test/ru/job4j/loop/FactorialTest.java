package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int rsl = Factorial.calc(1);
        int expected = 1;
        assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenCalculateFactorialForTenThen3208800() {
        int rsl = Factorial.calc(10);
        int expected = 3628800;
        assertThat(rsl, Matchers.is(expected));
    }
}