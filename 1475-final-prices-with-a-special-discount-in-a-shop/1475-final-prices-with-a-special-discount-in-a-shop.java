class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] discount = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>prices[i]) st.pop();

            if(st.isEmpty()) discount[i] = 0;
            else discount[i] = st.peek();

            st.push(prices[i]);
        }

        for(int i=0;i<n;i++){
            discount[i] = prices[i]-discount[i];
        }

        return discount;
    }
}