class Solution {
    public int minCostClimbingStairs(int[] arr) {
        int n = arr.length;

        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = arr[1];

        for(int i=2;i<n;i++){
            dp[i] = arr[i] + Math.min(dp[i-1], dp[i-2]);
        }

        return Math.min(dp[n-1], dp[n-2]);
    }
}