package kbalad.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _547_NumberOfProvincesTest {

    @Test
    void findCircleNum_1() {
        int[][] input = new int[][]{
                new int[]{1, 1, 0},
                new int[]{1, 1, 0},
                new int[]{0, 0, 1},
        };

        int act = new _547_NumberOfProvinces().findCircleNum(input);
        int exp = 2;
        assertEquals(exp, act);
    }

    @Test
    void findCircleNum_2() {
        int[][] input = new int[][]{
                new int[]{1, 0, 0},
                new int[]{0, 1, 0},
                new int[]{0, 0, 1},
        };

        int act = new _547_NumberOfProvinces().findCircleNum(input);
        int exp = 3;
        assertEquals(exp, act);
    }

    @Test
    void findCircleNum_3() {
        int[][] input = new int[][]{
                new int[]{1, 1, 0},
                new int[]{1, 1, 1},
                new int[]{0, 1, 1},
        };

        int act = new _547_NumberOfProvinces().findCircleNum(input);
        int exp = 1;
        assertEquals(exp, act);
    }
}