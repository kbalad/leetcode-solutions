package kbalad.iterative;

import kbalad.iterative._6104_CountAsterisk;
import org.junit.Test;

import static org.junit.Assert.*;

public class _6104_CountAsteriskTest {


    @Test
    public void countAsterisks1() {
        String in = "yo|uar|e**|b|e***au|tifu|l";
        int act = new _6104_CountAsterisk().countAsterisks(in);
        int exp = 5;
        assertEquals(exp, act);
    }

    @Test
    public void countAsterisks2() {
        String in = "abdfas";
        int act = new _6104_CountAsterisk().countAsterisks(in);
        int exp = 0;
        assertEquals(exp, act);
    }
}