public class LongestPalindromicSubsequence{
    public static void main(String[] args) {
        String a = "agbcba";
        int m = a.length();
        String b ="";

        for(int i=m-1;i>=0;i--) b = b + a.charAt(i);
        int[][] t = new int[m+1][m+1];

        for(int i=1;i<m+1;i++){
            for(int j=1;j<m+1;j++){
                if(a.charAt(i-1)==b.charAt(j-1)) t[i][j] = 1+t[i-1][j-1];
                else t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }

        //LongestPalindromicSubsequence = LCS(a, reverse(a))
        System.out.println(t[m][m]);
    }
}