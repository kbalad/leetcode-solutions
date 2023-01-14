package kbalad.dp;

public class _53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int best = nums[0];
        int cur = best;

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            cur = Math.max(cur + num, num);
            best = Math.max(best, cur);
        }

        return best;
    }
}
