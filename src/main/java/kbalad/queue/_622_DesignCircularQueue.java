package kbalad.queue;

public class _622_DesignCircularQueue {

}

class MyCircularQueue {
    private int[] queue;
    private int capacity;
    private int headIndex; // index of the empty bucket (next to insert)
    private int size;

    public MyCircularQueue(int k) {
        queue = new int[k];
        capacity = k;
        headIndex = 0;
        size = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;
        int tailIndex = (headIndex + size++) % capacity;
        queue[tailIndex] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        queue[headIndex] = -1;
        headIndex = (headIndex + 1) % capacity;
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return queue[headIndex];
    }

    public int Rear() {
        if (isEmpty()) return -1;
        int tailIndex = (headIndex + size - 1) % capacity;
        return queue[tailIndex];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */