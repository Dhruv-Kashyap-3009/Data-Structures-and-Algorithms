class Solution {
    public int longestSubarray(int[] arr) {
        int n = arr.length;

        int l=0;
        int count = 0;
        int maxLen = 0;

        for(int r=0;r<n;r++){
            if(arr[r]==0) count++;

            while(count>1){
                if(arr[l]==0) count--;
                l++;
            }
            maxLen = Math.max(maxLen, r-l);
        }

        return maxLen;
    }
}