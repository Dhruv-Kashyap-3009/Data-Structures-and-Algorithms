public class ShortestCommonSupersequence{
    //Length of SCS = m + n + length of LongestCommonSubsequence
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        int m = s1.length();
        String s2 = "GXTXAYB";
        int n = s2.length();

        int[][] t = new int[m+1][n+1];

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) t[i][j] = 1 + t[i-1][j-1];
                else t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }

        System.out.println(m+n-t[m][n]);
    }
}