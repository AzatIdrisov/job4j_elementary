package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenPIs2AndKIs1ThenSquareIs1() {
        int p = 4;
        int k = 1;

        double out = SqArea.square(p, k);
        double expected = 1.0;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPIs6AndKIs2ThenSquareIs2() {
        int p = 6;
        int k = 2;

        double out = SqArea.square(p, k);
        double expected = 2.0;
        Assert.assertEquals(expected, out, 0.01);
    }
}