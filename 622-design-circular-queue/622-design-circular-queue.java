class MyCircularQueue {
    int[] array;
    int headIndex;
    int totalAmount;
    int length;

    public MyCircularQueue(int k) {
        array = new int[k];
        length = k;
        headIndex = 0;
        totalAmount = 0;
    }
    
    public boolean enQueue(int value) {
        if (totalAmount == length) return false;
        array[(headIndex + totalAmount) % length] = value;
        totalAmount++;
        return true;
    }
    
    public boolean deQueue() {
        if (totalAmount == 0) return false;
        if (headIndex + 1 == length) headIndex = 0;
        else headIndex++;
        totalAmount--;
        return true;
    }
    
    public int Front() {
        if (totalAmount == 0) return -1;
        return array[headIndex];
    }
    
    public int Rear() {
        if (totalAmount == 0) return -1;
        return array[(headIndex + totalAmount - 1) % length];
    }
    
    public boolean isEmpty() {
        if (totalAmount == 0) return true;
        return false;
    }
    
    public boolean isFull() {
        if (totalAmount == length) return true;
        return false;
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