package kbalad.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _155_MinStack {

}

class MinStack {
    Stack<Integer> stack;
    List<Integer> mins;

    public MinStack() {
        stack = new Stack<>();
        mins = new ArrayList<>();
        mins.add(0, Integer.MAX_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        mins.add(stack.size(), Math.min(mins.get(stack.size()-1), val));
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return mins.get(stack.size());
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
