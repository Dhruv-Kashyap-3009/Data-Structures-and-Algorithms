class Solution {
    public int trap(int[] arr) {
        int n = arr.length;

        int l = 0;
        int r = n-1;
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        int water = 0;

        while(l<r){
            if(arr[l]<arr[r]){
                leftMax = Math.max(leftMax, arr[l]);
                water += leftMax - arr[l];
                l++;
            }else{
                rightMax = Math.max(rightMax, arr[r]);
                water += rightMax - arr[r];
                r--;
            }
        }

        return water;
    }
}