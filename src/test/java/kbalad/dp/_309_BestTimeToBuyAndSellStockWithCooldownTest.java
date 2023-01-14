package kbalad.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class _309_BestTimeToBuyAndSellStockWithCooldownTest {

    @Test
    public void maxProfit() {
        int[] prices = {1,2,3,0,2};
        int a = new _309_BestTimeToBuyAndSellStockWithCooldown().maxProfit(prices);
        int e = 3;
        assertEquals(e, a);
    }

    @Test
    public void maxProfit2() {
        int[] prices = {1};
        int a = new _309_BestTimeToBuyAndSellStockWithCooldown().maxProfit(prices);
        int e = 0;
        assertEquals(e, a);
    }
}