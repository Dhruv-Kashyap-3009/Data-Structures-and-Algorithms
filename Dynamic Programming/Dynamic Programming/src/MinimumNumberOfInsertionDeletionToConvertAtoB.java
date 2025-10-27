public class MinimumNumberOfInsertionDeletionToConvertAtoB{
    public static void main(String[] args) {
        String s1 = "heap";
        int m = s1.length();
        String s2 = "pea";
        int n = s2.length();

        int[][] t = new int[m+1][n+1];

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) t[i][j] = 1+t[i-1][j-1];
                else t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }

        int d = s1.length()-t[m][n];
        int i = s2.length()-t[m][n];

        System.out.println("No. of Insertion: "+i);
        System.out.println("No. of Deletion: "+d);
    }
}