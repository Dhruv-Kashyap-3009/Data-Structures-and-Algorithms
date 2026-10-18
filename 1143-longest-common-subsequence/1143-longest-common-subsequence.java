class Solution {
    private int solve(String s1, String s2, int i, int j, int[][] dp){
        if(i>=s1.length() || j>=s2.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        char c1 = s1.charAt(i);
        char c2 = s2.charAt(j);

        if(c1==c2){
            return dp[i][j] = 1 + solve(s1, s2, i+1, j+1, dp);
        }
        else{
            return dp[i][j] = Math.max(solve(s1, s2, i+1, j, dp), solve(s1, s2, i, j+1, dp));
        }
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m][n];
        for(int[] a : dp) Arrays.fill(a, -1);

        return solve(s1, s2, 0, 0, dp);
    }
}