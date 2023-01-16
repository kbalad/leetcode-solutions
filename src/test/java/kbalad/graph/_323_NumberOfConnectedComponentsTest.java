package kbalad.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _323_NumberOfConnectedComponentsTest {

    @Test
    void countComponents() {
        int n = 5;
        int[][] edges = new int[][] {
                new int[] {0,1},
                new int[] {1,2},
                new int[] {3,4},
        };

        int a = new _323_NumberOfConnectedComponents().countComponents(n, edges);
        int e = 2;

        assertEquals(e, a);
    }

    @Test
    void countComponents_2() {
        int n = 5;
        int[][] edges = new int[][] {
                new int[] {0,1},
                new int[] {1,2},
                new int[] {2,3},
                new int[] {3,4},
        };

        int a = new _323_NumberOfConnectedComponents().countComponents(n, edges);
        int e = 1;

        assertEquals(e, a);
    }
}