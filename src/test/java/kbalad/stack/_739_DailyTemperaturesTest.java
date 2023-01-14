package kbalad.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class _739_DailyTemperaturesTest {

    @Test
    public void dailyTemperatures() {
        int[] in = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] e = {1, 1, 4, 2, 1, 1, 0, 0};
        int[] a = new _739_DailyTemperatures().dailyTemperatures(in);
        assertArrayEquals(e, a);
    }

    @Test
    public void dailyTemperatures2() {
        int[] in = {30, 40, 50, 60};
        int[] e = {1, 1, 1, 0};
        int[] a = new _739_DailyTemperatures().dailyTemperatures(in);
        assertArrayEquals(e, a);
    }

    @Test
    public void dailyTemperatures3() {
        int[] in = {30, 60, 90};
        int[] e = {1, 1, 0};
        int[] a = new _739_DailyTemperatures().dailyTemperatures(in);
        assertArrayEquals(e, a);
    }
}