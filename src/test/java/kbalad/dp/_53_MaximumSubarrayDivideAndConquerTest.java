package kbalad.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _53_MaximumSubarrayDivideAndConquerTest {

    @Test
    public void maxSubArray() {
        int[] nums = { -2,1,-3,4,-1,2,1,-5,4 };
        int a = new _53_MaximumSubarrayDivideAndConquer().maxSubArray(nums);
        int e = 6;
        assertEquals(e, a);
    }

    @Test
    public void maxSubArray2() {
        int[] nums = {1};
        int a = new _53_MaximumSubarrayDivideAndConquer().maxSubArray(nums);
        int e = 1;
        assertEquals(e, a);
    }

    @Test
    public void maxSubArray3() {
        int[] nums = {5,4,-1,7,8};
        int a = new _53_MaximumSubarrayDivideAndConquer().maxSubArray(nums);
        int e = 23;
        assertEquals(e, a);
    }

}