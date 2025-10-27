import java.util.Arrays;

public class PalindromePartitioning{
    public static boolean isPalindrome(String s, int a, int b){
        if(s.length()==1) return true;

        for(int i=a, j=b;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)) return false;
        }
        return true;
    }
    public static int Partition(String s, int i, int j, int[][] dp){
        if(i>=j) return 0;
        if(isPalindrome(s, i, j)) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        int min = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp = 1 + Partition(s, i, k, dp) + Partition(s, k+1, j, dp);

            min = Math.min(min, temp);
        }

        return dp[i][j] = min;
    }
    public static void main(String[] args) {
        String s = "abcde";
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int[] a : dp) Arrays.fill(a, -1);

        System.out.println(Partition(s, 0, n-1, dp));
    }
}