class Solution {
    private String reverseInvert(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0') sb.append('1');
            else sb.append('0');
        }

        return sb.reverse().toString();
    }
    private String getString(int n, int k){
        if(n==1) return "0";
        
        StringBuilder sb = new StringBuilder();
        String prev = getString(n-1, k);

        if(prev.length()>=k) return prev;

        sb.append(prev).append('1').append(reverseInvert(prev));

        return sb.toString();
    }
    public char findKthBit(int n, int k) {
        String s = getString(n, k);

        return s.charAt(k-1);
    }
}