class Solution {
    private int k;
    private int size;
    private long[] H;
    private int[] prod;

    private void pull(int i) {
        int lc = 2 * i;
        int rc = lc + 1;
        int lp = prod[lc];

        int bi = i * k;
        int bl = lc * k;
        int br = rc * k;

        for (int q = 0; q < k; q++) {
            H[bi + q] = H[bl + q];
        }

        for (int q = 0; q < k; q++) {
            long c = H[br + q];

            if (c != 0) {
                H[bi + (lp * q) % k] += c;
            }
        }

        prod[i] = lp * prod[rc] % k;
    }

    private void update(int idx, int val) {
        int nd = size + idx;
        int base = nd * k;

        for (int q = 0; q < k; q++) {
            H[base + q] = 0;
        }

        int v = val % k;

        H[base + v] = 1;
        prod[nd] = v;

        int cur = nd >> 1;

        while (cur > 0) {
            pull(cur);
            cur >>= 1;
        }
    }

    public int[] resultArray(int[] nums, int k, int[][] queries) {
        this.k = k;

        int n = nums.length;

        size = 1;
        while (size < n) {
            size <<= 1;
        }

        H = new long[2 * size * k];
        prod = new int[2 * size];

        for (int i = 0; i < prod.length; i++) {
            prod[i] = 1 % k;
        }

        for (int i = 0; i < n; i++) {
            int v = nums[i] % k;
            int nd = size + i;

            H[nd * k + v] = 1;
            prod[nd] = v;
        }

        for (int i = size - 1; i >= 1; i--) {
            pull(i);
        }

        int[] ans = new int[queries.length];

        for (int qi = 0; qi < queries.length; qi++) {
            int idx = queries[qi][0];
            int val = queries[qi][1];
            int start = queries[qi][2];
            int x = queries[qi][3];

            update(idx, val);

            int l = start + size;
            int r = n + size;

            int[] ln = new int[64];
            int[] rn = new int[64];

            int lnSize = 0;
            int rnSize = 0;

            while (l < r) {
                if ((l & 1) != 0) {
                    ln[lnSize++] = l++;
                }

                if ((r & 1) != 0) {
                    rn[rnSize++] = --r;
                }

                l >>= 1;
                r >>= 1;
            }

            long[] res = new long[k];
            int p = 1 % k;

            for (int i = 0; i < lnSize; i++) {
                int node = ln[i];
                int base = node * k;

                for (int q = 0; q < k; q++) {
                    long c = H[base + q];

                    if (c != 0) {
                        res[(p * q) % k] += c;
                    }
                }

                p = p * prod[node] % k;
            }

            for (int i = rnSize - 1; i >= 0; i--) {
                int node = rn[i];
                int base = node * k;

                for (int q = 0; q < k; q++) {
                    long c = H[base + q];

                    if (c != 0) {
                        res[(p * q) % k] += c;
                    }
                }

                p = p * prod[node] % k;
            }

            ans[qi] = (int)res[x];
        }

        return ans;
    }
}