package kbalad.dp;

public class _1143_LongestCommonSubsequence_TopToBottom {
    private char[] a, b;
    private int[][] mem;

    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.length() >= text2.length()) {
            a = text2.toCharArray();
            b = text1.toCharArray();
        } else {
            b = text2.toCharArray();
            a = text1.toCharArray();
        }
        mem = new int[a.length][b.length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b.length; j++)
                mem[i][j] = -1;

        return dp(0, 0);
    }

    private int dp(int i, int j) {
        if (j == b.length || i == a.length) return 0;
        int v = 0;
        if (mem[i][j] == -1) {
            if (a[i] == b[j]) {
                mem[i][j] = dp(i + 1, j + 1) + 1;
            } else {
                int buf = Math.max(dp(i, j + 1), dp(i + 1, j));
                mem[i][j] = buf;
            }
        }
        return mem[i][j];
    }
}
