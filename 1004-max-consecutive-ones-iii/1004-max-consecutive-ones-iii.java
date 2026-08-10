class Solution {
    public int longestOnes(int[] arr, int k) {
        int n = arr.length;

        int i = 0;
        int j = 0;
        int maxLen = 0;

        while(j<n){
            if(arr[j]==1){
                maxLen = Math.max(maxLen, j-i+1);
                j++;
            }else{
                if(k>0){
                    k--;
                    maxLen = Math.max(maxLen, j-i+1);
                    j++;
                }else{
                    if(arr[i]==0) k++;
                    i++;
                }
            }
        }

        return maxLen;
    }
}