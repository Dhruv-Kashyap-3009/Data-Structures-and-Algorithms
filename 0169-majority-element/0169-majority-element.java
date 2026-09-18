class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ele = -1;

        for(int val : nums){
            if(ele==val) count++;
            else{
                if(count==0){
                    ele = val;
                    count = 1;
                }
                count--;
            }
        }


        return ele;
    }
}