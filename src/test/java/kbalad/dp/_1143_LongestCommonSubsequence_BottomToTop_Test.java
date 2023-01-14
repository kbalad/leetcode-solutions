package kbalad.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1143_LongestCommonSubsequence_BottomToTop_Test {
    Object[][] givenExp = new Object[][]{
            new Object[]{"abcde", "ace", 3},
            new Object[]{"ace", "ace", 3},
            new Object[]{"abc", "def", 0},
            new Object[]{"psnw", "vozsh", 1}
    };

    @Test
    public void ok() {
        int n = givenExp.length;
        for (Object[] testCase : givenExp) {
            int act = new _1143_LongestCommonSubsequence_BottomToTop().longestCommonSubsequence(
                    (String) testCase[0], (String) testCase[1]
            );
            int exp = (Integer) testCase[2];
            assertEquals(exp, act);
        }
    }
}