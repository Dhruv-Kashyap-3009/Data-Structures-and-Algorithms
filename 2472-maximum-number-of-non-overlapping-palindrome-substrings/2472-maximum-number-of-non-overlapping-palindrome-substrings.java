class Solution {
    int n;
    private boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
    private int solve(String s, int k, int i, int j, int[][] dp){
        if(i>=n || j>=n) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        if(isPalindrome(s, i, j)){
            int take = 1 + solve(s, k, j+1, j+k, dp);
            int grow = solve(s, k, i, j+1, dp);
            int slide = solve(s, k, i+1, j+1, dp);

            return dp[i][j] = Math.max(take, Math.max(grow, slide));
        }

        int grow = solve(s, k, i, j+1, dp);
        int slide = solve(s, k, i+1, j+1, dp);

        return dp[i][j] = Math.max(grow, slide);
    }
    public int maxPalindromes(String s, int k) {
        n = s.length();

        if(k==1) return n;

        int[][] dp = new int[n+1][n+1];
        for(int[] arr : dp) Arrays.fill(arr, -1);

        return solve(s, k, 0, k-1, dp);
    }
}