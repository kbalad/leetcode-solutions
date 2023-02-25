package kbalad.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1059_AllPathsFromSourceLeadToDestinationTest {

    @Test
    void leadsToDestination() {
        int n = 3;
        int[][] edges = {
                {0,1},
                {0,2}
        };
        int source = 0;
        int dest = 2;

        boolean act = new _1059_AllPathsFromSourceLeadToDestination().leadsToDestination(n, edges, source, dest);
        boolean exp = false;

        assertEquals(exp, act);
    }

    @Test
    void leadsToDestination2() {
        int n = 4;
        int[][] edges = {
                {0,1},
                {0,3},
                {1,2},
                {2,1}
        };
        int source = 0;
        int dest = 3;

        boolean act = new _1059_AllPathsFromSourceLeadToDestination().leadsToDestination(n, edges, source, dest);
        boolean exp = false;

        assertEquals(exp, act);
    }

    @Test
    void leadsToDestination3() {
        int n = 4;
        int[][] edges = {
                {0,1},
                {0,2},
                {1,3},
                {2,3}
        };
        int source = 0;
        int dest = 3;

        boolean act = new _1059_AllPathsFromSourceLeadToDestination().leadsToDestination(n, edges, source, dest);
        boolean exp = true;

        assertEquals(exp, act);
    }

    @Test
    void leadsToDestination4() {
        int n = 2;
        int[][] edges = {
                {0,1},
                {1,1},
        };
        int source = 0;
        int dest = 1;

        boolean act = new _1059_AllPathsFromSourceLeadToDestination().leadsToDestination(n, edges, source, dest);
        boolean exp = false;

        assertEquals(exp, act);
    }

}