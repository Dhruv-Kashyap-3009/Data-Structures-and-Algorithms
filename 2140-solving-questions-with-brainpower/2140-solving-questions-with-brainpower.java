class Solution {
    private long solve(int[][] arr, int i, long[] dp){
        if(i>=arr.length) return 0L;
        if(dp[i]!=-1L) return dp[i];

        long skip = solve(arr, i+1, dp);
        long take = arr[i][0] + solve(arr, i+arr[i][1]+1, dp);

        return dp[i] = Math.max(skip, take);
    }
    public long mostPoints(int[][] arr) {
        long[] dp = new long[arr.length];
        Arrays.fill(dp, -1L);

        return solve(arr, 0, dp);
    }
}