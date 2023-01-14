package kbalad.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class _121_BestTimeToBuyAndSellStockTest {

    @Test
    public void maxProfit() {
        int[] in = { 7,1,5,3,6,4 };
        int e = 5;
        int a = new _121_BestTimeToBuyAndSellStock().maxProfit(in);
        assertEquals(e, a);
    }

    @Test
    public void maxProfit2() {
        int[] in = {7,6,4,3,1};
        int e = 0;
        int a = new _121_BestTimeToBuyAndSellStock().maxProfit(in);
        assertEquals(e, a);
    }
}