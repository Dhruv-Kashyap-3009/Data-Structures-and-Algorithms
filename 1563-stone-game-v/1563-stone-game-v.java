class Solution {
    public int stoneGameV(int[] stoneValue) {
        int dp[][] = new int[stoneValue.length][stoneValue.length];
        for(int i[] : dp){
            Arrays.fill(i, -1);
        }
        return helper(0, stoneValue.length-1, stoneValue,dp);
    }

    public int helper(int i, int j, int arr[], int dp[][]){
        if(i>=j)return 0;

        if(dp[i][j]!=-1)return dp[i][j];
        int tot=0;
        for(int k=i;k<=j;k++){
            tot+=arr[k];
        }

        int ans=0;
        int left=0;
        for(int k=i;k<=j;k++){
            left+=arr[k];
            int right=tot-left;

            if(left<right){
                ans = Math.max(ans, left+helper(i,k,arr, dp));
            }
            else if(left>right){
                ans = Math.max(ans, right+helper(k+1,j,arr, dp));
            }
            else{
                ans=Math.max(ans, left+Math.max(helper(i,k,arr, dp),helper(k+1,j,arr, dp)));
            }
        }
       
        return dp[i][j]=ans;

    }
}