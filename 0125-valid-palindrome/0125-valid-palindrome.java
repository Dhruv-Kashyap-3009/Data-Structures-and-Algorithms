class Solution {
    private boolean isPalin(String s){
        for(int i=0, j=s.length()-1;i<j;i++, j--){
            if(s.charAt(i)!=s.charAt(j)) return false;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(Character.isLetter(c) || Character.isDigit(c)) sb.append(c);

        }
        s = sb.toString().toLowerCase();
        return isPalin(s);
    }
}