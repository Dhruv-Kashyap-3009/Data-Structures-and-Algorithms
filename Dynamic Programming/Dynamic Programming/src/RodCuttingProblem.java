public class RodCuttingProblem {
    public static void main(String[] args) {
        int[] length = {1,2,3,4};
        int[] price = {1,4,6,7};
        int N = 4;

        int[][] t = new int[length.length+1][N+1];

        for(int i=1;i<length.length+1;i++){
            for(int j=1;j<N+1;j++){
                if(j<length[i-1]) t[i][j] = t[i-1][j];
                else t[i][j] = Math.max(t[i-1][j], price[i-1]+t[i][j-length[i-1]]);
            }
        }

        System.out.println(t[length.length-1][N]);
    }
}
