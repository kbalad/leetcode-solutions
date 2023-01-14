package kbalad.dp;

import java.util.Arrays;

// https://leetcode.com/problems/maximal-square/
public class _221_MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n + 1][m + 1];

        int max = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i + 1][j], dp[i + 1][j + 1]), dp[i][j + 1]) + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max * max;
    }
}
