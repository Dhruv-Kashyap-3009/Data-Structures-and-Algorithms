class Solution {
    public String removeStars(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*') st.pop();
            else st.push(s.charAt(i));
        }

        String ans = "";

        while(!st.isEmpty()){
            ans = st.pop()+ans;
        }

        return ans;
    }
}