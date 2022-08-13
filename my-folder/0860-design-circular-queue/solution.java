class MyCircularQueue {

    int head = -1;
    int tail = -1;
    int[] q;
    int k;
    
    public MyCircularQueue(int k) {
        q = new int[k];
        this.k = k;
    }
    
    public boolean enQueue(int value) {
        if(head == -1 && tail == -1) {
            // enqueue when the queue is empty
            head = tail = 0;
            q[tail] = value;    // enQueue done
            return true;
        }
        if((tail == k-1 && head == 0) || tail+1 == head) {
            // queue is full
            return false;
        }
        tail++;
        if(tail == k) // condition for circularity
            tail = 0;
        q[tail] = value;    // enQueue done
        return true;
    }
    
    public boolean deQueue() {
        if(head == -1) {
            // check if q is already empty
            return false;
        } 
        if(head == tail) {
            // only 1 element is there and head,tail both points same index
            head = tail = -1;   // deQueue done
            return true;
        }
        head++;       // deQueue done
        if(head == k) // condition for circularity
            head = 0;
        return true;
    }
    
    public int Front() {
        if(head == -1) 
            return -1;
        return q[head];
    }
    
    public int Rear() {
        if(tail == -1) 
            return -1;
        return q[tail];
    }
    
    public boolean isEmpty() {
        if(head == -1 && tail == -1) 
            return true;
        return false;
    }
    
    public boolean isFull() {
        if(tail == k-1 || tail+1 == head) 
            return true;
        return false;
    }
}
