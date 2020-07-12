package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenFirstPointIs00() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        double expected = 5;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenSecondPointIs00() {
        Point a = new Point(3, 4);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        double expected = 5;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenCoordinatesIsLessThan0() {
        Point a = new Point(-20, -25);
        Point b = new Point(20, 15);
        double out = a.distance(b);
        double expected = 56.56;
        Assert.assertEquals(expected, out, 0.01);
    }
}