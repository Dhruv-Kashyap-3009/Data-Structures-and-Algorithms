class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        
        int maxProfit = 0;
        int minValue = arr[0];

        for(int i=1;i<n;i++){
            maxProfit = Math.max(maxProfit, arr[i] - minValue);
            minValue = Math.min(minValue, arr[i]);
        }

        return maxProfit;
    }
}