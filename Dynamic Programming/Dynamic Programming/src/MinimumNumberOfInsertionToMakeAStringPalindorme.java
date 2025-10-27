public class MinimumNumberOfInsertionToMakeAStringPalindorme {
    private static String Reverse(String s){
        int n = s.length();
        String rev = "";

        for(int i=n-1;i>=0;i--) rev+= s.charAt(i);
        return rev;
    }
    public static void main(String[] args) {
        String s1 = "aebcbda";
        String s2 = Reverse(s1);
        int n = s1.length();

        int[][] t = new int[n+1][n+1];

        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) t[i][j] = 1+t[i-1][j-1];
                else t[i][j] = Math.max(t[i][j-1], t[i-1][j]);
            }
        }

        int NoOfInsertion = n - t[n][n];
        System.out.println(NoOfInsertion);
    }
}