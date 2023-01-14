package kbalad.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class _279_PerfectSquaresTest {

    @Test
    public void numSquares() {
        int n = 12;
        int e = 3;
        int a = new _279_PerfectSquares().numSquares(n);
        assertEquals(e, a);
    }

    @Test
    public void numSquares2() {
        int n = 13;
        int e = 2;
        int a = new _279_PerfectSquares().numSquares(n);
        assertEquals(e, a);
    }
}