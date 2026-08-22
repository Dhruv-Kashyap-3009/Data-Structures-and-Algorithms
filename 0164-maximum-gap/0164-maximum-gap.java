class Solution {
    public int maximumGap(int[] arr) {
        int n = arr.length;

        if(n==1) return 0;
        Arrays.sort(arr);

        int max = 0;
        for(int i=0;i<n-1;i++){
            max = Math.max(max, arr[i+1]-arr[i]);
        }

        return max;
    }
}