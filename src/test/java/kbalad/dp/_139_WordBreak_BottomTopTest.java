package kbalad.dp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _139_WordBreak_BottomTopTest {

    @Test
    public void wordBreak() {
        String s = "leetcode";
        List<String> words = new ArrayList<>(Arrays.asList("leet", "code"));

        boolean a = new _139_WordBreak_BottomTop().wordBreak(s, words);
        boolean e = true;
        assertEquals(e, a);
    }

    @Test
    public void wordBreak2() {
        String s = "applepenapple";
        List<String> words = new ArrayList<>(Arrays.asList("apple", "pen"));

        boolean a = new _139_WordBreak_BottomTop().wordBreak(s, words);
        boolean e = true;
        assertEquals(e, a);
    }

    @Test
    public void wordBreak3() {
        String s = "catsandog";
        List<String> words = new ArrayList<>(Arrays.asList("cats","dog","sand","and","cat"));

        boolean a = new _139_WordBreak_BottomTop().wordBreak(s, words);
        boolean e = false;
        assertEquals(e, a);
    }

}