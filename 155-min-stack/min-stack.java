class MinStack {
    public Stack<Integer>s;
    public MinStack() {
        s=new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        
    }
    
    public void pop() {
        if(!s.isEmpty()){
            s.pop();
        }
        return;
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        if(s.isEmpty()) return -1;
        int min=Integer.MAX_VALUE;
        for(int x:s){
            if(x<min){
                min=x;
            }
        }
        return min;
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