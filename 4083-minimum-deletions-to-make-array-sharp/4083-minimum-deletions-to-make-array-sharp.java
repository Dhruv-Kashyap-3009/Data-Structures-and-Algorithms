class Solution {
    public int minDeletions(int[] arr) {
        int n = arr.length;
        int count = 0;

        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]) count++;
        }

        return count;
    }
}