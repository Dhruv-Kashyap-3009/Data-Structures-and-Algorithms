//Recursion + Memoization

import java.util.*;
class Fibonacci{
    public static int Fibo(int n, int[] dp){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];

        int ans = Fibo(n-1, dp) + Fibo(n-2, dp);
        dp[n] = ans;     //Memoization
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int[] dp = new int[n+1];
        for(int i=0;i<n+1;i++) dp[i]=-1;

        System.out.println("Fibonacci is:"+Fibo(n,dp));
    }
}