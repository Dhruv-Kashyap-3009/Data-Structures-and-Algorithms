class Solution {
    private void generate(List<String> ans, String s, int open, int close, int n){
        if(close==n){
            ans.add(s);
            return;
        }

        if(open<n) generate(ans, s+'(', open+1, close, n);

        if(close<open) generate(ans, s+')', open, close+1, n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(ans, "", 0, 0, n);

        return ans;
    }
}