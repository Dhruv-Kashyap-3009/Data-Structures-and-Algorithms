class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if(grid[0][0]==1) return -1;

        boolean[][] isVisited = new boolean[m][n];

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        isVisited[0][0] = true;

        int distance = 0;

        while(!q.isEmpty()){
            int size = q.size();

            distance++;

            while(size-- > 0){
                int i = q.peek()[0];
                int j = q.peek()[1];
                q.poll();

                if(i==m-1 && j==n-1) return distance;

                int[][] dir = {{-1, -1},{-1, 0},{-1, 1},{0, 1},{1, 1},{1, 0},{1, -1},{0, -1}};

                for(int k = 0;k<8;k++){
                    int x = i + dir[k][0];
                    int y = j + dir[k][1];

                    if(x>=0 && x<m && y>=0 && y<n && !isVisited[x][y] && grid[x][y]==0){
                        q.add(new int[]{x, y});
                        isVisited[x][y] = true;
                    }
                }
            }
        }

        return -1;
    }
}