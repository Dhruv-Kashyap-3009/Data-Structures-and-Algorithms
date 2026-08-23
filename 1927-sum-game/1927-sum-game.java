class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int diff = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean firstHalf = i < n / 2;

            if (num.charAt(i) == '?') {
                count += firstHalf ? 1 : -1;
            } else {
                int digit = num.charAt(i) - '0';
                diff += firstHalf ? digit : -digit;
            }
        }

        return 2 * diff != -9 * count;
    }
}