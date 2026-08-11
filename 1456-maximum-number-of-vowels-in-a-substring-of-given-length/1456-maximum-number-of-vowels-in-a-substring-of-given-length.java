class Solution {
    private boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int maxVowels(String s, int k) {
        int n = s.length();

        int count = 0;

        for(int i=0;i<k;i++) if(isVowel(s.charAt(i))) count++;

        int ans = count;

        for(int i=k;i<n;i++){
            count += (isVowel(s.charAt(i))?1:0) - (isVowel(s.charAt(i-k))?1:0);
            ans = Math.max(ans, count);
        }

        return ans;
    }
}