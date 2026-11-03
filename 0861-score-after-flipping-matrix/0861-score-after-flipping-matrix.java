class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0;i<m;i++){
            if(grid[i][0]==0){
                for(int j=0;j<n;j++){
                    grid[i][j] = (grid[i][j]+1)%2;
                }
            }
        }

        for(int j=1;j<n;j++){
            int zero = 0;
            int one = 0;

            for(int i=0;i<m;i++){
                if(grid[i][j]==0) zero++;
                else one++;
            }

            if(zero>one){
                for(int i=0;i<m;i++){
                    grid[i][j] = (grid[i][j]+1)%2;
                }
            }
        }

        int score = 0;

        for(int i=0;i<m;i++){
            int sum = 0;

            for(int j=0;j<n;j++){
                sum += grid[i][j] * (1 << (n-j-1));
            }

            score += sum;
        }

        return score;
    }
}