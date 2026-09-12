class Solution {
    private boolean subsetSum(int[] arr, int i, int sum, Boolean[][] dp){
        if(sum==0) return true;
        if(i>=arr.length || sum<0) return false;
        if(dp[i][sum]!=null) return dp[i][sum];

        boolean take = subsetSum(arr, i+1, sum-arr[i], dp);
        boolean skip = subsetSum(arr, i+1, sum, dp);

        return dp[i][sum] = take || skip;
    }
    public boolean canPartition(int[] arr) {
        int sum = 0;

        for(int val : arr) sum+= val;

        if(sum % 2 != 0) return false;
        else{
            int target = sum/2;
            Boolean[][] dp = new Boolean[arr.length][target+1];
            return subsetSum(arr, 0, target, dp);
        }
    }
}