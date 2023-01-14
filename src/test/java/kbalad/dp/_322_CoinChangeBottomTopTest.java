package kbalad.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _322_CoinChangeBottomTopTest {

    @Test
    public void coinChange() {
        int[] coins = new int[] { 1, 2, 5};
        int amount = 11;
        int a = new _322_CoinChange_BottomTop().coinChange(coins, amount);
        int e = 3;
        assertEquals(e, a);
    }

    @Test
    public void coinChange2() {
        int[] coins = new int[] { 2};
        int amount = 3;
        int a = new _322_CoinChange_BottomTop().coinChange(coins, amount);
        int e = -1;
        assertEquals(e, a);
    }

    @Test
    public void coinChange3() {
        int[] coins = new int[] { 2};
        int amount = 0;
        int a = new _322_CoinChange_BottomTop().coinChange(coins, amount);
        int e = 0;
        assertEquals(e, a);
    }

    @Test
    public void coinChange4() {
        int[] coins = new int[] { 2};
        int amount = 2;
        int a = new _322_CoinChange_BottomTop().coinChange(coins, amount);
        int e = 1;
        assertEquals(e, a);
    }
}