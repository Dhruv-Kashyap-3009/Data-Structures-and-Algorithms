class Solution {
    private boolean isVowel(char c){
        return c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    private void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public String reverseVowels(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();

        int i=0;
        int j=n-1;

        while(i<j){
            while(i<j && !isVowel(arr[i])) i++;
            while(i<j && !isVowel(arr[j])) j--;

            swap(arr, i, j);

            i++;
            j--;
        }

        return String.valueOf(arr);
    }
}