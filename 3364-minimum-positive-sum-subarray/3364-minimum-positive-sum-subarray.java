class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size(), best = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = i; j < Math.min(i + r, n); j++) {
                s += nums.get(j);
                if (j - i + 1 >= l && 0 < s && s < best)
                    best = s;
            }
        }
        return best == Integer.MAX_VALUE ? -1 : best;
    }
}