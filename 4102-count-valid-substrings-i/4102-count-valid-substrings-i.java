class Solution {
    public long countValidSubstrings(String s) {
        long ans = 0;
        int n = s.length();

        int l = 0;
        for(int r=0;r<n;r++){
            if(r>=2 && s.substring(r-2, r+1).equals("abc")) l=Math.max(l, r-1);
            
            ans += r-l+1;
        }

        return ans;
    }
}