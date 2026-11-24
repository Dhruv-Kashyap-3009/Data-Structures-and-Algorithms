
class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length, ans = 0;

        for (int l = 0; l < n; l++) {
            long g = nums[l], lc = nums[l];
            double inv = 1.0 / nums[l];

            for (int r = l; r < n; r++) {
                if (r > l) {
                    g = gcd(g, nums[r]);
                    lc = lc / gcd(lc, nums[r]) * nums[r];
                    inv /= nums[r];
                }

                if (g * (double) lc * inv > 0.99999999)
                    ans = Math.max(ans, r - l + 1);
            }
        }

        return ans;
    }

    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}