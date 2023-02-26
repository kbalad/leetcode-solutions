package kbalad.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _72_EditDistanceTest {

    @Test
    void minDistance() {
        String w1 = "horse";
        String w2 = "ros";

        int a = new _72_EditDistance().minDistance(w1,w2);
        int e = 3;

        assertEquals(e, a);
    }

    @Test
    void minDistance2() {
        String w1 = "intention";
        String w2 = "execution";

        int a = new _72_EditDistance().minDistance(w1,w2);
        int e = 5;

        assertEquals(e, a);
    }

    @Test
    void minDistance3() {
        String w1 = "abc";
        String w2 = "abc";

        int a = new _72_EditDistance().minDistance(w1,w2);
        int e = 0;

        assertEquals(e, a);
    }
}