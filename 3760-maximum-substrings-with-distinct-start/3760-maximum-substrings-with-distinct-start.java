class Solution {
    public int maxDistinct(String s) {
        Map<Character, Integer> mp = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        return mp.size();
    }
}