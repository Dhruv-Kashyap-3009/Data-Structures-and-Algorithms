public class CoinChange1 {
    public static void main(String[] args) {
        int[] arr = {25, 10, 5};
        int n = arr.length;
        int s = 30;

        int[][] t = new int[n+1][s+1];

        for(int i=0;i<n+1;i++) t[i][0] = 1;

        for(int i=1;i<n+1;i++){
            for(int j=1;j<s+1;j++){
                if(j>= arr[i-1]) t[i][j] = t[i-1][j] + t[i][j-arr[i-1]];
                else t[i][j] = t[i-1][j];
            }
        }

        System.out.println(t[n][s]);
    }
}
