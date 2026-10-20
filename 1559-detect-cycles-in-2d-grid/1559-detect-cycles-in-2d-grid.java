
class Solution {
    private boolean dfs(char[][] grid, int i, int j, int parX, int parY, boolean[][] isVisited) {
        isVisited[i][j] = true;

        int[] dirX = {-1, 0, 1, 0};
        int[] dirY = {0, -1, 0, 1};

        for (int k = 0; k < 4; k++) {
            int X = i + dirX[k];
            int Y = j + dirY[k];

            if (X < 0 || X >= grid.length || Y < 0 || Y >= grid[0].length) continue;
            if (grid[X][Y] != grid[i][j]) continue;
            if (X == parX && Y == parY) continue;
            if (isVisited[X][Y]) return true;

            if (dfs(grid, X, Y, i, j, isVisited)) {
                return true;
            }
        }

        return false;
    }

    public boolean containsCycle(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] isVisited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!isVisited[i][j]) {
                    if (dfs(grid, i, j, -1, -1, isVisited)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
