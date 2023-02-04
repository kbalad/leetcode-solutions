package kbalad.iterative;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _6_ZigzagConversionTest {

    @Test
    void convert() {
        String s = "PAYPALISHIRING";
        int r = 3;

        String a = new _6_ZigzagConversion().convert(s, r);
        String e = "PAHNAPLSIIGYIR";

        assertEquals(e, a);
    }

    @Test
    void convert_2() {
        String s = "PAYPALISHIRING";
        int r = 4;

        String a = new _6_ZigzagConversion().convert(s, r);
        String e = "PINALSIGYAHRPI";

        assertEquals(e, a);
    }

    @Test
    void convert_3() {
        String s = "PAYPALISHIRING";
        int r = 1;

        String a = new _6_ZigzagConversion().convert(s, r);
        String e = "PAYPALISHIRING";

        assertEquals(e, a);
    }
}