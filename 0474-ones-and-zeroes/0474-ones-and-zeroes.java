class Solution {
    private int solve(String[] strs, int i, int m, int n, int[] ones, int[][][] dp) {
        if (i >= strs.length) return 0;
        if (dp[i][m][n] != -1) return dp[i][m][n];

        int zeros = strs[i].length() - ones[i];

        int skip = solve(strs, i + 1, m, n, ones, dp);
        int take = 0;

        if (zeros <= m && ones[i] <= n) {
            take = 1 + solve(strs, i + 1, m - zeros, n - ones[i], ones, dp);
        }

        return dp[i][m][n] = Math.max(take, skip);
    }

    public int findMaxForm(String[] strs, int m, int n) {
        int size = strs.length;
        int[] ones = new int[size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                if (strs[i].charAt(j) == '1') {
                    ones[i]++;
                }
            }
        }

        int[][][] dp = new int[size][m + 1][n + 1];

        for (int[][] a : dp) {
            for (int[] b : a) {
                Arrays.fill(b, -1);
            }
        }

        return solve(strs, 0, m, n, ones, dp);
    }
}