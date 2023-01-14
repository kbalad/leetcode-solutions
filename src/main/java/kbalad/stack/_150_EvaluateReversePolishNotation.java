package kbalad.stack;

import java.util.Deque;
import java.util.LinkedList;

public class _150_EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> s = new LinkedList<>();
        for (String t: tokens) {
            try {
                int v = Integer.parseInt(t);
                s.push(v);
            } catch(NumberFormatException e) {
                int b = s.pop();
                int a = s.pop();
                int res;
                switch (t) {
                    case "+": res = a + b; break;
                    case "-": res = a - b; break;
                    case "*": res = a * b; break;
                    case "/": res = a / b; break;
                    default: res = -1; break;
                }
                s.push(res);
            }
        }
        return s.pop();
    }
}
