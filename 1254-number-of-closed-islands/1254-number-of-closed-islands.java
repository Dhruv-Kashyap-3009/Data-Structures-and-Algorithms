class Solution {
    private void dfs(int[][] grid, int i, int j, boolean[][] isVisited){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length) return;
        if(isVisited[i][j]) return;
        if(grid[i][j]==1) return;

        isVisited[i][j] = true;

        int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

        for(int k=0;k<4;k++){
            int x = i + dir[k][0];
            int y = j + dir[k][1];

            dfs(grid, x, y, isVisited);
        }
    }
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] isVisited = new boolean[m][n];

        for(int i=0;i<m;i++){
            if(grid[i][0]==0) dfs(grid, i, 0, isVisited);
            if(grid[i][n-1]==0) dfs(grid, i, n-1, isVisited);
        }

        for(int j=0;j<n;j++){
            if(grid[0][j]==0) dfs(grid, 0, j, isVisited);
            if(grid[m-1][j]==0) dfs(grid, m-1, j, isVisited);
        }

        int island = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0 && !isVisited[i][j]){
                    island++;
                    dfs(grid, i, j, isVisited);
                }
            }
        }

        return island;
    }
}