class Solution {
    public int minimumRecolors(String s, int k) {
        int n = s.length();
        int count = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<k;i++){
            if(s.charAt(i)=='W') count++;
        }

        min = Math.min(min, count);

        for(int i=k;i<n;i++){
            count+= (s.charAt(i)=='W'?1:0) - (s.charAt(i-k)=='W'?1:0);
            min = Math.min(min, count);
        }

        return min;
    }
}