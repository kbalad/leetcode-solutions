package kbalad.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class _91_DecodeWaysTest {

    @Test
    public void numDecodings() {
        String input = "12";
        int e = 2;
        int a = new _91_DecodeWays().numDecodings(input);
        assertEquals(e, a);
    }

    @Test
    public void numDecodings2() {
        String input = "226";
        int e = 3;
        int a = new _91_DecodeWays().numDecodings(input);
        assertEquals(e, a);
    }

    @Test
    public void numDecodings3() {
        String input = "06";
        int e = 0;
        int a = new _91_DecodeWays().numDecodings(input);
        assertEquals(e, a);
    }

    @Test
    public void numDecodings4() {
        String input = "2106";
        int e = 1;
        int a = new _91_DecodeWays().numDecodings(input);
        assertEquals(e, a);
    }
}