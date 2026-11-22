class Solution {
    public boolean checkString(String s) {
        int n = s.length();

        for(int i=1;i<n;i++){
            if(s.charAt(i-1)=='b' && s.charAt(i)=='a') return false;
        }

        return true;
    }
}