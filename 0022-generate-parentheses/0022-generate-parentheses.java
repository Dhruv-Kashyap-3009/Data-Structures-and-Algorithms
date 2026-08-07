class Solution {
    private void generate(int open, int close, int n, String s, List<String> ans){
        if(open==n && close==n){
            ans.add(s);
            return;
        }

        if(open<n) generate(open+1, close, n, s+"(", ans);
        if(close<open) generate(open, close+1, n, s+")", ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        generate(0, 0, n, "", ans);

        return ans;
    }
}