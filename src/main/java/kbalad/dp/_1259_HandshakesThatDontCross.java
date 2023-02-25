package kbalad.dp;

public class _1259_HandshakesThatDontCross {
    private static final int m = 1_000_000_007;

    public int numberOfWays(int numPeople) {
        int[] dp = new int[numPeople / 2 + 1];
        dp[0] = 1;
        for (int i = 1; i <= numPeople / 2; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += (long) dp[j] * dp[i - j - 1] % m;
                dp[i] %= m;
            }
        }
        return dp[numPeople / 2];
    }
}
