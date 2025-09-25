//Print the given matrix in spiral manner

import java.util.*;
class SpiralMatrix{
    static void PrintMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void PrintSpiralMatrix(int arr[][], int r, int c){
        int total_elements=0;
        int TopRow=0,BottomRow=r-1,LeftColumn=0,RightColumn=c-1;
        while(total_elements<r*c){

            //Print Top row from LeftColumn to RightColumn
            for(int j=LeftColumn;j<=RightColumn && total_elements<r*c;j++){
                System.out.print(arr[TopRow][j] + " ");
                total_elements++;
            }
            TopRow++;

            //Print Right column from top row to bottom row
            for(int i=TopRow;i<=BottomRow && total_elements<r*c;i++){
                System.out.print(arr[i][RightColumn] + " ");
                total_elements++;
            }
            RightColumn--;

            //Print Bottom row from right column to left column
            for(int j=RightColumn;j>=LeftColumn && total_elements<r*c;j--){
                System.out.print(arr[BottomRow][j] + " ");
                total_elements++;
            }
            BottomRow--;

            //Print Left Column from Bottom row to Top row
            for(int i=BottomRow;i>=TopRow && total_elements<r*c;i--){
                System.out.print(arr[i][LeftColumn] + " ");
                total_elements++;
            }
            LeftColumn++;
        }
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
        PrintMatrix(arr);
        System.out.println("The Spiral Print of the Matrix is:");
        PrintSpiralMatrix(arr,r,c);
    }
}