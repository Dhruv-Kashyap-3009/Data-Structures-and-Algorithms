class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int max = 0;
        int smax = 0;

        for(int num : nums){
            if(num>max){
                smax = max;
                max = num;
            }
            else if(num>smax){
                smax = num;
            }
        }

        return ((max-1)*(smax-1));
    }
}