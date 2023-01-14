package kbalad.dp;

public class _121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            int p = prices[i];
            int profit = p - min;
            maxProfit = Math.max(profit, maxProfit);
            min = Math.min(min, p);
        }

        return Math.max(maxProfit, 0);
    }
}
