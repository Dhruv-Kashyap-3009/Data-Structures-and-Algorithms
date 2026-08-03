class Solution {
    private int solve(int[] arr, int i, int[] dp){
        int n = arr.length;
        if(i>=n) return 0;
        if(dp[i]!=Integer.MIN_VALUE) return dp[i];
        
        int ans = Integer.MIN_VALUE;

        ans = Math.max(ans, arr[i] - solve(arr, i+1, dp));
        if(i+1 <n) ans = Math.max(ans, arr[i] + arr[i+1] - solve(arr, i+2, dp));
        if(i+2 <n) ans = Math.max(ans, arr[i] + arr[i+1] + arr[i+2] - solve(arr, i+3, dp));

        return dp[i] = ans;
    }
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MIN_VALUE);

        int ans = solve(stoneValue, 0, dp);

        if(ans>0) return "Alice";
        else if(ans<0) return "Bob";
        else return "Tie";
    }
}