class Solution {
    public int waysToSplitArray(int[] arr) {
        int n = arr.length;
        long total = 0;

        for(int val : arr) total += val;

        int count = 0;
        long sum = 0;

        for(int i=0;i<n-1;i++){
            sum += arr[i];

            long left = total - sum;

            if(sum >= left) count++;
        }
        return count;
    }
}