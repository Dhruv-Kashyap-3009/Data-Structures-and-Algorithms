class Solution {
    private static final long MOD = 1_000_000_007L;
    private long[][] C;

    private long ways(List<Integer> a) {
        int n = a.size();
        if (n <= 2) return 1;
        List<Integer> l = new ArrayList<>(), r = new ArrayList<>();
        int root = a.get(0);
        for (int i = 1; i < n; i++) {
            if (a.get(i) < root) l.add(a.get(i));
            else r.add(a.get(i));
        }
        return C[n - 1][l.size()] * ways(l) % MOD * ways(r) % MOD;
    }

    public int numOfWays(int[] nums) {
        int n = nums.length;
        C = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            C[i][0] = 1;
            for (int j = 1; j <= i; j++)
                C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % MOD;
        }
        List<Integer> list = new ArrayList<>();
        for (int x : nums) list.add(x);
        return (int) ((ways(list) - 1 + MOD) % MOD);
    }
}