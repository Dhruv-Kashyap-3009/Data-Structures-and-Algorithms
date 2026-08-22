class Solution {
    public int elevatorRequests(int n, int[] arr) {
        int len = arr.length;

        int ans = arr[0];

        for(int i=1;i<len;i++){
            ans += Math.abs(arr[i]-arr[i-1]);
        }

        return ans;
    }
}