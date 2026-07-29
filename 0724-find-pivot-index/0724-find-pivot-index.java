class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;

        int[] prefSum = new int[n];
        int[] suffSum = new int[n];

        for(int i=0;i<n;i++){
            prefSum[i] = i==0?arr[i]:arr[i]+prefSum[i-1];
            suffSum[n-i-1] = n-i-1==n-1?arr[n-i-1]:arr[n-i-1]+suffSum[n-i];
        }

        for(int i=0;i<n;i++){
            int pref = i==0?0:prefSum[i-1];
            int next = i==n-1?0:suffSum[i+1];

            if(pref==next) return i;
        }

        return -1;
    }
}