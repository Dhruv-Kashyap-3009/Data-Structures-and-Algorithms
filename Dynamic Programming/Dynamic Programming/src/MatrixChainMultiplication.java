import java.util.Arrays;

public class MatrixChainMultiplication{
    private static int MCM(int[] arr, int i, int j, int[][] dp){
        if(i==j) return 0;

        int min = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int cost = MCM(arr, i, k, dp) + MCM(arr, k+1, j, dp) + arr[i-1]*arr[k]*arr[j];

            min = Math.min(min, cost);
        }

        return min;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 3};
        int n = arr.length;
        int[][] dp = new int[n][n];
        for(int[] a : dp) Arrays.fill(a, -1);

        System.out.println(MCM(arr, 1, arr.length-1, dp));
    }
}