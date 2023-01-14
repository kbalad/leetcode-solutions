package kbalad.graph;

import kbalad.graph._6106_CountUnreachablePAI;
import org.junit.Test;

import static org.junit.Assert.*;

public class _6106_CountUnreachablePAITest {

    @Test
    public void countPairs() {
        int n = 7;
        int[][] arr = new int[][] {
                new int[] { 0, 2},
                new int[] { 0, 5},
                new int[] { 2, 4},
                new int[] { 1, 6},
                new int[] { 5, 4}
        };
        long act = new _6106_CountUnreachablePAI().countPairs(n, arr);
        long exp = 14;
        assertEquals(exp, act);
    }

    @Test
    public void countPairs2() {
        int n = 5;
        int[][] arr = new int[][] {
                new int[] { 1, 0},
                new int[] { 3, 1},
                new int[] { 0, 4},
                new int[] { 2, 1}
        };
        long act = new _6106_CountUnreachablePAI().countPairs(n, arr);
        long exp = 0;
        assertEquals(exp, act);
    }
}