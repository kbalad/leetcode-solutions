package kbalad.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class _518_CoinChange2Test {

    @Test
    public void change() {
        int amount = 5;
        int[] coins = {1, 2, 5};
        int a = new _518_CoinChange2().change(amount, coins);
        int e = 4;
        assertEquals(e, a);
    }

    @Test
    public void change2() {
        int amount = 3;
        int[] coins = {2};
        int a = new _518_CoinChange2().change(amount, coins);
        int e = 0;
        assertEquals(e, a);
    }

    @Test
    public void change3() {
        int amount = 0;
        int[] coins = {1, 2};
        int a = new _518_CoinChange2().change(amount, coins);
        int e = 1;
        assertEquals(e, a);
    }

    @Test
    public void change4() {
        int amount = 3;
        int[] coins = {3};
        int a = new _518_CoinChange2().change(amount, coins);
        int e = 1;
        assertEquals(e, a);
    }
}