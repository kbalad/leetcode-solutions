package kbalad.dp;

public class _322_CoinChange_TopBottom {
    int[] mem;
    int[] coins;
    int n;

    public int coinChange(int[] coins, int amount) {
        mem = new int[amount + 1];
        this.coins = coins;
        n = coins.length;
        int out = dp(amount);
        if (out == Integer.MAX_VALUE) return -1;
        return out;
    }

    int dp(int amount) {
        if (amount == 0)
            return 0;
        else if (amount < 0)
            return Integer.MAX_VALUE;

        if (mem[amount] == 0) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int v = dp(amount - coins[i]);
                if (v < min) min = v;
            }
            if (min == Integer.MAX_VALUE) min--;
            mem[amount] = min + 1;
        }
        return mem[amount];
    }
}
