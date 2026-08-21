class Solution {
    long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    public long findKthSmallest(int[] coins, int k) {
        int n = coins.length;

        List<long[]> subsets = new ArrayList<>();

        for (int mask = 1; mask < (1 << n); ++mask) {
            long curLcm = 1;
            int bits = 0;

            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) != 0) {
                    ++bits;
                    curLcm = lcm(curLcm, coins[i]);
                }
            }

            subsets.add(new long[]{
                curLcm,
                (bits & 1) == 1 ? 1 : -1
            });
        }

        long left = 1;
        long minCoin = Integer.MAX_VALUE;

        for (int coin : coins)
            minCoin = Math.min(minCoin, coin);

        long right = minCoin * (long) k;

        while (left < right) {
            long mid = left + (right - left) / 2;

            long total = 0;

            for (long[] sub : subsets) {
                if (sub[0] <= mid)
                    total += sub[1] * (mid / sub[0]);
            }

            if (total >= k)
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }
}