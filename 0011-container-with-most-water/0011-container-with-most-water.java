class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;

        int i=0;
        int j=n-1;
        int maxWater = 0;

        while(i<j){
            int water = Math.min(arr[i], arr[j]) * (j-i);
            maxWater = Math.max(maxWater, water);

            if(arr[i]<arr[j]) i++;
            else j--;
        }

        return maxWater;
    }
}