package kbalad.stack;

import java.util.LinkedList;
import java.util.Queue;

public class _225_ImplementingStackUsingQueues {
    class MyStack {
        Queue<Integer> a;

        public MyStack() {
            a = new LinkedList<>();
        }

        public void push(int x) {
            a.add(x);
        }

        public int pop() {
            int l = a.size() - 1;
            for (int i = 0; i < l; i++) {
                a.add(a.poll());
            }
            return a.poll();
        }

        public int top() {
            int l = a.size() - 1;
            for (int i = 0; i < l; i++) {
                a.add(a.poll());
            }
            int v = a.poll();
            a.add(v);
            return v;
        }

        public boolean empty() {
            return a.isEmpty();
        }
    }
}
