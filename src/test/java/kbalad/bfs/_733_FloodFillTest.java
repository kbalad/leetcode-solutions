package kbalad.bfs;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class _733_FloodFillTest {

    @Test
    public void floodFill() {
        int[][] in = new int[][] {
                new int[] { 1, 1, 1},
                new int[] {1, 1 , 0},
                new int[] {1, 0, 1}
        };
        int sr = 1, sc = 1;
        int color = 2;

        int[][] act = new _733_FloodFill().floodFill(in, sr, sc, color);
        int[][] exp = new int[][] {
                new int[] { 2, 2, 2},
                new int[] {2, 2 , 0},
                new int[] {2, 0, 1}
        };
        assertTrue(Arrays.deepEquals(act, exp));
    }
}