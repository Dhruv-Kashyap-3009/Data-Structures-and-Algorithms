import java.util.*;
class MultiplicationOfMatrices{
    static void PrintMatrix(int arr[][],int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void MultiplyMatrix(int a[][],int b[][],int r1,int c1,int r2,int c2){
        if(c1!=r2){
            System.out.println("Multiplication not Possible");
        }else{
            int mult[][]=new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        mult[i][j]+= a[i][k]*b[k][j];
                    }
                }
            }
            PrintMatrix(mult,r1,c2);
        }
    }
    public static void main(String[] args) {
        int r1,r2,c1,c2;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no. of rows for matrix 1:");
        r1=sc.nextInt();
        System.out.println("Enter no. of columns for matrix 1:");
        c1=sc.nextInt();
        int a[][]=new int[r1][c1];
        System.out.println("Enter elements:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        PrintMatrix(a,r1,c1);

        System.out.println("Enter no. of rows for matrix 2:");
        r2=sc.nextInt();
        System.out.println("Enter no. of columns for matrix 2:");
        c2=sc.nextInt();
        int b[][]=new int[r2][c2];
        System.out.println("Enter elements:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        PrintMatrix(b,r2,c2);

        System.out.println("Multiplication of two matrices is:");
        MultiplyMatrix(a,b,r1,c1,r2,c2);
    }
}