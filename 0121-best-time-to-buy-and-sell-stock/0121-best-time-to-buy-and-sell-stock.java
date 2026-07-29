class Solution {
    public int maxProfit(int[] arr) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int val : arr){
            maxProfit = Math.max(maxProfit, val-minPrice);
            minPrice = Math.min(minPrice, val);
        }

        return maxProfit;
    }
}