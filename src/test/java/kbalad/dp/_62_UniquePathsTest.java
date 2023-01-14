package kbalad.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class _62_UniquePathsTest {

    @Test
    public void uniquePaths() {
        int m = 3, n = 7;

        int e = 28;
        int a = new _62_UniquePaths().uniquePaths(m, n);

        assertEquals(e, a);
    }

    @Test
    public void uniquePaths2() {
        int m = 3, n = 2;

        int e = 3;
        int a = new _62_UniquePaths().uniquePaths(m, n);

        assertEquals(e, a);
    }

    @Test
    public void uniquePaths3() {
        int m = 1, n = 1;

        int e = 1;
        int a = new _62_UniquePaths().uniquePaths(m, n);

        assertEquals(e, a);
    }
}