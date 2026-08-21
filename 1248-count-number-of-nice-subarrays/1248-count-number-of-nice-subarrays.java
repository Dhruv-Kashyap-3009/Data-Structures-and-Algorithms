class Solution {
    private int countSubarray(int[] arr, int k){
        int n = arr.length;

        int l=0;
        int count = 0;
        int odd = 0;

        for(int r=0;r<n;r++){
            if(arr[r]%2==1) odd++;

            while(odd>k){
                if(arr[l]%2!=0) odd--;
                l++;
            }

            count += r-l+1;
        }

        return count;
    }
    public int numberOfSubarrays(int[] arr, int k) {
        return countSubarray(arr, k) - countSubarray(arr, k-1);
    }
}