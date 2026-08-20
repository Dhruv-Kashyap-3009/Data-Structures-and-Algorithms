class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            sum+= arr[i];

            maxSum = Math.max(sum, maxSum);

            if(sum<0) sum=0;
        }

        return maxSum;
    }
}