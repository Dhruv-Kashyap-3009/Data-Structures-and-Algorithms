class Solution {
    private int chori(int[] arr, int idx, int[] dp){
        if(idx>=arr.length) return 0;
        if(dp[idx]!=-1) return dp[idx];

        int left = chori(arr, idx+1, dp);
        int take = arr[idx] + chori(arr, idx+2, dp);

        return dp[idx] = Math.max(take, left);
    }
    public int rob(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return chori(arr, 0, dp);
    }
}