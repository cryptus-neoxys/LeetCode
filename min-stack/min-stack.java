class MinStack {

    
        Stack<Long> data;
        int min;
    
    public MinStack() {
        data = new Stack<>();
    }
    
    public void push(int val) {
        if (this.data.size() == 0) {
            this.data.push((long)val);
            this.min = val;
        } else if (val >= this.min) {
            this.data.push((long)val);
        } else {
            this.data.push((long)val + val - this.min);
            this.min = val;
        }
    }
    
    public void pop() {
        if(this.data.size() == 0) {
            return;
        } else {
            if(this.data.peek() >= min) {
                this.data.pop();
                return;
            } else {
                this.min = 2 * this.min - this.data.pop().intValue();
            }
        }
    }
    
    public int top() {
        if(this.data.size() == 0) {
            return -1;
        } else {
            if(this.data.peek() >= this.min) {
              return this.data.peek().intValue();
            } else {
                return this.min;
            }
        }
    }
    
    public int getMin() {
        if(this.data.size() == 0) {
            return -1;
        } else {
            return this.min;
        }
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