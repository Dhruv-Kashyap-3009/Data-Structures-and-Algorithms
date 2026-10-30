class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int maxRect = 0;

        for(int i=0;i<n;i++){
            if(!st.isEmpty() && arr[i]>=arr[st.peek()]) st.push(i);
            else{
                while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                    int curr = st.pop();
                    int nse = i;
                    int pse = st.isEmpty()?-1:st.peek();

                    maxRect = Math.max(maxRect, arr[curr] * (nse-pse-1));
                }
                st.push(i);
            }
        }

        while(!st.isEmpty()){
            int nse = n;
            int curr = st.pop();
            int pse = st.isEmpty()?-1:st.peek();

            maxRect = Math.max(maxRect, arr[curr] * (nse-pse-1));
        }

        return maxRect;
    }
}