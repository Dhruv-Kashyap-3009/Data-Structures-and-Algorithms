class Solution {
    public int removeElement(int[] arr, int val) {
        int n = arr.length;

        int i=0;

        for(int j=0;j<n;j++){
            if(arr[j]!=val){
                arr[i] = arr[j];
                i++;
            }
        }

        return i;
    }
}