class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;

        int max = arr[0];
        int min = arr[0];
        int ans = arr[0];

        for(int i=1;i<n;i++){
            int a = arr[i]*max;
            int b = arr[i]*min;

            max = Math.max(arr[i], Math.max(a, b));
            min = Math.min(arr[i], Math.min(a, b));

            ans = Math.max(ans, max);
        }
        return ans;
    }
}