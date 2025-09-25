import java.util.*;
class TransposeWithoutExtraSpace{
    static void PrintMatrix(int arr[][],int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void TransposeMatrix(int arr[][],int m,int n){
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println("The transpose of the matrix is:");
        PrintMatrix(arr,n,m);
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
        TransposeMatrix(arr,r,c);
    }
}