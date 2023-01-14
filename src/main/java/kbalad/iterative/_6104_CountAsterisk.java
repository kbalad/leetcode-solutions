package kbalad.iterative;

public class _6104_CountAsterisk {
    public int countAsterisks(String s) {
        char[] cs = s.toCharArray();
        boolean act = false;
        int cnt = 0;
        for (char c: cs) {
            if (c == '|') act = !act;
            else if (c == '*' && !act) cnt++;
        }
        return cnt;
    }
}
