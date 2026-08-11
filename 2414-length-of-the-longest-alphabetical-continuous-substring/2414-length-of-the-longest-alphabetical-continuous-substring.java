class Solution {
    public int longestContinuousSubstring(String s) {
        int n = s.length();

        int i=0;
        int j=1;
        int maxLen = 1;

        while(j<n){
            if(s.charAt(j)==s.charAt(j-1)+1){
                maxLen = Math.max(maxLen, j-i+1);
                j++;
            }else{
                i = j;
                j++;
            }
        }

        return maxLen;
    }
}