import java.util.*;
class TransposeMatrix{
    static void PrintMatrix(int arr[][],int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] TransposeMatrix(int arr[][],int m,int n){
        int trans[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                trans[i][j]=arr[j][i];
            }
        }
        return trans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.println("Enter no.of rows:");
        r=sc.nextInt();
        System.out.println("Enter no. of columns:");
        c=sc.nextInt();

        int arr[][]=new int[r][c];
        System.out.println("Enter elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("The Matrix is:");
        PrintMatrix(arr,r,c);

        int Transpose[][]=TransposeMatrix(arr,r,c);
        System.out.println("The transpose of the matrix is:");
        PrintMatrix(Transpose,c,r);
    }
}