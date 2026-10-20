class Solution {
    private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
    private int countVowel(String s, int start, int end){
        int count = 0;

        for(int i=start;i<end;i++){
            if(isVowel(s.charAt(i))) count++;
        }

        return count;
    }
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int count1 = countVowel(s, 0, n/2);
        int count2 = countVowel(s, n/2, n);

        return count1==count2;
    }
}