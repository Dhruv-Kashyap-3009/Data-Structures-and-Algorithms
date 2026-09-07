class Solution {
    public int distinctSubseqII(String s) {
        int n = s.length();
        int MOD = (int) 1e9 + 7;

        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int result = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i] = (int) ((dp[i] + (long) dp[j]) % MOD);
                }
            }

            result = (int) ((result + (long) dp[i]) % MOD);
        }

        return result;
    }
}