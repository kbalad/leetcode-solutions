package kbalad.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1259_HandshakesThatDontCrossTest {

    @Test
    void numberOfWays() {
        int numPeople = 4;

        int act = new _1259_HandshakesThatDontCross().numberOfWays(numPeople);
        int exp = 2;

        assertEquals(exp, act);
    }

    @Test
    void numberOfWays2() {
        int numPeople = 2;

        int act = new _1259_HandshakesThatDontCross().numberOfWays(numPeople);
        int exp = 1;

        assertEquals(exp, act);
    }

    @Test
    void numberOfWays3() {
        int numPeople = 6;

        int act = new _1259_HandshakesThatDontCross().numberOfWays(numPeople);
        int exp = 5;

        assertEquals(exp, act);
    }

    @Test
    void numberOfWays4() {
        int numPeople = 8;

        int act = new _1259_HandshakesThatDontCross().numberOfWays(numPeople);
        int exp = 14;

        assertEquals(exp, act);
    }

    @Test
    void numberOfWays5() {
        int numPeople = 140;

        int act = new _1259_HandshakesThatDontCross().numberOfWays(numPeople);
        int exp = 685542858;

        assertEquals(exp, act);
    }
}