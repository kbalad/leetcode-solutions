package kbalad.dp;

import java.util.Arrays;

public class _188_BestTimeToBuyAndSellStock_IV {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;

        int[][][] dp = new int[n + 1][k + 1][2];
        for (int d = n - 1; d >= 0; d--) {
            for (int t = 1; t <= k; t++) {
                // buy or nothing
                int buy = -prices[d] + dp[d + 1][t][1];
                int nothing = dp[d + 1][t][0];
                dp[d][t][0] = Math.max(buy, nothing);

                // sell or nothing
                int sell = prices[d] + dp[d + 1][t - 1][0];
                nothing = dp[d+1][t][1];
                dp[d][t][1] = Math.max(sell, nothing);
            }
        }

        return dp[0][k][0];
    }
}
