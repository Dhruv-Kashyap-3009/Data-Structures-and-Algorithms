import java.util.Arrays;

public class LongestCommonSubsequence {
    //Recursion + Memoization
    public static int Subsequence(String s1, int m, String s2, int n, int[][] dp){
        if(m==0 || n==0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];

        if(s1.charAt(m-1)==s2.charAt(n-1)) return dp[m][n] = 1 + Subsequence(s1, m-1, s2, n-1, dp);
        return dp[m][n] = Math.max(Subsequence(s1, m, s2, n-1, dp), Subsequence(s1, m-1, s2, n, dp));
    }
    public static void main(String[] args) {
        String s1 = "abcdgh";
        int m = s1.length();
        String s2 = "abedfhr";
        int n = s2.length();

        int[][] dp = new int[m+1][n+1];
        for(int[] arr : dp) Arrays.fill(arr, -1);

        System.out.println(Subsequence(s1, m, s2, n, dp));

        //Tabulation
        int[][] t = new int[m+1][n+1];

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) t[i][j] = 1 + t[i-1][j-1];
                else t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }
        System.out.println(t[m][n]);
    }
}
