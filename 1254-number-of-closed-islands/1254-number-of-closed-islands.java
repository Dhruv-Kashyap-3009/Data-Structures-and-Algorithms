class Solution {
    public int closedIsland(int[][] grid) {

        for (int j = 0; j < grid[0].length; j++) {
            if (grid[0][j] == 0) {
                dfs(grid, 0, j);
            }
            if (grid[grid.length - 1][j] == 0) {
                dfs(grid, grid.length - 1, j);
            }
        }

        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0) {
                dfs(grid, i, 0);
            }
            if (grid[i][grid[0].length - 1] == 0) {
                dfs(grid, i, grid[0].length - 1);
            }
        }

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    public void dfs(int[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length ||
            col < 0 || col >= grid[0].length) {
            return;
        }
        if (grid[row][col] == 1) {
            return;
        }

        grid[row][col] = 1;

        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }
}