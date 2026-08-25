class Solution {

    private Boolean[][] dp;

    private boolean checkMatch(String s, String p, int i, int j) {
        if (i == s.length() && j == p.length()) return true;
        if (j == p.length()) return false;

        if (i == s.length()) {
            while (j < p.length()) {
                if (p.charAt(j) != '*') {
                    return false;
                }
                j++;
            }
            return true;
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        char pc = p.charAt(j);

        if (pc == '?') {
            dp[i][j] = checkMatch(s, p, i + 1, j + 1);
        }

        else if (pc == '*') {
            dp[i][j] = checkMatch(s, p, i + 1, j) || checkMatch(s, p, i, j + 1);
        }

        else {
            if (s.charAt(i) == pc) {
                dp[i][j] = checkMatch(s, p, i + 1, j + 1);
            } else {
                dp[i][j] = false;
            }
        }

        return dp[i][j];
    }

    public boolean isMatch(String s, String p) {
        dp = new Boolean[s.length()][p.length()];
        return checkMatch(s, p, 0, 0);
    }
}