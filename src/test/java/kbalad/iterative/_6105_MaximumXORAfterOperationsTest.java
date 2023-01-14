package kbalad.iterative;

import kbalad.iterative._6105_MaximumXORAfterOperations;
import org.junit.Test;

import static org.junit.Assert.*;

public class _6105_MaximumXORAfterOperationsTest {

    @Test
    public void maximumXOR() {
        int[] in = new int[] { 3, 2, 4, 6};
        int act = new _6105_MaximumXORAfterOperations().maximumXOR(in);
        int exp = 7;
        assertEquals(exp, act);
    }

    @Test
    public void maximumXOR2() {
        int[] in = new int[] { 1, 2, 3, 9, 2};
        int act = new _6105_MaximumXORAfterOperations().maximumXOR(in);
        int exp = 11;
        assertEquals(exp, act);
    }

}