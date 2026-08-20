class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prepro=new int[n];
        int[] suffpro = new int[n];

        int pro=1;
        for(int i=0;i<n;i++){
            prepro[i]=pro;
            pro*=nums[i];
        }
        pro=1;
        for(int i=n-1;i>=0;i--){
            suffpro[i]=pro;
            pro*=nums[i];
        }
        
        for(int i=0;i<n;i++){
            nums[i]=suffpro[i]*prepro[i];
        }
        return nums;
    }
}