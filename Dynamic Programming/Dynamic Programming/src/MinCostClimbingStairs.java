//Recursion using Memoization

import java.util.*;
class MinCostClimbingStairs {
    public static int MinCost(int[] arr, int idx, int[] dp){
        if(idx>=arr.length) return 0;
        if(dp[idx]!=-1) return dp[idx];          //Memoization

        int jump1 = arr[idx] + MinCost(arr,idx+1, dp);
        int jump2 = arr[idx] + MinCost(arr, idx+2, dp);

        return dp[idx] = Math.min(jump1,jump2);      //first put the value ion dp[idx] and then return it.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,100,1,1,1,100,1,1,100,1};
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);

        System.out.println("Minimum Cost: " + Math.min(MinCost(arr, 0, dp),MinCost(arr, 1, dp)));
    }
}