class Solution {
    public int minOperations(int[] arr) {
        int n = arr.length;

        int ops = 0;

        for(int i=0;i<n-2;i++){
            if(arr[i]!=1){
                ops++;
                arr[i] = 1;
                arr[i+1] = (arr[i+1]+1)%2;
                arr[i+2] = (arr[i+2]+1)%2;
            }
        }

        if(arr[n-2]!=1 || arr[n-1]!=1) return -1;

        return ops;
    }
}