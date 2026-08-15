class Solution {
    private int countSubarray(int[] arr, int k){
        int n = arr.length;

        int l = 0;
        int count = 0;
        int countOdd = 0;

        for(int r = 0; r<n ; r++){
            if(arr[r]%2==1) countOdd++;

            while(countOdd>k){
                if(arr[l]%2==1) countOdd--;
                l++;
            }
            count+= r-l+1;
        }

        return count;
    }
    public int numberOfSubarrays(int[] arr, int k) {
        return countSubarray(arr, k) - countSubarray(arr, k-1);
    }
}