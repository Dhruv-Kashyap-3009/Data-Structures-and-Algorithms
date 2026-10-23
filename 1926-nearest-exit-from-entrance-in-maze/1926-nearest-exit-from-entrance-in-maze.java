class Solution {
    private boolean isNotBlocked(char[][] maze, int i, int j){
        return maze[i][j]!='+';
    }
    private boolean isEntrance(int[] entrance, int i, int j){
        if(entrance[0]==i && entrance[1]==j) return true;
        return false;
    }
    private boolean isExit(char[][] maze, int i, int j){
        int m = maze.length;
        int n = maze[0].length;

        return i==m-1 || i==0 || j==n-1 || j==0;
    }
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;

        Queue<int[]> q = new LinkedList<>();
        boolean[][] isVisited = new boolean[m][n];

        q.add(entrance);
        isVisited[entrance[0]][entrance[1]] = true;
        int level = 0;
        
        int[] dirX = {-1, 0, 1, 0};
        int[] dirY = {0, -1, 0, 1};

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                int row = q.peek()[0];
                int col = q.peek()[1];
                q.poll();

                if(isExit(maze, row, col) && !isEntrance(entrance, row, col)) return level;

                for(int k=0;k<4;k++){
                    int x = row + dirX[k];
                    int y = col + dirY[k];

                    if(x>=0 && x<m && y>=0 && y<n && isNotBlocked(maze, x, y) && !isVisited[x][y]){
                        q.add(new int[]{x, y});
                        isVisited[x][y] = true;
                    }
                }
            }
            level++;
        }

        return -1;
    }
}