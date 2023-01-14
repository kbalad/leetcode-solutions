package kbalad.iterative;

public class _6105_MaximumXORAfterOperations {
    public int maximumXOR(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res |= n | res;
        }
        return res;
    }
}
