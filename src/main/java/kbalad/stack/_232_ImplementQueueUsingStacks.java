package kbalad.stack;

import java.util.Deque;
import java.util.LinkedList;

public class _232_ImplementQueueUsingStacks {
    class MyQueue {
        Deque<Integer> a;
        Deque<Integer> b;

        public MyQueue() {
            a = new LinkedList<>();
            b = new LinkedList<>();
        }

        public void push(int x) {
            a.push(x);
        }

        public int pop() {
            if (b.isEmpty()) {
                while (!a.isEmpty()) {
                    b.push(a.pop());
                }
            }
            return b.pop();
        }

        public int peek() {
            if (b.isEmpty()) {
                while (!a.isEmpty()) {
                    b.push(a.pop());
                }
            }
            return b.peek();
        }

        public boolean empty() {
            return a.isEmpty() && b.isEmpty();
        }
    }
}
