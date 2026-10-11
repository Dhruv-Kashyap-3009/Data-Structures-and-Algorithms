class Solution {
    private int solve(int[] arr, int i, int prev, int[][] dp) {
        if (i >= arr.length) return 0;
        if (dp[i][prev + 1] != -1) return dp[i][prev + 1];

        int take = 0;
        if (prev == -1 || arr[i] > arr[prev]) take = 1 + solve(arr, i + 1, i, dp);

        int skip = solve(arr, i + 1, prev, dp);

        return dp[i][prev + 1] = Math.max(skip, take);
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n + 1];

        for (int[] row : dp) Arrays.fill(row, -1);

        return solve(nums, 0, -1, dp);
    }
}