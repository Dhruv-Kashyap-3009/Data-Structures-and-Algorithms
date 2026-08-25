class Solution {
    public int missingMultiple(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();

        for(int val : arr) set.add(val);

        int i=1;

        while(set.contains(k*i)) i++;

        return k*i;
    }
}