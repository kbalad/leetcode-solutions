package kbalad.dp;

public class _91_DecodeWays {
    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = chars[i] - '0';
        }

        if (arr[0] == 0) return 0;

        int a = 1;
        int b = 1;
        for (int i = 1; i < n; i++) {
            int nextB = 0;

            int cur = arr[i];
            int prev = arr[i - 1];

            if (isExceptionalCase(prev, cur)) {
                return 0;
            }
            if (canMerge(prev, cur)) {
                nextB += a;
            }
            if (cur != 0) {
                nextB += b;
            }

            // swap cycle
            a = b;
            b = nextB;
        }

        return b;
    }

    private boolean canMerge(int prev, int cur) {
        return prev == 1 || prev == 2 && cur <= 6;
    }

    private boolean isExceptionalCase(int prev, int cur) {
        return cur == 0 && (prev == 0 || prev > 2);
    }
}
