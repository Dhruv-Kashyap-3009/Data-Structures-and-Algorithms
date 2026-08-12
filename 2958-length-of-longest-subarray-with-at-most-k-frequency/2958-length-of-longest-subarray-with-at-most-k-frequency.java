class Solution {
    public int maxSubarrayLength(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();

        int i = 0;
        int j = 0;
        int maxLen = 0;

        while (j < n) {
            int val = arr[j];
            mp.put(val, mp.getOrDefault(val, 0) + 1);

            if (mp.get(val) <= k) {
                maxLen = Math.max(maxLen, j - i + 1);
                j++;
            } else {
                while (i < j && mp.get(val) > k) {
                    int remove = arr[i];
                    mp.put(remove, mp.get(remove) - 1);
                    i++;
                }
                maxLen = Math.max(maxLen, j - i + 1);
                j++;
            }
        }

        return maxLen;
    }
}