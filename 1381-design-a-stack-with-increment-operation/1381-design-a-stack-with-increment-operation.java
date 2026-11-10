class CustomStack {
    int[] st;
    int top;
    public CustomStack(int maxSize) {
        st = new int[maxSize];
        top = -1;
    }
    
    public void push(int x) {
        if(top < st.length - 1) st[++top] = x;
    }
    
    public int pop() {
        if(top==-1) return -1;

        int val = st[top];
        top--;

        return val;
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<k && i<=top;i++){
            st[i] += val;
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