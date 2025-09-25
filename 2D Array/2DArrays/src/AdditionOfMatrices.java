import java.util.*;
class AdditionOfMatrices{
    static int[][] AddMatrix(int arr1[][], int arr2[][],int m, int n){
        int sum[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sum;
    }
    static int[][] InputMatrix(int m,int n){
        Scanner sc= new Scanner(System.in);
        int arr[][]=new int[m][n];
        System.out.println("Enter Elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    static void PrintMatrix(int arr[][],int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int m,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        m = sc.nextInt();
        System.out.println("Enter no. of columns");
        n = sc.nextInt();
        System.out.println("For Matrix 1:");
        int matrix1[][]=InputMatrix(m,n);
        PrintMatrix(matrix1,m,n);
        System.out.println("For Matrix 2:");
        int matrix2[][]=InputMatrix(m,n);
        PrintMatrix(matrix2,m,n);
        int Sum[][]=AddMatrix(matrix1,matrix2,m,n);
        System.out.println("The addition of two matrices is");
        PrintMatrix(Sum,m,n);
    }
}