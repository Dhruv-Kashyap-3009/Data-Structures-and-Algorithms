class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();

        int maxLen = 0;

        //Left to Right
        int close = 0;
        int open = 0;

        for(int i=0;i<n;i++){
            char c = s.charAt(i);

            if(c=='(') open++;
            else if(c==')') close++;

            if(open<close){
                open = 0;
                close = 0;
            }else if(open==close){
                maxLen = Math.max(maxLen, open+close);
            }
        }

        //Right to left
        open = 0;
        close = 0;
        for(int i=n-1;i>=0;i--){
            char c = s.charAt(i);

            if(c=='(') open++;
            else if(c==')') close++;

            if(close<open){
                open = 0;
                close = 0;
            }else if(open==close){
                maxLen = Math.max(open+close, maxLen);
            }
        }

        return maxLen;
    }
}