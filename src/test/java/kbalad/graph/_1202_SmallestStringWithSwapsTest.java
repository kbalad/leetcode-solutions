package kbalad.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _1202_SmallestStringWithSwapsTest {

    @Test
    void smallestStringWithSwaps() {
        String s = "dcab";
        List<List<Integer>> pairs = Arrays.asList(
                Arrays.asList(0, 3),
                Arrays.asList(1, 2)
        );

        String a = new _1202_SmallestStringWithSwaps().smallestStringWithSwaps(s, pairs);
        String e = "bacd";

        assertEquals(e, a);
    }

    @Test
    void smallestStringWithSwaps2() {
        String s = "dcab";
        List<List<Integer>> pairs = Arrays.asList(
                Arrays.asList(0, 3),
                Arrays.asList(1, 2),
                Arrays.asList(0, 2)
        );

        String a = new _1202_SmallestStringWithSwaps().smallestStringWithSwaps(s, pairs);
        String e = "abcd";

        assertEquals(e, a);
    }

    @Test
    void smallestStringWithSwaps3() {
        String s = "cba";
        List<List<Integer>> pairs = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 2)
        );

        String a = new _1202_SmallestStringWithSwaps().smallestStringWithSwaps(s, pairs);
        String e = "abc";

        assertEquals(e, a);
    }
}