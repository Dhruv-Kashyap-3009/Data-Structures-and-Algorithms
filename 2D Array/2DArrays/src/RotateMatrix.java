//For rotating a matrix, first find it's transpose then reverse all rows.
import java.util.*;
class RotateMatrix{
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

    static int[] ReverseArray(int arr[]){
        int temp;
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return arr;
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

        int rotate[][]=new int[r][c];
        for(int i=0;i<r;i++){
            rotate[i]=ReverseArray(Transpose[i]);
        }

        System.out.println("The rotated matrix is:");
        PrintMatrix(rotate,r,c);
    }
}