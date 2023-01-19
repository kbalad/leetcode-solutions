package kbalad.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1101_TheEarliestMomentWhenEveryoneBecomeFriendsTest {

    @Test
    void earliestAcq() {
        int[][] logs = new int[][] {
                new int[] {0, 0, 1 },
                new int[] {1, 3 ,4 },
                new int[] {2, 2, 3 },
                new int[] {3, 1, 5 },
                new int[] {4, 2, 4 },
                new int[] {5, 0, 3 },
                new int[] {6, 1, 2 },
                new int[] {7, 4, 5 },
        };
        int n = 6;

        int a = new _1101_TheEarliestMomentWhenEveryoneBecomeFriends().earliestAcq(logs, n);
        int e = 5;

        assertEquals(e, a);
    }

    @Test
    void earliestAcq_2() {
        int[][] logs = new int[][] {
                new int[] {4, 2, 4 },
                new int[] {5, 0, 3 },
                new int[] {6, 1, 2 },
                new int[] {1, 3 ,4 },
                new int[] {7, 4, 5 },
                new int[] {0, 0, 1 },
                new int[] {2, 2, 3 },
                new int[] {3, 1, 5 },
        };
        int n = 6;

        int a = new _1101_TheEarliestMomentWhenEveryoneBecomeFriends().earliestAcq(logs, n);
        int e = 5;

        assertEquals(e, a);
    }
}