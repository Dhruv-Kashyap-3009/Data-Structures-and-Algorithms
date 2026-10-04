class Solution {

    Boolean[][][] dp;

    private boolean solve(String s, int i, int open, int close) {
        if (close > open) return false;
        if (i == s.length()) return open == close;
        if (dp[i][open][close] != null) return dp[i][open][close];

        char c = s.charAt(i);
        boolean ans;

        if (c == '(') ans = solve(s, i + 1, open + 1, close);
        else if (c == ')') ans = solve(s, i + 1, open, close + 1);
        else {
            boolean openTreated = solve(s, i + 1, open + 1, close);
            boolean closeTreated = solve(s, i + 1, open, close + 1);
            boolean nothingTreated = solve(s, i + 1, open, close);

            ans = openTreated || closeTreated || nothingTreated;
        }

        return dp[i][open][close] = ans;
    }

    public boolean checkValidString(String s) {
        int n = s.length();
        dp = new Boolean[n][n + 1][n + 1];

        return solve(s, 0, 0, 0);
    }
}