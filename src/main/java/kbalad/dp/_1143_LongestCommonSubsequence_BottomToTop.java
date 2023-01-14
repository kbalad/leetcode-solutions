package kbalad.dp;

public class _1143_LongestCommonSubsequence_BottomToTop {

    public int longestCommonSubsequence(String text1, String text2) {
        // init
        int[][] mem;
        char[] a, b;
        if (text1.length() >= text2.length()) {
            a = text2.toCharArray();
            b = text1.toCharArray();
        } else {
            b = text2.toCharArray();
            a = text1.toCharArray();
        }
        mem = new int[a.length+1][b.length+1];

        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = b.length - 1; j >= 0; j--) {
                if (a[i] == b[j]) {
                    mem[i][j] = mem[i + 1][j + 1] + 1;
                } else {
                    int buf = Math.max(mem[i][j + 1], mem[i+1][j]);
                    mem[i][j] = buf;
                }
            }
        }
        return mem[0][0];
    }
}
