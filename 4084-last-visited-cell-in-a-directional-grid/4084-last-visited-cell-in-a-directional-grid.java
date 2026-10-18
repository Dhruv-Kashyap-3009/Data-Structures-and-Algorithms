class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int lastX = -1;
        int lastY = -1;

        int x = 0;
        int y = 0;
        boolean[][] isVisited = new boolean[m][n];

        while(x<m && x>=0 && y<n && y>=0 && !isVisited[x][y]){
            isVisited[x][y] = true;

            lastX = x;
            lastY = y;

            char c = grid[x][y];

            if(c=='L'){
                y = y-1;
            }else if(c=='R'){
                y = y+1;
            }else if(c=='U'){
                x = x-1;
            }else{
                x = x+1;
            }
        }

        return new int[]{lastX, lastY};
    }
}