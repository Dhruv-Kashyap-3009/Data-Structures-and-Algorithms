import java.util.*;
class Knapsack01{
    //DP using Recursion + Memoization
    public static int knapsack(int[] wt, int[] val, int W, int n, int[][] dp){
        if(W<=0 || n==0) return 0;
        if(dp[n][W]!=-1) return dp[n][W];

        if(wt[n-1]<=W){
            int skip = knapsack(wt, val, W, n-1, dp);
            int include = val[n-1]+knapsack(wt, val, W-wt[n-1], n-1,dp);
            return dp[n][W] = Math.max(include, skip);
        }else{
            int skip = knapsack(wt, val, W, n-1, dp);
            return dp[n][W] = skip;
        }
    }
    public static void main(String[] args) {
        int[] wt = {1, 2, 3};
        int[] val = {4, 5, 1};
        int W = 4;
        int n = wt.length;
//        int[][] dp = new int[n+1][W+1];
//        for(int[] arr : dp) Arrays.fill(arr, -1);
//
//        System.out.println(knapsack(wt, val, W, n, dp));

        //DP using Tabulation
        int[][] t = new int[n+1][W+1];
        for(int i=0;i<W+1;i++) t[0][i] = 0;
        for(int i=0;i<n+1;i++) t[i][0] = 0;

        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(wt[i-1]<=j){
                    t[i][j] = Math.max(val[i-1]+t[i-1][j-wt[i-1]], t[i-1][j]);
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        System.out.println(t[n][W]);
    }
}