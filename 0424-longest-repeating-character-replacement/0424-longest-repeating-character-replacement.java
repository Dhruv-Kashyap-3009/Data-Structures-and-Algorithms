class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();

        int l = 0;
        int maxLen = 0;
        int maxFreq = 0;
        Map<Character, Integer> mp = new HashMap<>();

        for(int r=0 ; r<n ; r++){
            mp.put(s.charAt(r), mp.getOrDefault(s.charAt(r), 0) + 1);
            maxFreq = Math.max(maxFreq, mp.get(s.charAt(r)));

            while(r-l+1-maxFreq>k){
                char left = s.charAt(l);
                mp.put(left, mp.get(left) - 1);
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
        }

        return maxLen;
    }
}