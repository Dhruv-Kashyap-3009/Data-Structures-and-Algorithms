class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;

        int i=0;
        int j=0;

        while(j<n){
            arr[i] = arr[j];
            while(j<n && arr[i]==arr[j]) j++;
            i++;
        }

        return i;
    }
}