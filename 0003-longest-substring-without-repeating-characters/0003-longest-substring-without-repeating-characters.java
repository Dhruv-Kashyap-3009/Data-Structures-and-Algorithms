class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int maxLen = 0;
        int l = 0;
        int r = 0;
        Map<Character, Integer> mp = new HashMap<>();

        while(l <= r && r < n){
            if(!mp.containsKey(s.charAt(r)) || mp.get(s.charAt(r))<l){
                mp.put(s.charAt(r), r);
                maxLen = Math.max(maxLen, r-l+1);
                r++;
            }
            else{
                l = mp.get(s.charAt(r))+1;
            }
        }

        return maxLen;
    }
}