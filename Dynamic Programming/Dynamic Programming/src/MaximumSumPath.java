
class MaximumSumPath{
    public static int MaxSumPath(int[][]arr, int r, int c, int[][] dp){
        int n = arr.length;
        int m = arr[0].length;

        if(r==n || c==-1 || c==m) return Integer.MIN_VALUE;
        if(r==n-1) return arr[r][c];
        if(dp[r][c]!=0) return dp[r][c];

        int left = MaxSumPath(arr, r+1, c-1, dp);
        int down = MaxSumPath(arr, r+1, c, dp);
        int right = MaxSumPath(arr, r+1,c+1, dp);

        return dp[r][c]= arr[r][c] + Math.max(left, Math.max(right, down));
    }
    public static void main(String[] args) {
        int[][] arr = {{3,6,1},{2,3,4},{5,5,1}};
        int n = arr.length;
        int m = arr[0].length;
        int[][] dp = new int[n][m];

        int ans =-1;
        for(int j=0;j<m;j++){
            ans = Math.max(ans, MaxSumPath(arr,0,j,dp));
        }
        System.out.println("The Maximum Sum is: "+ans);
    }
}