class Solution {
    private int countCoins(int[] arr, int i, int amount, int[][] dp){
        if(i>=arr.length) return 0;
        if(amount<0) return 0;
        if(amount==0) return 1;
        if(dp[i][amount]!=-1) return dp[i][amount];

        int take = countCoins(arr, i, amount - arr[i], dp);
        int skip = countCoins(arr, i+1, amount, dp);

        return dp[i][amount] = take + skip;
    }
    public int change(int amount, int[] arr) {
        int[][] dp = new int[arr.length][amount+1];
        for(int[] a : dp) Arrays.fill(a, -1);

        return countCoins(arr, 0, amount, dp);
    }
}