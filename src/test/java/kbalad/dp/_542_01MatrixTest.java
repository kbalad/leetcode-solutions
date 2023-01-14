package kbalad.dp;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class _542_01MatrixTest {

    @Test
    public void updateMatrix() {
        int[][] in = new int[][] {
                new int[]{0, 0, 0},
                new int[]{0, 1, 0},
                new int[]{0, 0, 0}
        };
        int[][] ex = new int[][] {
                new int[]{0, 0, 0},
                new int[]{0, 1, 0},
                new int[]{0, 0, 0}
        };
        int[][] ac = new _542_01Matrix().updateMatrix(in);
        for (int i = 0; i < in.length; i++) {
            assertArrayEquals(ex[i], ac[i]);
        }
    }

    @Test
    public void updateMatrix2() {
        int[][] in = new int[][] {
                new int[]{0, 0, 0},
                new int[]{0, 1, 0},
                new int[]{1, 1, 1}
        };
        int[][] ex = new int[][] {
                new int[]{0, 0, 0},
                new int[]{0, 1, 0},
                new int[]{1, 2, 1}
        };
        int[][] ac = new _542_01Matrix().updateMatrix(in);
        for (int i = 0; i < in.length; i++) {
            assertArrayEquals(ex[i], ac[i]);
        }
    }
}