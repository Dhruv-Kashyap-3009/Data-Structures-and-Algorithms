class Solution {
    private int findLength(String s, int k, char c){
        int n = s.length();

        int l = 0;
        int count = 0;
        int maxLen = 0;

        for(int r=0;r<n;r++){
            if(s.charAt(r)==c) count++;

            while(count>k){
                if(s.charAt(l)==c) count--;
                l++;
            }

            maxLen = Math.max(maxLen, r-l+1);
        }

        return maxLen;
    }
    public int maxConsecutiveAnswers(String s, int k) {
        return Math.max(findLength(s, k, 'T'), findLength(s, k, 'F'));
    }
}