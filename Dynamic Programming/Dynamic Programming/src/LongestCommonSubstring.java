public class LongestCommonSubstring {
    public static void main(String[] args) {
        String a = "abcde";
        int m = a.length();
        String b = "abfce";
        int n = b.length();

        int[][] t = new int[m+1][n+1];
        int max = 0;

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    t[i][j] =  1 + t[i-1][j-1];
                    max = Math.max(max, t[i][j]);
                }
                else t[i][j] = 0;
            }
        }

        System.out.println(max);
    }
}
