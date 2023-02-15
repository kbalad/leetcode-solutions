package kbalad.bfs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _305_NumberOfIslands2Test {

    @Test
    void numIslands2() {
        int n = 3;
        int m = 3;
        int[][] pos = {
                {0,0},
                {0,1},
                {1,2},
                {2,1},
                {1,1},
        };

        List<Integer> act = new _305_NumberOfIslands2().numIslands2(n, m, pos);
        List<Integer> exp = List.of(1, 1, 2, 3, 1);

        assertEquals(exp, act);
    }

    @Test
    void numIslands2_1() {
        int n = 1;
        int m = 1;
        int[][] pos = {
                {0,0},
        };

        List<Integer> act = new _305_NumberOfIslands2().numIslands2(n, m, pos);
        List<Integer> exp = List.of(1);

        assertEquals(exp, act);
    }

    @Test
    void numIslands2_2() {
        int n = 2;
        int m = 3;
        int[][] pos = {
                {0,0},
                {1,1},
                {0,2},
                {0,1}
        };

        List<Integer> act = new _305_NumberOfIslands2().numIslands2(n, m, pos);
        List<Integer> exp = List.of(1, 2, 3, 1);

        assertEquals(exp, act);
    }

    @Test
    void numIslands2_3() {
        int n = 3;
        int m = 3;
        int[][] pos = {
                {0,0},
                {0,1},
                {1,2},
                {2,1},
                {1,1},
                {1,1},
        };

        List<Integer> act = new _305_NumberOfIslands2().numIslands2(n, m, pos);
        List<Integer> exp = List.of(1, 1, 2, 3, 1, 1);

        assertEquals(exp, act);
    }
}