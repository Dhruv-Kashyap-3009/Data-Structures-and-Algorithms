class Solution {
    public int findLengthOfLCIS(int[] arr) {
        int n = arr.length;

        if(n==1) return 1;

        int l = 0;
        int maxLen = 0;

        for(int r=1;r<n;r++){
            if(arr[r]<=arr[r-1]){
                l = r;
            }
            maxLen = Math.max(maxLen, r-l+1);
        }

        return maxLen;
    }
}