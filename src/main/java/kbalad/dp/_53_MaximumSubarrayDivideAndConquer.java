package kbalad.dp;

public class _53_MaximumSubarrayDivideAndConquer {
    private int[] numsArray;

    public int maxSubArray(int[] nums) {
        numsArray = nums;
        return findBestSubarray(0, nums.length - 1);
    }

    private int findBestSubarray(int left, int right) {
        if (left > right) return Integer.MIN_VALUE;

        int mid = Math.floorDiv(left + right, 2);
        int cur = 0;
        int bestLeftSum = 0;
        int bestRightSum = 0;

        // iterate from middle to the left
        for (int i = mid - 1; i >= left; i--) {
            cur += numsArray[i];
            bestLeftSum = Math.max(cur, bestLeftSum);
        }

        cur = 0;
        // iterate from middle to the right
        for (int i = mid + 1; i <= right; i++) {
            cur += numsArray[i];
            bestRightSum = Math.max(cur, bestRightSum);
        }

        int bestCombinedSum = numsArray[mid] + bestLeftSum + bestRightSum;

        int leftHalf = findBestSubarray(left, mid - 1);
        int rightHalf = findBestSubarray(mid + 1, right);
        return Math.max(bestCombinedSum, Math.max(leftHalf, rightHalf));
    }
}
