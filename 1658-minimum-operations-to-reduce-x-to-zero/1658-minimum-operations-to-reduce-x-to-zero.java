class Solution {
    public int minOperations(int[] arr, int x) {
        int n = arr.length;
        int sumArray = 0;

        for(int val : arr) sumArray+= val;

        int k = sumArray - x;

        int l = 0;
        int maxLen = Integer.MIN_VALUE;
        int sum = 0;

        for(int r=0;r<n;r++){
            sum += arr[r];

            while(l<=r && sum>k){
                sum -= arr[l];
                l++;
            }

            if(sum==k) maxLen = Math.max(maxLen, r-l+1);
        }

        return maxLen==Integer.MIN_VALUE?-1:n - maxLen;
    }
}