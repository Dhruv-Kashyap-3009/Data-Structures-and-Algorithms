class Solution {
    private int solve(int[] arr, int i, int canBuy, int fee, int[][] dp){
        if(i>=arr.length) return 0;
        if(dp[i][canBuy]!=-1) return dp[i][canBuy];

        if(canBuy==1){
            int take = - arr[i] + solve(arr, i+1, 0, fee, dp);
            int skip = solve(arr, i+1, 1, fee, dp);

            return dp[i][canBuy] = Math.max(take, skip);
        }else{
            int take = arr[i] - fee + solve(arr, i+1, 1, fee, dp);
            int skip = solve(arr, i+1, 0, fee, dp);

            return dp[i][canBuy] = Math.max(take, skip);
        }
    }
    public int maxProfit(int[] arr, int fee) {
        int n = arr.length;
        int[][] dp = new int[n][2];
        for(int[] a : dp) Arrays.fill(a, -1);

        return solve(arr, 0, 1, fee, dp);
    }
}