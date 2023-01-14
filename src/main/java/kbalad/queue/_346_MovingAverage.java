package kbalad.queue;

import java.util.LinkedList;
import java.util.Queue;

public class _346_MovingAverage {

}

class MovingAverage {
    private Queue<Integer> queue;
    private int size;
    private int capacity;
    private long tempSum;

    public MovingAverage(int size) {
        queue = new LinkedList<>();
        capacity = size;
        this.size = 0;
        tempSum = 0;
    }

    public double next(int val) {
        if (size >= capacity) {
            int v = queue.remove();
            tempSum -= v;
            size--;
        }
        queue.add(val);
        size++;
        tempSum += val;
        return tempSum * 1.0 / size;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */