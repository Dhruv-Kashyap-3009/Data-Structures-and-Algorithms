class Solution {
    private long solve(int[] arr, int i, int neg, long[][] dp){
        if(i>=arr.length) return 0L;
        if(dp[i][neg]!=-1L) return dp[i][neg];

        long skip = solve(arr, i+1, neg, dp);
        long take = 0L;
        if(neg==0){
            take = arr[i] + solve(arr, i+1, 1, dp);
        }else{
            take = -arr[i] + solve(arr, i+1, 0, dp);
        }

        return dp[i][neg] = Math.max(skip, take);
    }
    public long maxAlternatingSum(int[] arr) {
        int n = arr.length;
        long[][] dp = new long[n][2];
        
        for(long[] a : dp) Arrays.fill(a, -1L);

        return solve(arr, 0, 0, dp);
    }
}