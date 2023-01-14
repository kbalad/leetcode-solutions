package kbalad.dp;

import java.util.Arrays;

public class _518_CoinChange2 {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n][amount + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }

        Arrays.sort(coins);
        for (int c = 0; c < n; c++) {
            int coin = coins[c];
            if (c != 0 && coin >= 0) {
                System.arraycopy(dp[c - 1], 0, dp[c], 0, Math.min(amount + 1, coin));
            }
            for (int i = coin; i <= amount; i++) {
                if (c == 0) {
                    dp[c][i] = dp[c][i - coin];
                } else {
                    dp[c][i] = dp[c][i - coin] + dp[c - 1][i];
                }
            }
        }

        return dp[n - 1][amount];
    }
}
