class Solution {
    public int minOperations(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        int ops = 0;

        for(int val : arr) {
            mp.put(val, mp.getOrDefault(val, 0) + 1);
        }

        for(int freq : mp.values()) {
            if(freq == 1) return -1;

            ops += freq / 3;

            if(freq % 3 != 0) {
                ops++;
            }
        }

        return ops;
    }
}