class CustomStack {
    
    private int[] stack;
    private int top;

    public CustomStack(int maxSize) {
         int sizee = maxSize;
        stack= new int[sizee];
        top=0;
        
        
    }
    
    public void push(int x) {
        if(top<stack.length){
            stack[top]=x;
            top++;
        }
        
    }
    
    public int pop() {
        int val=0;
            if(top==0){
                return -1;
            }
        if(top>0){
            top--;
            val=stack[top];
            
        }
        return val;
    }
    
    public void increment(int k, int val) {
        
        if(k>stack.length){
            k= stack.length;

        }
        for(int i=0;i<k;i++){
            stack[i]+=val;
        }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */