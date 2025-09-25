import java.util.*;
class GenerateSpiralMatrix{
    static void PrintMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] GenerateSpiral(int arr[][], int n){
        int element=1;
        int TopRow=0,BottomRow=n-1,LeftColumn=0,RightColumn=n-1;
        while(element<=n*n){

            //Top row from LeftColumn to RightColumn
            for(int j=LeftColumn;j<=RightColumn && element<=n*n;j++){
                arr[TopRow][j]=element++;
            }
            TopRow++;

            //Right column from top row to bottom row
            for(int i=TopRow;i<=BottomRow && element<=n*n;i++){
                arr[i][RightColumn]=element++;
            }
            RightColumn--;

            //Bottom row from right column to left column
            for(int j=RightColumn;j>=LeftColumn && element<=n*n;j--){
                arr[BottomRow][j]=element++;
            }
            BottomRow--;

            //Left Column from Bottom row to Top row
            for(int i=BottomRow;i>=TopRow && element<=n*n;i--){
                arr[i][LeftColumn]=element++;
            }
            LeftColumn++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of Matrix:");
        n=sc.nextInt();
        int arr[][]=new int[n][n];
        int Spiral[][]=GenerateSpiral(arr,n);
        PrintMatrix(Spiral);

    }
}