class Solution {
    private boolean compare(String ans, String curr) {
        if (ans.equals("")) return true;
        if (curr.length() < ans.length()) return true;
        if (curr.length() == ans.length() && curr.compareTo(ans) < 0) return true;
        return false;
    }
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();

        int l = 0;
        int one = 0;
        String ans = "";

        for(int r=0;r<n;r++){
            if(s.charAt(r)=='1') one++;

            while(one>k){
                if(s.charAt(l)=='1') one--;
                l++;
            }

            while (one == k && s.charAt(l) == '0') l++;

            if (one == k) {
                String curr = s.substring(l, r + 1);
                if (compare(ans, curr)) {
                    ans = curr;
                }
            }
        }

        return ans;
    }
}