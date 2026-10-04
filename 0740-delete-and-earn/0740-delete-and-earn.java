class Solution {
    public int deleteAndEarn(int[] arr) {
        int[] points = new int[10001];

        for(int x : arr) points[x] += x;

        int n = points.length;
        int[] dp = new int[n];

        dp[0] = points[0];
        dp[1] = Math.max(points[0], points[1]);

        for(int i=2;i<n;i++) dp[i] = Math.max(dp[i-1], points[i]+dp[i-2]);

        return dp[n-1];
    }
}