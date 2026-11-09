class StockSpanner {
    Stack<int[]> st;
    int day;
    public StockSpanner() {
        st = new Stack<>();
        day = 1;
    }
    
    public int next(int price) {
        while(!st.isEmpty() && st.peek()[0]<=price) st.pop();

        int ans = st.isEmpty()?day:day - st.peek()[1];

        st.push(new int[]{price, day});
        day++;

        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */