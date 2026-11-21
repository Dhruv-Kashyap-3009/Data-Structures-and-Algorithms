class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int[] diff = new int[n];

        for(int i=0;i<n;i++) diff[i] = Math.abs(s.charAt(i) - t.charAt(i));

        int l = 0;
        int sum = 0;
        int maxLen = 0;

        for(int r=0;r<n;r++){
            sum += diff[r];

            while(l<r && sum > maxCost){
                sum -= diff[l];
                l++;
            }

            if(sum<=maxCost) maxLen = Math.max(maxLen, r-l+1);
        }

        return maxLen;
    }
}