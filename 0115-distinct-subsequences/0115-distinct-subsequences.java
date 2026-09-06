class Solution {
    private int makeSub(String s, String t, int i, int j){
        if(j==t.length()) return 1;
        if(i==s.length()) return 0;

        if(s.charAt(i)==t.charAt(j)){
            return makeSub(s, t, i+1, j) + makeSub(s, t, i+1, j+1);
        }else return makeSub(s, t, i+1, j);
    }
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();

        if(m < n) return 0;

        int[][] dp = new int[m+1][n+1];

        for(int i = 0; i <= m; i++) {
            dp[i][n] = 1;
        }

        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(s.charAt(i)==t.charAt(j)){
                    dp[i][j] = dp[i+1][j] + dp[i+1][j+1];
                }else{
                    dp[i][j] = dp[i+1][j];
                }
            }
        }

        return dp[0][0];
    }
}