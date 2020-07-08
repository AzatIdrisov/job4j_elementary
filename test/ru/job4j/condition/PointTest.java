package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenFirstPointIs00() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 3;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 5;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenSecondPointIs00() {
        int x1 = 3;
        int y1 = 4;
        int x2 = 0;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 5;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenCoordinatesIsLessThan0() {
        int x1 = -20;
        int y1 = -25;
        int x2 = 20;
        int y2 = 15;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 56.56;
        Assert.assertEquals(expected, out, 0.01);
    }
}