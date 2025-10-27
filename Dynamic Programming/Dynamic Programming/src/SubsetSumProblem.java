class SubsetSumProblem{
    //DP using Recursion
    public static boolean isSumPossible(int[] arr, int sum, int n){
        if(n==0) return false;
        if(sum==0) return true;

        if(arr[n-1]>sum){
            return isSumPossible(arr, sum, n-1);
        }else{
            boolean skip = isSumPossible(arr, sum, n-1);
            boolean include = isSumPossible(arr, sum-arr[n-1], n-1);

            return skip || include;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,10};
        int n = arr.length;
        int sum = 11;

        //DP using Tabulation
        boolean[][] dp = new boolean[n+1][sum+1];
        for(int i=0;i<sum+1;i++) dp[0][i] = false;
        for(int i=0;i<n+1;i++) dp[i][0] = true;

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]>j){
                    dp[i][j] = dp[i-1][j];
                }
                else dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
            }
        }
        System.out.println(isSumPossible(arr, sum, n));
        System.out.println(dp[n][sum]);
    }
}