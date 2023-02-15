package kbalad.iterative;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _67_AddBinaryTest {

    @Test
    void addBinary1() {
        String a = "11";
        String b = "1";

        String act = new _67_AddBinary().addBinary(a, b);
        String exp = "100";

        assertEquals(exp, act);
    }

    @Test
    void addBinary2() {
        String a = "1010";
        String b = "1011";

        String act = new _67_AddBinary().addBinary(a, b);
        String exp = "10101";

        assertEquals(exp, act);
    }

    @Test
    void addBinary3() {
        String a = "0";
        String b = "0";

        String act = new _67_AddBinary().addBinary(a, b);
        String exp = "0";

        assertEquals(exp, act);
    }

    @Test
    void addBinary4() {
        String a = "1";
        String b = "0";

        String act = new _67_AddBinary().addBinary(a, b);
        String exp = "1";

        assertEquals(exp, act);
    }

    @Test
    void addBinary5() {
        String a = "1";
        String b = "1";

        String act = new _67_AddBinary().addBinary(a, b);
        String exp = "10";

        assertEquals(exp, act);
    }
    @Test
    void addBinary6() {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        String act = new _67_AddBinary().addBinary(a, b);
        String exp = "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000";

        assertEquals(exp, act);

    }
}