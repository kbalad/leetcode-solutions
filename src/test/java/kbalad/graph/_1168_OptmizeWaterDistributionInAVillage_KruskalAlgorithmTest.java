package kbalad.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1168_OptmizeWaterDistributionInAVillage_KruskalAlgorithmTest {

    @Test
    void minCostToSupplyWater_1() {
        int n = 3;
        int[] wells = new int[]{1, 2, 2};
        int[][] pipes = new int[][]{
                new int[]{1, 2, 1},
                new int[]{2, 3, 1}
        };

        int a = new _1168_OptmizeWaterDistributionInAVillage_KruskalAlgorithm().minCostToSupplyWater(n, wells, pipes);
        int e = 3;

        assertEquals(e, a);
    }

    @Test
    void minCostToSupplyWater_2() {
        int n = 2;
        int[] wells = new int[]{1, 1};
        int[][] pipes = new int[][]{
                new int[]{1, 2, 1},
                new int[]{1, 2, 2}
        };

        int a = new _1168_OptmizeWaterDistributionInAVillage_KruskalAlgorithm().minCostToSupplyWater(n, wells, pipes);
        int e = 2;

        assertEquals(e, a);
    }
}