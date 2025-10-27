public class SequencePatternMatching{
    //Check if s1 is a subsequence of s2
    public static void main(String[] args) {
        String s1 = "AXY";
        String s2 = "ADXCPY";
        int m = s2.length();
        int n = s1.length();

        int[][] t = new int[m+1][n+1];

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s2.charAt(i-1)==s1.charAt(j-1)) t[i][j] = 1 + t[i-1][j-1];
                else t[i][j] = Math.max(t[i][j-1], t[i-1][j]);
            }
        }
        System.out.println(n==t[m][n]);
    }
}