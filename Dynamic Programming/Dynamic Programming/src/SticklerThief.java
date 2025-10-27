//Recursion + Memoization

import java.util.*;
class SticklerThief{
    public static int MaxLoot(int[] arr, int idx, int[] dp){
        if(idx>=arr.length) return 0;
        if(dp[idx]!=-1) return dp[idx];

        int steal = arr[idx] + MaxLoot(arr, idx+2, dp);
        int skip = MaxLoot(arr, idx+1, dp);

        dp[idx] = Math.max(steal, skip);       //Memoization
        return dp[idx];
    }
    public static void main(String[] args) {
        int[] arr = {6,5,5,7,4};
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);

        System.out.println(MaxLoot(arr, 0, dp));
    }
}