package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        double expected = 2.0;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when02to01then1() {
        Point a = new Point(0, 1);
        Point b = new Point(0, 0);
        double dist = a.distance(b);
        double expected = 1;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when00to30then3() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        double dist = a.distance(b);
        double expected = 3;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when00to40then4() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        double dist = a.distance(b);
        double expected = 4;
        Assert.assertEquals(expected, dist, 0.01);
    }

}