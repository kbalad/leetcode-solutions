package kbalad.iterative;

public class _67_AddBinary {
    public String addBinary(String a, String b) {
        byte car = 0;
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0) {
            char ca = i < 0 ? '0' : a.charAt(i);
            char cb = j < 0 ? '0' : b.charAt(j);
            if (ca == '1') {
                car++;
            }
            if (cb == '1') {
                car++;
            }
            if (car % 2 == 1) {
                sb.append('1');
            } else {
                sb.append('0');
            }
            car /= 2;
            i--; j--;
        }
        if (car == 1) {
            sb.append('1');
        }
        sb.reverse();
        return sb.toString();
    }
}
