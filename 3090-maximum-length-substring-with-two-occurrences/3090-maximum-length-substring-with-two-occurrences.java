class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();

        int l = 0;
        int maxLen = 0;
        Map<Character, Integer> mp = new HashMap<>();

        for(int r=0;r<n;r++){
            mp.put(s.charAt(r), mp.getOrDefault(s.charAt(r), 0)+1);
            
            while(mp.containsKey(s.charAt(r)) && mp.get(s.charAt(r))>2){
                mp.put(s.charAt(l), mp.get(s.charAt(l))-1);
                if(mp.get(s.charAt(l))==0) mp.remove(s.charAt(l));
                l++;
            }

            maxLen = Math.max(maxLen, r-l+1);
        }

        return maxLen;
    }
}