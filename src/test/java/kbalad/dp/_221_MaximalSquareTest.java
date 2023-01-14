package kbalad.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class _221_MaximalSquareTest {
    Object[][] givenExp = new Object[][]{
            new Object[]{new char[][]{
                    {'1', '0', '1', '0', '0'},
                    {'1', '0', '1', '1', '1'},
                    {'1', '1', '1', '1', '1'},
                    {'1', '0', '0', '1', '0'}},
                    4
            }

    };

    @Test
    public void maximalSquare() {
        int actual = new _221_MaximalSquare().maximalSquare((char[][]) givenExp[0][0]);
        assertEquals(actual, givenExp[0][1]);
    }
}