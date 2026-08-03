class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int ans = 0;

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                int idx = st.pop();
                int nse = i;
                int pse = st.isEmpty()?-1:st.peek();

                ans = Math.max(ans, arr[idx] * (nse-pse-1));
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int idx = st.pop();
            int nse = n;
            int pse = st.isEmpty()?-1:st.peek();

            ans = Math.max(ans, arr[idx] * (nse-pse-1));
        }

        return ans;
    }
}