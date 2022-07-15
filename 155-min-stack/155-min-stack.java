class Node {
    int value;
    Node next;
    int min;
    
    Node(int value, Node next, int min) {
        this.value = value;
        this.next = next;
        this.min = min;
    }
}

class MinStack {
    Node head;
    int min;

    public MinStack() {
        head = null;
    }
    
    public void push(int val) {
        if (head == null) {
            head = new Node(val, null, val);
            min = val;
        }
        else {
            if (val < head.min) head = new Node(val, head, val);
            else head = new Node(val, head, head.min);
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.value;
    }
    
    public int getMin() {
        return head.min;
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