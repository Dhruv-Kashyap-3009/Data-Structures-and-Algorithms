class EqualSumPartitionSubset{
    public static void main(String[] args) {
        int[] arr = {1,5,11,9};
        int n = arr.length;

        int sum = 0;
        for(int val : arr) sum+=val;
        if(sum%2!=0){
            System.out.println(false);
            return;
        }else{
            int s = sum/2;

            //Subset Sum Problem with sum as s
            boolean[][] dp = new boolean[n+1][s+1];
            for(int i=0;i<n+1;i++) dp[i][0] = true;

            for(int i=1;i<n+1;i++){
                for(int j=1;j<s+1;j++){
                    if(arr[i-1]>j) dp[i][j] = dp[i-1][j];
                    else dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
            }
            System.out.println(dp[n][s]);
        }
    }
}