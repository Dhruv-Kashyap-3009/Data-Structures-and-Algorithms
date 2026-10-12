class Solution {
    private int solve(int[] arr, int i, int amount, int[][] dp){
        if(i>=arr.length) return Integer.MAX_VALUE;
        if(amount<0) return Integer.MAX_VALUE;
        if(amount==0) return 0;
        if(dp[i][amount]!=-1) return dp[i][amount];

        int skip = solve(arr, i+1, amount, dp);

        int ans = solve(arr, i, amount-arr[i], dp);
        int take = Integer.MAX_VALUE;

        if(ans!=Integer.MAX_VALUE){
            take = 1 + ans;
        }

        return dp[i][amount] = Math.min(take, skip);
    }
    public int coinChange(int[] arr, int amount) {
        int n = arr.length;
        
        int[][] dp = new int[n][amount+1];
        for(int[] a : dp) Arrays.fill(a, -1);

        int ans = solve(arr, 0, amount, dp);

        return ans==Integer.MAX_VALUE?-1:ans;
    }
}