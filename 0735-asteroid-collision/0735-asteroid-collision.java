class Solution {
    public int[] asteroidCollision(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            if(st.isEmpty() || st.peek()<0) st.push(arr[i]);
            else{
                if(arr[i]>0) st.push(arr[i]);
                else{
                    while (!st.isEmpty() && st.peek() > 0 && st.peek() < -arr[i]) st.pop();
                    if (st.isEmpty() || st.peek() < 0) st.push(arr[i]);
                    else if (st.peek() == -arr[i]) st.pop();
                }
            }
        }

        int m = st.size();
        int[] ans = new int[m];

        for(int i=m-1;i>=0;i--) ans[i] = st.pop();

        return ans;
    }
}