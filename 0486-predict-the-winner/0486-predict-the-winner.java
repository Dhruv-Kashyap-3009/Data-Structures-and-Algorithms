class Solution {
    Integer[][] dp;

    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        dp = new Integer[n][n];

        return solve(nums, 0, n - 1) >= 0;
    }

    private int solve(int[] nums, int i, int j) {
        if (i == j)
            return nums[i];

        if (dp[i][j] != null)
            return dp[i][j];

        int takeLeft = nums[i] - solve(nums, i + 1, j);
        int takeRight = nums[j] - solve(nums, i, j - 1);

        return dp[i][j] = Math.max(takeLeft, takeRight);
    }
}