class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int even =0;
        int odd = n-1;

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                ans[even++] = arr[i];
            }else{
                ans[odd--] = arr[i];
            }
        }

        return ans;
    }
}