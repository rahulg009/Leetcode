class MyStack {
    
    Queue<Integer> que;
    Queue<Integer> help;

    public MyStack() {
        
         que = new LinkedList<>();
         help = new LinkedList<>();
            
        
    }
    
    public void push(int x) {
        while(!que.isEmpty()){
            help.add(que.poll());
        }
        que.add(x);
        while(!help.isEmpty()){
            que.add(help.poll());
        }
        
        
    }
    
    public int pop() {
        
        return que.poll();
        
    }
    
    public int top() {
        
        return que.peek();
        
    }
    
    public boolean empty() {
        if(que.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */