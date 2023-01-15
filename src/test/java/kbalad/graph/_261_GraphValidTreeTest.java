package kbalad.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _261_GraphValidTreeTest {

    @Test
    void validTree_1() {
        int n = 5;
        int[][] edges = new int[][] {
                new int[] {0, 1},
                new int[] {0, 2},
                new int[] {0, 3},
                new int[] {1, 4}
        };

        boolean act = new _261_GraphValidTree().validTree(n, edges);
        boolean exp = true;

        assertEquals(exp, act);
    }

    @Test
    void validTree_2() {
        int n = 5;
        int[][] edges = new int[][] {
                new int[] {0, 1},
                new int[] {1, 2},
                new int[] {2, 3},
                new int[] {1, 3},
                new int[] {1, 4}
        };

        boolean act = new _261_GraphValidTree().validTree(n, edges);
        boolean exp = false;

        assertEquals(exp, act);
    }

    @Test
    void validTree_3() {
        int n = 4;
        int[][] edges = new int[][] {
                new int[] {0, 1},
                new int[] {2, 3}
        };

        boolean act = new _261_GraphValidTree().validTree(n, edges);
        boolean exp = false;

        assertEquals(exp, act);
    }
}