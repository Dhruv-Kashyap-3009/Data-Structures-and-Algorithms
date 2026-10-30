class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        Stack<String[]> st = new Stack<>();
        st.push(logs.get(0).split(':'));

        for(int i=1;i<logs.size();i++){
            String[] temp = logs.get(i).split(':');

            if(temp[1].equals("start")){
                String[] peek = st.peek();
                ans[peek[0]-'0'] += temp[2]-peek[2]+1;
                peek[2] = temp[2];
            }
        }
    }
}