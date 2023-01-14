package kbalad.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class _494_TargetSumTest {

    @Test
    public void findTargetSumWays() {
        int[] nums = { 1,1, 1, 1, 1  };
        int target = 3;
        int a = new _494_TargetSum().findTargetSumWays(nums, target);
        assertEquals(5, a);
    }

    @Test
    public void findTargetSumWays2() {
        int[] nums = {1};
        int target = 1;
        int a = new _494_TargetSum().findTargetSumWays(nums, target);
        assertEquals(1, a);
    }
}