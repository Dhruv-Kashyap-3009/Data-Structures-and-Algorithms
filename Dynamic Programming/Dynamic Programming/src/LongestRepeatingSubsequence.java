public class LongestRepeatingSubsequence{
    public static void main(String[] args) {
        String s1 = "AABEBCDD";
        int n = s1.length();
        String s2 = s1;

        int[][] t = new int[n+1][n+1];

        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1) && i!=j) t[i][j] = 1 + t[i-1][j-1];
                else t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }

        System.out.println(t[n][n]);
        // Output:- ABD
    }
}