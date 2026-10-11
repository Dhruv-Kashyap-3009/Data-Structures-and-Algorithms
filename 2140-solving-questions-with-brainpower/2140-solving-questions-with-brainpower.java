class Solution {
    // private long solve(int[][] arr, int i, long[] dp){
    //     if(i>=arr.length) return 0L;
    //     if(dp[i]!=-1L) return dp[i];

    //     long skip = solve(arr, i+1, dp);
    //     long take = arr[i][0] + solve(arr, i+arr[i][1]+1, dp);

    //     return dp[i] = Math.max(skip, take);
    // }
    public long mostPoints(int[][] arr) {
        int n = arr.length;
        long[] dp = new long[n];

        for(int i=n-1;i>=0;i--){
            long skip = (i==n-1)?0:dp[i+1];
            long take = arr[i][0] + (((i+arr[i][1]+1) >= n) ? 0 : dp[i+arr[i][1]+1]);

            dp[i] = Math.max(skip, take);
        }

        return dp[0];
    }
}