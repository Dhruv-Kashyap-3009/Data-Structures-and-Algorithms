class Solution {
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 0;

        while(j<n){
            if(arr[i]==0){
                if(arr[j]!=0) swap(arr, i, j);
                else j++;
            }else{
                i++;
                j++;
            }
        }
    }
}