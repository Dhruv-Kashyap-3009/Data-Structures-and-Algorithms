//Recursion with memoization

import java.util.*;
class UniquePaths{
    public static int Unique(int r ,int c, int[][] dp){
        if(r<1 || c<1) return 0;
        if(r==1 && c==1){
            return 1;
        }
        if(dp[r][c]!=-1) return dp[r][c];

        return dp[r][c] = Unique(r, c-1, dp) + Unique(r-1, c, dp);     //Memoization
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m and n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int [][] dp = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j]=-1;
            }
        }

        System.out.println("No. of Unique Paths are: " + Unique(m,n, dp));
    }
}