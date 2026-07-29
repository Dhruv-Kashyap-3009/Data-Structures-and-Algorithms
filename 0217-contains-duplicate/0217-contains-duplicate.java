class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int val : nums){
            if(set.contains(val)) return true;
            set.add(val);
        }

        return false;
    }
}