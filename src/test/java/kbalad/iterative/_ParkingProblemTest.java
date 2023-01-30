package kbalad.iterative;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _ParkingProblemTest {

    @Test
    void findParkingLots() {
        int[][] input = new int[][] {
                new int[] {1,3},
                new int[] {2,4},
                new int[] {5,8},
        };

        int a = new _ParkingProblem().findParkingLots(input);
        int e = 2;

        assertEquals(e, a);
    }

    @Test
    void findParkingLots_2() {
        int[][] input = new int[][] {
                new int[] {1,3},
                new int[] {2,4},
                new int[] {3,5},
                new int[] {5,8},
        };

        int a = new _ParkingProblem().findParkingLots(input);
        int e = 3;

        assertEquals(e, a);
    }

    @Test
    void findParkingLots_3() {
        int[][] input = new int[][] { };

        int a = new _ParkingProblem().findParkingLots(input);
        int e = 0;

        assertEquals(e, a);
    }

    @Test
    void findParkingLots_4() {
        int[][] input = new int[][] {
                new int[] {1, 2}
        };

        int a = new _ParkingProblem().findParkingLots(input);
        int e = 1;

        assertEquals(e, a);
    }
}