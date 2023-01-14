package kbalad.dp;

import java.util.Arrays;

public class _279_PerfectSquares {
    public int numSquares(int n) {
        int maxSquareInd = (int)Math.sqrt(n) + 1;

        // precalculate squares
        int[] squares = new int[maxSquareInd];
        for (int i = 1; i < maxSquareInd; i++) {
            squares[i] = i * i;
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < maxSquareInd; j++) {
                if (squares[j] > i)
                    break;
                dp[i] = Math.min(dp[i], dp[i - squares[j]] + 1);
            }
        }

        return dp[n];
    }
}
