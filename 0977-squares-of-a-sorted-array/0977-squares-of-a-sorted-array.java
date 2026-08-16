class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int i=0;
        int j=n-1;
        int idx=n-1;

        while(i<=j){
            int val1=(int)Math.pow(arr[i], 2);
            int val2=(int)Math.pow(arr[j], 2);

            if(val1>val2){
                ans[idx--] = val1;
                i++;
            }else{
                ans[idx--] = val2;
                j--;
            }
        }

        return ans;
    }
}