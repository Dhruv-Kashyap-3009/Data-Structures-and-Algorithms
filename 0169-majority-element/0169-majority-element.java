class Solution {
    public int majorityElement(int[] arr) {
        int count = 0;
        int ele = -1;

        for(int val: arr){
            if(val==ele) count++;
            else {
                count--;

                if(count<=0){
                    ele = val;
                    count = 1;
                }
            }
        }

        return ele;
    }
}