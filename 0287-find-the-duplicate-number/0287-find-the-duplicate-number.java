class Solution {
    public int findDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for(int val : arr){
            if(set.contains(val)) return val;

            set.add(val);
        }

        return -1;
    }
}