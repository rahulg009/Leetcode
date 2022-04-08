class KthLargest {

    private PriorityQueue<Integer> store = new PriorityQueue<>();
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i:nums){
            store.add(i);
            if(store.size()>k){
                store.poll();
            }
        }
        
    }
    
    public int add(int val) {
        store.add(val);
        if(store.size()>k){
            store.poll();
        }
        return store.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */