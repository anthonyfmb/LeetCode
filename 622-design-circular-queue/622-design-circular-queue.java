class Node {
    public int value;
    public Node next;
    
    public Node(int value) {
        this.value = value;
        this.next = null;
    }
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

class MyCircularQueue {
    int length;
    int totalAmount;
    Node headPtr;
    Node tailPtr;

    public MyCircularQueue(int k) {
        length = k;
        totalAmount = 0;
    }
    
    public boolean enQueue(int value) {
        if (length == totalAmount) return false;
        if (totalAmount == 0) {
            Node n = new Node(value);
            headPtr = n;
            tailPtr = n;
        }
        else {
            Node n = new Node(value);
            tailPtr.next = n;
            tailPtr = n;
        }
        totalAmount++;
        return true;
    }
    
    public boolean deQueue() {
        if (totalAmount == 0) return false;
        headPtr = headPtr.next;
        totalAmount--;
        return true;
    }
    
    public int Front() {
        if (totalAmount == 0) return -1;
        return headPtr.value;
    }
    
    public int Rear() {
        if (totalAmount == 0) return -1;
        return tailPtr.value;
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