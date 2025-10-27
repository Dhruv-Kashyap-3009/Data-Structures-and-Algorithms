public class MinimumSubsetSumDifference {
    public static void SubsetSum(int[] arr, boolean[][] dp){
        int n = dp.length;
        int s = dp[0].length;

        for(int i=0;i<n;i++) dp[i][0] = true;

        for(int i=1;i<n;i++){
            for(int j=1;j<s;j++){
                if(arr[i-1]>j) dp[i][j] = dp[i-1][j];
                else dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,7};
        int n=arr.length;
        int sum = 0;
        for(int val : arr) sum+=val;

        boolean[][] dp = new boolean[n+1][sum+1];
        SubsetSum(arr, dp);

        int min = Integer.MAX_VALUE;

        for(int i=0;i<(sum+1)/2;i++){
            if(dp[n][i]) min = Math.min(min, sum-2*i);
        }

        System.out.println(min);
    }
}
