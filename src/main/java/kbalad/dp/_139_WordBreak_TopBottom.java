package kbalad.dp;

import java.util.*;

public class _139_WordBreak_TopBottom {
    int[] mem;
    List<String> words;
    int n;
    String s;

    public boolean wordBreak(String s, List<String> wordDict) {
        n = s.length();
        mem = new int[n + 1];
        Arrays.fill(mem, -1);
        mem[0] = 1;
        words = new LinkedList<>(wordDict);
        words.sort(Comparator.comparing(String::length));
        this.s = s;

        dp(n);

        if (mem[n] == 1) return true;
        return false;
    }

    private void dp(int i) {
        if (i < 0) return;
        if (mem[i] == -1) { // not visited
            mem[i] = 0;
            for (String w : words) {
                int sn = w.length();
                int oldI = i - sn;
                if (oldI < 0) break;
                if (s.substring(oldI, i).equals(w)) {
                    if (mem[oldI] == -1) dp(oldI);
                    if (mem[oldI] == 1) mem[i] = 1;
                }
            }
        }
    }
}
