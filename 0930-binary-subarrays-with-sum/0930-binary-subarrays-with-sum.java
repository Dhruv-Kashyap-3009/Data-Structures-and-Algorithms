class Solution {
    private int subarrayCount(int[] arr, int k){
        int n = arr.length;

        if (k < 0) return 0;

        int l = 0;
        int count = 0;
        int sum = 0;

        for(int r=0;r<n;r++){
            sum+= arr[r];

            while(sum>k){
                sum-= arr[l];
                l++;
            }
            count += r-l+1;
        }

        return count;
    }
    public int numSubarraysWithSum(int[] arr, int k) {
        return subarrayCount(arr, k) - subarrayCount(arr, k-1);
    }
}