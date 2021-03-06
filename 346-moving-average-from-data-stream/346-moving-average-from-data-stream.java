class MovingAverage {
    Queue<Integer> q;
    int length;
    double avg;

    public MovingAverage(int size) {
        q = new LinkedList<>();
        length = size;
        avg = 0;
    }
    
    public double next(int val) {
        if (q.size() == length) {
            q.add(val);
            avg -= q.remove();
            avg += val;
        } else {
            q.add(val);
            avg += val;
        }
        
        return avg / q.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */