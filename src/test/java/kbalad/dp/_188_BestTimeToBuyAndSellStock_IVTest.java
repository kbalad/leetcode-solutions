package kbalad.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class _188_BestTimeToBuyAndSellStock_IVTest {

    @Test
    public void maxProfit() {
        int k = 2;
        int[] prices = new int[] { 2, 4, 1};
        int a = new _188_BestTimeToBuyAndSellStock_IV().maxProfit(k, prices);
        int e = 2;
        assertEquals(e, a);
    }

    @Test
    public void maxProfit2() {
        int k = 2;
        int[] prices = new int[] { 3,2,6,5,0,3 };
        int a = new _188_BestTimeToBuyAndSellStock_IV().maxProfit(k, prices);
        int e = 7;
        assertEquals(e, a);
    }
}