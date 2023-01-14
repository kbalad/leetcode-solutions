package kbalad.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class _300_LongestIncreasingSubsequenceTest {

    @Test
    public void lengthOfLIS() {
        int[] nums = new int[] {10,9,2,5,3,7,101,18};
        int act = new _300_LongestIncreasingSubsequence().lengthOfLIS(nums);
        int exp = 4;
        assertEquals(exp, act);
    }

    @Test
    public void lengthOfLIS2() {
        int[] nums = new int[] {0,1,0,3,2,3};
        int act = new _300_LongestIncreasingSubsequence().lengthOfLIS(nums);
        int exp = 4;
        assertEquals(exp, act);
    }

    @Test
    public void lengthOfLIS3() {
        int[] nums = new int[] {7,7,7,7,7,7,7};
        int act = new _300_LongestIncreasingSubsequence().lengthOfLIS(nums);
        int exp = 1;
        assertEquals(exp, act);
    }
}