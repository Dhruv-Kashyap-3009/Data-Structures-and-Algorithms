public class PrintLongestCommonSubsequence{
    public static void main(String[] args) {
        String s1 = "abcdgh";
        int m = s1.length();
        String s2 = "abedfhr";
        int n = s2.length();

        int[][] t = new int[m+1][n+1];

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) t[i][j] = 1 + t[i-1][j-1];
                else t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }

        int i = m, j = n;
        String ans = "";
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                ans = s1.charAt(i-1) + ans;
                i--;
                j--;
            }
            else{
                if(t[i-1][j]>t[i][j-1]) i--;
                else j--;
            }
        }

        System.out.println(ans);
    }
}