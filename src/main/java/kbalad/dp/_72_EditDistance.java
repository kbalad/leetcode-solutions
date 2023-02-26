package kbalad.dp;

import java.util.Arrays;

public class _72_EditDistance {
    int[][] dp;
    String s1;
    String s2;

    public int minDistance(String word1, String word2) {
        s1 = word1;
        s2 = word2;
        int n = word1.length();
        int m = word2.length();

        dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return dp(n, m);
    }

    private int dp(int i, int j) {
        if (i == 0)
            return j;
        if (j == 0)
            return i;
        if (dp[i][j] != -1)
            return dp[i][j];

        int res;
        if (s1.charAt(i - 1) == s2.charAt(j - 1))
            res = dp(i - 1, j - 1);
        else {
            int insert = dp(i, j - 1);
            int delete = dp(i - 1, j);
            int replace = dp(i - 1, j - 1);
            res = Math.min(insert, Math.min(delete, replace)) + 1;
        }
        dp[i][j] = res;
        return res;
    }
}
