import java.util.*;
class FibonacciUsingTabulation{
    public static int Fibo(int n){
        int[] dp = new int[n+1];
        if(n>0) dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];                          //Tabulation
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println("The Fibonacci number is: "+ Fibo(n));
    }
}