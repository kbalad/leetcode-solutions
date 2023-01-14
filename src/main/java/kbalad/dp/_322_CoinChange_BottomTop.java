package kbalad.dp;

import java.util.Arrays;

public class _322_CoinChange_BottomTop {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < amount; i++) {
            if (dp[i] == Integer.MAX_VALUE) continue;
            for (int coin : coins) {
                int ind = i + coin;
                if (ind > amount || ind < 0) break;
                dp[ind] = Math.min(dp[ind], dp[i] + 1);
            }
        }

        if (dp[amount] == Integer.MAX_VALUE) return -1;
        return dp[amount];
    }
}
