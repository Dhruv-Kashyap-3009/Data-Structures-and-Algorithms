class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n = arr.length;

        int l = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for(int r = 0;r<n;r++){
            sum+= arr[r];


            while(sum>=target){
                minLen = Math.min(minLen, r-l+1);
                sum -= arr[l];
                l++;
            }
        }

        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}