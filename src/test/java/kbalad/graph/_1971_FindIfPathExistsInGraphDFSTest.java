package kbalad.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1971_FindIfPathExistsInGraphDFSTest {

    @Test
    void validPath_1() {
        int n = 3;
        int[][] edges = new int[][] {
                new int[] {0,1},
                new int[] {1,2},
                new int[] {2,0}
        };
        int source = 0;
        int dest = 2;

        boolean a = new _1971_FindIfPathExistsInGraph_DFS().validPath(n, edges, source, dest);
        boolean e = true;

        assertEquals(e, a);
    }

    @Test
    void validPath_2() {
        int n = 6;
        int[][] edges = new int[][] {
                new int[] {0,1},
                new int[] {0,2},
                new int[] {3,5},
                new int[] {5,4},
                new int[] {4,3}
        };
        int source = 0;
        int dest = 5;

        boolean a = new _1971_FindIfPathExistsInGraph_DFS().validPath(n, edges, source, dest);
        boolean e = false;

        assertEquals(e, a);
    }
}