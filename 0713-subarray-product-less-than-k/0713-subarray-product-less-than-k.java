class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int n = arr.length;

        int l = 0;
        int count = 0;
        int pro = 1;

        for(int r=0;r<n;r++){
            pro *= arr[r];

            while(l<n && pro >= k){
                pro/=arr[l];
                l++;
            }

            count += r-l+1; 
        }

        return count;
    }
}