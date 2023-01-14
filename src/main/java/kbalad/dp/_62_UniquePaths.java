package kbalad.dp;

public class _62_UniquePaths {
    public int uniquePaths(int m, int n) {
        // suppose that m >= n
        int least = Math.min(m, n);
        int most = Math.max(m, n);
        m = most;
        n = least;

        int[] dp = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    dp[j] = 1;
                } else {
                    if (j == 0) {
                        dp[j] = 1;
                    } else {
                        dp[j] = dp[j - 1] + dp[j];
                    }
                }
            }
        }

        return dp[n - 1];
    }
}
