class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();

        for(int val : arr){
            set.add(val);
            max = Math.max(max, val);
            min = Math.min(min, val);
        }

        List<Integer> ans = new ArrayList<>();

        for(int i=min+1;i<max;i++){
            if(!set.contains(i)) ans.add(i);
        }

        return ans;
    }
}