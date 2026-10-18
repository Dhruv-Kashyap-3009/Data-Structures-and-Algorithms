class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st = new Stack<>();

        for(int val : nums){
            long temp = (long)val;

            while(!st.isEmpty() && st.peek()==temp){
                st.pop();
                temp = temp*2L;
            }

            st.push(temp);
        }

        List<Long> ans = new ArrayList<>();

        while(!st.isEmpty()) ans.add(0, st.pop());

        return ans;
    }
}