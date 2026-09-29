class Solution {
    private boolean solve(char[][] grid, int i, int j, int count, Boolean[][][] dp) {
        int m = grid.length;
        int n = grid[0].length;
        if (i >= m || j >= n) return false;
        if (grid[i][j] == '(') {
            count++;
        } else {
            count--;
        }
        if (count < 0) return false;
        if (i == m - 1 && j == n - 1) return count == 0;
        if (dp[i][j][count] != null) return dp[i][j][count];

        boolean right = solve(grid, i, j + 1, count, dp);
        boolean down = solve(grid, i + 1, j, count, dp);

        return dp[i][j][count] = right || down;
    }

    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if (grid[0][0] == ')') return false;

        Boolean[][][] dp = new Boolean[m][n][m + n];

        return solve(grid, 0, 0, 0, dp);
    }
}