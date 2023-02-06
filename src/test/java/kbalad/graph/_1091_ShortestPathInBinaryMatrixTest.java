package kbalad.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1091_ShortestPathInBinaryMatrixTest {

    @Test
    void shortestPathBinaryMatrix() {
        int[][] grid = {{0, 1}, {1, 0}};

        int a = new _1091_ShortestPathInBinaryMatrix().shortestPathBinaryMatrix(grid);
        int e = 2;

        assertEquals(e, a);
    }

    @Test
    void shortestPathBinaryMatrix_2() {
        int[][] grid = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};

        int a = new _1091_ShortestPathInBinaryMatrix().shortestPathBinaryMatrix(grid);
        int e = 4;

        assertEquals(e, a);
    }

    @Test
    void shortestPathBinaryMatrix_3() {
        int[][] grid = {
                {1, 0, 0},
                {1, 1, 0},
                {1, 1, 0}};

        int a = new _1091_ShortestPathInBinaryMatrix().shortestPathBinaryMatrix(grid);
        int e = -1;

        assertEquals(e, a);
    }
}