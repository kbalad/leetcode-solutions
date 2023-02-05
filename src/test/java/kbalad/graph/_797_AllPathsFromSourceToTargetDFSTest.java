package kbalad.graph;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _797_AllPathsFromSourceToTargetDFSTest {

    @Test
    void allPathsSourceTarget() {
        int[][] g = new int[][]{
                new int[]{1, 2},
                new int[]{3},
                new int[]{3},
                new int[]{},
        };

        List<List<Integer>> a = new _797_AllPathsFromSourceToTarget_DFS().allPathsSourceTarget(g);
        List<List<Integer>> e = List.of(
                List.of(0, 1, 3),
                List.of(0, 2, 3)
        );

        assertEquals(e, a);
    }

    @Test
    void allPathsSourceTarget_2() {
        int[][] g = {{4, 3, 1}, {3, 2, 4}, {3}, {4}, {},};

        List<List<Integer>> a = new _797_AllPathsFromSourceToTarget_DFS().allPathsSourceTarget(g);
        List<List<Integer>> e = List.of(
                List.of(0, 4),
                List.of(0, 3, 4),
                List.of(0, 1, 3, 4),
                List.of(0, 1, 2, 3, 4),
                List.of(0, 1, 4)
        );

        assertEquals(e, a);
    }
}