class Solution {
    private boolean solve(int[] arr, int i, int target, Boolean[][] dp){
        if(target==0) return true;
        if(i>=arr.length) return false;
        if(target<0) return false;
        if(dp[i][target]!=null) return dp[i][target];

        return dp[i][target] = solve(arr, i+1, target-arr[i], dp) || solve(arr, i+1, target, dp);
    }
    public boolean canPartition(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for(int val : arr) sum += val;

        if(sum%2!=0) return false;

        Boolean[][] dp = new Boolean[n][sum/2+1];

        return solve(arr, 0, sum/2, dp);
    }
}