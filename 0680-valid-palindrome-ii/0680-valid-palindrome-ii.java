class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();

        int i = 0;
        int j = n - 1;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s.substring(i + 1, j + 1)) ||
                       isPalindrome(s.substring(i, j));
            }

            i++;
            j--;
        }

        return true;
    }

    private boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
}