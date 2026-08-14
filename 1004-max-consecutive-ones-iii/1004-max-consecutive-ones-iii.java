class Solution {
    public int longestOnes(int[] arr, int k) {
        int n = arr.length;

        int l=0;
        int count = 0;
        int maxLen = 0;

        for(int r=0;r<n;r++){
            if(arr[r]==0) count++;

            while(count>k){
                if(arr[l]==0){
                    count--;
                }
                l++;
            }

            maxLen = Math.max(maxLen, r-l+1);
        }

        return maxLen;
    }
}