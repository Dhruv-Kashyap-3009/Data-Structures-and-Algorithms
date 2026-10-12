class Solution {
    private int solve(int[] arr, int i, int prev, int[][] dp){
        if(i>=arr.length) return 0;
        if(dp[i][prev+1]!=-1) return dp[i][prev+1];

        int skip = solve(arr, i+1, prev, dp);
        int take = 0;

        if(prev==-1 || arr[prev]<arr[i]) take = 1+solve(arr, i+1, i, dp);

        return dp[i][prev+1] = Math.max(skip, take);
    }
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;

        int[][] dp = new int[n][n+1];
        for(int[] a : dp) Arrays.fill(a, -1);

        return solve(arr, 0, -1, dp);
    }
}