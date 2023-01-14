package kbalad.stack;

import java.util.Deque;
import java.util.LinkedList;

public class _739_DailyTemperatures {
    /*
    we have temperature t at a day i
    it may be:
    1) warmer - remove from stack while it is warmer with counter
    2) lesser or equal - add to stack
     */
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> s = new LinkedList<>(); // we store in monotonic stack indexes of temperatures
        s.push(0);

        int[] out = new int[temperatures.length];
        for (int i = 1; i < temperatures.length; i++) {
            while (s.peek() != null && temperatures[s.peek()] < temperatures[i]) {
                int d = s.pop();
                out[d] = i - d;
            }
            s.push(i);
        }
        return out;
    }
}
