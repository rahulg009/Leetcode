class StockSpanner {
    Stack<int[]> st;

    public StockSpanner() {
        
        st = new Stack();
        
        
    }
    
    public int next(int price) {
        
        int cnt =1;
        
        while(!st.isEmpty() && st.peek()[0] <= price){
            cnt+= st.pop()[1];
        }
        
        int[] x = new int[]{price,cnt};
        st.push(x);
        
        return cnt;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */