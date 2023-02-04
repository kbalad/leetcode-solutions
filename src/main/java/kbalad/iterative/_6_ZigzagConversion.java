package kbalad.iterative;

public class _6_ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        char[] res = new char[s.length()];
        int ptr = 0;
        for (int i = 0; i < numRows; i++) {
            int j = i;

            if (i == 0 || i == numRows - 1) {
                while (j < s.length()) {
                    res[ptr++] = s.charAt(j);
                    j += (numRows - 1) * 2;
                }
            }

            while (j < s.length()) {
                res[ptr++] = s.charAt(j);
                j += (numRows - 1 - i) * 2;
                if (j >= s.length()) break;
                res[ptr++] = s.charAt(j);
                j += i * 2;
            }
        }
        return new String(res);
    }
}
