class MyCircularQueue {
    
    final int[] arr;
    int head=0;
    int tail=0;
    int size=0;
    

    public MyCircularQueue(int k) {
        arr = new int[k];
 
        
    }
    
    public boolean enQueue(int value) {
        if(size== arr.length) return false;
        
        arr[tail]=value;
        
        tail=(tail+1)%arr.length;
        size++;
        return true;
        
    }
    
    public boolean deQueue() {
        if(size==0)return false;
        
        head=(head+1)%arr.length;
        
        size--;
        return true;
        
    }
    
    public int Front() {
        if(size==0) return -1;
        return arr[head];
        
    }
    
    public int Rear() {
        if (isEmpty()) return -1;
        return arr[calculatePrevIndex(tail)];
        
    }
    
    public boolean isEmpty() {
        if(size==0) return true;
        return false;
        
    }
    
    public boolean isFull() {
        if(size==arr.length)return true;
        return false;
        
    }
    private int calculatePrevIndex(int index) {
        return --index >= 0 ? index : (index + arr.length);
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